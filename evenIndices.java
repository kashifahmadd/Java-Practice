import java.util.Scanner;

public class evenIndices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("==========Welcome=========");
        System.out.print("Enter the size od array;: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}
