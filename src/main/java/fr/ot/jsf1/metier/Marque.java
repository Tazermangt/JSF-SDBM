package fr.ot.jsf1.metier;

public class Marque
{

    private int id;
    private String libelle;
    private Pays pays;
    private Fabricant fabricant;

    public Marque(){
        id = 0;
        libelle = "";
    }

    public Marque(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
        this.pays = new Pays();
        this.fabricant = new Fabricant();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public Fabricant getFabricant() {
        return fabricant;
    }

    public void setFabricant(Fabricant fabricant) {
        this.fabricant = fabricant;
    }

    @Override
    public String toString() {
        return libelle;
    }
}
