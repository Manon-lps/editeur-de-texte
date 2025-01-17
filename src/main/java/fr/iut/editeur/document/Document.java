package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }

    public void remplacer(int debut, int fin, String remplacement) {
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        texte = partieGauche + remplacement + partieDroite;
    }
    public void majuscules(int debut, int fin) {
        String maj = "";
        String partieGauche = texte.substring(0, debut);
        String partieDroite = texte.substring(fin + 1);
        for(int i = debut; i <= fin; i++) {
           maj += Character.toUpperCase(texte.charAt(i));
        }
        texte = partieGauche + maj + partieDroite;
    }
	
    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }
}
