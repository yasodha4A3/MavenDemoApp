package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.example.demo.service.MessageService;

@Service
public class MessageServiceImpl implements MessageService{
	
	public String getGreeting(String name) {
		return "Hey " +name;
	}

}
