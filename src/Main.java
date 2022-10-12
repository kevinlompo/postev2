import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*        Colis colis1 = new Colis("Vincent", "Av. Berthelot", "Paris", 75005, false, 0.741);
        Colis colis2 = new Colis("Dubois", "Bd Victor Hugo", "Toulon", 83000, true, 1.387);
        Lettre lettre1 = new Lettre("Dupont", "Rue Colbert", "Marseille", 13001, false, true);
        Lettre lettre2 = new Lettre("Durand", "Rue Joloit-Cuire", "Marseille", 13013, true, false);*/

        ObjetPostal [] BoiteALettres = new ObjetPostal[4];

        for (int i = 0; i<BoiteALettres.length; i++) {
            System.out.println("\n" + "** Objet no " + i + " : ");
            BoiteALettres[i] = menu();
            System.out.println("\n" + BoiteALettres[i]);
        }
    }
    public static ObjetPostal menu() {
        Lettre lettre = null;
        Colis colis = null;
        Scanner sc = new Scanner(System.in);
        int swValue;
        System.out.println("============================");
        System.out.println("|   MENU DE SELECTION       |");
        System.out.println("============================");
        System.out.println("| Options:                  |");
        System.out.println("|        1. LETTRE          |");
        System.out.println("|        2. COLIS           |");
        System.out.println("|        3. Exit            |");
        System.out.println("============================");
        swValue = sc.nextInt();

        switch (swValue) {
            case 1:
                lettre = lettreInfo();
                break;
            case 2:
                colis = colisInfo();
                break;
            case 3:
                System.out.println("Exit selected");
                System.exit(0);
            default:
                System.out.println("Invalid selection");
                break;
            // This break is not really necessary
        }
        if (swValue == 1) {
            return lettre;
        }
        else if(swValue == 2) {
            return colis;
        }
        else return null;
    }
    public static Lettre lettreInfo() {
        Scanner sc = new Scanner(System.in);
        Lettre lettre = new Lettre("", "", "", 00000, false, true);
        System.out.print("Entrer le nom du destinataire de la lettre : " );
        lettre.setNom(sc.nextLine());
        System.out.print("Entrer l'adresse du destinataire de la lettre : ");
        lettre.setAdresse(sc.nextLine());
        System.out.print("Entrer la ville du destinataire de la lettre : ");
        lettre.setNomVille(sc.nextLine());
        System.out.print("Entrer le code postal du destinataire de la lettre ");
        lettre.setCodePost(sc.nextInt());
        System.out.print("Est-elle en recommandee ? " );
        lettre.setExRec(sc.nextBoolean());
        System.out.print("Est-elle en urgence ? ");
        lettre.setExUr(sc.nextBoolean());
        lettre.prixAff();
        return lettre;
    }
    public static Colis colisInfo() {
        Scanner sc = new Scanner(System.in);
        Colis colis = new Colis("", "", "", 00000, false, 0);
        System.out.print("Entrer le nom du destinataire du colis : " );
        colis.setNom(sc.nextLine());
        System.out.print("Entrer l'adresse du destinataire du colis : ");
        colis.setAdresse(sc.nextLine());
        System.out.print("Entrer la ville du destinataire du colis : ");
        colis.setNomVille(sc.nextLine());
        System.out.print("Entrer le code postal du destinataire du colis : ");
        colis.setCodePost(sc.nextInt());
        System.out.print("Est-il en recommande ? " );
        colis.setExRec(sc.nextBoolean());
        System.out.print("Entrer le poids du colis : ");
        colis.setPoids(sc.nextDouble());
        colis.prixAff();
        return colis;
    }
}