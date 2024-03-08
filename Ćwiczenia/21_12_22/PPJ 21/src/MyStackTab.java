public class MyStackTab {
    private int size;
    private int index = 0;
    private Student[] students;
    public MyStackTab(int size) {
        this.size = size;
        students = new Student[size];
    }
    public void push(Student student){
        if (index < students.length){
            students[index++] = student;
        } else {
            System.out.println("The stack is full.");
        }
    }
    public void pop(){
        if (index > 0){
            System.out.println(students[--index]);
        } else {
            System.out.println("The stack is empty.");
        }
    }
}
