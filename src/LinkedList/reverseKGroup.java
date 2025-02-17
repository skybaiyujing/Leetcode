package LinkedList;
/*
25 困难
给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。

k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。

你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
*/
class reverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy=new ListNode(-1);
        dummy.next=reverse(head,k);
        return dummy.next;
    }
    public ListNode reverse(ListNode head,int k){
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null){
                return head;
            }
            cur=cur.next;
        }
        cur=head;
        ListNode prev=reverse(seekK(head,k),k);
        for(int i=0;i<k;i++){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }
    public ListNode seekK(ListNode head,int k){
        int c=0;
        while(head!=null&&c<k){
            c++;
            head=head.next;
        }
        return head;
    }

}