import java.util.Map;
import java.util.HashMap;
class Solution{
    public static int rti(String x){
        int ans = 0;
        Map<Character, Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        char prev='\0';
        for(char ch: x.toCharArray()){
          if(prev == 'I') if(ch == 'V' || ch == 'X') ans -=2;
          else if(prev == 'X') if(ch == 'L' || ch == 'C') ans -=20;
          else if(prev == 'C') if(ch == 'D' || ch == 'M') ans -=200;
          ans+=m.get(ch);
          prev = ch;
        }

        return ans;
    }
}
public class romanToInteger
{
    public static void main(String[] args) {
         System.out.println(Solution.rti(args[0]));
    }
 }
