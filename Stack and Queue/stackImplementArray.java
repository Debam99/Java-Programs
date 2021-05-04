public class stackImplementArray{
int top;
int capacity;
int stack[];
stackImplementArray(){
    top=-1;
    capacity=5;
    stack=new int[capacity];
}

public boolean isEmpty(){
    return top<=0;
}
public boolean isFull(){
    return top==capacity;
}

public void push(int data){
    if(isFull()){
        System.out.println("Stack is full");
    }
    ++top;
   stack[top]=data;
   
}
public void pop(){
    if(isEmpty()){
        System.out.println("The stack is empty");
    }
top--;
int data=stack[top];
stack[top]=0;
System.out.println(data);
  
}

public void peek(){
    System.out.println(stack[top]);
   
}
public void show(){
for(int n : stack){
    System.out.print(n+" ");
}
System.out.println();
}
public static void main(String[] args) {
    stackImplementArray st=new stackImplementArray();
    st.push(34);
    st.push(314);
    st.push(24);
    st.push(14);
    st.push(40);
    st.show();
   // st.pop();
    // st.pop();
    // st.pop();
    // st.pop();
    // st.pop();
    // st.pop();
st.peek();
    st.show();
}

}