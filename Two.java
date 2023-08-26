import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Two {

    public static void main(String[] args) {


   List<Integer> a = new ArrayList<Integer>();
   a.add(10);
   a.add(20);
   a.add(23);
   for(Integer b:a)
       System.out.println(b);

       System.out.println(a.toString());
        LinkedList<String> h= new LinkedList<String>();
        h.add("first String");
        h.add("second String");

        System.out.println(h);
        System.out.println(h.get(1));
    }
}
