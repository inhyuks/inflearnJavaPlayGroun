package gugudan;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] arg) {
		/*System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		System.out.println(3*1);
		System.out.println(3*2);
		System.out.println(3*3);
		System.out.println(3*4);
		System.out.println(3*5);
		System.out.println(3*6);
		System.out.println(3*7);
		System.out.println(3*8);
		System.out.println(3*9);*/ 
		// 2단3단 System..out.println 으로 출력
		
		/*Scanner in = new Scanner(System.in);
		System.out.print("구구단을 출력할 단은? : ");
		int i = in.nextInt();
		System.out.println(i*1);
		System.out.println(i*2);
		System.out.println(i*3);
		System.out.println(i*4);
		System.out.println(i*5);
		System.out.println(i*6);
		System.out.println(i*7);
		System.out.println(i*8);
		System.out.println(i*9);*/ 
		// 변수와 입력을 이용한계산
		
		/*int i = 1;
		while(i<10) {
			System.out.println(i++*4);
		}*/ 
		// while 반복
		
		/*for(int i = 1; i<10; i++) {
			System.out.println(i*5);
		}*/ 
		// for 반복
		
		/*	
		System.out.println("구구단을 출력할 단은 : ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(1<num && num<10) {
			for(int i=1; i<10; i++) {
				System.out.println(num*i);
			}
		}
		else System.out.println("2이상 , 9이하의 값만 받을수 있습니다.");
		*/ 
		// if 문을 이용한 입력값 확인
		
		/*int[] num = new int[9];
		
		for(int i=0; i<num.length; i++) {
			num[i]=(i+1)*2;
		}
		
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}*/ 
		// 배열을 이용한 계산
		
		
/*		System.out.print("구구단을 출력할 단은? : ");
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		print(calculate(times));*/ 
		// 메소드를 이용한 계산
		
	/*	System.out.print("구구단을 출력할 단은? : ");
		Scanner in = new Scanner(System.in);
		int times = in.nextInt();
		GugudanClass gugudan = new GugudanClass();
		gugudan.print(gugudan.calculate(times));*/
		//클래스를 이용한 계산 
		
		System.out.print("구구단을 출력할 단은?(ex. 6,7) : ");
		Scanner in = new Scanner(System.in);
		String problem = in.nextLine();
		String[] problemDiv = problem.split(","); // ,기준으로 분리
		
		int firstNum = Integer.parseInt(problemDiv[0]);
		int secondNum = Integer.parseInt(problemDiv[1]);
		GugudanClass gugudan = new GugudanClass();
		gugudan.lastCal(firstNum, secondNum);
		
		
	}
	
/*	public static void print(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	public static int[] calculate(int times) {
		int[] num = new int[9];
		for(int i=0; i<num.length; i++) {
			num[i]=times*i;
		}
		return num;
	}*/ // 메소드를 이용한 계산
}
