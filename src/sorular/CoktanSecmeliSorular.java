package sorular;

import java.util.Vector;

public class CoktanSecmeliSorular extends Sorular{
	
	private String aSikki;
	private String bSikki;
	private String cSikki;
	private String dSikki;
//	private Vector<CoktanSecmeliSorular> coktanSecmeliSoruBankasi = new Vector<CoktanSecmeliSorular>();
	public CoktanSecmeliSorular() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CoktanSecmeliSorular(String soruMetni, int puan, String zorlukDerecesi,String dogruCevap,
			String aSikki, String bSikki, String cSikki, String dSikki) {
		super(soruMetni, puan, zorlukDerecesi, dogruCevap);
		this.aSikki = aSikki;
		this.bSikki = bSikki;
		this.cSikki = cSikki;
		this.dSikki = dSikki;
	}
	int sayac = 0;
	
	private void soruSikkiarama(CoktanSecmeliSorular cs, String aranacakMetin) {
		if(cs.aSikki.contains(aranacakMetin) || cs.bSikki.contains(aranacakMetin) || cs.cSikki.contains(aranacakMetin)
				|| cs.dSikki.contains(aranacakMetin)) {
			System.out.println(cs.toString());
		}
	}
	public void soruSiklarininIcindeArayarakListeleme(String aranacakMetin) {
		for(Sorular soru : soruBankasi) {
			if(soru instanceof CoktanSecmeliSorular) {
				soruSikkiarama((CoktanSecmeliSorular) soru, aranacakMetin);
			}
		}
	}
	
	private void dogruSikArama(CoktanSecmeliSorular cs, String aranacakSik) {
		if(cs.dogruCevap.contains(aranacakSik)) {
			System.out.println(cs.toString());
		}
	}
	
	public void dogruSiklarUzerindenArayarakListeleme(String aranacakSik) {
		for(Sorular soru : soruBankasi) {
			if(soru instanceof CoktanSecmeliSorular) {
				dogruSikArama((CoktanSecmeliSorular) soru, aranacakSik);
			}
		}
	}

	public String getaSikki() {
		return aSikki;
	}

	public void setaSikki(String aSikki) {
		this.aSikki = aSikki;
	}

	public String getbSikki() {
		return bSikki;
	}

	public void setbSikki(String bSikki) {
		this.bSikki = bSikki;
	}

	public String getcSikki() {
		return cSikki;
	}

	public void setcSikki(String cSikki) {
		this.cSikki = cSikki;
	}

	public String getdSikki() {
		return dSikki;
	}

	public void setdSikki(String dSikki) {
		this.dSikki = dSikki;
	}

	@Override
	public String toString() {
		return "CoktanSecmeliSorular [aSikki=" + aSikki + ", bSikki=" + bSikki + ", cSikki=" + cSikki + ", dSikki="
				+ dSikki + ", soruMetni=" + soruMetni + ", puan=" + puan + ", zorlukDerecesi=" + zorlukDerecesi
				+ ", dogruCevap=" + dogruCevap + ", soruId=" + soruId + "]";
	}

	
	public void soruVeSiklariYazdir(CoktanSecmeliSorular soru) {
		soruYazdir(soru);
		System.out.println("a)" + soru.getaSikki());
		System.out.println("b)" + soru.getbSikki());
		System.out.println("c)" + soru.getcSikki());
		System.out.println("d)" + soru.getdSikki());
	}
	
	
	

}
