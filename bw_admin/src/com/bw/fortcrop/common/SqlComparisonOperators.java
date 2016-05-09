package com.bw.fortcrop.common;

import org.apache.commons.lang.StringUtils;

/**
 * 数据库中的比较运算符
 * @author Administrator
 *
 */
public enum SqlComparisonOperators {
	EQ("EQ","="),GT("GT",">"),LT("LT","<"),NEQ("NEQ","!="),LIKE("LIKE","like"),LTE("LTE","<="),GTE("GTE",">=");
	
	
	
	private SqlComparisonOperators(String name,String value) {
		this.value = value;
		this.name = name;
	}

	private String name;
	private String value;

	public String getValue() {
		return value;
	}
	
	public String getName() {
		return name;
	}

	public static  SqlComparisonOperators getByVal(String value){
		if(StringUtils.isEmpty(value)){
			return null;
		}
		value = value.trim();
		SqlComparisonOperators[] opers = SqlComparisonOperators.values();
		for(SqlComparisonOperators oper : opers){
			if(oper.getValue().equalsIgnoreCase(value)){
				return oper;
			}
		}
		return null;
	}
	
	
}
