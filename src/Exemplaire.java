public class Exemplaire {
    private Oeuvre oeuvre;

    public Exemplaire(Oeuvre oeuvre) {
        this.oeuvre = oeuvre;
        System.out.println("Nouvel exemplaire -> " + oeuvre.getTitre() + ", " + oeuvre.getAuteur().getNom() + ", en " + oeuvre.getLangue());
    }

    public Exemplaire(Exemplaire exemplaire) {
        this.oeuvre = exemplaire.oeuvre;
        System.out.println("Copie d’un exemplaire de -> " + oeuvre.getTitre() + ", " + oeuvre.getAuteur().getNom() + ", en " + oeuvre.getLangue());
    }

    public Oeuvre getOeuvre() {
        return oeuvre;
    }

    public void afficher() {
        System.out.print("Un exemplaire de ");
        oeuvre.afficher();
    }
}