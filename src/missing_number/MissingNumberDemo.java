package missing_number;

import java.awt.event.TextEvent;
import java.util.ArrayList;

public class MissingNumberDemo {
    public static void main(String[] args) {
        ArrayList<Integer> testList = new ArrayList<Integer>();

        int[] testArray = new int[100];

        for (int i = 0; i < 101; i++) {
            testList.add(i);
        }

        int removeElement = (int) (Math.random() * 99);
        System.out.println("Remove Element is: "+removeElement);
        testList.remove(removeElement);
        for (int i = 0; i < testList.size(); i++) {
            testArray[i] = testList.get(i);
        }

        for (int i = 0; i < testArray.length; i++) {
            System.out.print(testArray[i]);
        }
        System.out.println("\n");

        SortingSolution s1 = new SortingSolution();
        System.out.println("Sorting Solution Output "+s1.missingNumber(testArray));

        HashSetSolution s2 = new HashSetSolution();
        System.out.println("HashSet Solution Output "+s2.missingNumber(testArray));

        BitManipulationSolution s3 = new BitManipulationSolution();
        System.out.println("Bit Manipulation Solution Output "+s3.missingNumber(testArray));

        GaussSolution s4 = new GaussSolution();
        System.out.println("Guss Method Solution Output "+s4.missingNumber(testArray));
    }
}
