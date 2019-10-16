package com.keepzzz.film.mapper;


import com.keepzzz.film.domain.Ticket;
import com.keepzzz.film.provider.TicketProvider;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketMapper {
    /**
     * 查询所有电影票
     * @return
     */
    @Select("select * from ticket")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="user_id",property="userId"),
            @Result(column="film_id",property="filmId"),
            @Result(column="create_time",property="createTime"),
            @Result(column="seat_id",property="seatId"),
            @Result(column="ticket_price",property="ticketPrice"),
            @Result(column="order_id",property="orderId"),
            @Result(column="seat_id",property="seat",
                    one=@One(select="com.keepzzz.film.mapper.SeatMapper.getSeat",fetchType= FetchType.DEFAULT))
    })
    List<Ticket> getTickets();

    /**
     * 根据用户id查询电影票
     * @return
     */
    @Select("select * from ticket where user_id = #{userId}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="user_id",property="userId"),
            @Result(column="film_id",property="filmId"),
            @Result(column="create_time",property="createTime"),
            @Result(column="seat_id",property="seatId"),
            @Result(column="ticket_price",property="ticketPrice"),
            @Result(column="order_id",property="orderId"),
            @Result(column="seat_id",property="seat",
                    one=@One(select="com.keepzzz.film.mapper.SeatMapper.getSeat",fetchType= FetchType.EAGER))
    })
    Ticket getTicket(Long userId);




    @Select("select * from ticket where id = #{id}")
    @Results({
            @Result(id=true,column="id",property="id"),
            @Result(column="user_id",property="userId"),
            @Result(column="film_id",property="filmId"),
            @Result(column="create_time",property="createTime"),
            @Result(column="seat_id",property="seatId"),
            @Result(column="ticket_price",property="ticketPrice"),
            @Result(column="order_id",property="orderId"),
            @Result(column="seat_id",property="seat",
                    one=@One(select="com.keepzzz.film.mapper.SeatMapper.getSeat",fetchType= FetchType.EAGER))
    })
    Ticket getOne(Long id);


    /**
     * 添加电影票
     * @param ticket
     * @return
     */
    @InsertProvider(type = TicketProvider.class,method = "insertTicket")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    int insert(Ticket ticket);

    /**
     * 更新电影票
     */
    @UpdateProvider(type = TicketProvider.class,method = "updateTicket")
    int update(Ticket ticket);

    /**
     * 删除电影票
     * @param id
     * @return
     */
    @Delete("delete from ticket where id = #{id}")
    int delete(Long id);
}
