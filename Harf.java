package proje1;

import java.util.*;

public class Harf {

public static void main (String [] args) {
	
	// Bu program, sizden vize ve final notlarýnýzý ister ve BAIBU sistemine göre harf notunuzu hesaplar.
	
	double ortalama;
	
	Scanner puan = new Scanner (System.in);
	
	System.out.println("Vize notunuzu giriniz: ");
	int vize1 = puan.nextInt();
	
	System.out.println("Final notunuzu giriniz: " );
	int fnl = puan.nextInt();
	
	ortalama = (((vize1*40)/ 100) + ((fnl*60)/100));
	
	System.out.println("Ders ortalamaniz: " +ortalama);
	
	if (vize1 >100  || fnl >100) {
		System.out.println("Hatali giris yaptiniz. Notunuz en fazla 100 olabilir..");
	}
	
	else if (ortalama >= 90) {
		System.out.println("Harf notunuz AA. Tebrikler ! Dersten gectiniz.");
	}
	
		else if (90>ortalama && ortalama>=85) {
			System.out.println("Harf notunuz BA. Dersten gectiniz.");
			}
	
		else if (85>ortalama&& ortalama>=80) {
			System.out.println("Harf notunuz BB. Dersten gectiniz.");
			
		}
		else if (80>ortalama && ortalama>= 75) {
			System.out.println("Harf notunuz CB. Dersten gectiniz.");
			
		}
		else if (75 >ortalama && ortalama>=65 ) {
			System.out.println("Harf notunuz CC. Dersten gectiniz.");
		}
		else if (65>ortalama && ortalama>=60) {
			System.out.println("Harf notunuz DC. Dersten gectiniz.");
			}
		else if (60>ortalama && ortalama>=55) {
			System.out.println("Harf notunuz DD. Dersten gectiniz.");
			}	
		else if (55> ortalama && ortalama >= 50) {
				System.out.println("Harf notunuz FD. Dersten kaldiniz.");
			}
		else {
			System.out.println("Harf notunuz FF. Dersten kaldiniz.");
		}
	
}
}

