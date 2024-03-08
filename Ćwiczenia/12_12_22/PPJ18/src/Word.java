public class Word {
    char[] arr;
    int val;
    int index = 0;
    public Word() {
        arr = new char[100];
        val = 0;
    }
    public void addChar(char znak){
        arr[index++] = znak;
    }
    public void show(){
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }
    public int length(){
        return index;
    }
}
