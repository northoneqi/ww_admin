package com.bw.fortcrop.common.util;

public enum UserType {
	ADMIN("系统管理员",00),PROFESSOR("专家",01),COMPANY("企业",02),SCIENTIFIC("科研机构",03),QT("其他",05);
	private String name;
	private int type;
	private UserType(String name,int type){
		this.name = name;
		this.type = type;
	}
	public String getName(){
		return name;
	}
	public int getType(){
		return type;
	}
	public static UserType getUserType(int type){
		switch(type){
			case 00 : return ADMIN;
			case 01 : return PROFESSOR;
			case 02 : return COMPANY;
			case 03 : return SCIENTIFIC;
			case 05 : return QT;
			default : return null;
		}
	}
	
}