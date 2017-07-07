package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];	//공간을 만드는 것
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        String info=new String();
        
        for(int i=0;i<3;i++) {
        	info=sc.nextLine();
        	String[] arr = info.split(" ");
        	Friend fr=new Friend();
        	fr.getName(arr[0]);
        	fr.getHp(arr[1]);
        	fr.getSchool(arr[2]);
        	friendArray[i]=fr;			//공간에 fr을 집어 넣는다.
        	
        	
        }
            // 친구정보 입력받기

            // 입력받은 친구정보를 공백으로 분리

            // Friend 객체 생성하여 데이터 넣기

            // 배열에 추가하기

        
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
            //친구정보 출력 메소드 호출
        }

        sc.close();
    }

}
