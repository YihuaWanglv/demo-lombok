package com.iyihua.demo;

import com.iyihua.demo.entity.User;

public class LombokTest {

	public static void main(String[] args) {
		User u = User.builder().id(1l).name("iyihua").build();
		System.out.println(u.toString());
	}
}
