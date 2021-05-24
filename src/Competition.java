import java.util.ArrayList;
import java.util.Collections;

//August
public class Competition {
  //Compares and finds top 5
  public void compareTimes(ArrayList<Competitor> competitors) {
    Collections.sort(competitors);

  }


  //A lot of sorting
  public void sortTeamsByAge(ArrayList<Member> activeMembers, ArrayList<Member> juniorCompetitors, ArrayList<Member> seniorCompetitors) {
    for (int i = 0; i < activeMembers.size(); i++) {
      if (activeMembers.get(i).getAge() < 18) {
        juniorCompetitors.add(activeMembers.get(i));
      } else if (activeMembers.get(i).getAge() > 18) {
        seniorCompetitors.add(activeMembers.get(i));
      }
    }
  }

  public void assignSwimTeams(ArrayList<Member> competitors, Competitor competitor, ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
    for (int i = 0; i < competitors.size(); i++) {
      competitor.setName(competitors.get(i).getName());
      competitor.setID(competitors.get(i).getID());
      competitor.setDiscipline(competitor.randomizeDiscipline());
      competitor.setLocalDateTime();
      competitor.setTimer(competitor.getRandomTime());
      addToDiscipline(competitor, crawl, backCrawl, breast, butterfly);


    }
  }

  //Parsing senior and junior arrays through same method
  public void addToDiscipline(Competitor competitor, ArrayList<Competitor> crawlSwimmers, ArrayList<Competitor> backCrawlSwimmers, ArrayList<Competitor> breastSwimmers, ArrayList<Competitor> butterflySwimmers) {
    switch (competitor.getDiscipline()) {
      case "Crawl" -> crawlSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "BackCrawl" -> backCrawlSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Breast" -> breastSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Butterfly" -> butterflySwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

    }
  }

  public void printCrawlTop5(Ui ui, ArrayList<Competitor> crawlSwimmers) {
    if (crawlSwimmers.size() <= 5) {
      for (int i = 0; i < crawlSwimmers.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + crawlSwimmers.get(i).toString());
        ui.printFormatLines();
      }

    } else if (crawlSwimmers.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + crawlSwimmers.get(i).toString());
          ui.printFormatLines();
        }

      }
    }
  }

  public void printBackCrawlTop5(Ui ui, ArrayList<Competitor> backCrawlSwimmers) {
    if (backCrawlSwimmers.size() <= 5) {
      for (int i = 0; i < backCrawlSwimmers.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + backCrawlSwimmers.get(i).toString());
        ui.printFormatLines();
      }

    } else if (backCrawlSwimmers.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + backCrawlSwimmers.get(i).toString());
          ui.printFormatLines();
        }

      }
    }


  }

  public void printBreastTop5(Ui ui, ArrayList<Competitor> breastSwimmers) {
    if (breastSwimmers.size() <= 5) {
      for (int i = 0; i < breastSwimmers.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + breastSwimmers.get(i).toString());
        ui.printFormatLines();
      }

    } else if (breastSwimmers.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + breastSwimmers.get(i).toString());
          ui.printFormatLines();
        }

      }

    }
  }

  //A lot of printing
  public void printButterflyTop5(Ui ui, ArrayList<Competitor> butterflySwimmers) {
    if (butterflySwimmers.size() <= 5) {
      for (int i = 0; i < butterflySwimmers.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + butterflySwimmers.get(i).toString());
        ui.printFormatLines();
      }

    } else if (butterflySwimmers.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + butterflySwimmers.get(i).toString());
          ui.printFormatLines();
        }

      }
    }
  }
}
