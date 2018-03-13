package com.pattern.template;

import com.pattern.template.dao.MemberDao;

public class TemplateTest {

	public static void main(String[] args) {

		System.out.println("模板方法模式测试");
		
		MemberDao memdao = new MemberDao();
		
		memdao.query();
	}

}
