public class Multidimensional_arrays {
    public static void main(String[] args) {
        int[] number = {1,2,3};
        System.out.println(number[1]);

        int[][] matrice = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        System.out.println(matrice[2][1]);

        int[] number1 = new int[5];
        String[][] string = new String[2][3];
        string[0][1] = "hello";

        for (int i=0;i<matrice.length;i++){
            for (int j=0;j<matrice[i].length;j++){
                System.out.print(matrice[i][j]);
            }
            System.out.println();
        }
    }
}
