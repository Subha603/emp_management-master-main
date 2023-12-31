package com.jisu.emp_management.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class AdminMsg {
    public AdminMsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer msgId;

    private String msg;

    private String name;

    private String email;

	public AdminMsg(Integer msgId, String msg, String name, String email) {
		super();
		this.msgId = msgId;
		this.msg = msg;
		this.name = name;
		this.email = email;
	}

	public Integer getMsgId() {
		return msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
