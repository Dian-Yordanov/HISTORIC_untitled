import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Date: 02/10/13
 * Time: 04:22
 * > XycsC
 */
public class alienNumbers {

        public static void main(String args[]){
        ArrayList<String> list = new ArrayList<String>();
        inputHandler(list);
        System.out.print(list.toString());
        String system1 = "0123456789";
        String system2 = "0123456789abcdef";
        String system3 = "oF8";
        String system4 = "01";
        String system5 = "O!CDE?";
        String system6 = "A?JM!.";
        for(int i=1;i<Integer.parseInt(list.get(0));i++){
        if(list.get(i*2).equals(system1) && list.get(i*2 +1).equals(system2)){}
        if(list.get(i*2).equals(system1) && list.get(i*2 +1).equals(system3)){}
        if(list.get(i*2).equals(system1) && list.get(i*2 +1).equals(system4)){}
        if(list.get(i*2).equals(system1) && list.get(i*2 +1).equals(system5)){}
        if(list.get(i*2).equals(system1) && list.get(i*2 +1).equals(system6)){}

            if(list.get(i*2).equals(system2) && list.get(i*2 +1).equals(system2)){}
            if(list.get(i*2).equals(system2) && list.get(i*2 +1).equals(system3)){}
            if(list.get(i*2).equals(system2) && list.get(i*2 +1).equals(system4)){}
            if(list.get(i*2).equals(system2) && list.get(i*2 +1).equals(system5)){}
            if(list.get(i*2).equals(system2) && list.get(i*2 +1).equals(system6)){}

            if(list.get(i*2).equals(system3) && list.get(i*2 +1).equals(system2)){}
            if(list.get(i*2).equals(system3) && list.get(i*2 +1).equals(system3)){}
            if(list.get(i*2).equals(system3) && list.get(i*2 +1).equals(system4)){}
            if(list.get(i*2).equals(system3) && list.get(i*2 +1).equals(system5)){}
            if(list.get(i*2).equals(system3) && list.get(i*2 +1).equals(system6)){}

            if(list.get(i*2).equals(system4) && list.get(i*2 +1).equals(system2)){}
            if(list.get(i*2).equals(system4) && list.get(i*2 +1).equals(system3)){}
            if(list.get(i*2).equals(system4) && list.get(i*2 +1).equals(system4)){}
            if(list.get(i*2).equals(system4) && list.get(i*2 +1).equals(system5)){}
            if(list.get(i*2).equals(system4) && list.get(i*2 +1).equals(system6)){}
        }
    }
    public static void inputHandler(ArrayList<String> list){
        ArrayList<String> readingArray = new ArrayList<String>();

        BufferedReader br = null;
        try{
            String sCurrentLine;
            br = new BufferedReader(new FileReader("C:\\JavaFiles\\alienNumbers.in"));

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
        String counter;
        while(sc.hasNext())
        {
            counter = sc.next();
            list.add(list.size(),counter);
        }
    }
}
