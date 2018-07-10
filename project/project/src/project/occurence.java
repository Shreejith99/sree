package project;

import java.util.Scanner;

public class occurence {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your string");
		String st=sc.nextLine();
		int ocr[]=new int[128];
		for(int i=0;i<st.length();i++) {
			ocr[st.charAt(i)]++;
		}
		for(int i=0;i<ocr.length;i++) {
			if(ocr[i]!=0) {
				System.out.println((char)i+"     "+ocr[i]);
			}
		}
		
	}

}
