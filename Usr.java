

import java.util.Scanner;

public class Usr {

	int count =0;
//	boolean chk(String name){
	public  char chk(char[] arr, int n){
 //int count=0; 
		int i=n;
	if(arr[i]=='('&& count>=0){
		count++;}
		if(arr[i]==')'&& count>=0){
			count--;}
		//if(i==arr.length-1 && count>=0){
		if(i==arr.length-1){
			if(count==0)
			return 't';
			else
				return 'f';
		}
		if((i==arr.length-1 && count<=1)){
		 return 'f';
		}
		else
		return chk(arr,n+1);
	
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usr x =new Usr();
		Scanner scan = new Scanner( System.in  );
	    String str ;
	    System.out.print("Enter any sentence: ");
	    str= scan.nextLine();
		char[] chars = str.toCharArray();
		
System.out.println(chars);
//for (int i = 0; i < chars.length; i++) {
//	System.out.println(chars[i]);
//}
		
		
		//boolean x.chk()
		//if(x.chk(str)== true)
		if(x.chk(chars,0)== 't')

		{
			System.out.println("true");
		}
		else
			System.out.println("false");

	
		
	}

}
