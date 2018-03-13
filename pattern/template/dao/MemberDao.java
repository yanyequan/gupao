package com.pattern.template.dao;

import java.sql.ResultSet;
import java.util.List;

import com.pattern.template.JdbcTemplate;
import com.pattern.template.RowMapper;
import com.pattern.template.entity.Member;

public class MemberDao {

	JdbcTemplate jdbcTemplate = new JdbcTemplate(null);
	
	public List<?> query(){
		
		System.out.println("===开始执行模板方法");
		
		String sql = "select * from member";
		
		return jdbcTemplate.executeQuery(sql, new RowMapper<Member>() {

			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws Exception {

				Member member = new Member();
				
				member.setName(rs.getString("name"));
				member.setAge(rs.getInt("age"));
				
				return member;
			}
		}, null);
	}
}
