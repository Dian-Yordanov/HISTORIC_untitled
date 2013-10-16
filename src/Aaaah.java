import java.util.Scanner;

/**
 * Date: 29/09/13
 * Time: 02:51
 * > XycsC
 */
public class Aaaah {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int i=0,ii=0;
        String whatJonCanSay = sc.nextLine();
        String whatDoctorWants = sc.nextLine();
        do{
        if(whatJonCanSay.contains("a")){i++;whatJonCanSay.replace("a","");}
        }while(i<whatJonCanSay.length());
        do{
        if(whatDoctorWants.contains("a")){ii++;whatDoctorWants.replace("a","");}
        }while(ii<whatDoctorWants.length());
        if(i>ii){System.out.print("go");}
        else{System.out.print("no");}
    }
}
