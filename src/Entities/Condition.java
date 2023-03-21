package Entities;

public class Condition {
    static final int nbJours = 30;

    public static boolean Valider(int unNbDeJours) {
        if (nbJours > 30)
        {
            return false;
        } else
        {
            return true;
        }
    }

    public static int calculerMontantMaxCategorie(String uneCategorie) {
        int max = 0;
        if (uneCategorie.equals("Livres"))
        {
            max = 30;
        }
        else if (uneCategorie.equals("Jouets"))
        {
            max = 50;
        }
        else if (uneCategorie.equals("Informatique"))
        {
            max = 1000;
        }
        return max;
    }

    public static double calculerReductionMembre(boolean estMembre) {
        double deduction = 0;
        double prix = 0;

        if (estMembre = true)
        {
            deduction = prix - (prix * 0.2);
        }
        else if (estMembre = false)
        {
            deduction = prix;
        }
        return deduction;
    }

    public static double calculerReductionEtat(String unEtat) {
        double deduction = 0;
        double prix = 0;

        if (unEtat.equals("Neuf"))
        {
            deduction = prix - (prix * 0.1);
        }
        else if (unEtat.equals("Abimé") || unEtat.equals("Très abimé"))
        {
            deduction = prix - (prix * 0.3);
        }
        return deduction;
    }

    public static double calculerMontantRembourse ( int unNbDeJours, String uneCategorie,
                                                    boolean estMembre, String unEtat,int unPrix)
    {
        int montantMax = 0;

        return 0;
    }
    
}
