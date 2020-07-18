import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=scanner.nextInt();
        }
        boolean sorted=true;
        {
            if (size == 0 || size == 1)
                sorted = true;

            for (int i = 1; i < size; i++)
                if (array[i - 1] > array[i])
                    sorted = false;
        }

        System.out.println(sorted);
    }
}