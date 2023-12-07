package com.example.firstwebappgrp1.servlet;

import com.example.firstwebappgrp1.entity.Film;
import com.example.firstwebappgrp1.entity.Livre;
import com.example.firstwebappgrp1.singleinstance.SingleListFilm;
import com.example.firstwebappgrp1.singleinstance.SingleListLivre;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet(name = "listeFilms", value = "/liste-film")
public class ListeFilmServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ArrayList<Film> listFilm = SingleListFilm.filmService.getListFilm();

        req.setAttribute("listeFilms", listFilm);

        req.getRequestDispatcher("WEB-INF/jsp/listeFilm.jsp").forward(req, resp);
    }
}
