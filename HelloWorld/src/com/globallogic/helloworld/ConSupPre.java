package com.globallogic.helloworld;
import java.util.*;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.List;
public class ConSupPre {
public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<Integer,String>();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Limit of the map");
	int n=sc.nextInt();
	for(int i=0;i<n;i++){
	System.out.println("Enter name");
	String v = sc.next();
	System.out.println("Enter Key");
	int k = sc.nextInt();
	map.put(k, v);
	}
	System.out.println(map.keySet());
	//map.entrySet().forEach();
	Consumer<Map.Entry<Integer,String>> con=e->System.out.println(e.getKey());
	map.entrySet().forEach(con);
	
//	
   ArrayList<Integer> ar=new ArrayList<Integer>();
   //Scanner sc = new Scanner(System.in);
	System.out.println("Enter Limit of the List");
//	int n=sc.nextInt();
	for(int i=0;i<n;i++){
		System.out.println("Enter integer value");
		int k = sc.nextInt();
		ar.add(k);
}
	Consumer<Integer>consum=t->System.out.println(t);
	ar.forEach(consum);
	
	String str[]=new String[]{"Sydney", "Dhaka", "New York", "London"};
	List<String> cities = Arrays.asList(str);
	String[] words = {"ace", "boom", "crew", "dog", "eon"};  

   

    Consumer<List<String>> upperCaseConsumer = list -> {
        for(int i=0; i< list.size(); i++){
            list.set(i, list.get(i).toUpperCase());
        }
    };
    Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

    upperCaseConsumer.andThen(printConsumer).accept(cities);
    
    
    
    
    
    IntStream.range(1, 10).forEach(System.out::println);
    
    
}}
