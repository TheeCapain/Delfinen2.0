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
<<<<<<< HEAD
//Parsing senior and junior arrays through same method
  public void addToDiscipline(Competitor competitor,ArrayList<Competitor> crawlSwimmers, ArrayList<Competitor> backCrawlSwimmers, ArrayList<Competitor> breastSwimmers, ArrayList<Competitor> butterflySwimmers) {
=======

  public void addToDiscipline(Competitor competitor, ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
>>>>>>> decaa7feed053ed0669aec1baf6c69010ceaedd2
    switch (competitor.getDiscipline()) {
      case "Crawl" -> crawlSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "BackCrawl" -> backCrawlSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Breast" -> breastSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Butterfly" -> butterflySwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

    }
  }

  //A lot of printing
  public void printButterfly(Ui ui, ArrayList<Competitor> butterfly) {
    if (butterfly.size() <= 5) {
      for (int i = 0; i < butterfly.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + butterfly.get(i).toString());
        ui.printFormatLines();
      }

    } else if (butterfly.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + butterfly.get(i).toString());
          ui.printFormatLines();
        }

      }
    }
  }

  public void printCrawl(Ui ui, ArrayList<Competitor> crawl) {
    if (crawl.size() <= 5) {
      for (int i = 0; i < crawl.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + crawl.get(i).toString());
        ui.printFormatLines();
      }

    } else if (crawl.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + crawl.get(i).toString());
          ui.printFormatLines();
        }

      }
    }
  }

  public void printBreast(Ui ui, ArrayList<Competitor> breast) {
    if (breast.size() <= 5) {
      for (int i = 0; i < breast.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + breast.get(i).toString());
        ui.printFormatLines();
      }

    } else if (breast.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + breast.get(i).toString());
          ui.printFormatLines();
        }

      }

    }
  }

  public void printBackCrawlTop5(Ui ui, ArrayList<Competitor> BackCrawl) {
    if (BackCrawl.size() <= 5) {
      for (int i = 0; i < BackCrawl.size(); i++) {

        ui.printFormatLines();
        ui.display("NR: " + (i + 1) + BackCrawl.get(i).toString());
        ui.printFormatLines();
      }

    } else if (BackCrawl.size() > 5) {
      {
        for (int i = 0; i < 5; i++) {
          ui.printFormatLines();
          ui.display("NR: " + (i + 1) + BackCrawl.get(i).toString());
          ui.printFormatLines();
        }

      }
    }


  }

}
