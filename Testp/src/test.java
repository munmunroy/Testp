import java.util.Scanner;
public class test {
	
    public void speed(String a, String b) {
    double p1,p2;
    if(a.equals("Hatchback") && b.equals("preimium") ){
	        p1=(120000*5)/100;
	        p2=p1 + (20*p1)/100;
		System.out.println("car is hatchback");
		System.out.println("car amout : 120000");
	        System.out.println("insurance amt"+p2);
	    }else if (a.equals("Hatchback") && b.equals("basic") ){
	       p1=(120000*5)/100;
	       System.out.println("car is hatchback");
		System.out.println("car amout : 120000");
	        System.out.println("insurance amt"+p1);
	    }
   else if (a.equals("Sedan") && b.equals("preimium") ){
	        p1=(1000000*8)/100;
	        p2=p1 + (20*p1)/100;
	        System.out.println("car is Sedan");
		System.out.println("car amout : 1000000");
	        System.out.println("insurance amt"+p2);
	    }else if (a.equals("Sedan") && b.equals("basic") ){
	       p1=(1000000*8)/100;
	       System.out.println("car is Sedan");
		System.out.println("car amout : 1000000");
	        System.out.println("insurance amt"+p1);
	    }
   else if(a.equals("SUV") && b.equals("preimium") ){
	        p1=(2000000*10)/100;
	        p2=p1 + (20*p1)/100;
	        System.out.println("car is SUV");
		System.out.println("car amout : 2000000");
	        System.out.println("insurance amt"+p2);
	    }else{
	       p1=(2000000*8)/100;
	       System.out.println("car is SUV");
		System.out.println("car amout : 2000000");
	        System.out.println("insurance amt"+p1);
	    }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("Enter of the the car Hatchback,Sedan,SUV:");
		    Scanner s = new Scanner(System.in);
		    String a = s.nextLine();
		    System.out.println("Enter type of insurance basic or preimium");
		    String b = s.nextLine();
		    Main myCar = new Main();
		    myCar.speed(a,b);
		    System.out.println("Do you want to add one more car(Y/N)");
		    String nextCar = s.nextLine();
		    while(nextCar.equals("Y")) {
		        System.out.println("Enter of the the car Hatchback,Sedan,SUV");
		        String a_mod = s.nextLine();
		    System.out.println("Enter type of insurance basic or preimium");
		    String b_mod = s.nextLine();
		    myCar.speed(a_mod,b_mod);
		    System.out.println("Do you want to add one more car(Y/N)");
		    String nextCar_mod = s.nextLine();
		    nextCar = nextCar_mod;
		    
		        
		    }
		   
	   }
	}


