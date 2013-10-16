import java.util.Scanner;

/**
 * Date: 02/10/13
 * Time: 04:56
 * > XycsC
 */
public class AlistGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long i=1,ii=0,m=1;
        long player1Input = sc.nextLong();
        for(long n=1;n<=player1Input;n++){
            if(player1Input%n==0){ii++;m=m*n;System.out.println(n + " " + m);}
            if(player1Input==m){break;}
        }

        System.out.println(ii-1);
    }
}
