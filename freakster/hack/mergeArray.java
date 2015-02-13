package freakster.hack;

/**
 * Created by AGA2 on 2/12/2015.
 */
public class mergeArray {
    public static void main(String[] args) {

        int A[] = {1,3,8,9};
        int B[] = {2,4,5,6,7,0,0,0,0};

        int a_max = 3;
        int b_max = 4;

        int b_length = 8;

        while( a_max >= 0){

            if(A[a_max] > B[b_max] || b_max >= 0){
                B[b_length] = A[a_max];
                a_max--;
            }else {
                B[b_length] = B[b_max];
                b_max--;
            }

            b_length--;
        }


        System.out.println("args = [" + B + "]");
        for (int i = 0; i < B.length ; i++) {
            System.out.println("B[i] = " + B[i]);
        }
            
        

    }



}
