import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 02/10/13
 * Time: 05:06
 * > XycsC
 */
public class AllFriends {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        inputHandler(list);
        System.out.print(list.toString());
        int[] mostCommonElement = new int[list.get(1)*2 + 1];
        int max=list.get(1); int index=0;
        for(int i=2;i<list.get(1)*2 + 2;i+=2){

          for(int ii=2;ii<list.get(1)*2 +2;ii+=2){
           if(list.get(i) == list.get(ii) && list.get(i+1) == list.get(ii+1) && i!=ii && list.get(ii)!=0 && list.get(ii+1)!=0)
                                                                                {max--;list.set(ii,0);list.set(ii+1,0);}
           if(list.get(i) == list.get(ii+1) && list.get(i+1) == list.get(ii) && i!=ii && list.get(ii)!=0 && list.get(ii+1)!=0)
                                                                                {max--;list.set(ii,0);list.set(ii+1,0);}

           }
            System.out.print(max);

        }
        System.out.print(max);



    }
    public static void inputHandler(ArrayList<Integer> list){
        ArrayList<String> readingArray = new ArrayList<String>();

        BufferedReader br = null;
        try{
            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\JavaFiles\\friends.in"));

            while((sCurrentLine = br.readLine())!=null){
                readingArray.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(br != null) br.close();
            } catch (IOException ex){
                ex.printStackTrace();
            }
        }
        Scanner sc = new Scanner(readingArray.toString().replace(","," ").replace("[","").replace("]",""));
        int counter;
        while(sc.hasNextInt())
        {
            counter = sc.nextInt();
            list.add(list.size(),counter);
        }
    }

}
