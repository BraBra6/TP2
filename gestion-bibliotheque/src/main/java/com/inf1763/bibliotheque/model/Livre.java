package com.inf1763.bibliotheque.model;

import org.apache.commons.lang3.StringUtils;

/**
 * Classe représentant un livre dans la bibliothèque
 */
public class Livre {
    private Long id;
    private String titre;
    private String auteur;
    private String isbn;
    private int anneePublication;

    // Constructeur par défaut
    public Livre() {
    }

    // Constructeur avec paramètres
    public Livre(Long id, String titre, String auteur, String isbn, int anneePublication) {
        this.id = id;
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.anneePublication = anneePublication;
    }

    // Getters et Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public int getAnneePublication() { return anneePublication; }
    public void setAnneePublication(int anneePublication) { this.anneePublication = anneePublication; }

    /**
     * Vérifie si le livre est valide
     * Utilise Apache Commons Lang pour la validation
     */
    public boolean estValide() {
        return id != null
            && StringUtils.isNotBlank(titre)
            && StringUtils.isNotBlank(auteur)
            && StringUtils.isNotBlank(isbn)
            && anneePublication > 0;
    }

    @Override
    public String toString() {
        return "Livre{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", auteur='" + auteur + '\'' +
                ", isbn='" + isbn + '\'' +
                ", anneePublication=" + anneePublication +
                '}';
    }
}
