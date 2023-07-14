package com.springcore2;

public class Department 
{
   private int departmentId;
   private int departmentName;
   private int departmentAddress;
   private int departmentRoom;
public int getDepartmentId() {
	return departmentId;
}
public void setDepartmentId(int departmentId) {
	this.departmentId = departmentId;
}
public int getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(int departmentName) {
	this.departmentName = departmentName;
}
public int getDepartmentAddress() {
	return departmentAddress;
}
public void setDepartmentAddress(int departmentAddress) {
	this.departmentAddress = departmentAddress;
}
public int getDepartmentRoom() {
	return departmentRoom;
}
public void setDepartmentRoom(int departmentRoom) {
	this.departmentRoom = departmentRoom;
}
public Department(int departmentId, int departmentName, int departmentAddress, int departmentRoom) {
	super();
	this.departmentId = departmentId;
	this.departmentName = departmentName;
	this.departmentAddress = departmentAddress;
	this.departmentRoom = departmentRoom;
}
public Department() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", departmentAddress="
			+ departmentAddress + ", departmentRoom=" + departmentRoom + "]";
}
   
}
