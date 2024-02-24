package com.jsp.springboot.Actor.utility;

import java.util.List;

import com.jsp.springboot.Actor.model.Actor;

public class ResposeStucture <T>{
     private int ststusCode;
     private String message;
     private T data;
     private List<T> list;
     
	public List<T> getList() {
		return list;
	}
	public void setList(List<Actor> actorList) {
		this.list = (List<T>) actorList;
	}
	public int getStstusCode() {
		return ststusCode;
	}
	public void setStstusCode(int ststusCode) {
		this.ststusCode = ststusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
     
	
	
     
     
}
