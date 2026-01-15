//count vowels in the string
class am5{
    public static int solve(String s){
        int count = 0;
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e'|| ch =='i'|| ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        System.out.println(solve("amcat exam"));
    }
}