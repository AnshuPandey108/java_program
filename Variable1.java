class Variable1 
{
  
   static int a=10;
    void fun()
{
  int b=10;
  System.out.println(a+" "+b);
  ++a;  ++b;
}
    public static void main(String [] args)
{
   Variable1 r=new Variable1();
   r.fun();
   r.fun();
}
}