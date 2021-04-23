 class Node{
	int data;
	Node next;
}

 class LinkedList{
	Node head;


public void insert(int data){
	Node node= new Node();
	node.data=data;
	node.next=null;

if(head==null){
	head=node;
}
else{
	Node n= head;
	while(n.next!=null){
		n=n.next;
	}
	n.next=node;
}

}



public void del(int index){
	if(index==0){
		head=head.next;
	 }

	else{
		Node n= head;
		Node n1=null;

			for(int i=0; i<index-1; i++ ){
				n=n.next;

			 }
			 n1=n.next;
			 n.next=n1.next;


	}
}



public void show(){
	Node node=head;

	while(node.next!=null){
		System.out.print(node.data+" ");
		node=node.next;
	}
	System.out.print(node.data);
		System.out.println();

}



public Node reverseList(Node head){
if(head==null){
	return head;
}
Node prev =null;
Node current = head;

Node nextNode=null;

while(current!=null){
	nextNode=current.next;
	current.next=prev;
	prev=current;
	current=nextNode;
}
return prev;

}



}

public class Runner{
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(35);
		list.insert(36);
		list.insert(37);
		list.insert(38);
		list.show();
		list.del(2);
		list.show();


	}
}