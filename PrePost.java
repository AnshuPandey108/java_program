class PrePost
{
   public static void main(String []args)
{
    int a=10;
    System.out.println(a);
    System.out.println("PrePost Incr...");
    System.out.println(a++);  //10
    System.out.println(++a);  //12
    
    System.out.println("PrePost Decr...");
    System.out.println(a--);  //12
    System.out.println(--a);  //10
}
}