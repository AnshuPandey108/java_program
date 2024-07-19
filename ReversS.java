public class ReversS {
    public static void main(String[] args) {
      // Using StringBuffer to reverse the string
      StringBuffer r = new StringBuffer("Anshu Pandey");
      System.out.println(r.reverse());
      
      // Manually reversing the string
      int l;
      String r1 = "Anshu Pandey";
      String r2 = "";
      l = r1.length();
      for(int i = l - 1; i >= 0; i--) {
          r2 = r2 + r1.charAt(i);
      }
      System.out.println(r2);
    }  
  }
  