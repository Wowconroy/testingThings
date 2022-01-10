package GoF.AbstractFactory;

import GoF.AbstractFactory.Banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Starts coding...");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
