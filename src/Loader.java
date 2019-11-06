public class Loader {
    public static void main(String[] args) {
        String[][] arrayX = {
                {"X", " ", " ", " ", " ", " ", "X"},
                {" ", "X", " ", " ", " ", "X", " "},
                {" ", " ", "X", " ", "X", " ", " "},
                {" ", " ", " ", "X", " ", " ", " "},
                {" ", " ", "X", " ", "X", " ", " "},
                {" ", "X", " ", " ", " ", "X", " "},
                {"X", " ", " ", " ", " ", " ", "X"}
        };

        for(int i = 0; i < arrayX.length; i++){
            for(int j = 0; j < arrayX[i].length; j++){
                System.out.print(arrayX[i][j]);
            }
            System.out.println();
        }
    }
}
