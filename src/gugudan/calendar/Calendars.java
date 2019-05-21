package gugudan.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Calendars {
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,30,31,30,31,30};
	
	public int getMaxDayOfMonth(int month) {
		return MAX_DAYS[month-1];
	}
	
	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	
	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
	/*	System.out.println("�� �� ȭ �� �� �� ��");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");*/
		//print 로 달력 출력
		
		////숫자를 입력받아 입력받은 달의 최대 일수 구하기
		/*System.out.println("달을 입력하세요 : ");
		Calendars cal = new Calendars();
		int month = in.nextInt();
		System.out.printf("%d월은 %d일까지 있습니다.",month,cal.getMaxDayOfMonth(month));
		cal.printSampleCalendar();*/
		
		System.out.println("반복횟수를 입력하세요 : ");
		int cnt = in.nextInt();
		Calendars cal = new Calendars();
		int[] month = new int[cnt];
		System.out.println("달을 입력하세요 : ");
		
		for(int i=0; i<cnt; i++) {
			 month[i]= in.nextInt();
		}
		
		for(int i=0; i<cnt; i++) {
			System.out.printf("%d월은 %d일까지 있습니다.\n",month[i],cal.getMaxDayOfMonth(month[i]));
		}
	}
}