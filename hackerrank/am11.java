//count non-repeating chsracters
class am11{
    public static int solve(String s){
        int count =0;
        for(int i =0;i<s.length(); i++){
            boolean repeat = false;
            for(int j =0; j<s.length(); j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    repeat = true;
                    break;
                }
            }
            if(!repeat){
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(solve("aabbccd"));
    }
}