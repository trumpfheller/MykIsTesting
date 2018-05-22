package Arrays;

import java.util.ArrayList;
import java.util.List;

public class MyList{
    List<String> list = new ArrayList<String> ();
    List<String> list2 = new ArrayList<String> ();
    
    public List<String> method(List<String> list){
    list.add ("a");
    list.add ("b");
    return list;
    }
    public static void main (String[]args){
    MyList ml1 = new MyList();
    ml1.list2 = ml1.method(ml1.list);
    ml1.list.add("c");
    ml1.list.add("d");
    System.out.println(ml1.list2);
    }
}
/*
Declaration 1:

ArrayList<String> arrayList = new ArrayList<String>();

Declaration 2:

List<String> arrayList = new ArrayList<String>();
*/