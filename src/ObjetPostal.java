public class ObjetPostal {
    String nom = "", adresse = "", nomVille = "";
    int codePost = 0;
    boolean exRec = false;
    public ObjetPostal(String nom, String adresse, String nomVille, int codePost, boolean exRec){
        this.nom = nom;
        this.adresse = adresse;
        this.nomVille = nomVille;
        this.codePost = codePost;
        this.exRec = exRec;
    }
    public String toString(){
        return "Nom : " + nom + ", " +"Adresse : " + adresse + " " + + codePost + " " + nomVille + ", " ;
    }
}
