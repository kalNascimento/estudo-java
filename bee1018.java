import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);

		int myCarteira;
		int carteira;
		int dolls100;
		int dolls50;
		int dolls20;
		int dolls10;
		int dolls5;
		int dolls2;
		int dolls1;

		dolls100 = 0;
		dolls50 = 0;
		dolls20 = 0;
		dolls10 = 0;
		dolls5 = 0;
		dolls2 = 0;
		dolls1 = 0;

		myCarteira = input.nextInt();
		carteira = myCarteira;

		while(carteira>=100){
			carteira = carteira - 100;
			dolls100++;
		}
		
		while(carteira>=50){
			carteira = carteira - 50;
			dolls50++;
		}
		
		while(carteira>=20){
			carteira = carteira - 20;
			dolls20++;
		}
		
		while(carteira>=10){
			carteira = carteira - 10;
			dolls10++;
		}
		
		while(carteira>=5){
			carteira = carteira - 5;
			dolls5++;
		}
		
		while(carteira>=2){
			carteira = carteira - 2;
			dolls2++;
		}
		
		while(carteira>=1){
			carteira = carteira - 1;
			dolls1++;
		}

		System.out.println(myCarteira);
		System.out.println(dolls100 + " nota(s) de R$ 100,00");
		System.out.println(dolls50 + " nota(s) de R$ 50,00");
		System.out.println(dolls20 + " nota(s) de R$ 20,00");
		System.out.println(dolls10 + " nota(s) de R$ 10,00");
		System.out.println(dolls5 + " nota(s) de R$ 5,00");
		System.out.println(dolls2 + " nota(s) de R$ 2,00");
		System.out.println(dolls1 + " nota(s) de R$ 1,00");
	}
}