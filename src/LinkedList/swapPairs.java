package LinkedList;
/*
24 中等
给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
*/
public class swapPairs {
    public ListNode swapPairs(ListNode head) {
    if(head==null){return null;}
    if(head.next==null){return head;}
    else{
        ListNode dummy=new ListNode(-1);
        ListNode temp=head.next.next;
        dummy.next=head.next;
        head.next.next=head;
        head.next=swapPairs(temp);
        return dummy.next;
    }
}
}
