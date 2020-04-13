import java.util.ArrayList;

public class Zoo {
    public static ArrayList<Carnivore> all_carnivores = new ArrayList<>();
    public static ArrayList<Herbivore> all_herbivores = new ArrayList<>();

    public Zoo(){
        TestJSON.main();
    }
    public static void info(){
        System.out.println("Текущее состояние животных в зоопарке");
        System.out.println("Травоядные - "+all_herbivores);
        System.out.println("Плотоядные - "+all_carnivores);
    }
}
