package com.kb.shop.repository;


import com.kb.shop.domain.ShippingInfo;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ShippingRepository {

    private final JdbcTemplate jdbcTemplate;

    public ShippingRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public ShippingInfo selectShippingInfo(Long id) {
        String sql = "SELECT * FROM shippinginfo WHERE id = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{id}, BeanPropertyRowMapper.newInstance(ShippingInfo.class));
    }

    public ShippingInfo selectSelectInfoByShippingStatus (String shippingStatus) {
        String sql = "SELECT * FROM shippinginfo WHERE seller_name = ?";
        return jdbcTemplate.queryForObject(sql, new Object[]{shippingStatus}, BeanPropertyRowMapper.newInstance(ShippingInfo.class));
    }

    public void deleteShippingInfo(Long id) {
        String sql = "DELETE FROM shippinginfo WHERE id = ?";
        jdbcTemplate.update(sql, id);
    }

    public void setShippinginfo(ShippingInfo shippingInfo) {
        String sql = "INSERT INTO shippinginfo ( shippingInfo_status) VALUES (?)";
        jdbcTemplate.update(sql,shippingInfo.getShippingStatus() ) ;
    }



}
