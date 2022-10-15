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
        int space=2*n-2;
        
        
        for(int i=1;i<=n;i++)
        {
            
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
            space=space-2;
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
            
        }
        space=space+4;
        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int j=0;j<space;j++)
            {
                System.out.print(" ");
            }
                        space=space+2;

            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}