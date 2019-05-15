package com.xmpp207.pojo;

public class Group {
	
	private int roomid;
	private String roomname;
	private String owner;
	private String people;
	private boolean status;
	private int maintainid;
	
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public String getRoomname() {
		return roomname;
	}
	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getPeople() {
		return people;
	}
	public void setPeople(String people) {
		this.people = people;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public int getMaintainid() {
		return maintainid;
	}
	public void setMaintainid(int maintainid) {
		this.maintainid = maintainid;
	}
	
	

}
