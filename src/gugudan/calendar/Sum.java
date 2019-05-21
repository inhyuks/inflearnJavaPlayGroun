package gugudan.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] arg) {
		System.out.println("두 수를 입력하세요.");
		Scanner in = new Scanner(System.in);
		String num;
		num = in.nextLine();
		String[] nums = num.split(" ");
		System.out.println("두 수의 합은 "+(Integer.parseInt(nums[0])+Integer.parseInt(nums[1]))+"입니다.");
	}
}
