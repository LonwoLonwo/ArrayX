import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(reader.readLine());

        char[][] arrayX = new char[c][c];

        int middle = c / 2;

        for(int i = 0; i < arrayX.length; i++){
            for(int j = 0; j < arrayX[i].length; j++){
                if(i == j) {
                    arrayX[i][j] = 'X';
                }
                else if(Math.abs(i - middle) == Math.abs(j - middle)){
                    arrayX[i][j] = 'X';
                }
                else{
                    arrayX[i][j] = ' ';
                }
            }
        }

        for(char[] x : arrayX){
            for(char y : x){
                System.out.print(y);
            }
            System.out.println();
        }

        reader.close();
    }
}
