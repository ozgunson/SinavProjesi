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
	
//	public void soruVeSiklariYazdir(CoktanSecmeliSorular soru) {
//		soru.soruYazdir(soru);
//		System.out.println("a)" + soru.getaSikki());
//		System.out.println("b)" + soru.getbSikki());
//		System.out.println("c)" + soru.getcSikki());
//		System.out.println("d)" + soru.getdSikki());
//	}
	
	@Override
	public void sinavSorulariGetir() {
		alinanPuan = 0;
		for(Sorular soru : sinavSorulari) {
			if(soru instanceof CoktanSecmeliSorular) {
				((CoktanSecmeliSorular) soru).soruVeSiklariYazdir((CoktanSecmeliSorular) soru);
				
//				String cevap = cevapVer();
//				verilenCevaplar.add(cevap);
//				if(cevap.equals(soru.getDogruCevap())) {
//					alinanPuan += soru.getPuan();
//				}
				
				alinanPuan += puanAlindiMi(soru);
			}
		}
		System.out.println(alinanPuan);
	}
	
}
