package com.htwsaar.vs;

import java.util.Scanner;

public class CLI {
    private static final String[] MENU_ITEMS = {
            "Registrieren",
            "Einloggen (User)",
            "Einloggen (Admin)",
            "Beenden"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            int selection = scanner.nextInt();

            if (selection == MENU_ITEMS.length) {
                break;
            }

            switch (selection) {
                case 1:
                    register();
                    break;
                case 2:
                    loginUser();
                    break;
                case 3:
                    loginAdmin();
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }
    }

    private static void printMenu() {
        for (int i = 0; i < MENU_ITEMS.length; i++) {
            System.out.println((i + 1) + ". " + MENU_ITEMS[i]);
        }
    }

    private static void register() {
        // TODO: Implement register method
    }

    private static void loginUser() {
        UserCLI.main(null);
    }

    private static void loginAdmin() {
        AdminCLI.main(null);
    }
}