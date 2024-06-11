package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<IPInfo> ipInfoList = new ArrayList<IPInfo>(); //List<IPInfo> ipInfoList = null;	//ipInfoList는 ArrayList로 생성해야 하지만, null로 대입하였으므로 ipInfoList에 요소를 추가(add)하는 13~15 문장은 NullPointerException이 발생 
		
		ipInfoList.add(new IPInfo("123.123.123.123","홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8","김기태")); //방법1) IPInfo 클래스에 매개 변수 ip 만 받는 생성자를 추가 //방법2) IPInfo 객체 생성시 ip와 user의 매개변수 값을 모두 넣느다. //ipInfoList.add(new IPInfo("212.133.7.8"));  //IPInfo 클래스에서 매개변수 하나만 전달 받는 생성자(Constructor)는 없으므로 객체 생성 불가  
		ipInfoList.add(new IPInfo("177.233.111.222","고길순"));
		
		System.out.print("ip 입력 : ");
		String ip = sc.next();
		
		for(int i=0 ; i<ipInfoList.size() ; i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) { //if(ipInfoList.get(i) == ip) { //ipInfoList.get(i)는 특정 번째의 IPInfo 클래스의 객체이고, ip 는 String 변수 이므로, 
				System.out.println(ipInfoList.get(i));
				break;
			} //일치하는 ip 사용자가 없는 경우의 메시지 출력이 없음
		}
	}
}
