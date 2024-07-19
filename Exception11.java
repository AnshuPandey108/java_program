
class Exception11
 {
    void div(int a,int b) throws ArithmeticException
        {
            if(b==0)
            {
                throw new ArithmeticException("Devision by zero is not allowed");
            }
            else
            {
                int c=a/b;
                System.out.println(c);
            }
        }
    public static void main(String[] args) {
        Exception11 e=new Exception11();
            e.div(20, 0);
    }
}