import java.util.Scanner ;

public class s�n�fgecmekalmadurumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int math, psy, turk, chem, music ;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Matematik notunuz: ");
	math= input.nextInt();
	
	System.out.print("Fizik notunuz: ");
	psy = input.nextInt();
	
	
	System.out.print("T�rk�e notunuz: ");
	turk = input.nextInt();
	
	
	System.out.print("Kimya notunuz: ");
	chem = input.nextInt();
	
	
	System.out.print("M�zik notunuz: ");
	music = input.nextInt();
	
	//calculatitng the gpa
	double gpa =( math+psy+turk+chem+music)/5.00;
	if(gpa<=55) {
		System.out.println("S�n�fta kald�n�z, seneye tekrar g�r��mek �zere ! \nOrtalaman�z: "+ gpa);
	}
	else {
			System.out.println("Tebrikler s�n�f� ge�tiniz ! \nOrtalaman�z: "+ gpa);
			
		}
		
	}
	
	
	

	}


