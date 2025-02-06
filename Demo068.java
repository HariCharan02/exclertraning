public class Demo068 {
    public static void main(String[] args) {
        int[] arr = {10, 23, 34, 45, 56, 67, 78, 89, 90};
        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Count of even numbers: " + evenCount);
    }
}

