package sinavlar;

import sorular.*;

public class KarisikSinav extends Sinavlar{

	public KarisikSinav() {
		super();
	}
	
	public KarisikSinav(String ogrenciAdi, int ogrenciNumarasi) {
		super(ogrenciAdi, ogrenciNumarasi);
	}

	@Override
	public void sinavSorulariGetir() {
		// TODO Auto-generated method stub
		for (Sorular soru : sinavSorulari) {
			
			if(soru instanceof CoktanSecmeliSorular) {
				((CoktanSecmeliSorular) soru).soruVeSiklariYazdir((CoktanSecmeliSorular)soru);
			}
			else {
				soru.soruYazdir(soru);
			}
			verilenCevaplar.add(cevapVer());
		}
		
		for(String cevap : verilenCevaplar) {
			System.out.println(cevap);
		}
	}
	
	
}
