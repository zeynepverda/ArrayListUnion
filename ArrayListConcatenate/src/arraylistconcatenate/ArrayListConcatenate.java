
package arraylistconcatenate;
import java.util.ArrayList;
public class ArrayListConcatenate {

   
    public static void main(String[] args) { 
        ArrayList<String> list1=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        list1.add("zeynos ");
        list1.add("havacılık");
        list1.add("istiyor");
        list2.add("kırmızı");
        list2.add("beyaz");
        list2.add("mavi");
        list1.addAll(list2);
        System.out.print(list1);
    }
    
}
