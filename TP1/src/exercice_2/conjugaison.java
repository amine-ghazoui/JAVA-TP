package exercice_2;

public class conjugaison {
    public String[] pronomPersonnels = {"je", "tu", "il/elle", "nous", "vous", "ils/elles"};

    public void verbePremGrp(String verbe){

        String mot1 = verbe.substring(verbe.length() - 2);
        String mot2 = verbe.substring(verbe.length() - 3);


        if (mot1.equals("er") && !verbe.equals("aller") && !mot2.equals("yer") && !mot2.equals("ger") && !mot2.equals("cer")) {
            for (String pronom : pronomPersonnels) {
                if (pronom.equals("je")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "e");
                } else if (pronom.equals("tu")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "es");
                } else if (pronom.equals("il/elle")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "e");
                } else if (pronom.equals("nous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ons");
                } else if (pronom.equals("vous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ez");
                } else if (pronom.equals("ils/elles")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ent");
                }
            }
        }

        // Pour les verbes en "yer"
        else if (!verbe.equals("aller") && mot2.equals("yer")) {
            for (String pronom : pronomPersonnels) {
                if (pronom.equals("je")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 3) + "ie");
                } else if (pronom.equals("tu")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 3) + "ies");
                } else if (pronom.equals("il/elle")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 3) + "ie");
                } else if (pronom.equals("nous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ons");
                } else if (pronom.equals("vous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ez");
                } else if (pronom.equals("ils/elles")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 3) + "ient");
                }
            }
        }

        // Pour les verbes en "ger"
        else if (!verbe.equals("aller") && mot2.equals("ger")) {
            for (String pronom : pronomPersonnels) {
                if (pronom.equals("je")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "e");
                } else if (pronom.equals("tu")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "es");
                } else if (pronom.equals("il/elle")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "e");
                } else if (pronom.equals("nous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "eons");
                } else if (pronom.equals("vous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ez");
                } else if (pronom.equals("ils/elles")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ent");
                }
            }
        }

        // Pour les verbes en "cer"
        else if (!verbe.equals("aller") && mot2.equals("cer")) {
            for (String pronom : pronomPersonnels) {
                if (pronom.equals("je")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "e");
                } else if (pronom.equals("tu")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "es");
                } else if (pronom.equals("il/elle")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "e");
                } else if (pronom.equals("nous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "çons");
                } else if (pronom.equals("vous")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ez");
                } else if (pronom.equals("ils/elles")) {
                    System.out.println(pronom + " " + verbe.substring(0, verbe.length() - 2) + "ent");
                }
            }
        }

        else {
            System.out.println("Le verbe est de 3ème groupe ou d'un autre groupe!");
        }
    }
}
