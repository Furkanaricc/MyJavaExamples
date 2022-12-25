import java.util.Scanner;

public class Main {

	
	 public static void main(String[] args) {
	
		 Scanner scanner = new Scanner(System.in);
		 
		 String islemler ="İşlemler...\n"
				         +"1.Kare Alan Hesaplama\n"
				         +"2.Üçgen Alan Hesaplama\n"
				         +"3.Dire Alan Hesaplama\n"
				         +"Çıkış : q";
		 
		 while (true) {
			System.out.println(islemler); 
		 
			System.out.println("Hangi Şeklin Alan Hesaplamasını Yapmak istiyorsunuz : ");
			
			String sekilTuru = scanner.nextLine();
			Sekil sekil =null;
			
			if(sekilTuru.equals("q")) {
				System.out.println("Programdan Çıkılıyor.");
				break;
			}else if(sekilTuru.equals("1")) {
				System.out.println("Kare Alanı hesaplanacak. Kenar uzunluğunu giriniz.");
				int kenar = scanner.nextInt();
				scanner.nextLine();
				
				 sekil = new Kare("Kare",kenar);
				
				 sekil.alanHesapla();
				 
			}else if(sekilTuru.equals("2")) {
				System.out.println("Üçgen Alanı Hesaplanacak. Kenar uzunluklarını giriniz.\n"
						+ "Kenar 1 : ");
				int a = scanner.nextInt();
				System.out.println("Kenar 2 : ");
				int b = scanner.nextInt();
				System.out.println("Kenar 3 : ");
				int c =scanner.nextInt();
				scanner.nextLine();
			
			 
				sekil = new Ucgen("Üçgen",a,b,c);
				
				sekil.alanHesapla();
			
				
				
				
			}else if(sekilTuru.equals("3")) {
				
				System.out.println("Dairenin alanı hesaplanacak yarıçapı giriniz.");
				int r=scanner.nextInt();
				scanner.nextLine();
				
				 sekil =  new Daire("Daire",r);
				
				sekil.alanHesapla();
				
			}else
				System.out.println("Geçersiz işlem");
		
		 
		 }
		
	 }
			
	
	}

