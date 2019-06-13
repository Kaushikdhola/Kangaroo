import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    

    public static void main(String[] args) throws IOException {
    
Scanner scanner = new Scanner(System.in);
        int x1,v1,x2,v2;
        int sum1=0,sum2=0;
        int count=1;
        x1=scanner.nextInt();
        v1=scanner.nextInt();
        x2=scanner.nextInt();
        v2=scanner.nextInt();

        while(count!=0)
        {
            sum1=x1+v1;
            x1=sum1;
           
            sum2=x2+v2;
            x2=sum2;
            if(sum1==sum2)
            {
                count=0;
                break;
            }
            else{
                if(sum2>=100000000){
                    break;
                }
            }
        }
      
        if(sum1==sum2)
        {
        System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
