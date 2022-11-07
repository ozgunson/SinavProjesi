package sinavlar;

import java.util.Vector;

import sorular.*;

public class CoktanSecmeliSinav extends Sinavlar {
	
	public CoktanSecmeliSinav() {
		super();
	}
	
	public CoktanSecmeliSinav(String ogrenciAdi, int ogrenciNumarasi) {
		super(ogrenciAdi, ogrenciNumarasi);
	}
	
	
	
	@Override
	public void sinavUret(Vector<Sorular> soruBankasi) {
		while(toplamPuan < 96) {
			Sorular soru = rastgeleSoruAl(soruBankasi);
			
			if(soru instanceof CoktanSecmeliSorular) {
				if(ayniSoruKontrol(soru)) {
					puanKontroluIleSoruEkle(soru);
				}
			}
		}
	}
	
	
	@Override
	public void sinavSorulariGetir() {
		alinanPuan = 0;
		for(Sorular soru : sinavSorulari) {
			if(soru instanceof CoktanSecmeliSorular) {
				((CoktanSecmeliSorular) soru).soruVeSiklariYazdir((CoktanSecmeliSorular) soru);
				
				alinanPuan += puanAlindiMi(soru);
			}
		}
		System.out.println(alinanPuan);
	}
	
}
