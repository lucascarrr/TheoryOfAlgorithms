import java.util.Scanner;

public class Pricing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long K = scan.nextLong();
        scan.close();

        //long largest = f((int) K);
        System.out.println(binarySearch(0, 1000000, K));

    }   
    public static long binarySearch(long lo, long hi, long available) {
        if (lo > hi) { 
            return -1;
        }
        long mid = lo + (hi - lo) / 2;
        if (f(mid) < available && f(mid+1) > available) {
            return mid;
        }
        else if (f(mid) < available) {
            return binarySearch(mid+1, hi, available);
        }
        else {
            return binarySearch(lo, mid-1, available);
        }
    } 

    public static long f(long i)
    {
        long result = 0;
        for (int j = 1; j < i; ++j)
        {
            result += j * (i/j);
        }
        return result;
    }


}
