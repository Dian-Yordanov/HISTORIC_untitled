import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 30/09/13
 * Time: 00:15
 * > XycsC
 */
public class AlongMove {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int distance = sc.nextInt();
        int minPriceForDistance=0;
        int distanceleft=0;
        int iiLocation=0;
        int endAnswer=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        inputHandler(list);
        minPriceForDistance=list.get(1);
        do{
            System.out.println(list.toString());
        for(int ii=1;ii<list.size();ii+=2){
        if(minPriceForDistance>list.get(ii)){minPriceForDistance=list.get(ii);iiLocation=ii;}
        }

        endAnswer+=minPriceForDistance*list.get(iiLocation-1);
        System.out.print(minPriceForDistance + " ");
        System.out.print(distance-list.get(iiLocation-1)+" ");
        System.out.print(endAnswer);
        System.out.println(" ");
        distance-=list.get(iiLocation-1);
        distanceleft=list.get(iiLocation-1);
        list.remove(iiLocation-1);list.remove(iiLocation-1);
        minPriceForDistance=10000;
        }while(distance>=distanceleft);


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

