package com.example.imc;

public class Patient
{
    private String name;
    private String surname;
    private float taille;
    private float poids;
    private String nbchambre;

    public Patient(String name, String surname, float taille, float poids, String nbchambre) {
        this.name = name;
        this.surname = surname;
        this.taille = taille;
        this.poids = poids;
        this.nbchambre = nbchambre;
    }

}
