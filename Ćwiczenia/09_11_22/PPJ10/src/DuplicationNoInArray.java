public class DuplicationNoInArray {

    /**
     * @param args
     *            the command line arguments
     */
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 1, 2, 8, 1,2 };
        int[] result = new int[10];
        int counter = 0, count = 0, isdistinct = 0, sizeWoDist = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isDistinct = true;
                    break;
                }
            }
            if (!isDistinct) {
                result[counter++] = arr[i];
            }
        }
        for (int i = 0; i < counter; i++) {
            count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (result[i] == arr[j]) {
                    count++;
                }
            }
            if(count > 1){
                isdistinct++;
            }
            System.out.println(result[i] + " = " + count);
        }
        sizeWoDist = arr.length - 2 - isdistinct;
        System.out.println(8 - 1 - 1 - sizeWoDist);
    }
}
