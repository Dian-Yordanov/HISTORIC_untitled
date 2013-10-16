import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 30/09/13
 * Time: 12:53
 * > XycsC
 */
public class ggForWordINputs {
    public static void main(String args[]){


        ArrayList list = new ArrayList();
        inputHandler(list);
        System.out.print(list.toString());

    }
    public static void inputHandler(ArrayList list){
        System.out.println("enter END to stop the input");
        Scanner in = new Scanner(System. in);
        String counter;
        while(in.hasNext())
        {

                counter = in.next();
                list.add(list.size(),counter);
                if(list.get(list.size()-1).equals("END")){break;}

        }
    }
}


