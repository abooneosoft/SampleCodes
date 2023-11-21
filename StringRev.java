package codes;

public class StringRev {

    public static void main(String[] args) {
        String s = "Neosoft Technologies";
        String toRev = s.toLowerCase();
        String rev= "";
        for (int i = s.length()-1; i>=0 ; i--) {
           char a = toRev.charAt(i);
            rev = rev + a; 
            
        }
        System.out.print(rev);
       
        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();
        System.out.println(reversed);
    }
    
}
