import java.util.ArrayList;
//August
public class CoachController {
  Ui ui = new Ui();
  ArrayList<Member> juniorCompetitors = new ArrayList<>();
  ArrayList<Member> seniorCompetitors = new ArrayList<>();
  ArrayList<Competitor> crawlSwimmerJuniors = new ArrayList<>();
  ArrayList<Competitor> breastSwimmerJuniors = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmerJuniors = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmerJuniors = new ArrayList<>();
  ArrayList<Competitor> crawlSwimmerSeniors = new ArrayList<>();
  ArrayList<Competitor> breastSwimmerSeniors = new ArrayList<>();
  ArrayList<Competitor> backCrawlSwimmerSeniors = new ArrayList<>();
  ArrayList<Competitor> butterflySwimmerSeniors = new ArrayList<>();
  Competitor competitor = new Competitor();
  Competition competition = new Competition();

  public void coachInitializer(ArrayList<Member> activeMembers, Menu menu) {
    competition.sortTeamsByAge(activeMembers, juniorCompetitors, seniorCompetitors);
    competition.assignSwimTeams(juniorCompetitors, competitor, crawlSwimmerJuniors, backCrawlSwimmerJuniors, breastSwimmerJuniors, butterflySwimmerJuniors);
    competition.assignSwimTeams(seniorCompetitors, competitor, crawlSwimmerSeniors, backCrawlSwimmerSeniors, breastSwimmerSeniors, butterflySwimmerSeniors);
    coachController(menu);
  }

  public void coachController(Menu menu) {

    String choice;
    boolean isRunning = true;
    do {
      menu.printCoachMenu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> top5Controller(ui, menu);
        case "9" -> isRunning = false;
      }
    } while (isRunning);

  }

  public void top5Controller(Ui ui, Menu menu) {
    competition.compareTimes(crawlSwimmerJuniors);
    competition.compareTimes(breastSwimmerJuniors);
    competition.compareTimes(backCrawlSwimmerJuniors);
    competition.compareTimes(butterflySwimmerJuniors);
    competition.compareTimes(crawlSwimmerSeniors);
    competition.compareTimes(breastSwimmerSeniors);
    competition.compareTimes(backCrawlSwimmerSeniors);
    competition.compareTimes(butterflySwimmerSeniors);
    String choice;
    boolean isRunning = true;
    do {
      menu.printTop5Menu(ui);
      ui.display("Enter number:");
      choice = ui.scanString();
      switch (choice) {
        case "1" -> competition.printBreast(ui, breastSwimmerJuniors);
        case "2" -> competition.printCrawl(ui, crawlSwimmerJuniors);
        case "3" -> competition.printBackCrawlTop5(ui, backCrawlSwimmerJuniors);
        case "4" -> competition.printButterfly(ui, butterflySwimmerJuniors);
        case "5" -> competition.printBreast(ui, breastSwimmerSeniors);
        case "6" -> competition.printCrawl(ui, crawlSwimmerSeniors);
        case "7" -> competition.printBackCrawlTop5(ui, backCrawlSwimmerSeniors);
        case "8" -> competition.printButterfly(ui, butterflySwimmerSeniors);
        case "9" -> isRunning = false;
      }
    } while (isRunning);
  }
}

