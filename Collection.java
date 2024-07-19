import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class Collection {
    public static void main(String[] args) {
        ArrayList<String> Name=new ArrayList<String>();
        Name.add("Anshu");
        Name.add("Perfect");
        Name.add("Danger");
        System.out.println(Name);
        Name.add(1,"Raju");
        System.out.println(Name);
        Name.remove(1);
        System.out.println(Name);
        Name.set(1, "Rohit");
        Name.clear();
        System.out.println(Name);

        LinkedList<String> name=new LinkedList<String>();
        name.add("Anshu");
        name.add("Perfect");
        name.add("Danger");
        System.out.println(name);
        name.addFirst("Salman");
        System.out.println(name);
        name.remove(2);
        System.out.println(name);
        for(String str:name)
        {
            System.out.println(str);
        }

        Stack<String> stack=new Stack<String>();
        stack.push("anshu");
        stack.push("perfect");
        stack.push("danger");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);

        ArrayDeque<String> array=new ArrayDeque<String>();
        array.add("anshu");
        array.add("perfect");
        array.add("danger");
        System.out.println(array);
        array.remove();
        System.out.println(array);
    }
}
