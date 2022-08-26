package ch04.exercise;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {
		static StringBuilder sb=new StringBuilder();
		static Scanner in = new Scanner(System.in);
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Scanner in = new Scanner(System.in);
		int N = in.nextInt(); 
		//int M = in.nextInt();
		d(N);
	}
	
	public static void d(int n){
		int[] arrW = new int[n];
		int[] arrH = new int[n];
		int[] arrRank = new int[n];
		for(int i=0;i<n;i++) {
			arrW[i] = in.nextInt(); 
			arrH[i] = in.nextInt();
			arrRank[i] = 1;
		}//입력값 전부 배열에 들어감
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arrW[i]>arrW[j]&&arrH[i]>arrW[j]) {
					arrRank[j]++;
				}
			}
		}
		for(int i=0;i<5;i++) {
			System.out.print(arrRank[i]+" ");
		}
		
		
	}
}

//일단 키가 같고 몸무게가 우위거나 몸무게가 같고 키가 우위인 경우는 배제
