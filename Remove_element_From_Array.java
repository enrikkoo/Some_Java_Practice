package Practice;
import java.util.Scanner;

public class Remove_element_From_Array {
    public static void main(String[] args) {
        System.out.println("Введите размер массива:");
        Scanner len = new Scanner(System.in);
        int size = len.nextInt();

        int[] nums = new int[size];
        Scanner mas = new Scanner(System.in);
        System.out.printf("Введите первые %d элементов,которые попадут в массив",size);
        for (int i=0;i<size;i++){
            nums[i] = mas.nextInt();
        }
        Scanner tar = new Scanner(System.in);
        System.out.println("Введите число,которое нужно удалить:");
        int target = len.nextInt();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != target) nums[count++] = nums[i];
        }
        System.out.println("Результат:");
        for (int i = 0; i < count; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}


