public class Exception2 {
    public static void main(String[] args) {
        String str="Anshu";
        try{
        int a=Integer.parseInt(str);

        System.out.println("String Number Format Exception: ");
       }
        catch(NumberFormatException n)
        {
            System.out.println("string "+str+" can't be converted Into INT.");
        }
    }
}
