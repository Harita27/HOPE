public class KadaneSubarray {

    public static void kadaneWithSubarray(int[] arr) {
    int maxSoFar = Integer.MIN_VALUE;
    int maxEndingHere = 0;
    int start = 0, end = 0, s = 0;

    for (int i = 0; i < arr.length; i++) {
        maxEndingHere += arr[i];

        if (maxSoFar < maxEndingHere) {
            maxSoFar = maxEndingHere;
            start = s;
            end = i;
        }

        if (maxEndingHere < 0) {
            maxEndingHere = 0;
            s = i + 1;
        }
    }

    // Print the subarray
    System.out.print("Maximum Subarray: [");
    for (int i = start; i <= end; i++) {
        System.out.print(arr[i]);
        if (i < end) System.out.print(", ");
    }
    System.out.println("]");
    System.out.println("Maximum Sum: " + maxSoFar);
}


    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadaneWithSubarray(arr);
    }
}
