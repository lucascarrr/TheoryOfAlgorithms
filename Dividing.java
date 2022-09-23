import java.util.Scanner;
import java.util.ArrayList;

public class Dividing {
    public static void main(String[] args) {
        /*Getting Inputs */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> planks = new ArrayList<Integer>();
        int list_size = sc.nextInt();
        for (int i = 0; i < list_size; i++){
            planks.add(sc.nextInt());
        }

        int planks_needed = sc.nextInt();
        sc.close();

        int max_size = max(planks);
        System.out.println(bSearch(1, max_size, planks_needed, planks));

    }

    private static int max(ArrayList<Integer> planks) {
        int max = planks.get(0);
        for (int i = 0; i < planks.size(); i++){
            if (planks.get(i) > max) {
                max = planks.get(i);
            }
        }
        return max;
    }

    private static int correctSize(int plank_size, ArrayList<Integer> planks) {
        int count = 0;
        for (int plank : planks) {
            count += plank / plank_size;
        }
        return count;
    }

    private static int bSearch(int lo, int hi, int target, ArrayList<Integer> planks) {
        if (lo > hi) {      //not found
            return -1;
        }

        int mid = lo + (hi - lo) / 2;
        if (correctSize(mid, planks) == target){
            return mid;
        }
        else if (correctSize(mid, planks) > target) {
            return bSearch(mid+1, hi, target, planks);
        }
        else {
            return (bSearch(lo, mid-1, target, planks));
        }
    }

    
}
