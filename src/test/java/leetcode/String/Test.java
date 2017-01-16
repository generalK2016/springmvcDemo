package leetcode.String;

/**
 * Created by shayuan on 2016/12/11.
 */
public class Test {

    public static String countAndSay(int n){
        String init = "1";
        for(int i=1; i<n;i++){
            init = countAndSay(init);
        }
        return init;
    }

    public static String countAndSay(String init){
        char[] str = init.toCharArray();
        String s = "";
        int p = 1;
        int count = 1;
        char last = str[0];
        for(;p<init.length();p++){
            if(str[p]==last){
                count ++;
            }else{
                s += "" +count +last;
                count = 1;
                last = str[p];
            }
        }
        s += "" +count +last;
        return s;
    }


    public static void main(String[] args) {
        String s = countAndSay(4);
        System.out.println(s);
    }
}
