public class MyStackList {
    private int size;
    private Student head;
    private int counter;
    public MyStackList(int size) {
        this.size = size;
        counter = 0;
    }

    public void push(Student student){
        if (counter < size) {
            if(this.head == null) {
                this.head = student;
            } else {
                Student tmp = this.head;
                while(tmp.getNext() != null){
                    tmp = tmp.getNext();
                }
                tmp.setNext(student);
            }
            counter++;
        } else {
            System.out.println("Stack is full.");
        }
    }
    public Student pop() {
        if(head == null){
            System.out.println("Stack is empty.");
            return null;
        } else {
            Student tmp = head;
            if(counter == 1) {
                head = null;
                counter--;
                return tmp;
            }
            for (int i = 1; i < counter - 1; i++) {
                tmp = tmp.getNext();
            }
            Student last = tmp.getNext();
            tmp.setNext(null);
            counter--;
            return last;
        }
    }
}
