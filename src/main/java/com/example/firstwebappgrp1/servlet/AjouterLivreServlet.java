package com.example.firstwebappgrp1.servlet;

import com.example.firstwebappgrp1.entity.Livre;
import com.example.firstwebappgrp1.service.LivreService;
import com.example.firstwebappgrp1.singleinstance.SingleListLivre;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AjouterLivre", value = "/ajouter-livre")
public class AjouterLivreServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/jsp/ajouterLivre.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titre = req.getParameter("titre");
        String auteur = req.getParameter("auteur");
        String genre = req.getParameter("genre");
        String annee = req.getParameter("annee");

        Livre livre = new Livre(auteur, genre, annee, titre);
        SingleListLivre.livreService.ajouterLivre(livre);

        resp.sendRedirect("liste-livre");
    }
}
