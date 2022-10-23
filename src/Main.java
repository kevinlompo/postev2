import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
/*        Colis colis1 = new Colis("Vincent", "Av. Berthelot", "Paris", 75005, false, 0.741);
        Colis colis2 = new Colis("Dubois", "Bd Victor Hugo", "Toulon", 83000, true, 1.387);
        Lettre lettre1 = new Lettre("Dupont", "Rue Colbert", "Marseille", 13001, false, true);
        Lettre lettre2 = new Lettre("Durand", "Rue Joloit-Cuire", "Marseille", 13013, true, false);*/

        List<ObjetPostal> BoiteALettres = new ArrayList<ObjetPostal>();

        for (int i = 0; i<=3; i++) {
            System.out.println("\n" + "** Objet n° " + i + " : ");
            BoiteALettres.add(menu());
            System.out.println("\n" + BoiteALettres.get(i).toString());
        }
    }

    public static ObjetPostal menu(){
        Lettre lettre = null;
        Colis colis = null;
        Scanner sc = new Scanner(System.in);
        String swValue = "";
        System.out.println("============================");
        System.out.println("|   MENU DE SELECTION       |");
        System.out.println("============================");
        System.out.println("| Options:                  |");
        System.out.println("|        1. LETTRE          |");
        System.out.println("|        2. COLIS           |");
        System.out.println("|        3. Exit            |");
        System.out.println("============================");
        swValue = sc.nextLine();

        while(!swValue.matches("[1-3]")) {
            System.out.println("sois 1 2 3");
            menu();
        }
        if (swValue.equals("1")){
            lettre = lettreInfo();
            return lettre;
        }
        else if(swValue.equals("2")) {
            colis = colisInfo();
            return colis;
        }
        else if(swValue.equals("3")) {
            System.out.println("Exit selected");
            System.exit(0);
        }

        return null;
    }
    public static Lettre lettreInfo() {
        Scanner sc = new Scanner(System.in);
        String v;
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Lettre lettre = new Lettre("", "", "", 00000, false, true);
        System.out.print("Entrer le nom du destinataire de la lettre : ");
        lettre.setNom(sc.nextLine());
        System.out.print("Entrer l'adresse du destinataire de la lettre : ");
        lettre.setAdresse(sc.nextLine());
        System.out.print("Entrer la ville du destinataire de la lettre : ");
        lettre.setNomVille(sc.nextLine());
        System.out.print("Entrer le code postal du destinataire de la lettre :  ");
        lettre.setCodePost(sc.nextInt());
        System.out.print("Est-elle en recommandee ? (1 pour oui et 2 pour non ) : ");
        v = sc.nextLine();
        while (!v.matches("[1-2]")){
            System.out.print("Est-elle en recommandee ? (1 pour oui et 2 pour non ) : ");
            v = sc.nextLine();
        }
        lettre.setExRec(v.equals("1")?true:false);
        System.out.print("Est-elle en urgence ? (1 pour oui et 2 pour non ) : ");
        v = sc.nextLine();
        while (!v.matches("[1-2]")){
            System.out.print("Est-elle en urgence ? (1 pour oui et 2 pour non ) : ");
            v = sc.nextLine();
        }
        lettre.setExUr(v.equals("1")?true:false);
        lettre.prixAff();
        return lettre;
    }
    public static Colis colisInfo() {
        Scanner sc = new Scanner(System.in);
        Colis colis = new Colis("", "", "", 00000, false, 0);
        String v;
        System.out.print("Entrer le nom du destinataire du colis : " );
        colis.setNom(sc.nextLine());
        System.out.print("Entrer l'adresse du destinataire du colis : ");
        colis.setAdresse(sc.nextLine());
        System.out.print("Entrer la ville du destinataire du colis : ");
        colis.setNomVille(sc.nextLine());
        System.out.print("Entrer le code postal du destinataire du colis : ");
        colis.setCodePost(sc.nextInt());
        v = sc.nextLine();
        while (!v.matches("[1-2]")){
            System.out.print("Est-il en recommande ? (1 pour oui et 2 pour non ) : ");
            v = sc.nextLine();
        }
        colis.setExRec(v.equals("1")?true:false);
        System.out.print("Entrer le poids du colis : ");
        colis.setPoids(sc.nextDouble());
        colis.prixAff();
        return colis;
    }

}