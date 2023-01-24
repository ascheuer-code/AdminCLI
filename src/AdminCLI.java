import java.util.Scanner;

public class AdminCLI {
  private static final String[] MENU_ITEMS = {
      "System konfigurieren",
      "Benutzerpasswort ändern",
      "Benutzerpasswort resetten",
      "Online Nutzer anzeigen",
      "Nachrichten Pro Woche",
      "Nachrichten pro Chat/Gruppe",
      "Nachrichten in einem Zeitraum",
      "Nutzer löschen",
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
          configureSystem();
          break;
        case 2:
          changeUserPassword();
          break;
        case 3:
          resetUserPassword();
          break;
        case 4:
          showOnlineUsers();
          break;
        case 5:
          showMessagesPerWeek();
          break;
        case 6:
          showMessagesPerChatOrGroup();
          break;
        case 7:
          showMessagesInTimeRange();
          break;
        case 8:
          deleteUser();
          break;
        case 9:
          System.exit(0);
          break;
      }
    }
  }

  private static void showMessagesInTimeRange() {
  }

  private static void printMenu() {
    for (int i = 0; i < MENU_ITEMS.length; i++) {
      System.out.println((i + 1) + ". " + MENU_ITEMS[i]);
    }
  }

  private static void configureSystem() {
    // TODO: Implement configureSystem method
  }

  private static void changeUserPassword() {
    // TODO: Implement changeUserPassword method
  }

  private static void resetUserPassword() {
    // TODO: Implement resetUserPassword method
  }

  private static void showOnlineUsers() {
    // TODO: Implement showOnlineUsers method
  }

  private static void showMessagesPerWeek() {
    // TODO: Implement showMessagesPerWeek method
  }

  private static void showMessagesPerChatOrGroup() {
    // TODO: Implement showMessagesPerChatOrGroup method
  }

  private static void deleteUser() {
    // TODO: Implement deleteUser method
  }
}