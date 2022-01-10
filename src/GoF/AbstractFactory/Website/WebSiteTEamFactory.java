package GoF.AbstractFactory.Website;

import GoF.AbstractFactory.Developer;
import GoF.AbstractFactory.ProjectManager;
import GoF.AbstractFactory.ProjectTeamFactory;
import GoF.AbstractFactory.Tester;

public class WebSiteTEamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebSitePM();
    }
}
