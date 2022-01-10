package TestingPackage.epam2;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        ArrayList <String> array = new ArrayList<>();
        array.addAll(Arrays.asList("3", "aaaaa", "bbbb", "ccc", "d", "eee", "g", "f", "hh"));
      System.out.println("Before removing: " + Arrays.asList(array));
        removeElementWithLengthEquals1(array);
      System.out.println("After removing: " + Arrays.asList(array));

    }
    public static void removeElementWithLengthEquals1(ArrayList <String> array){
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).length()==1){
                array.remove(i);
                i--;
            }
        }
    }

}
