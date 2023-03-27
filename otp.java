import java.util.Random;
import java.util.Scanner;

public class otp {

    void data(){
        String d;
        String num = "0123456789";
        int n = 6;
        char[] s = new char[n];
        Random r = new Random();

        for(int i =0; i<n ; i++){
        s[i] = num.charAt(r.nextInt(num.length())); 
        }

        System.out.println("Your otp is:" + new String(s));
        
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter the otp: ");
        d = s2.next();

        if(d.equals(new String(s))){
            System.out.println("Your otp has been verified....");
        }

        else{
            for(int i = 0; i<=i; i++){
            System.out.println("Enter the valid otp");
            d = s2.next();
            
            if(d.equals(new String(s))){
                System.out.println("Your otp has been verified....");
                break;
            }
        }
    }
    }

    void display(){
        long numm;
        Scanner ss = new Scanner(System.in);
        System.out.println("Enter your Mobile number: ");   
        numm = ss.nextLong();
    }

    public static void main(String[] args) {
    otp s1 = new otp();
    s1.display();
    s1.data();       
}
}
