package org.example;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("/services/SimpleService/META-INF/config.xml");
        SimpleService simpleServiceBean = (SimpleService) ctx.getBean("simpleService");

        System.out.println(simpleServiceBean.getHello());

        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemp");
        String sql = "SELECT * FROM details";

        // queryForInt() is Deprecated
        // https://www.mkyong.com/spring/jdbctemplate-queryforint-is-deprecated/
        //int total = jdbcTemplate.queryForInt(sql);

        List<Details> res = jdbcTemplate.query(sql, new DetailsRowMapper());
        res.forEach((s) -> System.out.println(s.getUserId()+" "+s.getName()));
    }
}
