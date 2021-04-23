
 class Node{
	int data;
	Node next;
}


class reverseLinkedList{

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

public void show(){
	Node node=head;

	while(node.next!=null){
		System.out.print(node.data+" ");
		node=node.next;
	}
	System.out.print(node.data);
		System.out.println();

}




public static void main(String[] args) {


Node head = new Node(35);
Node 2nd = new Node(10);
Node 3rd = new Node(8);
Node 4th = new Node(4);


head.next=2nd;
2nd.next=3rd;
3rd.next=4th;

LinkedList list= new LinkedList();
list.show();

list.reverseList(head);
list.show();


}



		}