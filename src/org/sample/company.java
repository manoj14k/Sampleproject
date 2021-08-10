package org.sample;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class company {
public static void main(String[] args) {
   Map<Integer,String> mp = new LinkedHashMap();
   
  //insert values
   mp.put(10,"java");
   mp.put(20, "sq1");
   mp.put(30,"selenium");
   mp.put(40, "selenium");
   mp.put(50, "python");
   mp.put(60, "cloud");
   mp.put(10,"c#");
   mp.put(90, "google");
   
   
   int size = mp.size();
   System.out.println(size);
   
   String getkey = mp.get(30);
   System.out.println(getkey);
   
   mp.remove(40);
   System.out.println(mp);
   
   String string = mp.get(30);
   System.out.println(string);
   
   boolean containsKey = mp.containsKey(30);
   System.out.println(containsKey);
   
   boolean containsValue = mp.containsValue("sq1");
   System.out.println(containsValue);
   
   Collection<String> values = mp.values();
   System.out.println(values);
   
   Set<Integer> keySet = mp.keySet();
   System.out.println(keySet);
   
   Set<Entry<Integer,String>> entrySet = mp.entrySet();
   System.out.println(entrySet);
   
for (Entry<Integer, String> entry2 : entrySet) {
	System.out.println(entry2);
	
}   
	for (Entry<Integer, String> entry : entrySet) {
		System.out.println(entry.getValue());
		System.out.println(entry.getKey());
	}

   
   
   
   
   
}
}
