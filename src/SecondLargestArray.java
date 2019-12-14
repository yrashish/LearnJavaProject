import java.util.Arrays;

public class SecondLargestArray {
    public static void main(String[] args) {
        int array [] = {10,20,5,15};
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]);
        }
        System.out.println("Second Largest Element In Given Array Is");
        System.out.println(array[array.length-2]);

    }
}
