public class Demo067 {
    public static void main(String[] args) {
        int[] arr = {2,4,5,7,8,9,20};
        System.out.println("Even elements in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}   