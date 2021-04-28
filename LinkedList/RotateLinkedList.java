class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       ListNode tail= head;
        int length=0;
        if(head==null || head.next==null){
            return head;
        }
        
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        length++;
        tail.next=head;
        tail=head;
        int len=length-k%length;
        for(int i=0; i<len-1; i++){
            tail=tail.next;
        }
        head=tail.next;
        tail.next=null;
        
        
        return head;
    }
    
}
