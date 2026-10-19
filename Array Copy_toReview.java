public class ArrayCopyExample {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5};
        int[] destArray = new int [3];

        System.arraycopy(srcArray, 0, destArray, 6, 2);
        
        for (int num : destArray) {
            System.out.print(num + " ");
        }
    }
}

//To review pa 'to, medyo nalilito pa me
