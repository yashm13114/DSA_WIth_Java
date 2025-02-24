package mathsForDSA;

public class BS_Sqrt {
    public static void main(String[] args) {
        int n = 36;
        int p = 3;
        System.out.println(sqrt(n,p));
    }
    static double sqrt(int n, int p){
        int s = 0;
        int e = n;

        double root = 0.0;
        while (s <= e){
            int mid = s +(e - s)/ 2;

            if (mid * mid == n){
                return mid;
            }
            if (mid * mid > n){
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        double incre = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n){
                root += incre;
            }
            root -= incre;
            incre /= 10;
        }
        return root;
    }
}
