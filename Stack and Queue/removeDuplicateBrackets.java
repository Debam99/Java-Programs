import java.util.*;
public class removeDuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    Stack <Character> stack =new Stack<>();    
    for(int i=0; i<str.length(); i++){
char c=str.charAt(i);
    
if(c==')'){
    if(stack.peek()=='('){
    System.out.println(true);
    return;
    }else{
        while(stack.peek()!='('){
            stack.pop();
        }
    }
}else{
    stack.push(c);
}
}

System.out.println(false);


    }
    
}
