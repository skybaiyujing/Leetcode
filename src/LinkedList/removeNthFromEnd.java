package LinkedList;
/*
19 中等
*给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
* */
public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    if(head==null){
        return null;
    }
    if(head.next==null){
        return null;
    }


    ListNode r=reverse(head);
    ListNode dummy = new ListNode(-1);
    dummy.next = r;
    ListNode prev=dummy;
    for(int i=0;i<n-1;i++){
        prev=r;
        r=r.next;
    }
    prev.next=r==null?null:r.next;
    return reverse(dummy.next);
}
    public ListNode reverse(ListNode head){
        ListNode r=null;
        while(head!=null){
            ListNode temp= head.next;
            head.next=r;
            r=head;
            head=temp;
        }
        return r;
    }
}
