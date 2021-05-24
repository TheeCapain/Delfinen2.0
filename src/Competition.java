import java.util.ArrayList;
import java.util.Collections;


public class Competition {
  //Compares and finds top 5
  public void compareTimes(ArrayList<Competitor> competitors) {
    Collections.sort(competitors);

  }


  //A lot of sorting
  public void sortTeamsByAge(ArrayList<Member> activeMember, ArrayList<Member> juniorCompetitor, ArrayList<Member> seniorCompetitor) {
    for (int i = 0; i < activeMember.size(); i++) {
      if (activeMember.get(i).getAge() < 18) {
        juniorCompetitor.add(activeMember.get(i));
      } else if (activeMember.get(i).getAge() > 18) {
        seniorCompetitor.add(activeMember.get(i));
      }
    }
  }

  public void assignSwimTeams(ArrayList<Member> Competitors, Competitor competitor, ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
    for (int i = 0; i < Competitors.size(); i++) {
      competitor.setName(Competitors.get(i).getName());
      competitor.setID(Competitors.get(i).getID());
      competitor.setDiscipline(competitor.randomizeDiscipline());
      competitor.setLocalDateTime();
      competitor.setTimer(competitor.getRandomTime());
      addToDiscipline(competitor, crawl, backCrawl, breast, butterfly);


    }
  }

  public void addToDiscipline(Competitor competitor, ArrayList<Competitor> crawl, ArrayList<Competitor> backCrawl, ArrayList<Competitor> breast, ArrayList<Competitor> butterfly) {
    switch (competitor.getDiscipline()) {
      case "Crawl" -> crawl.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "BackCrawl" -> backCrawl.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Breast" -> breast.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Butterfly" -> butterfly.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

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
