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
     * Complete the 'closestNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> closestNumbers(List<Integer> arr) {
    // Write your code here
    Collections.sort(arr);
    Map<Integer, Integer> hmap= new HashMap<>();
    int mindiff= Integer.MAX_VALUE;
    for (int i = 0; i < arr.size()-1; i++) {
        int diff=arr.get(i+1)-arr.get(i);
        hmap.put(i,diff);
        mindiff=Math.min(mindiff,diff);
        
    }
    List<Integer> List = new ArrayList<>();
    for(Integer key:hmap.keySet()){
        if(hmap.get(key)== mindiff){
            List.add(arr.get(key));
            List.add(arr.get(key+1));
            
        }
    }
    return List;

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

        List<Integer> result = Result.closestNumbers(arr);

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
