import java.util.*; 

public class HelloWorld { 
   
public static void main(String []args){
         
String[] res = {"4","4","6","5"};

LinkedHashMap<String,Integer> hm=new LinkedHashMap<String,Integer>(); 
          
for(String str : res) {
    hm.put(str,hm.containsKey(str) ? (hm.get(str) + 1) : 1); 
}
System.out.println(hm);
}
}
