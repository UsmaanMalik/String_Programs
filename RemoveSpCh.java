package Strings;

public class RemoveSpCh {
    public static void main(String [] args){
        String str="$ja!va$&\tst%ar";
        String plainstr=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainstr);
        //Remove Special charcharter for our String
        String plainstr1=str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(plainstr1);
    }
    
}
