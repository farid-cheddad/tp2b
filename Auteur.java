public class Auteur {
    private String nom;
    private String citationTragedie;
    private int qualitéTragedie;
    private String citationComedie;
    private int qualitéComedie;
    private String citationDrame;
    private int qualitéDrame;


    public Auteur(String nom, int qualitéTragedie, String citationTragedie, int qualitéComedie, String citationComedie, int qualitéDrame, String citationDrame) {
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
        return "L'honorable" + this.nom;
    }
}