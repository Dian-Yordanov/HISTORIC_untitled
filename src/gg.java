import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 30/09/13
 * Time: 02:09
 * > XycsC
 */
public class gg {
    public static void main(String args[]){


        ArrayList<Integer> list = new ArrayList<Integer>();
        inputHandler(list);
        System.out.print(list.toString());

}
                public static void inputHandler(ArrayList<Integer> list){
                System.out.println("enter a letter to stop the input");
                Scanner in = new Scanner(System. in);
                int counter;

                        while(in.hasNextInt())
                        {
                            counter = in.nextInt();
                            list.add(list.size(),counter);
                        }

                }
}

