package com.spring.exam2;

import org.springframework.beans.factory.annotation.Autowired;

public class First {
	@Autowired
	private Second second;
	
	public Second getSecond(){
		return second;
	}
}
