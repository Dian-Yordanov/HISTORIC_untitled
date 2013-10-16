import java.util.Scanner;
/**
 * Date: 28/09/13
 * Time: 15:02
 * > XycsC
 */
public class Flagquiz {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
    String question = sc.nextLine();
    int alternativesNumber = sc.nextInt();
    int counterOfSameElementsByi=0;
        int[] counter= new int[100];

    if(alternativesNumber<1 || alternativesNumber>100 || alternativesNumber!= (int)alternativesNumber)
    {System.out.println("you have entered either a number not in the range of 1-100 or not a number");System.exit(0);}
    String[][] alternativesPart = new String[alternativesNumber][100];
    for(int i=0;i<alternativesNumber;i++){
        for(int ii=0;ii<alternativesNumber;ii++){
            alternativesPart[i][ii]=sc.next();
            alternativesPart[i][ii].replaceAll(", ","");
            if( alternativesPart[i][ii].length()>50)
            {System.out.print("the maximum lenght a part can have is 50");System.exit(0);}
        }
    }
    for(int i=0;i<alternativesNumber;i++){
        for(int ii=0;ii<alternativesNumber;ii++){

          if(alternativesPart[i][ii].equals(alternativesPart[i+counterOfSameElementsByi][ii])){
                counter[i]++;};
            counterOfSameElementsByi++;
            if(alternativesNumber==i-1){counterOfSameElementsByi=0;}

        }
        System.out.println(counter[i]);
    }

    }

}
