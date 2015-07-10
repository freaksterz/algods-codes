package freakster.hack;

/**
 * Created by AGA2 on 7/6/2015.
 */
public class SetMatrixZero {

    public static void main(String[] args) {
        int[][] matrix =  { {1,2},{3,4},{0,1},{1,0} };
        setZeroes(matrix);

    }

    public static void setZeroes(int[][] matrix) {

        int firstLine = 1;

        int firstCol = 1;

        //set the first row and first column to record the rows and cols to be set 0s.

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[0].length;j++){

                if(matrix[i][j]==0){

                    if(i==0)

                        firstLine=0;

                    if(j==0)

                        firstCol=0;

                    matrix[0][j]=0;

                    matrix[i][0]=0;

                }

            }

        }

        //set rows and columns

        for(int i=1;i<matrix.length;i++){

            if(matrix[i][0]==0){

                for(int j=1;j<matrix[0].length;j++)

                    matrix[i][j]=0;

            }

        }

        for(int j=1;j<matrix[0].length;j++){

            if(matrix[0][j]==0){

                for(int i=1;i<matrix.length;i++)

                    matrix[i][j]=0;

            }

        }

        //set first row and column

        if(firstLine==0){

            for(int j=0;j<matrix[0].length;j++)

                matrix[0][j]=0;

        }

        if(firstCol==0){

            for(int i=0;i<matrix.length;i++)

                matrix[i][0]=0;

        }

    }

}

