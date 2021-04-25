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
    public boolean isPalindrome(ListNode head) {
         if(head==null || head.next==null){
            return true;
        }
        
        ListNode mid = midOfList(head);
        ListNode newHead= mid.next;
        mid.next=null;
        newHead = reverse(newHead);
       
        
        
        ListNode c1=head;
        ListNode c2=newHead;
        
        boolean res=true;
        
        while(c1!=null && c2!=null){
            if(c1.val!=c2.val){
                res=false;
                break;
            }
            c1=c1.next;
            c2=c2.next;
        }
        return res;
        
        
    }
    
}
