import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
    	Scanner s=new Scanner(System.in);
    	System.out.print("enter units :");
        int a =s.nextInt() ;
        System.out.print("if late enter 1,else 2:");
        int b =s.nextInt() ;
        double v=0;
        	if(a<=100) {
        		v=(a*0.5)+10;
        		
        	}
        	else if(a<=300) {
        		v=(100*0.5);
        		v+=((a-100)*0.5)+10;
        		
        	}
        	else {
        		v=(100*0.5);
        		v+=(200*0.75);
        		v+=((a-300)*1.2)+10;
        		
        	}
        
        	if(b==1) {
        		v+=(5*v)/100;
        	}
        
        	System.out.println("Total bill: $"+v);
        
    }
}
