import java.util.ArrayList;

public class User_Tools {

    void visit(ArrayList<? extends Animal> name){
        for (Animal some : name) {
            some.reaciton_event(Event.KEEPER_COME);
        }
        for (Carnivore some : Zoo.all_carnivores) {
            some.reaciton_event(Event.KEEPER_COME);
        }
    }

    void feed(ArrayList<? extends Animal> name){
        for (Animal some : name) {
            some.reaciton_event(Event.FEEDING);
        }
    }

    void setThunder(ArrayList<Herbivore> herbivore,ArrayList<Carnivore> carnivore){
        for (Herbivore kind : herbivore) {
            kind.reaciton_event(Event.THUNDER);
        }
        for (Carnivore kind : carnivore) {
            kind.reaciton_event(Event.THUNDER);
        }
    }

    void setMorning(ArrayList<Herbivore> herbivore,ArrayList<Carnivore> carnivore){
        for (Herbivore kind : herbivore) {
            kind.reaciton_event(Event.WAKE_UP);
        }
        for (Carnivore kind : carnivore) {
            kind.reaciton_event(Event.WAKE_UP);
        }
    }

    void setNight(ArrayList<Herbivore> herbivore,ArrayList<Carnivore> carnivore){
        for (Herbivore kind : herbivore) {
            kind.reaciton_event(Event.NIGHT_COME);
        }
        for (Carnivore kind : carnivore) {
            kind.reaciton_event(Event.NIGHT_COME);
        }
    }
}







//если только список,то не знаем к кому именно идти
//из-за этого доп свитчи
//но клиенту надо только знать про вид и что делать,передать список он не может и это глупо!!
//надо завтра переделать эту логику
//хотя можно ему дать только выбор инвента,а остальное за интерфейсом будет на бэке