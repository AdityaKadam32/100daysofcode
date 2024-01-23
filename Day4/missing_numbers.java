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
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List <Integer> brr) {
        List<Integer> missingValueList = new ArrayList<>();
        Map<Integer , Integer> hmap = new HashMap<>();
        for(int i=0; i<brr.size();i++){
            hmap.put(brr.get(i),hmap.getOrDefault(brr.get(i),0)+1);
        }
          for(int i=0; i<arr.size();i++){
            if(hmap.containsKey(arr.get(i)) && hmap.get(arr.get(i))>0){
              hmap.put(arr.get(i),hmap.get(arr.get(i))-1);  
            }
        }
    for(Integer key:hmap.keySet()){
        if(hmap.get(key)>0) {
            missingValueList.add(key);
        }
    }
    Collections.sort(missingValueList);
    return missingValueList;
            
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> result = Result.missingNumbers(arr, brr);

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


