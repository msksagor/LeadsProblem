
package leadsproblem;

import java.util.Scanner;

public class LeadsProblem {

    public static void main(String[] args) {
        float n,r,d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Training Hour ?");
        n = sc.nextFloat();
        System.out.println("Enter Class Hour ?");
        r = sc.nextFloat();
        if(n>0 && r>0 && n>=r){
        d = n/r;
        System.out.println("Total number of classes : "+d);
        }
        
               
    }
    
}
