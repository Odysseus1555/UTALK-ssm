package com.xmpp207.pojo;


public class User {
    private int id; //±‡∫≈
    private String name; //”√ªß√˚
    private String pwd;//√‹¬Î
    private String personalname;
    private String group;
    
	public String getPersonalname() {
		return personalname;
	}
	public void setPersonalname(String personalname) {
		this.personalname = personalname;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pwd=" + pwd + "]";
	}
	
}
