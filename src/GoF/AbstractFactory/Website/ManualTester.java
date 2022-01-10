package GoF.AbstractFactory.Website;

import GoF.AbstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests web site...");
    }
}
