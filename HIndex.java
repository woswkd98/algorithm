import java.util.Arrays;

public class HIndex {
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        Arrays.sort(citations);
        // 0 1 3 5 6
        // 3 5 6
        
        int answer = 0;
        for(int i =0; i < citations.length; ++i) {
            if(
                citations[i] >= citations.length - i
            ) {
                
                answer = i + 1;
            } 

        }
        System.out.println(answer);
    }
}
