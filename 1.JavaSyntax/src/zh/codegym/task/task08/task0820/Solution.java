package zh.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
动物集
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        //在此编写你的代码
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());
        result.add(new Cat());

        return result;
    }

    public static Set<Dog> createDogs() {
        //在此编写你的代码
        HashSet<Dog> result = new HashSet<>();
        result.add(new Dog());
        result.add(new Dog());
        result.add(new Dog());
        return result;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //在此编写你的代码
        HashSet<Object> result = new HashSet<>();
        result.addAll(cats);
        result.addAll(dogs);
        return result;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //在此编写你的代码
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        //在此编写你的代码
        for (Object item :
                pets) {
            System.out.println(item);
        }
    }

    //在此编写你的代码

    public static class Cat {

    }

    public static class Dog {}

}
