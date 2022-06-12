// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}
// } Driver Code Ends




class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        // code here 
        String res="";
        String []a=S.split("\\.");
        for(int i=(a.length-1);i>=0;i--)
        {
           // System.out.println(a[i]+".");
            if(i!=0)
            {
            res +=a[i]+".";
            }
            else
            res +=a[i];
        }
        return res;
        
    }
}