package com.example.firstwebappgrp1.entity;

public class Livre {

    private String auteur;
    private String genre;
    private String annee;
    private String titre;

    public Livre(String auteur, String genre, String annee, String titre) {
        this.auteur = auteur;
        this.genre = genre;
        this.annee = annee;
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
}
