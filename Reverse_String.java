package Practice;
import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] args) {

        System.out.println("Введите строку для реверса: ");
        Scanner len = new Scanner(System.in);
        String str = len.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String[] strarray = sb.reverse().toString().split(" ");
        sb.delete(0,str.length());
        for (int i=strarray.length - 1;i>=0;i--){
            sb.append(strarray[i]);
            sb.append(" ");
        }
        System.out.println("Результат: ");
        System.out.println(sb.reverse().deleteCharAt(0));
    }
}
