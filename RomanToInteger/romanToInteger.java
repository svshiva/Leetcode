class Solution{
    public static int rti(String x){
        int ans = 0;
        for(char ch: x.toCharArray()){
            switch (ch) {
                case 'I':ans +=1; break;
                case 'V':ans +=5; break;
                case 'X':ans +=10; break;
                case 'L':ans +=50; break;
                case 'C':ans +=100; break;
                case 'D':ans +=500; break;
                case 'M':ans +=1000; break;
                default:break;
            }
        }
        return ans;
    }
}
public class romanToInteger
{
    public static void main(String[] args) {
         System.out.println(Solution.rti("XII"));
    }
 }
