package com.example.demo.entity;

public class VDic {
	private byte value;
	private String des;
	
	public VDic() {
		
	}
	
	public VDic(byte value,String des) {
		this.value = value;
		this.des = des;
	}
	
	public byte getValue() {
		return value;
	}
	public void setValue(byte value) {
		this.value = value;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
	

}
