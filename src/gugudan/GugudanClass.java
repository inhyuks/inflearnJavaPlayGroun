package gugudan;

public class GugudanClass {
	public void print(int[] num) {
		for(int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
	}
	
	public int[] calculate(int times) {
		int[] num = new int[9];
		for(int i=0; i<num.length; i++) {
			num[i]=times*i;
		}
		return num;
	}
	
	public void lastCal(int firstNum, int secondNum) {
		
		for(int i=2; i<=firstNum; i++) {
			for(int j=1; j<10; j++) {
					System.out.println(i+"*"+j+" : " + (i*j));
					if(i==firstNum && j ==secondNum) break;
			}
		}
		
	}
}
