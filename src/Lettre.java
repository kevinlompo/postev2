import java.io.StringBufferInputStream;
import java.text.DecimalFormat;

public class Lettre extends ObjetPostal {
    boolean exUr = false;
    protected String prixT = "";
    public Lettre(String nom, String adresse, String nomVille, int codePost, boolean exRec, boolean exUrg) {
        super(nom, adresse, nomVille, codePost, exRec);
        this.exUr = exUrg;
    }
    public void prixAff() {
        double prixN = 0.53;
        String str  = "";
        DecimalFormat df = new DecimalFormat("0.00");
        if(exRec) prixN += 1.5;
        if (exUr) prixN += 0.6;
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
    public void setExUr(boolean exUr) {
        this.exUr = exUr;
    }
    @Override
    public String toString() {
        String aff = "";
        aff = "Type = lettre " + "\n";
        aff += super.toString();
        if (exRec) aff += "en recommande, " + "\n";
        else if (!exRec) aff += "pas recommande, " + "\n";
        if (exUr) aff += "en urgence, " + "\n";
        else if (!exUr) aff += "pas en urgence, " + "\n";
        aff += "Son tarif d'affrenchissement = " + prixT + "\n";
        return aff;
    }
}
