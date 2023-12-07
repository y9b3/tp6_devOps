package com.example.firstwebappgrp1.service;

import com.example.firstwebappgrp1.entity.Film;

import java.util.ArrayList;

public class FilmService {

    private ArrayList<Film> listFilm;

    public FilmService() {
        listFilm= new ArrayList<>();
    }

    public void ajouterFilm(Film film){
        listFilm.add(film);
    }

    public ArrayList<Film> getListFilm() {
        return listFilm;
    }
}

