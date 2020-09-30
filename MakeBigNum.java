import java.util.ArrayList;
import java.util.List;
public class MakeBigNum {
    public static void main(String[] args) {

        List<Integer> iList = new ArrayList<>();
        //1 0~k 중 가장 큰 수들의 인덱스를 뽑고 
        // 

        String number = "752475432586";
        int k = 6;
        for(int i = 0; i < number.length(); ++i) {
            iList.add(Integer.parseInt(number.charAt(i) +""));
        }
        int reverseK = iList.size() - k;
        int max =0;
        List<Integer> indices = new ArrayList<>();

        for(int i =0; i < k; ++i) {
            if(iList.get(i) > max) {
                max = iList.get(i);
            }
        } 
        for(int i =0; i < k; ++i) {
            if(max ==  iList.get(i)) {
                indices.add(i);
            }
        }
        
     
        
      
        System.out.println(max);
    }
}