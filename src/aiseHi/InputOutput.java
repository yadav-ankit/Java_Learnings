package aiseHi;
import java.io.*;
import java.util.*;


public class InputOutput {
    
    private static void inputSpaceSepratedInput() throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int arr[] = new int[n];
        
        String str[] = new String[n];
        
        str = bf.readLine().split("\\s");
        
        for(int i=0; i<str.length; i++){
            // System.out.print(str[i]);
            arr[i] = Integer.parseInt(str[i]);
        }
        
        for(int i=0; i<str.length; i++){
         System.out.print(arr[i]);
        }
        
    }
    /*
    Remove Duplicate elements from an array
    */
    public static void main(String args[]) throws IOException {
    
    
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    Integer n = Integer.parseInt(bf.readLine());
    
    String str = bf.readLine();
    System.out.print(str);
    
    
    int arr[] = new int[n];
    char carr[] = new String("xyzgdg").toCharArray();
    Integer arr2[] = new Integer[n];
    
    Set<Integer> myset = new HashSet<Integer>();
    
    for(int i=0;i<n;i++){
          int ele = (int)bf.read();
          arr[i] = ele;
          //myset.add(ele);
    }
    
    for(Integer ele : myset){
     //   System.out.println(ele);
    }   
       for(int i=0;i<n;i++){
          System.out.println(arr[i]);
       }

    
    inputSpaceSepratedInput();
    
    }
    
}