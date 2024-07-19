abstract class Programing{
    public abstract void developer();
    public abstract void Rank();
}
class Html extends Programing{
    @Override
    public void developer()
    {
        System.out.println("Tim Barners Lee");
    }
    public void Rank()
    {
        System.out.println("3rd");
    }
}
class Java extends Programing{
    @Override
    public void developer()
    {
        System.out.println("James Gosling");
    }
    public void Rank()
    {
        System.out.println("1st");
    }
}
public class MethodAb {
      public static void main(String[] args) {
        Html h=new Html();
        Java j=new Java();
        h.developer();j.developer();
        h.Rank();j.Rank();
      }
    
}