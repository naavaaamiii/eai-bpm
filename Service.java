package com.Soap.Services;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Service {

	
	@WebMethod
	public int add(int x,int y){
		return x+y;
	}
}
