import java.util.Scanner ;

public class sýnýfgecmekalmadurumu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int math, psy, turk, chem, music ;
	
	Scanner input = new Scanner(System.in);
	
	System.out.print("Matematik notunuz: ");
	math= input.nextInt();
	
	System.out.print("Fizik notunuz: ");
	psy = input.nextInt();
	
	
	System.out.print("Türkçe notunuz: ");
	turk = input.nextInt();
	
	
	System.out.print("Kimya notunuz: ");
	chem = input.nextInt();
	
	
	System.out.print("Müzik notunuz: ");
	music = input.nextInt();
	
	//calculatitng the gpa
	double gpa =( math+psy+turk+chem+music)/5.00;
	if(gpa<=55) {
		System.out.println("Sýnýfta kaldýnýz, seneye tekrar görüþmek üzere ! \nOrtalamanýz: "+ gpa);
	}
	else {
			System.out.println("Tebrikler sýnýfý geçtiniz ! \nOrtalamanýz: "+ gpa);
			
		}
		
	}
	
	
	

	}


