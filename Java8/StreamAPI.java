import java.util.*;
import java.util.stream.*;
public class StreamAPI {
   public static void main(String[] args) {
    // Immutable list can't be changed
    List<Integer> list1 = List.of(2,3,4,5,6,7,8);
    // System.out.println(list1);  
    Stream<Integer> stream = list1.stream();
    int[] arr = {1,2,3,4,5,6};
    List<Integer> res = stream.filter(it->{     // passing predecate into filter elements
        return (it % 2 == 0);
    }).collect(Collectors.toList());
    System.out.println(res);
    
    int sum = list1.stream().mapToInt(Integer:: intValue).sum();
    System.out.println(sum);  

    Stream emptyStream = Stream.empty();

    String[] names = {"Ankit","Ayush","Aditya","Divya"};

    Stream<String> stream1 = Stream.of(names);
    stream1.forEach(it->{
        System.out.println(it);
    });
     IntStream intStream = Arrays.stream(new int[]{1,2,3,4,4,5,6});

     intStream.forEach(e->{
        System.out.println(e);
     });

     Set<Integer> set = new HashSet<>();
     set.add(2);
     set.add(3);
     set.add(4);
     set.add(5);

     Stream<Integer> st = set.stream();
     st.forEach(e->{
        System.out.println(e);
     });

     IntStream streamset = set.stream().mapToInt(Integer:: intValue);
     
     streamset.forEach(e->{
        System.out.println(e);
     });

     List<String> Names = List.of("Anil","Ankit","Ajay Suneja","Aniyeshu");

     List<String> StreamNames = Names.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());

     List<Integer> numbers = List.of(1,2,3,4,5,6,7);
      
     List<Integer> squares = numbers.stream().map(i->i*i).collect(Collectors.toList());
     System.out.println(squares);
   }    

}
