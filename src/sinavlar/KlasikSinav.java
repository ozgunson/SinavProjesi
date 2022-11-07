package sinavlar;

import java.util.Vector;

import sorular.*;

public class KlasikSinav extends Sinavlar{
	
	public KlasikSinav() {
		super();
	}
	
	public KlasikSinav(String ogrenciAdi, int ogrenciNumarasi) {
		super(ogrenciAdi, ogrenciNumarasi);
	}
	

	@Override
	public void sinavUret(Vector<Sorular> soruBankasi) {
		while(toplamPuan < 96) {
			Sorular soru = rastgeleSoruAl(soruBankasi);
			
			if(soru instanceof KlasikSorular) {
				if(ayniSoruKontrol(soru)) {
					puanKontroluIleSoruEkle(soru);
				}
			}
		}
	}

	@Override
	public void sinavSorulariGetir() {
		// TODO Auto-generated method stub
		for(Sorular soru : sinavSorulari) {
			if(soru instanceof KlasikSorular) {
				soru.soruYazdir(soru);
				verilenCevaplar.add(cevapVer());
			}
		}
		
		for(String cevap : verilenCevaplar) {
			System.out.println(cevap);
		}
		
	}
	
}
