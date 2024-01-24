import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'jimOrders' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts 2D_INTEGER_ARRAY orders as parameter.
     */

    public static List<Integer> jimOrders(List<List<Integer>> orders) {
    // Write your code here
    Map<Integer, Set<Integer>> hmap = new TreeMap<>();
    int customer=1;
    for(List<Integer> List:orders) {
        int sum=0;
    for(int val:List){
        sum= sum+val;
        
    }
    if(hmap.containsKey(sum)){
        Set<Integer> hset= hmap.get(sum);
        hset.add(customer);
        hmap.put(sum,hset);
            
    }
    else{
        Set<Integer> hset = new TreeSet<>();
        hset.add(customer);
        hmap.put(sum,hset);
        
        
    }
    customer++;

    }
    List<Integer> newList = new ArrayList<>();
    for(Integer key: hmap.keySet()){
        for(Integer val: hmap.get(key)) {
            newList.add(val);
            
        }
    }
    return newList;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> orders = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                orders.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        List<Integer> result = Result.jimOrders(orders);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining(" "))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}

