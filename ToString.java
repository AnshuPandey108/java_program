import java.util.Arrays;
public class ToString {
    public static void main(String[] args) {
        String a[]={"Apple","Ball","Cat","Dog"};
        System.out.println("toString: "+Arrays.toString(a));
        System.out.println("asList: "+Arrays.asList(a));
        int arr[][]={{10,20},{30,40}};
        System.out.println("deepToString: "+Arrays.deepToString(arr));
    }
}
