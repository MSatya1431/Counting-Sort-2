import java.util.Scanner;
public class Ram
{
    public static void countingSort(int[] arr)
    {
        int[] a=new int[100];
        for(int i=0;i<arr.length;i++)
        {
            a[arr[i]]++;
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i];j++)
            {
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        countingSort(arr);
        
    }
}