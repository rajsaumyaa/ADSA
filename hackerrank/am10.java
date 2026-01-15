//check palindrome string
class am10{
    public static boolean solve(String s){
        int i = 0;
        int j = s.length() -1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    public static void main(String[] args){
        String s = "level";
        if (solve(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}