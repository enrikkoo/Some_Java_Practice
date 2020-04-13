public abstract class Animal  {

    public Current_Status getStatus() {
        return status;
    }
    public void setStatus(Current_Status status) {
        this.status = status;
    }

    public String getAnimal_kind() {
        return animal_kind;
    }

    public Animal() { }

    protected Current_Status status;
    protected String animal_kind;

    public abstract void keeperVisit();
    public abstract void feeding();
    public abstract void night();
    public abstract void morning();
    public abstract void thunder();

    @Override
    public String toString(){
        return animal_kind +" with "+status+" status";
    }

    public  void reaciton_event(Event event) {
        switch (event) {
            case WAKE_UP:
                morning();
                break;
            case KEEPER_COME:
                keeperVisit();
                break;
            case FEEDING:
                feeding();
                break;
            case NIGHT_COME:
                night();
                break;
            case THUNDER:
                thunder();
                break;
            default:
                System.out.println("Unknown event");
        }
    }
}
