package com.xd.halo.model;

/**
 * 
 * @author xiaodong
 *
 * @date 2014年12月17日 下午3:25:35
 */
public class User {
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + "]";
	}

}
