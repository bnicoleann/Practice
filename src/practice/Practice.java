package practice;

public class Practice {

    /**
     *
     * @param a accepts int
     * @return
     */
    public static boolean contains(int[] a, int index, int check) {
        int[] array = {1,2,3,4};
        
        if (index < array.length) {
            if (array[index] == check) {
                return true;
            } else {
                return contains(array, index + 1, check);
            }
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] temp = {1,2,3,4};
        System.out.println(contains(temp,0,2));
    }
}
