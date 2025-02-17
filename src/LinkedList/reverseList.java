package LinkedList;
/*
*206 反转链表
*
*
* */
public class reverseList {
    public ListNode reverseList(ListNode head) {
    ListNode temp=null;//记录前项
    ListNode temp2=null;//记录后项
    while(head!=null){
        temp2=head.next;
        head.next=temp;
        temp=head;
        head=temp2;
    }
    return temp;
}
}
