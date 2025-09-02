## Map
- Map is a Data structure that is used to store elements in the form of pairs.
- Each pair contains a key and a value
- In Java programming, to use map data structure we have the following two interfaces.
    - Map
    - SortedMap
- In Java Programming, to implement map interface we use the following predefined classes
    - HashMap
    - LInkedHashMap
- In Map Interface to perform insert operations, delete oeprations, for accesssing elements we have the following predefined methods.
    1. clear() - this method is used to remove/delete all the pairs from the map.
    2. containsKey(k) - to check if the key is available in the map or not (return boolean)
        - object.containsKey(k):
    3. containsValue(v): to check if the value is available in the map or not (return boolean)
        - object.containsValue(v);
    4. entryset() - this method is used to arrange the pairs in the form of array to iterate through the map
        - object.entryset();
    5. equals(): this method is used to check if both maps are equal or not.
        - object1.equals(object2);    //check object2 with object 1
    6. isEmpty(): this method is used to check if the given map is empty or not(return boolean)
        - object.isEmpty();
    7. keyset():  return all the keys from the given map.
        - object.keyset();
    8. values():  return all the values from the given map.
        - object.values();
    9. size() : return the no of pairs in the given map.
        - object.size();
    10. get(k):  return the value for the given key. If the given key is not available in the map ,it returns null value.
        - object.get(k);
    11. put(k,v): insert a new pair of key, value into the map.
        - object.put(k,v);
    12. putIfAbsent(k,v): insert given pair into the map <=> if the given key is not available.
        - object.putIfAbsent(k,v);
    13. putAll(object): to copy all the pairs from one map to another map.
        - object1.putAll(object2);   // copy objects from 2 to 1.
    14. remove(k): if the key is present in the map then key value pair is removed.
        - object.remove(k);
    
    WE can use all these map interface methods with the help of object of hashmap class or linked hashmap class.

//write a java program to implement the following instructions

1. create a object of hashmap 
2. print the size of Hashmap
3. check if the map is empty or not
4. insert 1:”abc” 2:”xyz”
5. print size of map
6. check map is empty or not.
7. display map- (1-sop(object) 2. entryset)
8. put 2:”pqr” 
9. print size
10. print map (” 1:abc, 2:pqr”)
11. put 1:”xyz” if 1 is not available (putIfAbsent)
12. print size
13. put 3:”xyz” if 3 is not available 
14. print size
15. read key from the user and check if the user given key is available in the map or not , if available print its value.  ( read key-”enter key “ , ex:2 if object.containsKey(keyy): object.get(k));
16. print all the keys from the map. (using keyset)
17. print all the values from teh map. (values)
18. read a value from the user and check if the value is available in the map or not.


```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Map<Integer, String> hm=new HashMap<>(); //1
		System.out.println(hm.size()); //2
		if(hm.isEmpty()){  //3
		    hm.put(1,"abc"); //4
		    hm.put(2,"xyz");
		}
		System.out.println(hm.size()); //5
		System.out.println(hm.isEmpty()); //6
		    
		System.out.println(hm); //7-1
		System.out.println(hm.entrySet());  //7-2
		hm.put(2,"pqr"); //8
		System.out.println(hm.size()); //9
		System.out.println(hm);  //10
		hm.putIfAbsent(1,"xyz"); //11
		System.out.println(hm.size());  //12
		hm.putIfAbsent(3, "xyz");  //13
		System.out.println(hm.size());  //14
		Scanner sc=new Scanner(System.in); //15
		System.out.println("Enter key");
		int keyy=sc.nextInt();
		if(hm.containsKey(keyy)){
		    System.out.println(hm.get(keyy));
		}
		System.out.println(hm.keySet()); //16
		System.out.println(hm.values()); //17
		
		System.out.println("Enter value"); //18
		String str=sc.nextLine();
		if(hm.containsValue(str)){
		    System.out.println(str+" is available");
		}
	}
}
```