import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;


public class Test {
    User_Tools ut = new User_Tools();

    @BeforeClass
    public static void adding(){
        Add.addd();
    }
    @Before
    public void feed(){
        ut.feed(Zoo.all_herbivores);
        ut.feed(Zoo.all_carnivores);
    }
    @After
    public void info(){
        Zoo.info();
    }

    @org.junit.Test
    public void test1(){
        ut.visit(Zoo.all_herbivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.NOISE,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.NOISE,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test2(){
        ut.visit(Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.CALM,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.NOISE,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test3(){
        ut.visit(Zoo.all_herbivores);
        ut.setNight(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.SLEEP,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.SLEEP,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test4(){
        ut.setThunder(Zoo.all_herbivores,Zoo.all_carnivores);
        ut.setMorning(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.CALM,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.CALM,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test5(){
        ut.setNight(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.SLEEP,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.SLEEP,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test6(){
        ut.setThunder(Zoo.all_herbivores,Zoo.all_carnivores);
        ut.setNight(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.SLEEP,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.SLEEP,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test7(){
        ut.setMorning(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.CALM,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.CALM,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test8(){
        ut.setThunder(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.NOISE,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.NOISE,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test9(){
        ut.visit(Zoo.all_carnivores);
        ut.setMorning(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.CALM,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.CALM,carnivore.getStatus());
        }
    }
    @org.junit.Test
    public void test10(){
        ut.setNight(Zoo.all_herbivores,Zoo.all_carnivores);
        ut.setMorning(Zoo.all_herbivores,Zoo.all_carnivores);
        for (Herbivore herbivore : Zoo.all_herbivores){
            Assert.assertEquals(Current_Status.CALM,herbivore.getStatus());
        }
        for (Carnivore carnivore : Zoo.all_carnivores){
            Assert.assertEquals(Current_Status.CALM,carnivore.getStatus());
        }
    }
}
