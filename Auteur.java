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
        this.citationTragedie = citationTragedie;
        this.qualitéTragedie = qualitéTragedie;
        this.citationComedie = citationComedie;
        this.qualitéComedie = qualitéComedie;
        this.citationDrame = citationDrame;
        this.qualitéDrame = qualitéDrame;
    }

    public int getQualitéTragedie() {
        return this.qualitéTragedie;
    }

    