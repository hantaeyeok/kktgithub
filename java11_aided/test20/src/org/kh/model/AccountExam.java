package org.kh.model;

import java.util.ArrayList;
import java.util.List;

import section.Account;

public class AccountExam {
	public static void main(String[] args) {
		List<Account> accList = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			Account acc = new Account(i, "아무개"+i, "토스뱅크"+i, 0);
			accList.add(acc);
		}
		for(Account a:accList) {
			System.out.println(a.toString());
		}
	}
}
