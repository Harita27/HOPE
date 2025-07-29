import java.util.*;

public class MexCoinsImpossible {

    public static int findSmallestImpossible(int[] coins) {
        Arrays.sort(coins);  // sort coins in ascending order
        int res = 1;

        for (int coin : coins) {
            if (coin > res) break;
            res += coin;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // number of coin denominations
        int[] coins = new int[n];

        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }

        System.out.println(findSmallestImpossible(coins));
    }
}
