package me.folixa.wsclient;

import me.folixa.ws.users.Security;
import me.folixa.ws.users.Users;
import me.folixa.ws.users.UsersSoap;

public class UsersWSClient {
	private Security security;
	private UsersSoap service;
	
	
	public UsersWSClient() {
		security = new Security();
		service = new Users().getUsersSoap12();
	}

	public void SignUp(String email, String password) {
		service.signUp(email, password);
	}
	
	public boolean logIn(String email, String password) {
		security.setEmail(email);
		security.setPassword(password);
		String resp = service.logIn(security);

		return resp.equals("OK")? true : false;
	}
	
	public boolean isAdmin(String email) {
		String resp = service.getUserPermission(email);
		return resp.equals("admin") ? true : false;
	}

	
}
