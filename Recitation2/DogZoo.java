/**
 * DogZoo
 */
public class DogZoo {

    public static void foo(int i) {
        i = 1;
    }

    public static class Dog {
        String name;

        public Dog(String name) {
            this.name = name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void printName() {
            System.out.println("The name is " + this.name);
        }
    }

    public static void setNewName1(Dog dog, String newName) {
        dog = new Dog(newName);
    }

    public static void setNewName2(Dog dog, String newName) {
        dog.setName(newName);
    }

    public static void main(String[] args) {
        int i = 2;
        System.out.println("The value of i is " + i);
        foo(i);
        System.out.println("The value of i is " + i);
        // what is the value of i?
        // 1 or 2

        Dog myDog = new Dog("A");
        myDog.printName();

        setNewName1(myDog, "B");
        myDog.printName();

        setNewName2(myDog, "C");
        myDog.printName();

    }
}