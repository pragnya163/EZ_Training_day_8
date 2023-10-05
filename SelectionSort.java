import java.util.*;
import java.io.*;
public class SelectionSort
{
    void sort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int[] arr=new int[n];//={10,15,25,5,9};
        System.out.println("enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        SelectionSort obj=new SelectionSort();
        obj.sort(arr);
        System.out.println("sorted array:");
        obj.printArray(arr);
    }
}