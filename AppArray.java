
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppArray {

    public static void main(String[] args) {

        Mas randomExecuter = new Mas();
        System.out.print("Base Array");
        randomExecuter.outArray();
        randomExecuter.sortBubble(randomExecuter.arrayForSorting);
        System.out.print("Sort by BubbleSort");
        randomExecuter.outArray();

        randomExecuter = new Mas();
        System.out.print("Base Array");
        randomExecuter.outArray();
        randomExecuter.ShakerSort(randomExecuter.arrayForSorting);
        System.out.print("Sort by ShakerSort");
        randomExecuter.outArray();


        int initialArray[] = inputArray();
        Mas userExecuter = new Mas(initialArray);
        System.out.print("Base Array");
        userExecuter.outArray();
        userExecuter.sortBubble(initialArray);
        System.out.print("Sort by BubbleSort");
        userExecuter.outArray();

        int initialArray2[] = inputArray();
        userExecuter = new Mas(initialArray2);
        System.out.print("Base Array");
        userExecuter.outArray();
        userExecuter.ShakerSort(initialArray2);
        System.out.print("Sort by ShakerSort");
        userExecuter.outArray();
    }


    static    int[] inputArray() {
        Scanner cs = new Scanner(System.in);
        int n = 0;
        boolean next = false;

        do {
            try {
                System.out.println("Input length:");
                 cs = new Scanner(System.in);
                n = cs.nextInt();
                next = true;
                if ((n <= 0) || (n > 30)) {
                    next = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error! Enter number format:");
            }
        } while (next == false);


        boolean next2=false;
        int[] arrayList = new int[n];
        for (int i = 0; i < arrayList.length; i++) {

            do {
                try {
                    System.out.println("Input " + i + " element:");
                    cs = new Scanner(System.in);
                    arrayList[i] = cs.nextInt();
                    next2 = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error! Enter number format:");
                }
            }while (next2 == false);
            next2=false;
        }
        return arrayList;
    }
}
