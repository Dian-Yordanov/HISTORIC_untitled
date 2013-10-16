import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 15/10/13
 * Time: 19:21
 * > XycsC
 */
public class rChallengeNumber136 {
    public static void main(String args[]){
        double scoreSummed = 0;
        double classAverage = 0;
        int n;
        ArrayList<String> list2 =new ArrayList<String>();
        ArrayList<String> list = new ArrayList<String> ();
        inputHandler(list);
        for(int i=0;i<Integer.parseInt(list.get(0));i++){
        list2.add(list.get(2+(Integer.parseInt(list.get(1))+1)*i));
            n=3+(Integer.parseInt(list.get(1))+1)*i ;
            for(int ii=0;ii<Integer.parseInt(list.get(1));ii++){
            scoreSummed += Integer.parseInt(list.get(n));
            n++;
            }
        classAverage +=scoreSummed;
        scoreSummed = scoreSummed/Integer.parseInt(list.get(1));
        list2.add(String.valueOf(scoreSummed));
        scoreSummed =0;
        }
        System.out.println(classAverage/(Integer.parseInt(list.get(1))*Integer.parseInt(list.get(0))));
        for(int mm=0;mm<list2.size()*2;mm+=2){
            System.out.print(list2.get(mm) + " ");
            System.out.println(list2.get(mm+1));
        }
    }
    public static void inputHandler(ArrayList<String>  list){
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
