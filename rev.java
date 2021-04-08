import java.io.*;
import java.util.*;
class rev{
    public static void main(String args[])throws IOException{
    Scanner sc= new Scanner(System.in);
    String str= "Hi My name is Debam";
    char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
    int i=0;
    int j=str.length()-1;
    while(i<j){
                char c=ch[i];
                ch[i]=ch[j];
                ch[j]=c;
                j--;
                i++;
    }
    for (char k : ch)
            System.out.print(k);




    }
}