
public class AsalSayı {

	public static void main(String[] args) {
		
		int number = -5;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;												//Fonksiyona girdiğinde doğruysa diğer fonksiyonlara sokmaz
		}
		
		if(number<1) {
			System.out.println("Geçersiz bir sayı girdiniz");
			return;
		}
		
		for(int i = 2;i<number;i++) { 
			if(number % i == 0) {
				isPrime = false;
			}	
		}	
		
		if(isPrime) {
			System.out.println("Sayı asaldır");
		}else {
			System.out.println("Sayı asal değildir");
		}
		
		
		
		
		
		
		
	}

}
