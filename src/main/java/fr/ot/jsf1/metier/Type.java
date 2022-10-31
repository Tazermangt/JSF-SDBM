package fr.ot.jsf1.metier;

public class Type {
    private int id;
    private String nom;

    public Type(){
        this.id = 0;
        this.nom = "";
    }
    public Type(int id, String nom){
        this.id = id;
        this.nom = nom;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString()
    {
        return nom;
    }
}
