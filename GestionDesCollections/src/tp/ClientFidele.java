package tp;

import java.util.List;

public class ClientFidele extends Client {
		
	String codeFidelite;
	float tauxDeReduction;
	 
	public ClientFidele(int codeClient, String nomClient, String adrClient,String telClient, List listCommandes) {
		super(codeClient, nomClient, adrClient, telClient, listCommandes);
		this.codeFidelite=codeFidelite;
		this.tauxDeReduction=tauxDeReduction;
		
	}
	public String getCodeFidelite() {
        return codeFidelite;
    }

    public void setCodeFidelite(String codeFidelite) {
        this.codeFidelite = codeFidelite;
    }

    public float getTauxReduction() {
        return tauxDeReduction;
    }

    public void setTauxReduction(float tauxReduction) {
        this.tauxDeReduction = tauxReduction;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCode de fidélité : " + codeFidelite +
                "\nTaux de réduction : " + tauxDeReduction + "%";
    }
	
}
