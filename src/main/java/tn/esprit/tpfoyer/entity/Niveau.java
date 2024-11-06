package tn.esprit.tpfoyer.entity;

public enum Niveau {
    PREMIERE("1ERE"),
    DEUXIEME("2EME"),
    TROISIEME("3EME"),
    QUATRIEME("4EME"),
    CINQUIEME("5EME");

    private final String label;

    // Constructeur
    Niveau(String label) {
        this.label = label;
    }

    // Méthode pour obtenir le label
    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
}
