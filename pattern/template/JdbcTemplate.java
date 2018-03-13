package com.pattern.template;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.sql.DataSource;

public class JdbcTemplate {

//	private DataSource dataSource;
	
	public JdbcTemplate(DataSource dataSource){
		
//		this.dataSource = dataSource;
	}
	
	public List<?> executeQuery(String sql, RowMapper<?> rowMapper, Object[] values){
		
		try{
			Connection conn = this.getConnection();
			
			PreparedStatement pstmt = this.getPrepareStatement(conn, sql);
			
			ResultSet rs = this.executeQuery(pstmt, values);
			
			List<?> list =  this.parseResultSet(rs, rowMapper);
			
			this.closeResultSet(rs);
			
			this.closeStatement(pstmt);
			
			this.closeConnection(conn);
			
			return list;
			
		}catch(Exception e){
			
			e.printStackTrace();
			return null;
		}
	}

	private Connection getConnection() throws Exception {
		
		System.out.println("获取连接");
		return null;
//		return dataSource.getConnection();
	}
	
	private PreparedStatement getPrepareStatement(Connection conn, String sql) throws Exception {
		
		System.out.println("获取语句集");
		return null;
//		return conn.prepareStatement(sql);
	}

	private ResultSet executeQuery(PreparedStatement pstmt, Object[] values) throws Exception {
		
		System.out.println("执行查询");
		return null;//
//		for (int i = 0; i < values.length; i++) {
//			pstmt.setObject(i, values);
//		}
//		return pstmt.executeQuery();
	}

	private List<?> parseResultSet(ResultSet rs, RowMapper<?> rowMapper) throws Exception {

		System.out.println("解析语句集");
		return null;
//		List<Object> list = new ArrayList<Object>();
//		int rowNum = 1;
//		while(rs.next()){
//			list.add(rowMapper.mapRow(rs, rowNum));
//		}
//		
//		return list;
	}

	private void closeResultSet(ResultSet rs) throws Exception {

		System.out.println("关闭结果集");
//		rs.close();
	}

	private void closeStatement(PreparedStatement pstmt) throws Exception {

		System.out.println("关闭语句集");
//		pstmt.close();
	}

	private void closeConnection(Connection conn) throws Exception {

		System.out.println("关闭连接");
//		this.dataSource.getConnection().close();
	}
}
