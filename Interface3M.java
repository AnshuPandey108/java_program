interface client{
    void webdesign();
    void webdevelop();
}
 abstract class Rajtech implements client{
    @Override
     public void webdesign()
     {
        System.out.println("Green, Top menu,Three dot button: ");
     }
}
class Rahultech extends Rajtech{
    @Override
    public void webdevelop()
    {
     System.out.println("Html,Css,JavaScript");
    }
}
public class Interface3M {
    public static void main(String[] args) {
        Rahultech r=new Rahultech();
        r.webdesign();
        r.webdevelop();
    }
}
