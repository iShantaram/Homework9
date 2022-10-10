public class Main {
    public static void main(String[] args) {
        // Первое задание - инициализация массивов
        System.out.println("Первое задание:");
        int[] arrayThreeNum = new int[3];
        arrayThreeNum[0] = 1;
        arrayThreeNum[1] = 2;
        arrayThreeNum[2] = 3;

        double[] arrayFloat = {1.57, 7.654, 9.986};

        String[] words = {"ordered", "not", "is", "array", "This"};

        System.out.println("Массивы инициализированы успешно.");

        // Второе задание - последовательный вывод элементов массивов
        System.out.println("Второе задание:");

        for (int i = 0; i < arrayThreeNum.length; i++) {
            System.out.print(arrayThreeNum[i]);
            if (i < arrayThreeNum.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[i]);
            if (i < arrayThreeNum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Третье задание - обратный вывод элементов массивов
        System.out.println("Третье задание:");
        for (int i = 0; i < arrayThreeNum.length; i++) {
            System.out.print(arrayThreeNum[arrayThreeNum.length-1-i]);
            if (i < arrayThreeNum.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < arrayFloat.length; i++) {
            System.out.print(arrayFloat[arrayFloat.length-1-i]);
            if (i < arrayThreeNum.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[words.length-1-i]);
            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
    }
}