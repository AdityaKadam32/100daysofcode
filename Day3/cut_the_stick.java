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
     * Complete the 'cutTheSticks' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
    //  [5 4 4 2 2 8]
    //  [2 2 4 4 5 8]                    ans = [6,4,2,1]
     
    //  min = 8

    public static List<Integer> cutTheSticks(List<Integer> arr) {
    // Write your code here
    List<Integer> ans = new ArrayList<>();
    Collections.sort(arr);
    int min = arr.get(0);
    ans.add(arr.size());
    for (int i = 0; i < arr.size(); i++) {
        if(arr.get(i)>min){
            min=arr.get(i);
            ans.add(arr.size()-i);
        }
        
        
    }
    return ans;
    
     

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

        List<Integer> result = Result.cutTheSticks(arr);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
