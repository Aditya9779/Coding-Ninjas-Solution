package Recursion_1;

import java.util.Scanner;

public class quick {
//    public static void quickSort(int[] input, int startIndex, int endIndex) {
//        if (startIndex < endIndex) {
//            int pivotIndex = partition(input, startIndex, endIndex);
//            quickSort(input, startIndex, pivotIndex - 1);
//            quickSort(input, pivotIndex + 1, endIndex);
//        }
//    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[start]; // Choosing the first element as the pivot
        int count = start;
        for (int j = start + 1; j <= end; j++) {
            if (arr[j] < pivot) {
                count++;
                // Swap arr[count] and arr[j]
                int temp = arr[count];
                arr[count] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[start] and arr[count]
        int temp = arr[start];
        arr[start] = arr[count];
        arr[count] = temp;
        return count;
    }
    public static String[] keypad(int n)
    {
        if(n==0||n==1)
        {
            String ans[]={""};
            return ans;
        }
        int newN=n%10;
        String[] ans=keypad(n/10);
        String helpans=helper(newN);
        String finalans[]=new String[helpans.length()*ans.length];
        int k=0;
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<helpans.length();j++){
                finalans[k]=ans[i]+helpans.charAt(j);
                k++;}
        }
        return finalans;
    }

    private static String helper(int newN){
        if(newN==2)
            return "abc";
        if(newN==3)
            return "def";
        if(newN==4)
            return "ghi";
        if(newN==5)
            return "jkl";
        if(newN==6)
            return "mno";
        if(newN==7)
            return "pqrs";
        if(newN==8)
            return "tuv";
        if(newN==9)
            return "wxyz";
        else
            return "";


    }
    public static void main(String[] args) {
//        int[] arr = { 10, 7, 8, 9, 1, 5 };
//        int n = arr.length;
//        quickSort(arr, 0, n - 1);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        String output[] = quick.keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
    }
