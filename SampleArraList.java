package collectionlearnig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;
//import java.util.Iterator;

public class SampleArraList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list=new ArrayList();
		list.add(455);
		list.add(null);
		list.add("hello");
		list.add(455);
		list.add(900);
		System.out.println(list+" "+list.size());
		list.add("hyd");
		System.out.println(list+" "+list.size());
		list.remove(new Integer(900));
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
		Iterator itr=list.listIterator();
		while(itr.hasNext()){
				Object  obj=itr.next();
				if(obj instanceof Integer)
			System.out.println(obj);
				if(obj instanceof String)
					System.out.println("string type");
		}
		 //String[] item = list.toArray(new String[list.size()]);  
		
	}

}
