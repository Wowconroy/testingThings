package GoF.AbstractFactory.Banking;

import GoF.AbstractFactory.Developer;
import GoF.AbstractFactory.ProjectManager;
import GoF.AbstractFactory.ProjectTeamFactory;
import GoF.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloperCoder();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
