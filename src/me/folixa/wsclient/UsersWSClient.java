package me.folixa.wsclient;

import me.folixa.ws.Security;
import me.folixa.ws.Users;
import me.folixa.ws.UsersSoap;

public class UsersWSClient {
	private Security security;
	private UsersSoap service;
	
	
	public UsersWSClient() {
		security = new Security();
		service = new Users().getUsersSoap();
	}

	public void SignUp(String email, String password) {
		service.signUp(email, password);
	}
	
	
}
