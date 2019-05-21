package gugudan.calendar;

import java.util.Scanner;

public class DoomsDayAlorithm {
	
	public int getAnchorDay(int year) { //앵커데이 계산
		int yearDiv = year/100;
		if(yearDiv==18) return 5; //금요일
		else if(yearDiv==19) return 3; //수요일
		else if(yearDiv==20) return 2; //수요일
		else if(yearDiv==21) return 0; //수요일
		else return -1;
	}
	
	public int getDumsDay(int year) { // 둠스데이 계산
		int[] dumsNum = new int[5];
		dumsNum[0] = (year%100)/12; // 연의 뒤에두자리에 12가 몇번들어가나
		dumsNum[1] = (year%100)-(dumsNum[0]*12); //12의 배수와 년도의 마지막 두 자리 수의 차이
		dumsNum[2] = dumsNum[1]/4; //1번값에 4의 배수가 몇 번 들어가나
		dumsNum[3] = getAnchorDay(year); // 그해의 앵커데이는?
		dumsNum[4] = dumsNum[0]+dumsNum[1]+dumsNum[2]+dumsNum[3];
		return dumsNum[4]%7;
	}
	
	public int getDumsMonth(int year, int month) { // 월별 둠스데이
		if(month%2==0&&month!=2) { //짝수달이면서 2월이아닌경우 둠스에이 월과 일이 동일함
			return month;
		}
		else if(month==3) {
			return 7; // 3월 14일
		}
		else if(month==5) {
			return 9; // 5월 9일
		}
		else if(month==7) {
			return 11; //7월 11일
		}
		else if(month==9) {
			return 12; //9월 5일
		}
		else if(month==11) {
			return 7; //11월 7일
		}
		else if(month==2) { //윤년이면 8월 아니면 3월
			if(year%4==0) return 8;
			else return 7;
		}
		else if(month==1) { //윤년이면 4월 아니면 10월
			if(year%4==0) return 11;
			else return 10;
		}
		else return -1;
	}

	public int calDumsDay(int year, int month, int day) { // 요일 맞추기
		int trueDay=0;
		trueDay = day%7; //구하고자하는 일을 7로나눈 나머지값을구하여 7이하의 수로만듬
		trueDay = getDumsMonth(year, month)-trueDay; //둠스데이에서 일을뺌
		int dumsDay = getDumsDay(year); //그해의 둠스데이
		for(int i=0; i<trueDay; i++) { //차이만큼 dumsday를 뺌 요일이 -되는 경우때문에 for문으로 체크하면서 감소
			dumsDay--;
			if(dumsDay==-1) {dumsDay=6;}
		}
		return dumsDay;
	}
	
	public String printDay(int day) {
		if(day==0) return "일";
		else if(day==1) return "월";
		else if(day==2) return "화";
		else if(day==3) return "수";
		else if(day==4) return "목";
		else if(day==5) return "금";
		else return "토";
	}
	public static void main(String[] arg) {
		System.out.println("년 , 월 , 일");
		int year,month,day;
		Scanner in = new Scanner(System.in);
		year = in.nextInt();
		month = in.nextInt();
		day = in.nextInt();
		DoomsDayAlorithm dum = new DoomsDayAlorithm();
		System.out.println(dum.printDay(dum.calDumsDay(year, month, day)));
	}
}
