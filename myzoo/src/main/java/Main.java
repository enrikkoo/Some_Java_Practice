import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        Zoo zoo = new Zoo();
        System.out.println("Добро пожаловать в зоопарк!");
        menu();
        }
    public static void menu() throws IOException {
        User_Tools ut2 = new User_Tools();
        Zoo.info();
        System.out.println("Что будем делать?(введите просто цифру)");
        System.out.println("1.Позвать смотрителя к травоядным");
        System.out.println("2.Позвать смотрителя к плотоядным");
        System.out.println("3.Вызвать гром");
        System.out.println("4.Утро");
        System.out.println("5.Ночь");
        System.out.println("6.Покормить травоядных");
        System.out.println("7.Покормить плотоядных");
        System.out.println("");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        switch (a){
            case "1":
                ut2.visit(Zoo.all_herbivores);
                break;
            case "2":
                ut2.visit(Zoo.all_carnivores);
                break;
            case "3":
                ut2.setThunder(Zoo.all_herbivores,Zoo.all_carnivores);
                break;
            case "4":
                ut2.setMorning(Zoo.all_herbivores,Zoo.all_carnivores);
                break;
            case "5":
                ut2.setNight(Zoo.all_herbivores,Zoo.all_carnivores);
                break;
            case "6":
                ut2.feed(Zoo.all_herbivores);
                break;
            case "7":
                ut2.feed(Zoo.all_carnivores);
                break;
        }
        menu();
    }
}
