package com.company;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 Добавить трату/пополнение");
        System.out.println("2 Удалить трату/пополнение");
        System.out.println("3 Узнать текущий счёт");
        System.out.println("4 Вывести все траты/пополнения");
        System.out.println("5 Вывести траты по определенной категории");
        System.out.println("0 Выход");
        String[][] mas = new String[100][3];
        Scanner scan = new Scanner(System.in);
        String menu = scan.nextLine();
        while (!(new String(menu).equals("0"))) {
            switch (menu) {
                case ("1"):
                    System.out.println("Введите категорию и сумму:");
                    String n1 = scan.nextLine();
                    String[] lines = n1.split(" ");
                    for (int i = 0; i < 100; i++) {
                        if (mas[i][0] == null) {
                            mas[i][0] = Integer.toString(i+1);
                            mas[i][1] = lines[0];
                            mas[i][2] = lines[1];
                            break;
                        }
                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                case ("2"):
                    System.out.println("Введите номер траты/пополнения, которую необходимо удалить:");
                    String n2 = scan.nextLine();
                    mas[new Integer(n2)-1][0] = null;
                    mas[new Integer(n2)-1][1] = null;
                    mas[new Integer(n2)-1][2] = null;
                    System.out.println("-----------------------------------------------------");
                    break;
                case ("3"):
                    Integer sum = 0;
                    for (int i = 0; i < 100; i++) {

                        if (mas[i][2] != null) {
                            sum += new Integer(mas[i][2]);
                        }
                    }
                    System.out.println("Ваш текущий счёт: " + sum);
                    System.out.println("-----------------------------------------------------");
                    break;
                case ("4"):
                    System.out.println("Ваши траты/пополнения:");
                    for (int i = 0; i < 100; i++) {
                        if (mas[i][0] != null) {
                            System.out.println(mas[i][0] + " " + mas[i][1] +" "+ mas[i][2]);
                        }

                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                case ("5"):
                    System.out.println("Введите категорию:");
                    String n5 = scan.nextLine();
                    for (int i = 0; i < 100; i++) {
                        if (mas[i][0] != null) {
                            if (new String(mas[i][1]).equals(n5)) {
                                System.out.println(mas[i][0] + " " + mas[i][1] + " " + mas[i][2]);
                            }
                        }
                    }
                    System.out.println("-----------------------------------------------------");
                    break;
                default:
                    System.out.println("Ошибка");
                    break;
            }
                System.out.println("1 Добавить трату/пополнение");
                System.out.println("2 Удалить трату/пополнение");
                System.out.println("3 Узнать текущий счёт");
                System.out.println("4 Вывести все траты/пополнения");
                System.out.println("5 Вывести траты по определенной категории");
                System.out.println("0 Выход");
                menu = scan.nextLine();
            }

        }

    }







