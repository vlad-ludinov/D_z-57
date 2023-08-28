/**
 * Task1
 */
public class Task1 {

    public static void main(String[] args) {
        

        System.out.println("------------------------");
        int[][] ints1 = new int[4][];
        ints1[0] = new int[]{0, 0, 0, 0};
        ints1[1] = new int[]{0, 0, 0, 0};
        ints1[2] = new int[]{0, 0, 0, 0};
        ints1[3] = new int[]{0, 0, 0, 0};
        checkMatrix(ints1);
        System.out.println("------------------------");
        int[][] ints2 = new int[4][];
        ints2[0] = new int[]{0, 0, 0, 0};
        ints2[1] = new int[]{0, 0, 0};
        ints2[2] = new int[]{0, 0};
        ints2[3] = new int[]{0};
        checkMatrix(ints2);
        System.out.println("------------------------");
        int[][] ints3 = new int[1][];
        ints3[0] = new int[]{0};
        checkMatrix(ints3);
        System.out.println("------------------------");
        int[][] ints4 = new int[4][];
        ints4[0] = new int[]{0, 0, 0};
        ints4[1] = new int[]{0, 0, 0, 0};
        ints4[2] = new int[]{0, 0, 0, 0};
        ints4[3] = new int[]{0, 0, 0, 0};
        checkMatrix(ints4);
        System.out.println("------------------------");
        int[][] ints5 = new int[4][];
        ints5[0] = new int[]{0, 0, 0, 0, 0};
        ints5[1] = new int[]{0, 0, 0, 0};
        ints5[2] = new int[]{0, 0, 0, 0};
        ints5[3] = new int[]{0, 0, 0, 0};
        checkMatrix(ints5);
        System.out.println("------------------------");
        int[][] ints6 = new int[4][];
        ints6[0] = new int[]{0, 0, 0, 0};
        ints6[1] = new int[]{0, 0, 0, 0};
        ints6[2] = new int[]{0, 0};
        ints6[3] = new int[]{0, 0, 0, 0};
        checkMatrix(ints6);
        System.out.println("------------------------");
        int[][] ints7 = new int[5][];
        ints7[0] = new int[]{0, 0, 0, 0};
        ints7[1] = new int[]{0, 0, 0, 0};
        ints7[2] = new int[]{0, 0, 0, 0};
        ints7[3] = new int[]{0, 0, 0};
        ints7[4] = new int[]{0};
        checkMatrix(ints7);
        System.out.println("------------------------");
    }



    public static void checkMatrix(int[][] matrix) {
        int count = 0;
        try {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    count += matrix[j][i];
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Длина строк и столбцов с одинаковыми индексами не одинакова");
            return;
        }
        System.out.println("Все в порядке");
            
    }
}