package academy.bentodev.javaoneforall.multidimensionalArrays;

public class multidimensionalArrays {
    public static void main(String[] args) {
        // forma 1 de inicializar um array multidimensional
        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        days[1][0] = 4;
        days[1][1] = 5;
        days[1][2] = 6;

        days[2][0] = 7;
        days[2][1] = 8;
        days[2][2] = 9;

//        for (int i = 0; i < days.length; i++) {
//            for (int j = 0; j < days[i].length; j++) {
//                System.out.println(days[i][j]);
//            }
//        }

        // forma 2 de inicializar um array multidimensional
        int[][] daysAgain = {{1,2,3,0}, {4,5,6}, {7,8,9}};
        for(int[] arrX: daysAgain){
            System.out.print("\n");
            for(int arrY: arrX){
                System.out.print(arrY);
            }
        }
    }
}
