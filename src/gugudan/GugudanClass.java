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
}
