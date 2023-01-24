package com.htwsaar.vs;

import java.util.Scanner;

public class UserCLI {
  private static final String[] MENU_ITEMS = {
      "Message senden",
      "Message empfangen",
      "Gruppen Chat erstellen",
      "Gruppen Chat User hinzufügen",
      "Gruppen Chat User entfernen",
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
          sendMessage();
          break;
        case 2:
          receiveMessage();
          break;
        case 3:
          createGroupChat();
          break;
        case 4:
          addUserToGroupChat();
          break;
        case 5:
          removeUserToGroupChat();
          break;
        case 6:
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

  private static void sendMessage() {
    // TODO: Implement sendMessage method
  }

  private static void receiveMessage() {
    // TODO: Implement receiveMessage method
  }

  private static void createGroupChat() {
    // TODO: Implement createGroupChat method
  }

  private static void addUserToGroupChat() {
    // TODO: Implement createGroupChat method
  }

  private static void removeUserToGroupChat() {
    // TODO: Implement createGroupChat method
  }
}