import java.util.ArrayList;
import java.util.Collections;


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
      //@TODO Fix tidsformattering
      competitor.setLocalDateTime();
      //@TODO Fix laveste tid
      competitor.setTimer(competitor.getRandomTime());
      addToDiscipline(competitor,crawl,backCrawl,breast,butterfly);


    }
  }
//Parsing senior and junior arrays through same method
  public void addToDiscipline(Competitor competitor,ArrayList<Competitor> crawlSwimmers, ArrayList<Competitor> backCrawlSwimmers, ArrayList<Competitor> breastSwimmers, ArrayList<Competitor> butterflySwimmers) {
    switch (competitor.getDiscipline()) {
      case "Crawl" -> crawlSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "BackCrawl" -> backCrawlSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Breast" -> breastSwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

      case "Butterfly" -> butterflySwimmers.add(new Competitor(competitor.getName(), competitor.getID(), competitor.getDiscipline(), competitor.getLocalDateTime(), competitor.getTimer()));

    }
  }

  //A lot of printing
  public void printButterfly(Ui ui, ArrayList<Competitor> butterfly) {
    for (int i = 0; i < butterfly.size(); i++) {
      ui.printFormatLines();
      ui.display(butterfly.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printCrawl(Ui ui, ArrayList<Competitor> crawl) {
    for (int i = 0; i < crawl.size(); i++) {
      ui.printFormatLines();
      ui.display(crawl.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printBreast(Ui ui, ArrayList<Competitor> breast) {
    for (int i = 0; i < breast.size(); i++) {
      ui.printFormatLines();
      ui.display(breast.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printBackCrawl(Ui ui, ArrayList<Competitor> BackCrawl) {
    for (int i = 0; i < BackCrawl.size(); i++) {
      ui.printFormatLines();
      ui.display(BackCrawl.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printSeniors(ArrayList<Member> seniorCompetitors, Ui ui) {
    for (int i = 0; i < seniorCompetitors.size(); i++) {
      ui.printFormatLines();
      //To Fix indentation: i+1
      ui.display("MemberNR: " + (i + 1) + " " + seniorCompetitors.get(i).toString());
      ui.printFormatLines();
    }
  }

  public void printJuniors(ArrayList<Member> juniorCompetitors, Ui ui) {
    for (int i = 0; i < juniorCompetitors.size(); i++) {
      ui.printFormatLines();
      //To Fix indentation: i+1
      ui.display("MemberNR: " + (i + 1) + " " + juniorCompetitors.get(i).toString());
      ui.printFormatLines();
    }
  }
}
