package com.seminnova.mvpar.monumentosvalledupar;

public class CategoriaObject {

    private String nom;
    private int img;

    public CategoriaObject(String nom, int img) {
        this.nom = nom;
        this.img = img;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

}
