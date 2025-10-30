package com.inf1763.bibliotheque.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Livre
 */
class LivreTest {

    private Livre livre;

    @BeforeEach
    void setUp() {
        // Initialisation avant chaque test
        livre = new Livre();
    }

    @Test
    @DisplayName("Test du constructeur avec paramètres")
    void testConstructeurAvecParametres() {
        Livre livre = new Livre(1L, "Clean Code", "Robert C. Martin", "978-0132350884", 2008);

        assertEquals(1L, livre.getId());
        assertEquals("Clean Code", livre.getTitre());
        assertEquals("Robert C. Martin", livre.getAuteur());
        assertEquals("978-0132350884", livre.getIsbn());
        assertEquals(2008, livre.getAnneePublication());
    }

    @Test
    @DisplayName("Test d'un livre valide")
    void testLivreValide() {
        livre.setId(1L);
        livre.setTitre("Design Patterns");
        livre.setAuteur("Gang of Four");
        livre.setIsbn("978-0201633610");
        livre.setAnneePublication(1994);

        assertTrue(livre.estValide(), "Le livre devrait être valide");
    }

    @Test
    @DisplayName("Test avec titre vide")
    void testLivreTitreVide() {
        livre.setId(1L);
        livre.setTitre("");
        livre.setAuteur("Auteur Test");
        livre.setIsbn("978-1234567890");
        livre.setAnneePublication(2020);

        assertFalse(livre.estValide(), "Le livre ne devrait pas être valide avec un titre vide");
    }

    @Test
    @DisplayName("Test sans ID")
    void testLivreSansId() {
        livre.setTitre("Titre Test");
        livre.setAuteur("Auteur Test");
        livre.setIsbn("978-1234567890");
        livre.setAnneePublication(2020);

        assertFalse(livre.estValide(), "Le livre ne devrait pas être valide sans ID");
    }

    @Test
    @DisplayName("Test de la méthode toString")
    void testToString() {
        livre.setId(1L);
        livre.setTitre("Test");
        livre.setAuteur("Auteur");
        livre.setIsbn("123");
        livre.setAnneePublication(2020);

        String result = livre.toString();
        assertTrue(result.contains("Test"));
        assertTrue(result.contains("Auteur"));
        assertTrue(result.contains("123"));
        assertTrue(result.contains("2020"));
    }
}
