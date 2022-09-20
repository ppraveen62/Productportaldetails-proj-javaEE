package com;

public class product {
	public int uid;
	public String uname;
	public int uprice;
	public String usd;
	
	public product() {
		super();
	}
	
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getUprice() {
		return uprice;
	}
	public void setUprice(int uprice) {
		this.uprice = uprice;
	}
	public String getUsd() {
		return usd;
	}
	public void setUsd(String usd) {
		this.usd = usd;
	}
	@Override
	public String toString() {
		return "product [uid=" + uid + ", uname=" + uname + ", uprice=" + uprice + ", usd=" + usd + "]";
	}
	
	
	
	
	

}
