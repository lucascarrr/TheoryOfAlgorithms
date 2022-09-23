import java.util.Scanner;

class Modulus {
    public static void main(String[] args) {
        /*Getting the inputs */
        Scanner scan = new Scanner(System.in);
        int n_integer = scan.nextInt();
        int z_integer = scan.nextInt();
        scan.close();

        /*Elegant Solution */
        // startTime = System.nanoTime();
        int pair_count = 0;

        for (int i = 1; i < n_integer; i++){
            for (int j = i; j < n_integer; j++) {
                if ((i * j) % n_integer == z_integer){
                    if (i == j) { pair_count += 1; }
                   else { pair_count += 2; }
                }
            }
        }

        // endTime   = System.nanoTime();
        // totalTime = endTime - startTime;
        System.out.println(pair_count);
        // System.out.println("Runtime of Elegant: " + totalTime);
    }   
}