class Test{
    int a=10; String b="Anshu";
    void show()
    {
        System.out.println(a+"   "+b);
    }

}
/**
 s Test
 */
class Object_class{
    public static void main(String[] args) {
        Test r=new Test();
        // Test r;    It will also work if u want,u can use above else this one 
        // r=new Test();
        r.show();
    }

    
}
