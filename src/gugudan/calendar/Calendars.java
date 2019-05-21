package gugudan.calendar;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

public class Calendars {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
	private static final int[] LEAP_MAX_DAYS = { 31, 29, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDayOfMonth(int year, int month) {
		if (isLeapYear(year)) {
			return LEAP_MAX_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printSampleCalendar() {
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("1 2 3 4 5 6 7");
		System.out.println("8 9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

	public int palseWeekDay(String weekDay) {
		if (weekDay.equals("su")) {
			return 0;
		} else if (weekDay.equals("mo")) {
			return 1;
		} else if (weekDay.equals("tu")) {
			return 2;
		} else if (weekDay.equals("we")) {
			return 3;
		} else if (weekDay.equals("th")) {
			return 4;
		} else if (weekDay.equals("fr")) {
			return 5;
		} else if (weekDay.equals("sa")) {
			return 6;
		} else
			return 0;
	}

	public static void main(String[] arg) {
		Scanner in = new Scanner(System.in);
		/*
		 * System.out.println("일 월 화 수 목 금 토"); System.out.println("1 2 3 4 5 6 7");
		 * System.out.println("8 9 10 11 12 13 14");
		 * System.out.println("15 16 17 18 19 20 21");
		 * System.out.println("22 23 24 25 26 27 28");
		 */
		// print 로 달력 출력

		/*
		 * System.out.println("달을 입력하세요 : "); Calendars cal = new Calendars(); int month
		 * = in.nextInt();
		 * System.out.printf("%d월은 %d일까지 있습니다.",month,cal.getMaxDayOfMonth(month));
		 * cal.printSampleCalendar();
		 */
		//// 숫자를 입력받아 입력받은 달의 최대 일수 구하기

		/*
		 * System.out.println("반복횟수를 입력하세요 : "); int cnt = in.nextInt(); Calendars cal =
		 * new Calendars(); int[] month = new int[cnt];
		 * System.out.println("달을 입력하세요 : ");
		 * 
		 * for(int i=0; i<cnt; i++) { month[i]= in.nextInt(); }
		 * 
		 * for(int i=0; i<cnt; i++) {
		 * System.out.printf("%d월은 %d일까지 있습니다.\n",month[i],cal.getMaxDayOfMonth(month[i]
		 * )); }
		 */
		// 반복 입력 가능하게 변경

		/*
		 * int year=0,month=0; while(true) { Calendars cal = new Calendars(); String
		 * prompt = ">"; System.out.println("연과 달을 입력하세요 : "); System.out.print(prompt);
		 * year = in.nextInt(); if(year==-1) { System.out.println("종료되었습니다."); break; }
		 * month = in.nextInt();
		 * //System.out.println("첫번째 요일을 입력하세요. (SU MO TU WE TH FR SA)");
		 * //System.out.print(prompt); //String weekDay = in.next();
		 * System.out.printf("    << %d년 %d월 >>\n",year,month);
		 * System.out.println(" 일    월    화    수    목    금    토");
		 * System.out.println("------------");
		 * 
		 * DoomsDayAlorithm doom = new DoomsDayAlorithm(); //둠스데이알고리즘클래스
		 * 
		 * for(int i=0; i<doom.calDumsDay(year, month,1); i++) {
		 * System.out.print("   "); }
		 * 
		 * for(int i=1; i<=cal.getMaxDayOfMonth(year,month); i++) { if(i<10) { // 일수가
		 * 한자리일경우 공백생성 System.out.print(" "); } System.out.print(i+" ");
		 * if((i+doom.calDumsDay(year, month,1))%7==0) { // 열맞추기 System.out.println(); }
		 * } System.out.println(); }
		 */
		// 정교한 달력 생성

		System.out.println("+----------------------+");
		System.out.println("| 1. 일정 등록           ");
		System.out.println("| 2. 일정 검색  ");
		System.out.println("| 3. 달력 보기");
		System.out.println("| h. 도움말 q. 종료");
		System.out.println("+----------------------+");
		String order;
		String prompt = ">";
		ArrayList<Schedul> list = new ArrayList<>();
		do {
			System.out.println("명령 (1, 2, 3, h, q)");
			System.out.print(prompt);
			order = in.next();
			switch(order){
				case "1" :{
					System.out.println("[일정 등록] 날짜를 입력하세요.");
					System.out.print(prompt);
					String date = in.next();
					System.out.println("일정을 입력하세요");
					System.out.print(prompt);
					String content = in.next();
					list.add(new Schedul(date,content));
					System.out.println("일정이 등록되었습니다.");
					break;
				}
				case "2" :{
					System.out.println("[일정 검색] 날짜를 입력하세요.");
					System.out.print(prompt);
					String date = in.next();
					int[] indexNum = new int[list.size()];
					int cnt=0;
					for(int i=0; i<list.size(); i++) {
						if(date.equals(list.get(i).getDate())) {
							cnt++;
						}
					}
					System.out.println(cnt+"개의 일정이 있습니다.");
					for(int i=0; i<list.size(); i++) {
						if(date.equals(list.get(i).getDate())) {
							System.out.println(list.get(i).getContent());
						}
					}
					break;
				}
			}
		}while(!order.equals("q"));
	}
}
