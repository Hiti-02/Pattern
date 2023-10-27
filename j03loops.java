import java.util.*;

public class j03loops {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
       int input;
       do{
        int mark =sc.nextInt();
        if(mark >=90 && mark <= 100){
            System.out.println("good");
        } else if (mark >=50 && mark <=89){
            System.out.println("ok");
        } else if (mark >=0 && mark<=49){
            System.out.println("well");
        } else{
            System.out.println("invalid");
        }
        System.out.println("want to continue? yes(1) or no(0)");
        input=sc.nextInt();
       } while(input==0);
    
}

}
