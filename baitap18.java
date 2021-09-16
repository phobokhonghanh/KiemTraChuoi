package chuoi;

import java.util.Scanner;

public class baitap18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập");
		String ip = sc.nextLine();

		if (ip.matches("^[A-Z]\\S{0,18}\\d$")) {
			System.out.println("Duyệt");
		} else {
			System.out.println("Không duyệt!");
		}
		
	}
}
