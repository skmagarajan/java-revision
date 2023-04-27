package org.example;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DetailsRowMapper implements RowMapper {
    @Override
    public Details mapRow(ResultSet rs, int rowNum) throws SQLException {
        Details d = new Details();
        d.setUserId(rs.getInt(1));
        d.setName(rs.getString(2));
        return d;
    }
}
