package Tests;

import Entities.Condition;

import static org.junit.jupiter.api.Assertions.*;

class ConditionTest {

    private Condition uneCategorie;
    private Condition estMembre;
    private Condition unNbDeJours;
    private Condition unEtat;

    @org.junit.jupiter.api.BeforeEach
    void setUp()
    {

    }

    @org.junit.jupiter.api.Test
    void valider()
    {
        Condition.Valider(12);
        String expected = unNbDeJours.toString();
        String actual = "12";
        assertEquals(expected,actual);

        Condition.Valider(34);
        expected = unNbDeJours.toString();
        actual = "34";
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculerMontantMaxCategorie()
    {
        Condition.calculerMontantMaxCategorie("Livres");
        String expected = uneCategorie.toString();
        String actual = "Livres";
        assertEquals(expected,actual);

        Condition.calculerMontantMaxCategorie("Jouets");
        expected = uneCategorie.toString();
        actual = "Jouets";
        assertEquals(expected,actual);

        Condition.calculerMontantMaxCategorie("Informatique");
        expected = uneCategorie.toString();
        actual = "Informatique";
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculerReductionMembre()
    {
        Condition.calculerReductionMembre(true);
        String expected = estMembre.toString();
        String actual = "true";
        assertEquals(expected,actual);
        Condition.calculerReductionMembre(false);
        expected = estMembre.toString();
        actual = "false";
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculerReducEtat()
    {
        Condition.calculerReductionEtat("Abimé");
        String expected = unEtat.toString();
        String actual = "Abimé";
        assertEquals(expected,actual);

        Condition.calculerReductionEtat("Très abimé");
        expected = unEtat.toString();
        actual = "Très abimé";
        assertEquals(expected,actual);

        Condition.calculerReductionEtat("Neuf");
        expected = unEtat.toString();
        actual = "Neuf";
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculerMontantRembourse()
    {
        Condition.calculerMontantRembourse(25,"Informatique",true,"Neuf",699);
        Condition.calculerMontantRembourse(40,"Livres",false,"Abimé",3);
        Condition.calculerMontantRembourse(15,"Jouets",false,"Très abimé",15);
        Condition.calculerMontantRembourse(10,"Livres",true,"Neuf",25);
        Condition.calculerMontantRembourse(32,"Jouets",true,"Abimé",150);
    }
}