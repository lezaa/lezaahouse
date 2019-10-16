package com.keepzzz.film.controller.front;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.keepzzz.film.base.ApiResponse;
import com.keepzzz.film.domain.Ticket;
import com.keepzzz.film.enums.Status;
import com.keepzzz.film.service.TicketService;
import com.keepzzz.film.vo.TicketVO;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

    @Autowired
    private TicketService ticketService;

    /**
     * 查询所有电影票
     *
     * @return
     */
    @GetMapping("/tickets")
    public ApiResponse getTickets(@RequestParam(value = "page",defaultValue = "1") int page,
                                  @RequestParam(value = "size",defaultValue = "8") int size) {
        List<TicketVO> ticketVOs = ticketService.getTickets();
        Map<String, Object> data = page(page, size, ticketVOs);
        return ApiResponse.ofSuccess(data);
    }


    /**
     *获取单个电影票(回显)
     * @param
     * @return
     */
    @GetMapping("/{id}")
    public ApiResponse getTicket(@PathVariable("id") Long userId) {
        TicketVO ticketVO = ticketService.getTicket(userId);
        if (ticketVO != null) {
            return ApiResponse.ofSuccess(ticketVO);
        }
        return ApiResponse.ofStatus(Status.THIS_TICKET_NOT_EXITS);

    }

    /**
     *添加电影票（过时）
     * @param ticket
     * @return
     */
    @PostMapping("/add")
    public ApiResponse addTicket(@RequestBody Ticket ticket) {
        boolean flag = ticketService.addTicket(ticket);
        if (flag) {
            return ApiResponse.ofSuccess();
        }
        return ApiResponse.ofStatus(Status.BAD_REQUEST);
    }



    /**
     * 修改电影票
     */
    @PutMapping("/{id}")
    public ApiResponse updateTicket(@PathVariable("id") long id,@RequestBody Ticket ticket) {
        if(id == ticket.getId() && ticketService.getOne(id) != null){
            boolean flag = ticketService.updateTicket(ticket);
            if (flag) {
                return ApiResponse.ofSuccess();
            }
            return ApiResponse.ofStatus(Status.BAD_REQUEST);
        }
        return ApiResponse.ofStatus(Status.THIS_TICKET_NOT_EXITS);
    }


    /**
     * 删除电影票（过期）
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ApiResponse deleteTicket(@PathVariable("id") Long id){
        boolean flag = ticketService.deleteTicket(id);
        if (flag) {
            return ApiResponse.ofSuccess();
        }
        return ApiResponse.ofStatus(Status.BAD_REQUEST);
    }

    /**
     * 分页方法
     * @param page
     * @param size
     * @param ts
     * @param <T>
     * @return
     */
    private static<T> Map<String,Object> page(int page, int size, List<T> ts){
        PageHelper.startPage(page,size);
        PageInfo<T> pageInfo = new PageInfo<>(ts);
        Map<String,Object> data = new HashMap<>();
        data.put("totalPage",pageInfo.getPages());
        data.put("totalSize",pageInfo.getTotal());
        data.put("currentPage",page);
        data.put("data",pageInfo.getList());
        return data;
    }

}
