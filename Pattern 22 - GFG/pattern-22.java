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
            obj.printSquare(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printSquare(int n) {
        // code here
         for(int i=1-n;i<n;i++)
        {
            for(int j=1-n;j<n;j++)
            {
                if(Math.abs(i)>Math.abs(j)) 
                  System.out.print(Math.abs(i)+1+" ");
                else 
                  System.out.print(Math.abs(j)+1+" ");
            }
            System.out.println();
        }
    }
}