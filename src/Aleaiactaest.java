import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 02/10/13
 * Time: 04:00
 * > XycsC
 */
public class Aleaiactaest {
    public static void main(String args[]){
        ArrayList<Long> list = new ArrayList<Long>();
        inputHandler(list);
        System.out.print(list.toString());

    }
    public static void inputHandler(ArrayList<Long> list){
        ArrayList<String> readingArray = new ArrayList<String>();

        BufferedReader br = null;
        try{
            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\JavaFiles\\alea.in"));

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
        Long counter;
        while(sc.hasNextLong())
        {
            counter = sc.nextLong();
            list.add(list.size(),counter);
        }
    }
}
