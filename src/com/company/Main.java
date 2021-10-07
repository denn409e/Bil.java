package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
        Rat rat = new Rat(50, true, false, true);
        Motor motor = new Motor("v8", 4000);
        Bremse bremse = new Bremse(3000, 10);
        Hjul hjul = new Hjul(22, "Goodyear", "Sommer", 12);
        Bil bil = new Bil("Ford", "GT", 22567, 4,0.1,12.542,0,bremse, rat, motor, hjul);
*/
        String Biltype;
        System.out.println("Hvad type/mærke er din bil");
        Scanner s_bilType = new Scanner(System.in);
        Biltype = s_bilType.nextLine();

        String Model;
        System.out.println("Hvad model er det");
        Scanner s_Model = new Scanner(System.in);
        Model = s_Model.nextLine();

        int stelnummer;
        System.out.println("Hvad er dit stelnummer");
        Scanner s_stelnummer = new Scanner(System.in);
        stelnummer = s_stelnummer.nextInt();
        if(s_stelnummer.nextInt() <= 0);

        int antal_døre;
        System.out.println("Hvor mange døre har din bil");
        Scanner s_aDøre = new Scanner(System.in);
        antal_døre = s_aDøre.nextInt();
        if(s_aDøre.nextInt() <= 0);

        String softwareversion;
        System.out.println("Hvad softwareversion bruger din bil");
        Scanner s_softver = new Scanner(System.in);
        softwareversion = s_softver.nextLine();

        String GPS_kordinater;
        System.out.println("Hvad er dine kordinater");
        Scanner s_GPS = new Scanner(System.in);
        GPS_kordinater = s_GPS.nextLine();

        float Hastighed;
        System.out.println("Hvor hurtigt køre du lige nu");
        Scanner s_hastighed = new Scanner(System.in);
        Hastighed = s_hastighed.nextFloat();

        int diameter;
        System.out.println("Indtast rattets diameter");
        Scanner s_diameter = new Scanner(System.in);
        diameter = s_diameter.nextInt();
        if (s_diameter.nextInt() <= 0)
        {
            //System.out.println(s_diameter);
        }
        boolean plys = false;
        System.out.println("Har rattet plys ja/nej");
        Scanner s_plys = new Scanner(System.in);
        if(s_plys.nextLine().equalsIgnoreCase("ja")) {
            plys = true;
        }


        boolean læder = false;
        System.out.println("Har rattet læder ja/nej");
        Scanner s_læder = new Scanner(System.in);
        if(s_læder.nextLine().equalsIgnoreCase("ja")){
            læder = true;
        }

        boolean horn = false;
        System.out.println("Har rattet et horn ja/nej");
        Scanner s_horn = new Scanner(System.in);
        if(s_horn.nextLine().equalsIgnoreCase("ja")){
            horn = true;
        }

        String motorType;
        System.out.println("Hvad type motor har din bil eks. V8, V10...");
        Scanner s_motorType = new Scanner(System.in);
        motorType = s_motorType.nextLine();

        int omdrejninger;
        System.out.println("Hvor mange omdrejninger i minuttet køre din bil ved 100km/t");
        Scanner s_omdrejninger = new Scanner(System.in);
        if(s_omdrejninger.nextInt() <= 0);

        int bVægt;
        System.out.println("Hvor meget vejer dine bremser tilsammen");
        Scanner s_bVægt = new Scanner(System.in);
        if(s_bVægt.nextInt() <= 0);

        int bOile;
        System.out.println("Hvor mange liter bremseoile har din bil");
        Scanner s_bOile = new Scanner(System.in);
        if(s_bOile.nextInt() <=0);

        int tommer;
        System.out.println("Hvor mange tommer er dine dæk");
        Scanner s_tommer = new Scanner(System.in);
        if(s_tommer.nextInt() <=0);

        String dNavn;
        System.out.println("Hvem producere dine hjul");
        Scanner s_dNavn = new Scanner(System.in);
        dNavn = s_dNavn.nextLine();

        String dType;
        System.out.println("Hvad type dæk har du sommer/vinter");
        Scanner s_dtype = new Scanner(System.in);
        dType = s_dtype.nextLine();

        float dTryk;
        System.out.println("Hvad er dit dæktryk i psi");
        Scanner s_dTryk = new Scanner(System.in);
        if(s_dTryk.nextFloat() <= 0);

        Bil minBil = new Bil();

    }

}

