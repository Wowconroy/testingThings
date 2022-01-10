package GoF.AbstractFactory.Banking;

import GoF.AbstractFactory.Developer;

public class JavaDeveloperCoder implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code...");
    }
}
