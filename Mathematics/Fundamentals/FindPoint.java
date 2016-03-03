import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Formula to find the symmertric point x = 2* Px2-Qx1 and y = 2* Py2-Qy1*/
        
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
  
        for(int i=0;i<t;i++){
            int x1=s.nextInt();
            int y1=s.nextInt();
            int x2=s.nextInt();
            int y2=s.nextInt();
  
            int x=2*x2-x1;
  
            int y=2*y2-y1;
            
            System.out.println(x+" "+y);
        }
    }
}
