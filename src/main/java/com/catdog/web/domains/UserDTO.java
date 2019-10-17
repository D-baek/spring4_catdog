package com.catdog.web.domains;
import java.io.Serializable;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String cid,pw,ssn,credit,pname,phone,address,email;

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

}
