public class NonPrimDataTypes {
    public static void main(String[] args) {
        String str = "first";
        System.out.println("String is: " + str);

        String str1 = new String("test");
        System.out.println("Another string: " + str1);

        int arr[];
        arr = new int[2];
        arr[0] = 0;
        arr[1] = 1;

        System.out.println(arr);
        System.out.println(arr[1]);
    }
}
