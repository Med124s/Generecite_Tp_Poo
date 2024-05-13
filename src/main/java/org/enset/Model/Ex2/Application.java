package org.enset.Model.Ex2;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();

        // Boucle de menu
        boolean quitter = false;
        while (!quitter) {
            // Affichage du menu
            System.out.println("\nMenu:");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter le programme.");

            // Lecture du choix de l'utilisateur
            int choix = LectureEntier("Votre choix : ");

            switch (choix) {
                case 1:
                    afficherListeProduits(metier);
                    break;
                case 2:
                    rechercherProduitParId(metier);
                    break;
                case 3:
                    ajouterNouveauProduit(metier);
                    break;
                case 4:
                    supprimerProduitParId(metier);
                    break;
                case 5:
                    quitter = true;
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez saisir un nombre entre 1 et 5.");
            }
        }
    }

    // Méthode utilitaire pour lire un entier depuis l'entrée standard
    private static int LectureEntier(String message) {
        System.out.print(message);
        return Integer.parseInt(System.console().readLine());
    }

    // Méthodes du menu

    private static void afficherListeProduits(MetierProduitImpl metier) {
        List<Produit> produits = metier.getAll();
        if (produits.isEmpty()) {
            System.out.println("La liste des produits est vide.");
        } else {
            System.out.println("Liste des produits :");
            for (Produit produit : produits) {
                System.out.println(produit);
            }
        }
    }

    private static void rechercherProduitParId(MetierProduitImpl metier) {
        long id = LectureEntier("Entrez l'id du produit à rechercher : ");
        Produit produit = metier.findById(id);
        if (produit != null) {
            System.out.println("Produit trouvé : " + produit);
        } else {
            System.out.println("Produit non trouvé.");
        }
    }

    private static void ajouterNouveauProduit(MetierProduitImpl metier) {
        long id = LectureEntier("Entrez l'id du nouveau produit : ");
        String nom = System.console().readLine("Entrez le nom du nouveau produit : ");
        String marque = System.console().readLine("Entrez la marque du nouveau produit : ");
        double prix = Double.parseDouble(System.console().readLine("Entrez le prix du nouveau produit : "));
        String description = System.console().readLine("Entrez la description du nouveau produit : ");
        int nombreEnStock = LectureEntier("Entrez le nombre en stock du nouveau produit : ");

        Produit nouveauProduit = new Produit(id, nom, marque, prix, description, nombreEnStock);
        metier.add(nouveauProduit);
        System.out.println("Nouveau produit ajouté avec succès.");
    }

    private static void supprimerProduitParId(MetierProduitImpl metier) {
        long id = LectureEntier("Entrez l'id du produit à supprimer : ");
        metier.delete(id);
        System.out.println("Produit supprimé avec succès.");
    }
}

