public class Carnivore extends Animal {

    public Carnivore(Current_Status status, String animal_kind,int number) {
        this.status = status;
        this.animal_kind = animal_kind+number;
    }
    private static long count_of_carnivore;
    public static long getCount_of_carnivore() {
        return count_of_carnivore;
    }

    public static void setCount_of_carnivore(long count_of_carnivore) {
        Carnivore.count_of_carnivore = count_of_carnivore;
    }

    @Override
    public void keeperVisit() {
        setStatus(Current_Status.NOISE);
    }

    @Override
    public void feeding() {
        setStatus(Current_Status.CALM);
    }

    @Override
    public void night() {
        if (getStatus()==Current_Status.NOISE) {
            System.out.println(getAnimal_kind()+" is noisy and can't sleep");
        }else{
            setStatus(Current_Status.SLEEP);
            System.out.println(getAnimal_kind()+" is sleeping");
        }
    }

    @Override
    public void morning() {
        if (getStatus()==Current_Status.SLEEP || getStatus()==Current_Status.CALM){
            setStatus(Current_Status.CALM);
        }else{
            System.out.println(getAnimal_kind()+" didn't sleep because it's noisy");
        }
    }

    @Override
    public void thunder() {
        setStatus(Current_Status.NOISE);
    }
}
