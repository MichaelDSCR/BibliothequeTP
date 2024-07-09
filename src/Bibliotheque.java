import java.util.ArrayList;
import java.util.List;

public class Bibliotheque {
    private String nom;
    private List<Exemplaire> exemplaires;

    public Bibliotheque(String nom) {
        this.nom = nom;
        this.exemplaires = new ArrayList<>();
        System.out.println("La bibliothèque " + nom + " est ouverte !");
    }

    public String getNom() {
        return nom;
    }

    public int getNbExemplaires() {
        return exemplaires.size();
    }

    public void stocker(Oeuvre oeuvre, int n) {
        for (int i = 0; i < n; i++) {
            exemplaires.add(new Exemplaire(oeuvre));
        }
    }

    public void stocker(Oeuvre oeuvre) {
        stocker(oeuvre, 1);
    }

    public List<Exemplaire> listerExemplaires(String langue) {
        List<Exemplaire> result = new ArrayList<>();
        for (Exemplaire exemplaire : exemplaires) {
            if (langue.isEmpty() || exemplaire.getOeuvre().getLangue().equals(langue)) {
                result.add(exemplaire);
            }
        }
        return result;
    }

    public int compterExemplaires(Oeuvre oeuvre) {
        int count = 0;
        for (Exemplaire exemplaire : exemplaires) {
            if (exemplaire.getOeuvre().getTitre().equals(oeuvre.getTitre())) {
                count++;
            }
        }
        return count;
    }

    public void afficherAuteurs(boolean prime) {
        for (Exemplaire exemplaire : exemplaires) {
            if (exemplaire.getOeuvre().getAuteur().getPrix() == prime) {
                System.out.println(exemplaire.getOeuvre().getAuteur().getNom());
            }
        }
    }

    public void afficherAuteurs() {
        afficherAuteurs(true);
    }
}