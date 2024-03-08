public class Person {
    private String name;
    private int birthYear;
    private static int counter = 0;
    private static int index = 0;
    public Person(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public Person(String name) {
        this(name,1990);
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return 2022 - birthYear;
    }
    public static Person getOlder(Person p1, Person p2){
        return p1.getAge() > p2.getAge() ? p1 : p2;
    }
    public static Person getOldest(Person[] people){
        Person oldest = people[0];
        for (int i = 0; i < people.length - counter; i++) {
            if (people[i].getAge() > oldest.getAge()) {
                oldest = people[i];
                index = i;
            }
        }
        return oldest;
    }
    public static void peopleSort(Person[] people){
        for (int i = 0, j = people.length; i < people.length; i++) {
            Person tmp = people[--j];
            people[j] = getOldest(people);
            people[index] = tmp;
            counter++;
            index = 0;
        }
        counter = 0;
    }
}
