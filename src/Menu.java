//August & Jens
public class Menu {

  private final String[] MANAGE_MEMBER_MENU = {"1. Add new member", "2. View member list ", "3. Delete a member", "4. Edit a members info", "9. Back to main menu"};
  private final String[] MAIN_MENU = {"1. Foreman", "2. Cashier", "3. Coach", "9. Quit"};
  private final String[] EDIT_MEMBER_MENU = {"1. Change name", "2. Change Age", "3. Change memberStatus", "9. Back to menu"};
  private final String[] COACH_MENU = {"1. View top 5", "9. Back to menu"};
  private final String[] TOP_5_MENU = {"1. Top 5 Breast Swim - Junior", "2. Top 5 Crawl - Junior", "3. Top 5 Back crawl - Junior", "4. Top 5 Butterfly - Senior", "5. top 5 Breast Stroke - Senior", "6. top 5 crawl Stroke - Senior", "7. top 5 back crawl Stroke - Senior", "8. top 5 Butterfly - Senior", "9. Back to Coach Menu"};
  private final String[] CASHIER_MENU = {"1. Display MembershipPayment total", "2. Display Total Payment", "3. Display Debt Members total", "4. Display Difference Total", "5. Display Debt Members info", "9. Back to Cashier Menu"};

  public void printMainMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < MAIN_MENU.length; i++) {
      ui.display(MAIN_MENU[i]);
    }
    ui.printFormatLines();
  }

  public void printForemanMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < MANAGE_MEMBER_MENU.length; i++) {
      ui.display(MANAGE_MEMBER_MENU[i]);
    }
    ui.printFormatLines();
  }

  public void printEditMemberMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < EDIT_MEMBER_MENU.length; i++) {
      ui.display(EDIT_MEMBER_MENU[i]);
    }
    ui.printFormatLines();
  }

  public void printCoachMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < COACH_MENU.length; i++) {
      ui.display(COACH_MENU[i]);
    }
    ui.printFormatLines();
  }

  public void printTop5Menu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < TOP_5_MENU.length; i++) {
      ui.display(TOP_5_MENU[i]);
    }
    ui.printFormatLines();
  }

  public void cashierMenu(Ui ui) {
    ui.printFormatLines();
    for (int i = 0; i < CASHIER_MENU.length; i++) {
      ui.display(CASHIER_MENU[i]);
    }
    ui.printFormatLines();
  }
}