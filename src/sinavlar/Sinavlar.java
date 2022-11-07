package sinavlar;

import Main.*;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

import sorular.*;

public abstract class Sinavlar {
	
	Scanner scanner = new Scanner(System.in);
	
	Random r = new Random();
	
	protected int toplamPuan = 0;
	protected int alinanPuan;
	protected String ogrenciAdi;
	protected int ogrenciNumarasi;
	protected Vector<String> verilenCevaplar = new Vector<String>();
	protected Vector<Sorular> sinavSorulari = new Vector<Sorular>();
	
	public Sinavlar() {
	}
	
	public Sinavlar(String ogrenciAdi, int ogrenciNumarasi) {
		this.ogrenciAdi = ogrenciAdi;
		this.ogrenciNumarasi = ogrenciNumarasi;
	}
	
	public boolean ayniSoruKontrol(Sorular eklenecekSoru) {
		for (Sorular soru : sinavSorulari) {
			if(soru == eklenecekSoru) {
				return false;
			}
		}
		return true;
	}
	
	public Sorular rastgeleSoruAl(Vector<Sorular> soruBankasi) {
		
		int i = r.nextInt(soruBankasi.size());
		return soruBankasi.get(i);
		
	}
	
	public void sinavUret(Vector<Sorular> soruBankasi) {
		while(toplamPuan < 96) {
			
			Sorular soru = rastgeleSoruAl(soruBankasi);
			
			if(ayniSoruKontrol(soru)) {
				puanKontroluIleSoruEkle(soru);
			}
		}
	}
	
	
	public void puanKontroluIleSoruEkle(Sorular soru) {
		if(soru.getPuan() == 15 && toplamPuan <= 95) {
			sinavSorulari.add(soru);
			toplamPuan += 15;
		}
		else if(soru.getPuan() == 10 && toplamPuan <= 100) {
			sinavSorulari.add(soru);
			toplamPuan += 10;
		}
		else if(soru.getPuan() == 5 && toplamPuan <= 105) {
			sinavSorulari.add(soru);
			toplamPuan += 5;
		}
	}
	
	public String cevapVer() {
		System.out.println("Lutfen cevabinizi giriniz:");
		return scanner.nextLine();
	}
	
	public int puanAlindiMi(Sorular soru) {
		int puan = 0;
		String cevap = cevapVer();
		verilenCevaplar.add(cevap);
		if(cevap.equals(soru.getDogruCevap())) {
			puan += soru.getPuan();
		}
		return puan;
	}
	
//	public void soruYazdir(Sorular soru) {
//		System.out.println(soru.getSoruMetni());
//		System.out.println("puan:" + soru.getPuan());
//		System.out.println("zorluk derecesi:" + soru.getZorlukDerecesi());
//	}
	
	public abstract void sinavSorulariGetir();
	
	public void sinavSorulariGoster() {
		for(Sorular soru : sinavSorulari) {
			System.out.println(soru);
//			String something = scanner.nextLine();
//			verilenCevaplar.add(something);
		}
		System.out.println(toplamPuan);
	}

	public int getToplamPuan() {
		return toplamPuan;
	}

	public void setToplamPuan(int toplamPuan) {
		this.toplamPuan = toplamPuan;
	}

	public int getAlinanPuan() {
		return alinanPuan;
	}

	public void setAlinanPuan(int alinanPuan) {
		this.alinanPuan = alinanPuan;
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public int getOgrenciNumarasi() {
		return ogrenciNumarasi;
	}

	public void setOgrenciNumarasi(int ogrenciNumarasi) {
		this.ogrenciNumarasi = ogrenciNumarasi;
	}

	public Vector<String> getVerilenCevaplar() {
		return verilenCevaplar;
	}

	public void setVerilenCevaplar(Vector<String> verilenCevaplar) {
		this.verilenCevaplar = verilenCevaplar;
	}

	public Vector<Sorular> getSinavSorulari() {
		return sinavSorulari;
	}

	public void setSinavSorulari(Vector<Sorular> sinavSorulari) {
		this.sinavSorulari = sinavSorulari;
	}	
	
	

}
