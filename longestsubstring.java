import java.util.HashSet;
import java.util.Set;
public class longestsubstring {
    public static int logestsub(String s){
        Set<Character> se = new HashSet<>();
        int res=0;
        int l=0;
        for(int i=0;i<s.length();i++){
            while(se.contains(s.charAt(i))){
                se.remove(s.charAt(l));
                l++;
            }
            se.add(s.charAt(i));
            res = Math.max(res, i - l + 1);
        }
        return res;
    }
public static void main(String[] args) {
    String s ="abcabeebc";
   System.out.println(logestsub(s)); 
}
}