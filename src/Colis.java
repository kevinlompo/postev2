import java.text.DecimalFormat;

public class Colis extends ObjetPostal {
    double poids;
    protected String prixT = "";
    public Colis(String nom, String adresse, String nomVille, int codePost, boolean exRec, double poids) {
        super(nom, adresse, nomVille, codePost, exRec);
        this.poids = poids;
    }
    public void prixAff() {
        double poidsT = poids*1000;
        DecimalFormat df = new DecimalFormat("0.00");
        String str = "";
        double prixN = 0;
        if (poidsT <= 100) prixN = 0.8;
        if(poidsT > 100) {
            prixN = (poidsT*0.8)/100;
        }
        if(exRec) prixN += 3;
        str = df.format(prixN) + " euros";
        this.prixT = str;
    }
    public void setNom(String nom) {
        super.nom = nom;
    }
    public void setAdresse(String adresse) {
        super.adresse = adresse;
    }
    public void setCodePost(int codePost) {
        super.codePost = codePost;
    }
    public void setNomVille(String nomVille) {
        super.nomVille = nomVille;
    }
    public void setExRec(boolean exRec) {
        super.exRec = exRec;
    }
    public void setPoids(double poids) {
        this.poids = poids;
    }
    @Override
    public String toString() {
        String aff = "";
        aff = "Type = colis " + "\n";
        aff += super.toString();
        if (exRec) aff += "en recommande " + "\n";
        else if (!exRec) aff += "pas recommande " + "\n";
        aff += "Poids : " + this.poids + " Kgs" + "\n";
        aff += "Son tarif d'affrenchissement = " + prixT + "\n";
        return aff;
    }
}
