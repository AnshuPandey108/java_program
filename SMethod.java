public class SMethod {
    public static void main(String[] args) {
        String a="ANKIT";
        String b="rahul";

        System.out.println(a.toLowerCase());
        System.out.println(b.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());
        
        String c="   Ankush    ";
        String d="Learn";
        System.out.println(c.trim());
        System.out.println(d.isEmpty());

        System.out.println(b.charAt(2));
        System.out.println(a.indexOf('K'));

        System.out.println(b.equals(a));
        System.out.println(d.replace('r', 'T'));
    } 
}
