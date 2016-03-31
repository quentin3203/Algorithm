package com.algorithm.demo;

public class NotChinese {
	public String notChinese(String str){
		String s="";
		for(int i=0;i<str.length();i++){
			String str0="";
			if(str.substring(i, i+1).matches("[u4e00-u9fa5]+")){
				str0=str.substring(i, i+1).toString();
				
			}else{
				System.out.println();
			}
			s+=str0;
		}
		return s;
	}
}
