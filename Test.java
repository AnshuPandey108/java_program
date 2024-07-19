                  /* Java Variables */

class Test
{
  int a =10;  // Instance Variable
  static int b=20;   // static variable
  public static void main(String []args){
  int c=30;  //Local Variable
  final int D=40;  //final variable

  Test t=new Test(); // object creation
  System.out.println(t.a); 
  System.out.println(b);
  System.out.println(c);
  System.out.println(D);
   
}
}
