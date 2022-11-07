package Main;
import java.util.Scanner;

import sorular.*;
import sinavlar.*;

public class Main {
	
	static Scanner scanner = new Scanner(System.in);
	static Sorular soru = new CoktanSecmeliSorular();
	static Sinavlar sinav = new CoktanSecmeliSinav();
	static Sinavlar sinav2 = new KlasikSinav();
	static Sinavlar sinav3 = new KarisikSinav();
	
	public static void main(String[] args) {
		soru.soruEkle(new CoktanSecmeliSorular("Turkiyenin Baskenti?", 10, "Kolay", "A", "Ankara", "Istanbul", "Bursa", "Zonguldak"));
		soru.soruEkle(new CoktanSecmeliSorular("Almanyanin Baskenti?", 10, "Kolay", "B", "Munih", "Berlin", "Dortmund", "Koln"));
		soru.soruEkle(new CoktanSecmeliSorular("Ispanyanin Baskenti?", 15, "Orta", "D", "Barselona", "Ibiza", "Mallorca", "Madrid"));
		soru.soruEkle(new CoktanSecmeliSorular("Ingilterenin Baskenti?", 10, "Kolay", "A", "Londra", "Liverpool", "Birmingham", "Manchester"));
		soru.soruEkle(new CoktanSecmeliSorular("Isvecin Baskenti?", 15, "Zor", "A", "Stockolm", "Moskova", "Dublin", "Montreal"));
		soru.soruEkle(new CoktanSecmeliSorular("Norvecin Baskenti?", 15, "Zor", "C", "Bergen", "Hamburg", "Oslo", "Lofoten"));
		soru.soruEkle(new CoktanSecmeliSorular("Hollandanin Baskenti?", 15, "Orta", "D", "Rotterdam", "Bruksel", "Alkmaar", "Amsterdam"));
		soru.soruEkle(new CoktanSecmeliSorular("Romanyanin Baskenti?", 15, "Zor", "D", "Sevilla", "Transilvanya", "Pensilvanya", "Bukres"));
		soru.soruEkle(new CoktanSecmeliSorular("Italyanin Baskenti?", 10, "Kolay", "B", "Milano", "Roma", "Napoli", "Pisa"));
		soru.soruEkle(new CoktanSecmeliSorular("Amerikanin Baskenti?", 15, "Orta", "A", "New York", "Los Angeles", "Washington(D.C)", "Miami"));
		
		soru.soruEkle(new KlasikSorular("Ronesans Donemi Sanatcilari Kimlerdir ve Neler Yapmislardir?", 15, "Orta"));
		soru.soruEkle(new KlasikSorular("Cumhuriyet Donemi Sairlerinin Ozellikleri Nelerdir?", 15, "Zor"));
		soru.soruEkle(new KlasikSorular("Arsenal Neden Sampiyonlar Ligini Kazanamadi? Aciklayiniz.", 15, "Zor"));
		soru.soruEkle(new KlasikSorular("Turkiyenin Ekonomisi Nasil Duzelir?", 15, "Zor"));
		soru.soruEkle(new KlasikSorular("En Sevdiginiz Kitabi Anlatiniz.", 15, "Kolay"));
		soru.soruEkle(new KlasikSorular("Siralama Algoritmalari Nelerdir?", 15, "Orta"));
		soru.soruEkle(new KlasikSorular("Kuantum Bilgisayarlarini Basit Olarak Aciklayiniz.", 15, "Orta"));
		soru.soruEkle(new KlasikSorular("Kaptan Yosun Seker Adasina Gidebildi Mi?", 15, "Zor"));
		soru.soruEkle(new KlasikSorular("Game Of Thrones'a Alternatif Bir Son Yaziniz.", 15, "Kolay"));
		soru.soruEkle(new KlasikSorular("Neden Spor Yapmaliyiz?", 15, "Orta"));

		
		soru.soruEkle(new BoslukDoldurmaSorulari("Bosluga ... gelmelidir.", 15, "Zor", "dogru cevap"));
		soru.soruEkle(new BoslukDoldurmaSorulari("Maymunlarin ... gozu vardir.", 5, "Kolay", "iki"));
		soru.soruEkle(new BoslukDoldurmaSorulari("Tavsanlarin ... ayagi vardir.", 5, "Kolay", "dort"));
		soru.soruEkle(new BoslukDoldurmaSorulari("Yere dusersek canimiz ... .", 5, "Orta", "acir"));
		soru.soruEkle(new BoslukDoldurmaSorulari("Kaplumbaga ... .", 5, "Kolay", "deden"));
		soru.soruEkle(new BoslukDoldurmaSorulari("Ingilizce ... ana dilidir.", 5, "Kolay", "Ingilizlerin"));
		soru.soruEkle(new DogruYanlisSorulari("Turkiye super guctur.", 10, "Kolay", "D"));
		soru.soruEkle(new DogruYanlisSorulari("Almanya bizi kiskaniyor.", 5, "Orta", "D"));
		soru.soruEkle(new DogruYanlisSorulari("Ekonomi gozlerdeki isiltidan anlasilir.", 15, "Zor", "D"));
		soru.soruEkle(new DogruYanlisSorulari("Turk lirasi deger kaybediyor", 5, "Kolay", "Y"));
		soru.soruEkle(new DogruYanlisSorulari("Neden", 15, "Zor", "Y"));

		anaMenu();

		
	}
	
	
	private static void anaMenu() {
		
		int secim = -1;
		do {
			System.out.println("Sinav Uygulamasina Hos Geldiniz");
			System.out.println("1-Soru Bankasina Soru Ekleme");
			System.out.println("2-Soru Bankasindan Soru Cikarma");
			System.out.println("3-Soru Bankasindaki Sorulari Listeleme");
			System.out.println("4-Sinav Olusturma");
			System.out.println("5-Cikis");
			System.out.println("Lutfen Seciminizi Yapiniz:");
			secim = scanner.nextInt();
			
			switch(secim) {
				case 1 : soruEklemeMenusu();
					break;
				case 2 : soruCikarmaMenusu();
					break;
				case 3 : soruListelemeMenusu();
					break;
				case 4 : sinavMenusu();
					break;
			}
		}while(secim != 5);
	}
	
	private static void sinavMenusu() {
		int secim = -1;
		do {
			System.out.println("Sinav Menusune Hos Geldiniz");
			System.out.println("1-Klasik Sinav Olusturma");
			System.out.println("2-Test Sinavi Olusturma");
			System.out.println("3-Karisik Sinav Olusturma");
			System.out.println("4-Ana Menu");
			System.out.println("Lutfen Seciminizi Yapiniz:");
			secim = scanner.nextInt();
			
			switch(secim) {
				case 1 : klasikSinavMenusu();
					break;
				case 2 : testSinavMenusu();
					break;
				case 3 : karisikSinavMenusu();
					break;
			}
		}while(secim != 4);
	}
	
	private static void karisikSinavMenusu() {
		System.out.println("Karisik Sinava Hosgeldiniz.");
		System.out.println("Sinaviniz Basliyor.");
		KarisikSinav kar = (KarisikSinav) sinav3;
		kar.sinavUret(soru.getSoruBankasi());
		kar.sinavSorulariGetir();
	}
	
	private static void testSinavMenusu() {
		System.out.println("Test Sinavina Hosgeldiniz.");
		System.out.println("Sinaviniz Basliyor.");
		CoktanSecmeliSinav cs = (CoktanSecmeliSinav) sinav;
		cs.sinavUret(soru.getSoruBankasi());
		cs.sinavSorulariGetir();
	}
	
	private static void klasikSinavMenusu() {
		System.out.println("Klasik Sinava Hosgeldiniz.");
		System.out.println("Sinaviniz Basliyor.");
		KlasikSinav ks = (KlasikSinav) sinav2;
		ks.sinavUret(soru.getSoruBankasi());
		ks.sinavSorulariGetir();
	}
	
	
	
	private static void soruListelemeMenusu() {
		int secim = -1;
		do {
			System.out.println("Soru Listeleme Menusune Hos Geldiniz");
			System.out.println("1-Soru Metni Icinde Arayarak Listeleme");
			System.out.println("2-Soru Siklarinin Metinleri Icinde Arayarak Listeleme");
			System.out.println("3-Dogru Siklari Uzerinden Listeleme");
			System.out.println("4-Puan Uzerinden Listeleme");
			System.out.println("5-Zorluk Derecesi Uzerinden Listeleme");
			System.out.println("6-Tum Sorulari Listele");
			System.out.println("7-Ana Menuye Don");
			System.out.println("Lutfen Seciminizi Yapiniz:");
			secim = scanner.nextInt();		
			scanner.nextLine();
			
			
			switch(secim) {
				case 1 : soruMetniIcindeArayarakListele();
					break;
				case 2 : soruSiklariIcindeArayarakListele();
					break;
				case 3 : dogruSiklarUzerindenListele();
					break;
				case 4 : puanUzerindenListele();
					break;
				case 5 : zorlukDerecesiUzerindenListele();
					break;
				case 6 : tumSorulariListele();
					break;
			}
		}while(secim != 7);
		
	}
	
	private static void tumSorulariListele() {
		System.out.println("Tum Sorular");
		soru.soruListele();
	}
	
	private static void soruMetniIcindeArayarakListele() {
		System.out.println("Lufen listelemek istediginiz sorularin icerisinde gecen birseyler giriniz:");
		String metin = scanner.nextLine();
		soru.soruMetniUzerindenArayarakListeleme(metin);
	}
	
	private static void soruSiklariIcindeArayarakListele() {
		System.out.println("Lutfen listelemek istediginiz sorularin siklari icerisinde gecen birseyler giriniz:");
		String metin = scanner.nextLine();
		CoktanSecmeliSorular css = (CoktanSecmeliSorular) soru;
		css.soruSiklarininIcindeArayarakListeleme(metin);
	}
	
	private static void dogruSiklarUzerindenListele() {
		System.out.println("Lutfen listelemek istediginiz sorularin dogru sikkini giriniz:");
		String metin = scanner.nextLine();
		CoktanSecmeliSorular css = (CoktanSecmeliSorular) soru;
		css.dogruSiklarUzerindenArayarakListeleme(metin);
	}
	
	private static void puanUzerindenListele() {
		System.out.println("Lutfen listelemek istediginiz sorularin puanini giriniz:");
		int puan = scanner.nextInt();
		soru.puanUzerindenListele(puan);
	}
	
	private static void zorlukDerecesiUzerindenListele() {
		System.out.println("Lutfen listelemek istediginiz sorularin zorluk derecesini giriniz:");
		String zorlukDerecesi = scanner.nextLine();
		soru.zorlukDerecesiUzerindenListele(zorlukDerecesi);
	}
	
	private static void soruCikarmaMenusu() {
		System.out.println("Lutfen silmek istediginiz soru icerisinde gecen birseyler giriniz:");
		String soruMetni = scanner.nextLine();
		scanner.nextLine();
		soru.soruMetniUzerindenArayarakListeleme(soruMetni);
		
		System.out.println("Lutfen silmek istediginiz sorunun idsini giriniz:");
		int secim = scanner.nextInt();
		soru.secilenSoruyuCikar(secim);
		System.out.println("Soru basariyla silindi.");
		
	}
	
	private static void soruEklemeMenusu() {
		int secim = -1;
		do {
			System.out.println("Soru Ekleme Menusune Hos Geldiniz");
			System.out.println("1-Coktan Secmeli Soru Ekleme");
			System.out.println("2-Bosluk Doldurma Sorusu Ekleme");
			System.out.println("3-Dogru Yanlis Sorusu Ekleme");
			System.out.println("4-Klasik Soru Ekleme");
			System.out.println("5-Ana Menuye Don");
			System.out.println("Lutfen Seciminizi Yapiniz:");
			secim = scanner.nextInt();
			scanner.nextLine();
			
			switch(secim) {
				case 1 : coktanSecmeliSoruEkle();
					break;
				case 2 : boslukDoldurmaSoruEkle();
					break;
				case 3 : dogruYanlisSoruEkle();
					break;
				case 4 : klasikSoruEkle();
					break;
			}
		} while(secim != 5);
	}
	
	private static String soruMetniEkleme() {
		System.out.println("Soru metnini giriniz:");
		String soruMetni = scanner.nextLine();
		return soruMetni;
	}
	
	private static int soruPuaniEkleme() {
		System.out.println("Puani giriniz:");
		int puan = scanner.nextInt();
		scanner.nextLine();
		return puan;
	}
	
	private static String soruZorlukDerecesiEkleme() {
		System.out.println("Zorluk derecesi giriniz:");
		return scanner.nextLine();
	}
	
	private static String soruDogruCevapEkleme() {
		System.out.println("Dogru cevabi giriniz:");
		return scanner.nextLine();
	}
	
	private static String soruSikkiEkleme(String sik) {
		System.out.println(sik + " sikkini giriniz:");
		return scanner.nextLine();
	}
	
	private static void coktanSecmeliSoruEkle() {
		String soruMetni = soruMetniEkleme();
		int puan = soruPuaniEkleme();
		String zorlukDerecesi = soruZorlukDerecesiEkleme();
		String dogruCevap = soruDogruCevapEkleme();
		String aSikki = soruSikkiEkleme("A");
		String bSikki = soruSikkiEkleme("B");
		String cSikki = soruSikkiEkleme("C");
		String dSikki = soruSikkiEkleme("D");
		Sorular yeniSoru = new CoktanSecmeliSorular(soruMetni, puan, zorlukDerecesi, dogruCevap, aSikki,
				bSikki, cSikki, dSikki);
		soru.soruEkle(yeniSoru);
		soru.soruListele();
	}
	
	private static void boslukDoldurmaSoruEkle() {
		String soruMetni = soruMetniEkleme();
		int puan = soruPuaniEkleme();
		String zorlukDerecesi = soruZorlukDerecesiEkleme();
		String dogruCevap = soruDogruCevapEkleme();
		
		Sorular yeniSoru = new BoslukDoldurmaSorulari(soruMetni, puan, zorlukDerecesi, dogruCevap);
		soru.soruEkle(yeniSoru);
	}
	
	private static void dogruYanlisSoruEkle() {
		String soruMetni = soruMetniEkleme();
		int puan = soruPuaniEkleme();
		String zorlukDerecesi = soruZorlukDerecesiEkleme();
		String dogruCevap = soruDogruCevapEkleme();
		
		Sorular yeniSoru = new DogruYanlisSorulari(soruMetni, puan, zorlukDerecesi, dogruCevap);
		soru.soruEkle(yeniSoru);
	}
	
	private static void klasikSoruEkle() {
		String soruMetni = soruMetniEkleme();
		int puan = soruPuaniEkleme();
		String zorlukDerecesi = soruZorlukDerecesiEkleme();
		
		Sorular yeniSoru = new KlasikSorular(soruMetni, puan, zorlukDerecesi);
		soru.soruEkle(yeniSoru);
	}

}
