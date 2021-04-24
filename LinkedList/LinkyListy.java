
public class LinkyListy {
    Node head;

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }




    public void append(int data){ // 1) append
        if(head==null){
            head=new Node(data);
            return;
        }
        Node curr =head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=new Node(data);
    }




    public void prepend(int data){ // 2) prepend
        Node newhead=new Node(data);
        newhead.next=head;
        head=newhead;
    }




    public void delNode(int data){ // 3) Delete by value
        if (head==null) return;
        if(head.data==data){
            head=head.next;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            if(curr.next.data==data){
                curr.next=curr.next.next;
                return;
            }
            curr=curr.next;
        }
    }

public void delByIndex(int index){
    if (head==null) return;

    Node temp=head;
    for(int i=0; i<index-1;i++){
        temp=temp.next;
    }
    Node temp2=temp.next.next;
    temp.next=temp2;
}


    public void insert(int pos,int data){ // 4) Insert

        Node curr=head;
        Node temp=new Node(data);
        temp.next=null;
        if(pos==0){
            prepend(data);
        }
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
        temp.next=curr.next;
        curr.next=temp;
    }




    public void print(LinkyListy List){ // 5) Print
        Node curr=List.head;
        while(curr.next!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println(curr.data+"\n");
    }




    public LinkyListy reverse(LinkyListy List){
        Node curr,prev,next;
        curr=List.head;
        prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return List;
    }

    public static void main(String[] args) {
    LinkyListy list = new LinkyListy();
    list.append(5);
    list.append(10);
    list.append(15);
    list.append(20);
    list.append(25);
    list.print(list);
    list.reverse(list);
    list.print(list);

}
    
}



