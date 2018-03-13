package com.pattern.template;

import java.sql.ResultSet;

public interface RowMapper<T> {

	public T mapRow(ResultSet rs, int rowNum) throws Exception;
}
