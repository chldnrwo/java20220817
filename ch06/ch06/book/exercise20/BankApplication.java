package ch06.book.exercise20;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray=new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	static int num = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌등록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo==1) {
				createAccount();
			}
			else if(selectNo==2) {
				accountList();
			}
			else if(selectNo==3) {
				deposit();
			}
			else if(selectNo==4) {
				withdraw();
			}
			else if(selectNo==5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
	}
	
	
	private static void createAccount() {
		
		
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		
		System.out.print("계좌주: ");
		String owner =scanner.next();
		
		
		System.out.print("초기입금액: ");
		int balance = scanner.nextInt();
		
		
		accountArray[num] = new Account(ano, owner, balance);
		num++;
		System.out.println("결과: 계좌가 생성되었습니다.");
	}
	
	private static void accountList() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		
		for(int i=0;i<num;i++) {
			System.out.println(accountArray[i].getAno()+" "+accountArray[i].getOwner()+" "+accountArray[i].getBalance());
		}
		
	}
	
	private static void deposit() {
		System.out.println("-----------");
		System.out.println("예금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String anoAlt = scanner.next();
		
		System.out.print("예금액: ");
		int depo = scanner.nextInt();
		
		findAccount(anoAlt).setBalance(findAccount(anoAlt).getBalance()+depo);
		
		System.out.println("결과: 예금이 성공했습니다.");
	}
	
	private static void withdraw() {
		System.out.println("-----------");
		System.out.println("출금");
		System.out.println("-----------");
		
		System.out.print("계좌번호: ");
		String anoAlt = scanner.next();
		
		System.out.print("출금액: ");
		int depo = scanner.nextInt();
		
		findAccount(anoAlt).setBalance(findAccount(anoAlt).getBalance()-depo);
		
		System.out.println("결과: 출금이 성공했습니다.");
		
	}

	
	private static Account findAccount(String ano) {
		for(int i=0;i<num;i++) {
			if(ano.equals(accountArray[i].getAno())) {
				return accountArray[i];
			}
		}
		return null;
	}


}
