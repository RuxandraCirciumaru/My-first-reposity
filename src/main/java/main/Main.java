package main;

import itfactory.Clothing;
import itfactory.Electronics;
import itfactory.PersonalCare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Se cer datele unui produs de tip Imbracaminte");
        System.out.print("Nume: ");
        String clothingName = scanner.nextLine();
        System.out.print("Pret: ");
        double clothingPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Tip imbracaminte: ");
        String clothingType = scanner.nextLine();

        Clothing clothing = new Clothing(clothingName, clothingPrice, 0, clothingType);
        System.out.println("Pretul produsului de tip Imbracaminte este: " + clothing.calculatePrice());

        System.out.println("Se cer datele unui produs de tip Ingrijire");
        System.out.print("Nume: ");
        String careName = scanner.nextLine();
        System.out.print("Pret: ");
        double carePrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Returnabil: ");
        boolean returnable = Boolean.parseBoolean(scanner.nextLine());

        PersonalCare personalCare = new PersonalCare(careName, carePrice, 0, returnable);
        System.out.println("Pretul produsului de tip Ingrijire este: " + personalCare.calculatePrice());


        System.out.println("Se cer datele unui produs de tip Electronice");
        System.out.print("Nume: ");
        String electronicName = scanner.nextLine();
        System.out.print("Pret: ");
        double electronicPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Voltaj: ");
        int voltage = Integer.parseInt(scanner.nextLine());

        Electronics electronics = new Electronics(electronicName, electronicPrice, 0, voltage);
        System.out.println("Pretul produsului de tip Electronice este: " + electronics.calculatePrice());

        scanner.close();
    }
}
