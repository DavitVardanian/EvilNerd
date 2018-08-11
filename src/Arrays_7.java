public class Arrays_7 {
    public static void main(String[]args){

//        int[]number = {1,2,3};
        int[][] matrice = {{101,102,100, 99, 98},
                           {97, 96, 95},
                           {94}};
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length;j++)
            {
                System.out.print(matrice[i][j] + " ");
            }
        System.out.println();
    }
    }
}

