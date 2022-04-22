package ru.skypro;

public class Main {

    public static void checkYear(int y) {
        if (y % 4 == 0) {
            System.out.println(y + " - visokosnyi god");
        } else {
            System.out.println(y + " - normalnyi fevral");
        }
    }


    public static void checkOS(int OS, int clientDeviceYear) {
        if (OS == 1 && clientDeviceYear < 2015) {
            System.out.println("Ustanovite lite versiyu dlya Androida");
        } else if (OS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Ustanovite versiyu dlya Androida");
        } else if (OS == 0 && clientDeviceYear < 2015) {
            System.out.println("Ustanovite lite versiyu dlya iOS");
        } else if (OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Ustanovite versiyu dlya iOS");
        }
    }


    public static void deliverCard(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance <= 20) {
            System.out.println("Dostavka zaimet " + deliveryDays + " den");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Dostavka zaimet " + (deliveryDays + 1) + " dnya");
        } else if (deliveryDistance > 60 && deliveryDistance <=100) {
            System.out.println("Dostavka zaimet " + (deliveryDays + 2) + " dnya");
        } else {
            System.out.println("V vash raion dostavka ne osushestvlyaetsya");
        }

    }


    public static void reverseArray (int reverce[]) {
        for (int a = reverce.length-1; a >= 0; a--) {
            if(a!=0) {
                System.out.print(reverce[a] + ", ");
            } else {
                System.out.print(reverce[a]);
            }
        }
    }


    public static void deleteDuplicate (String duplicate) {

        int duplicateLenght = duplicate.length();
        for (int i = 0; i < duplicateLenght-1; i++) {
            if (duplicate.charAt(i) == duplicate.charAt(i+1)) {
                System.out.println("Dubl - " + "'" + duplicate.charAt(i+1) + "'");
                break;
            }
        }
    }



    public static void main(String[] args) {
        System.out.println("Zadanie 1");
        System.out.println();
        int y = 2000;
        checkYear(y);
        System.out.println();
        System.out.println("Zadanie 2");
        System.out.println();
        int OS = 1; // 1 - Android, 0 - iOS
        int clientDeviceYear = 2000; // god vypuska telephona
        checkOS(OS, clientDeviceYear);
        System.out.println();
        System.out.println("Zadanie 3");
        System.out.println();
        int deliveryDistance = 20;
        int deliveryDays = 1;
        deliverCard(deliveryDistance, deliveryDays);
        System.out.println();
        System.out.println();
        System.out.println("Zadanie 4");
        System.out.println();
        String duplicate = "assdf";
        deleteDuplicate(duplicate);
        System.out.println();
        System.out.println("Zadanie 5");
        System.out.println();
        int[] arr = {3,4,5,6};
        reverseArray(arr);



    }
}
