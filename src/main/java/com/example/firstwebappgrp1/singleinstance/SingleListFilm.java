package com.example.firstwebappgrp1.singleinstance;

import com.example.firstwebappgrp1.service.FilmService;
import com.example.firstwebappgrp1.service.LivreService;

public class SingleListFilm {
    public static final FilmService filmService = new FilmService();
}
