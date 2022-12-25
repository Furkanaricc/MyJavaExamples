
public class Daire extends Sekil {

	private int r; //yaricap
	
	
	public Daire(String isim,int r) {
		super(isim);
		this.r = r;
		
	
	}


	@Override
	void alanHesapla() {

		System.out.println(getIsim() + " alanı : "+(Math.PI*r*r));
		
	}

	

	
	
	
}
