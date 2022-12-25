
public class Ucgen extends Sekil {

	
	private int a;
	private int b;
	private int c;
	
	
	public Ucgen(String isim, int a2, int b2, int c2) {
		super(isim);
	this.a=a;
	this.b=b;
	this.c=c;
	}


	@Override
	public void alanHesapla() {
	
		double u = (a+b+c)/2.0;
		
		double alan= u*(u-a)*(u-b)*(u-c);
		
		System.out.println(getIsim() + " in alanı : "+alan);
		
	}


	


	


	
	
	
	
}
