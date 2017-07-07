package com.javaex.problem06;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    //필요한 메소드 작성
    public void getName(String name) {
    	this.name=name;
    }
    
    public void getHp(String hp) {
    	this.hp=hp;
    	
    }
    
    public void getSchool(String school) {
    	this.school=school;
    	
    }
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
