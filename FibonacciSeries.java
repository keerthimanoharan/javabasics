package Week3.day1;

public class FibonacciSeries {
public static void main(String[] args) {
	int range=8, firstnum=0, secondnum=1, sum;
	System.out.println("firstnum is="+firstnum);
	for(int i=1;i<=range;i++)
	{
			sum=firstnum+secondnum;	//sum=0+1=1
		firstnum=secondnum;	//0=1
		secondnum=sum;	//1=1
		System.out.println("sum is="+sum);
	
}
}}
