package com.keepzzz.film.service.impl;

import com.keepzzz.film.domain.Ticket;
import com.keepzzz.film.mapper.TicketMapper;
import com.keepzzz.film.service.*;
import com.keepzzz.film.vo.TicketVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketMapper ticketMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private FilmService filmService;
    @Autowired
    private SnackService snackService;
    @Autowired
    private OrderService orderService;
    @Autowired
    private OrderDetailService orderDetailService;
    @Autowired
    private SeatService seatService;


    /**
     * 查询所有
     * @return
     */
    @Override
    public List<TicketVO> getTickets() {

        List<Ticket> tickets = ticketMapper.getTickets();
        return  tickets.stream().map(e ->(
              new TicketVO( filmService.getFilmInfo(
                      e.getFilmId()).getFilmName(),
                      e.getHallId(),e.getTicketPrice(),filmService.getFilmInfo(e.getFilmId()).getPlayTime(),
                     snackService.getSnack( orderDetailService.getOrderDetailByOrderId(orderService.getOrderByUserId(e.getUserId()).getId()).getSnackId()).getSnackName(),e.getSeat()
                      )
        )).collect(Collectors.toList());


    }

    /**
     * 查询单个电影票
     * @param
     * @return
     */
    @Override
    public TicketVO getTicket(Long userId) {
        Ticket ticket = ticketMapper.getTicket(userId);
        TicketVO ticketVO = new TicketVO();
        ticketVO.setFilmName(filmService.getFilmInfo(ticket.getFilmId()).getFilmName());
        ticketVO.setPlayTime(filmService.getFilmInfo(ticket.getFilmId()).getPlayTime());
        ticketVO.setSnackName(snackService.getSnack(orderDetailService.getOrderDetailByOrderId(ticket.getOrderId()).getSnackId()).getSnackName());
        BeanUtils.copyProperties(ticket,ticketVO);
        return ticketVO;
    }

    @Override
    public Ticket getOne(Long id) {
        return ticketMapper.getOne(id);
    }


    @Override
    public boolean addTicket(Ticket ticket) {
        ticket.setCreateTime(new Date());
        return ticketMapper.insert(ticket) > 0;
    }

    @Override
    public boolean updateTicket(Ticket ticket) {

        return ticketMapper.update(ticket) > 0;
    }

    @Override
    public boolean deleteTicket(Long id) {
        return ticketMapper.delete(id) > 0;
    }


}
