class Solution {
    public ListNode midOfList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow =head;
        ListNode fast =head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }
    public ListNode reverse(ListNode newHead){
        if(newHead==null || newHead.next==null){
            return newHead;
        }
        ListNode prev=null;
        ListNode curr=newHead;
        ListNode nex=null;
        
        while(curr!=null){
            nex=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nex;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
         if(head==null || head.next==null){
            return ;
        }
        
        ListNode mid = midOfList(head);
        ListNode newHead= mid.next;
        mid.next=null;
        newHead = reverse(newHead);
       
        
        
        ListNode c1=head;
        ListNode c2=newHead;
        
        ListNode f1=null;
        ListNode f2=null;
        
        while(c1!=null && c2!=null){
            f1=c1.next;
            f2=c2.next;
            
            c1.next=c2;
            c2.next=f1;
            
            c1=f1;
            c2=f2;
        }
        
        
    }
}
