interface A{
    public static void show()
    {
        System.out.println("Can't Override interface static method: ");
    }
}
public class JDk2 {
    public static void main(String[] args) {
        A.show();
    }
}
