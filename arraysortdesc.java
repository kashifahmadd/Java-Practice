import java.util.Scanner;

public class arraysortdesc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-----Welcome------");
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i+1]){
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("Array is sorted in the descending order");
        }else {
            System.out.println("Array is not sorted in the descending order");
        }
    }
}
