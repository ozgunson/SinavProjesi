package sorular;

import java.util.Collections;
import java.util.Vector;

public abstract class Sorular implements Comparable<Sorular>{
	
	protected String soruMetni;
	protected int puan;
	protected String zorlukDerecesi;
	protected String dogruCevap;
	protected int soruId;
	protected Vector<Sorular> soruBankasi = new Vector<Sorular>();


	public Sorular(String soruMetni, int puan, String zorlukDerecesi, String dogruCevap) {
		this.soruMetni = soruMetni;
		this.puan = puan;
		this.zorlukDerecesi = zorlukDerecesi;
		this.dogruCevap = dogruCevap;
	}
	
	public Sorular() {
		
	}
	
	public void soruEkle(Sorular soru) {
		soruBankasi.add(soru);
		soru.soruId = soruBankasi.indexOf(soru);
	}
	
	public int getSoruBankasiSize() {
		return soruBankasi.size();
	}
	
	
	
	public Vector<Sorular> getSoruBankasi() {
		return soruBankasi;
	}

	public void setSoruBankasi(Vector<Sorular> soruBankasi) {
		this.soruBankasi = soruBankasi;
	}

	public Sorular getSoru(int index) {
		return soruBankasi.elementAt(index);
	}
	
	private void idAyarla() {
		for(int i = 0; i < soruBankasi.size(); i++) {
			Sorular s = soruBankasi.get(i);
			s.soruId = soruBankasi.indexOf(s);
		}
	}
	
	public void soruListele() {
		Collections.sort(soruBankasi);
		for(int i = 0; i < soruBankasi.size(); i++) {
			System.out.println(soruBankasi.elementAt(i).toString());
		}
	}
	
	public void puanUzerindenListele(int puan) {
		Collections.sort(soruBankasi);
		for(Sorular soru : soruBankasi) {
			if(soru.puan == puan) {
				System.out.println(soru);
			}
		}
	}
	
	public void zorlukDerecesiUzerindenListele(String zorlukDerecesi) {
		Collections.sort(soruBankasi);
		for(Sorular soru : soruBankasi) {
			if(soru.zorlukDerecesi.equals(zorlukDerecesi)) {
				System.out.println(soru);
			}
		}
	}
	
	public void soruCikar(Sorular soru) {
		soruBankasi.remove(soru);
		idAyarla();
	}
	
	public void soruMetniUzerindenArayarakListeleme(String aranacakMetin) {
		for(Sorular soru : soruBankasi) {
			if(soru.soruMetni.contains(aranacakMetin)) {
				System.out.println(soru.toString());
			}
		}
	}
	
	public void secilenSoruyuCikar(int id) {
		soruCikar(soruBankasi.get(id));		
	}
	
	@Override
	public String toString() {
		return "Sorular [soruMetni=" + soruMetni + ", puan=" + puan + ", zorlukDerecesi=" + zorlukDerecesi
				+ ", dogruCevap=" + dogruCevap + ", soruId=" + soruId + "]";
	}

	public int getSoruId() {
		return soruId;
	}

	public void setSoruId(int soruId) {
		this.soruId = soruId;
	}
	
	public String getSoruMetni() {
		return soruMetni;
	}

	public void setSoruMetni(String soruMetni) {
		this.soruMetni = soruMetni;
	}

	public int getPuan() {
		return puan;
	}

	public void setPuan(int puan) {
		this.puan = puan;
	}

	public String getZorlukDerecesi() {
		return zorlukDerecesi;
	}

	public void setZorlukDerecesi(String zorlukDerecesi) {
		this.zorlukDerecesi = zorlukDerecesi;
	}

	public String getDogruCevap() {
		return dogruCevap;
	}

	public void setDogruCevap(String dogruCevap) {
		this.dogruCevap = dogruCevap;
	}
	
	
	@Override
	public int compareTo(Sorular o) {
		// TODO Auto-generated method stub
		if(this.puan > o.puan) {
			return 1;
		}
		if(this.puan < o.puan) {
			return -1;
		}
		return 0;
	}	
	
	
	public void soruYazdir(Sorular soru) {
		System.out.println(soru.getSoruMetni());
		System.out.println("puan:" + soru.getPuan());
		System.out.println("zorluk derecesi:" + soru.getZorlukDerecesi());
	}
	
	

}
