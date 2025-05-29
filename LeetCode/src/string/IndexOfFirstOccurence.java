package string;

import java.util.Scanner;

public class IndexOfFirstOccurence {
    public int strStr(String haystack, String needle){
        for (int i=0;i<haystack.length() - needle.length()+1;i++){
            if (haystack.substring(i,needle.length()+i).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st String: ");
        String haystack = sc.nextLine();

        System.out.println("Enter 2nd String: ");
        String needle = sc.nextLine();

        IndexOfFirstOccurence ifo = new IndexOfFirstOccurence();
        int result = ifo.strStr(haystack,needle);

        System.out.println(result);

    }
}
