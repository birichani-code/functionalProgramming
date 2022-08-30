
 /*
  * Author     : birichani.code
  * Date         : 31/08/22  00:12
  * Project Name : functionalProgramming
  * */


 package birichani.code;

 import java.util.Arrays;
 import java.util.List;
 import java.util.stream.Stream;

 public class Functions {

  public static void main(String[] args) {

   //Collections
   String[] names ={"Sally","George","Paul","John",};
   List<String>list= Arrays.asList(names);
   Stream<String>stream=list.stream();
   stream.forEach(name-> System.out.println(name + "-" + name.length()));

   //Method and constructor references

   Stream<Integer>stream1=Stream.of(12,34,56,78,23);
  // stream1.map(x->x * 3)
   stream1.map(Math::sqrt)
           .forEach(System.out::println);

   //Functions
   Integer[] arr ={1,2,3,4,56};
   List<Integer>list1=Arrays.asList(arr);
   list1.forEach(System.out::println);

  }

 }
