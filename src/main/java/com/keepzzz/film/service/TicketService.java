package com.keepzzz.film.service;

import com.keepzzz.film.domain.Ticket;
import com.keepzzz.film.vo.TicketVO;

import java.util.List;


public interface TicketService {
    /**
     * 查询所有电影票
     * @return
     */
    List<TicketVO> getTickets();

    /**
     * 查询单个电影票
     * @return
     */
    TicketVO getTicket(Long userId);


    Ticket getOne(Long id);


    /**
     * 添加电影票
     * @return
     */
    boolean addTicket(Ticket ticket);

    /**
     * 修改
     * @param ticket
     * @return
     */
    boolean updateTicket(Ticket ticket);


    /**
     * 删除电影票
     * @return
     */
    boolean deleteTicket(Long id);
}
