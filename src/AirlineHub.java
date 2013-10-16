import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 02/10/13
 * Time: 00:14
 * > XycsC
 */
public class AirlineHub {
    public static void main(String args[]){
        ArrayList<Double> list = new ArrayList<Double>();
        inputHandler(list);
        System.out.print(list.toString());
        double minDistance;
        int iLocation=0;
        int cyclingInt =0;
        int cyclingInt2 =0;
        minDistance = Math.abs(list.get(1)) + Math.abs(list.get(2));

        while(list.size()>=cyclingInt)
        {
        for(int i=1 + cyclingInt;i<=1+list.get(cyclingInt)*2;i+=2){
        if(minDistance>Math.abs(list.get(i))+Math.abs(list.get(i+1))){minDistance=Math.abs(list.get(i))+Math.abs(list.get(i+1));
        iLocation = i;
        }
        cyclingInt2 = i;
        }
        cyclingInt += cyclingInt2;
        System.out.println(list.get(iLocation+1) + " " + list.get(iLocation+2) + " " + cyclingInt);
        //for(int i=0;i<cyclingInt2 + 1;i++){
        //    list.remove(0);
        //}
        }

    }
    public static void inputHandler(ArrayList<Double> list){
        ArrayList<String> readingArray = new ArrayList<String>();

        BufferedReader br = null;
        try{
            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\JavaFiles\\airlinehub.in"));

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
        Double counter;
        while(sc.hasNextDouble())
        {
            counter = sc.nextDouble();
            list.add(list.size(),counter);
        }
    }

}

