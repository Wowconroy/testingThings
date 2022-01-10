package GoF.AbstractFactory.Website;

import GoF.AbstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages web site project...");
    }
}
