public class Demo029 {
    public static void main(String[] args) {
        int i = 10;
        String arr[] = new String[i];
        arr[0] = "charan";
        arr[1] = "kanna";
        arr[2] = "Nikki";
        arr[3] = "Chinnu";
        arr[4] = "Rishi";
        arr[5] = "bro";
        arr[6] = "ashu";
        arr[7] = "sathwika";
        arr[8] = "raahul";
        arr[9] = "nagesh";
        System.out.println("Array elements are:");
        for (int j = 0; j < arr.length; j++) {
            System.out.println("arr[" + j + "] = " + arr[j]);
        }
    }
}