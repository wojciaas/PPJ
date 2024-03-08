public class Student {
    private int sNumber;
    private String name;
    private Student next;
    public Student(int sNumber, String name) {
        this.sNumber = sNumber;
        this.name = name;
        this.next = null;
    }
    public void show(){
        System.out.println(name + "\t" + sNumber);
    }
    public Student getNext() {
        return next;
    }
    public void setNext(Student next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }
}
