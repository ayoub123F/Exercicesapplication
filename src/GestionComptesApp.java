public class GestionComptesApp {
    public static void main(String[] args) {
        // Création des comptes
        Compte c1 = new Compte(11111, "Ahmed", 20000);
        Compte c2 = new Compte(22222, "HAJAR", 30000);

        // Retrait d'un montant du premier compte
        c1.retirer(19000);

        // Retrait d'un montant du deuxième compte
        c2.retirer(45000);

        // Dépôt d'un montant dans le premier compte
        c1.deposer(15000);

        // Affichage des informations des comptes
        System.out.println("Informations du compte c1 :");
        c1.afficherCompteInfo();
        System.out.println("\nInformations du compte c2 :");
        c2.afficherCompteInfo();
    }
}
