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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
    Map<Integer, Integer> treemap =new TreeMap<>();
    int type = -1;
    for (int i = 0; i < arr.size(); i++) {
        if(treemap.containsKey(arr.get(i))){
            int val = treemap.get(arr.get(i));
            treemap.put(arr.get(i), val+1);
        }
        else {
            treemap.put(arr.get(i),1);      
              }   
    }
    int maxcount = Integer.MIN_VALUE;
    for(Integer key:treemap.keySet()){
        if(treemap.get(key)>maxcount) {
          maxcount =treemap.get(key);
          type = key;
        }
    }
    return type;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
