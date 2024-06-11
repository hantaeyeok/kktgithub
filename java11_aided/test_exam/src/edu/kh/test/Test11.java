package edu.kh.test;

import java.util.ArrayList;
import java.util.List;

public class Test11 {

	public static void main(String[] args) {
		String names = "김기태 이순신 강감찬 고주몽 부여온조"; //문자열
		
		List<IPInfo> ipList = new ArrayList<>();	//List
		ipList.add(new IPInfo("192.168.0.191", "이성하"));
		ipList.add(new IPInfo("192.168.1.132", "이원석"));
		ipList.add(new IPInfo("192.168.3.24", "김기태"));
		ipList.add(new IPInfo("192.168.1.3", "강감찬"));
		
		String str = "이순신";
		
		System.out.println("String에서 찾기");
		if(names.contains(str)) {
			System.out.println(str+"이 포함되어 있습니다.");
		} else {
			System.out.println(str+"이 포함되어 있지 않습니다.");
		}
		
		System.out.println("\nArrayList에서 찾기");

		boolean sw = false;
		for(IPInfo i:ipList) {
			if(i.getUser().equals(str)) {
				sw = true;
			}
		}
		
		if(sw) {
			System.out.println(str+"이 포함되어 있습니다.");
		} else {
			System.out.println(str+"이 포함되어 있지 않습니다.");
		}
	}

}
