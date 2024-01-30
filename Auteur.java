public class Auteur {
    private String nom;
    private String citationTragedie;
    private int qualitéTragedie;
    private String citationComedie;
    private int qualitéComedie;
    private String citationDrame;
    private int qualitéDrame;
}

    public Auteur(String nom, String citationTragedie, int qualitéTragedie, String citationComedie, int qualitéComedie, String citationDrame, int qualitéDrame) {
        this.nom = nom;
        this.qualitéTragedie = qualitéTragedie;
        this.citationTragedie = citationTragedie;
        this.qualitéComedie = qualitéComedie;
        this.citationComedie = citationComedie;
        this.qualitéDrame = qualitéDrame;
        this.citationDrame = citationDrame;
    }

    public int getQualitéTragedie() {
        return this.qualitéTragedie;
    }

    public String toString() {
        return "L'honorable" + nom;
    }