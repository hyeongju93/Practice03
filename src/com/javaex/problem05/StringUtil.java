package com.javaex.problem05;

public class StringUtil {
    
    public static String concatString(String[] array){
    	String result=" ";
    	for(int i=0;i<array.length;i++) {
    		result=result.concat(array[i]);
    	}
    	
    	return result;
    	
        //메소드 내용작성
        
    }

}
