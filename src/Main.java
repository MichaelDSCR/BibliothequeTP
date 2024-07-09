public class Main {
    public static void main(String[] args) {
        Bibliotheque bibliotheque = new Bibliotheque("municipale");

        Auteur hugo = new Auteur("Victor Hugo", true);
        Auteur dumas = new Auteur("Alexandre Dumas", false);
        Auteur queneau = new Auteur("Raymond Queneau", true);

        Oeuvre lesMiserables = new Oeuvre("Les Miserables", hugo, "francais");
        Oeuvre hommeQuiRit = new Oeuvre("L’Homme qui rit", hugo, "francais");
        Oeuvre monteCristo = new Oeuvre("Le Comte de Monte-Cristo", dumas, "francais");
        Oeuvre zazie = new Oeuvre("Zazie dans le metro", queneau, "francais");
        Oeuvre countMonteCristo = new Oeuvre("The count of Monte-Cristo", dumas, "anglais");

        bibliotheque.stocker(lesMiserables, 2);
        bibliotheque.stocker(hommeQuiRit);
        bibliotheque.stocker(monteCristo, 3);
        bibliotheque.stocker(zazie);
        bibliotheque.stocker(countMonteCristo);

        System.out.println("La bibliotheque " + bibliotheque.getNom() + " offre");
        for (Exemplaire exemplaire : bibliotheque.listerExemplaires("")) {
            exemplaire.afficher();
            System.out.println();
        }

        System.out.println("Les exemplaires en anglais sont");
        for (Exemplaire exemplaire : bibliotheque.listerExemplaires("anglais")) {
            exemplaire.afficher();
            System.out.println();
        }

        System.out.println("Les auteurs a succes sont");
        bibliotheque.afficherAuteurs();

        System.out.println("Il y a " + bibliotheque.compterExemplaires(monteCristo) + " exemplaires de " + monteCristo.getTitre());
    }
}