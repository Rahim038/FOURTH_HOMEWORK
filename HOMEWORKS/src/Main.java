import HOMEWORK_4.Human;
import HOMEWORK_4.Pet;

public class Main {
    public static void main(String[] args) {

        Human father = new Human("Alexandr", "Karleone" );
        Human mother = new Human("Ann", "Karleone");

        Pet pet1 = new Pet();
        pet1.species = "dog";
        pet1.nickname = "Charax";
        pet1.age = 5;
        pet1.tricklevel = 75;
        pet1.habits = new String[] {"eat","drink","swim"};
        Human child = new Human("Michel","Karleone",1996,88,pet1,mother,father,
                new String[][]{{"Monday", "go to school"}, {"Tuesday", "swim"}});

        child.greetPet();
        child.describePet();

        pet1.eat();
        pet1.respond();
        pet1.foul();
        System.out.println(pet1.toString() + "\n");
    }
}