// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int s = sc.nextInt();

            int[] m = new int[n];
            for (int j = 0; j < n; j++) {
                m[j] = sc.nextInt();
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> res = obj.subarraySum(m, n, s);
            for(int ii = 0;ii<res.size();ii++)
                System.out.print(res.get(ii) + " ");
            System.out.println();
        }
    }

}// } Driver Code Ends


class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
       // Your code here
      
       for(int i =0; i<n;i++){
           int j; 
           int sum = 0 ;
           for(j = i; j<n && sum<s;j++){
               sum +=arr[j];
               
           }
           
           
           
           if(sum==s){
               // System.out.println(i+1+ " " + j+1);
               arrli.add(i+1);
               arrli.add(j);
               break;
               
               
              
           }
           
       }
       if(arrli.size()==0){
           arrli.add(-1);
       }
       return arrli;
   
    }
}