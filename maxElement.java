import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("======Welcome!+++++");
        System.out.print("Enter the size of array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest){
               largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
