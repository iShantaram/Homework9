public class Main {
    public static void main(String[] args) {
        //
        int[] arrayThreeNum = new int[3];
        arrayThreeNum[0] = 1;
        arrayThreeNum[1] = 2;
        arrayThreeNum[2] = 3;

        double[] arrayFloat = {1.57, 7.654, 9.986};

        String[] words = {"ordered", "not", "is", "array", "This"};

        for (int i = 0; i < arrayThreeNum.length; i++) {
            System.out.print(arrayThreeNum[i]);
            if (i < arrayThreeNum.length-1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i < arrayThreeNum.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + ",");
        }
    }
}