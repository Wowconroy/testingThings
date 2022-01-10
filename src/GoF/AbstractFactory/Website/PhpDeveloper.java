package GoF.AbstractFactory.Website;

import GoF.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php developer writes PHP code...");
    }
}
