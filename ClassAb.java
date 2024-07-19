abstract class animal{
    animal(){
         System.out.println("All animals.......!");
    }
   public abstract void sound();
}
class Dog extends animal{
      Dog()
      {
        super();
      }
      public void sound()
      {
        System.out.println("Dog is Barking: ");
      }
}
class Lion extends animal{
      Lion()
      {
        super();
      }
      public void sound()
      {
      System.out.println("Lion is Roaring: ");
      }
}
public class ClassAb {
    public static void main(String[] args) {
        Dog d=new Dog();
        Lion l= new Lion();
        d.sound(); l.sound();
    }
    
}
