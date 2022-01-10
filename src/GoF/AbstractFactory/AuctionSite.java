package GoF.AbstractFactory;

import GoF.AbstractFactory.Website.WebSiteTEamFactory;

public class AuctionSite{
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebSiteTEamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Starts coding...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
