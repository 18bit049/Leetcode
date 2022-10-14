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
        int space=n-1;
        char c='A';
        int a=c;
        for(int i=1;i<=n;i++)
        {
            a=c;
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print((char)a);
                a++;
            }
            a--;
            for(int k=i;k>1;k--)
            {    a--;
                System.out.print((char)a);
               
            }
            System.out.println();
            space--;
        }
    }
}