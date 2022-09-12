import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		double wallet;
		int doll100;
		int doll50;
		int doll20;
		int doll10;
		int doll5;
		int doll2;
		int doll1;
		int doll05;
		int doll025;
		int doll010;
		int doll005;
		double doll001;

		doll100 = 0;
		doll50 = 0;
		doll20 = 0;
		doll10 = 0;
		doll5 = 0;
		doll2 = 0;
		doll1 = 0;
		doll05 = 0;
		doll025 = 0;
		doll010 = 0;
		doll005 = 0;
		doll001 = 0;

		wallet = input.nextDouble();

		while(wallet>=100){
			wallet = wallet - 100;
			doll100++;
		}
		
		while(wallet>=50){
			wallet = wallet - 50;
			doll50++;
		}
		
		while(wallet>=20){
			wallet = wallet - 20;
			doll20++;
		}
		
		while(wallet>=10){
			wallet = wallet - 10;
			doll10++;
		}
		
		while(wallet>=5){
			wallet = wallet - 5;
			doll5++;
		}
		
		while(wallet>=2){
			wallet = wallet - 2;
			doll2++;
		}
		
		while(wallet>=1){
			wallet = wallet - 1;
			doll1++;
		}

		while(wallet>=0.5){
			wallet = wallet - 0.5;
			doll05++;
		}
		
		while(wallet>=0.25){
			wallet = wallet - 0.25;
			doll025++;
		}
		
		while(wallet>=0.10){
			wallet = wallet - 0.1;
			doll010++;
		}
		
		while(wallet>=0.05){
			wallet = wallet - 0.05;
			doll005++;
		}

		doll001 = wallet;

		System.out.println("NOTAS:");
		System.out.println(doll100 + " nota(s) de R$ 100.00");
		System.out.println(doll50 + " nota(s) de R$ 50.00");
		System.out.println(doll20 + " nota(s) de R$ 20.00");
		System.out.println(doll10 + " nota(s) de R$ 10.00");
		System.out.println(doll5 + " nota(s) de R$ 5.00");
		System.out.println(doll2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(doll1 + " moeda(s) de R$ 1.00");
		System.out.println(doll05 + " moeda(s) de R$ 0.50");
		System.out.println(doll025 + " moeda(s) de R$ 0.25");
		System.out.println(doll010 + " moeda(s) de R$ 0.10");
		System.out.println(doll005 + " moeda(s) de R$ 0.05");
		System.out.printf("%.0f", doll001*100);
		System.out.println(" moeda(s) de R$ 0.01");
	}
}