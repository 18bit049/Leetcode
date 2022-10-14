//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int x=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                x=1;
                for(int j=1;j<=i;j++)
                {
                   System.out.print(x+" "); 
                   if(x==1)
                   {
                       x=0;
                   }
                   else
                    x=1;
                }
            }
            if(i%2==0)
            {
                x=0;
                for(int j=1;j<=i;j++)
                {
                   System.out.print(x+" "); 
                   if(x==1)
                   {
                       x=0;
                   }
                   else
                    x=1;
                }
            }
            System.out.println();
        }
        
    }
}