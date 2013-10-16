import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 29/09/13
 * Time: 05:23
 * > XycsC
 */
public class AdifferentProblem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int elementsNumber =0;

        ArrayList input = new ArrayList();
        for(int i=0;i<=elementsNumber+1;i++){
            input.add(sc.nextLong());
            if(sc.hasNextLong() && input.size()!=2*elementsNumber){elementsNumber+=1;}

            System.out.print(input.toString());
        }
        // input.add(sc.next());
        //  input.add(sc.nextLong());
        //  input.add(sc.nextLong());
        int mm = input.size();
        int[] array = new int[mm];
        for(int nn=0;nn<mm;nn++){
            //  array[nn] = Integer.parseInt(input.get(nn).toString());
        }

        for(int ii=0;ii<=mm;ii+=2){

            System.out.println(array[ii] - array[ii+2]);
        }
    }
}
