package LinkedList;
/*
*234 回文链表 简单
*给你一个单链表的头节点 head ，请你判断该链表是否为回文链表
。如果是，返回 true ；否则，返回 false 。
* */
public class isPalindrome {
    public boolean isPalindrome(ListNode head) {

    if(head==null){return true;}
    //找到中间
    ListNode slow=head;
    ListNode fast=head;
    while(fast.next!=null&&fast.next.next!=null){
        fast=fast.next.next;
        slow=slow.next;
    }
    //对后半内容进行反转
    ListNode temp=slow.next;
    ListNode r=null;
    while(temp!=null){
        ListNode nextTemp =temp.next;
        temp.next=r;
        r=temp;
        temp=nextTemp ;
    }
    //判断两者是否一致
    ListNode p1=head;
    ListNode p2=r;
    while(p2!=null){
        if(p2.val==p1.val){
            p2=p2.next;
            p1=p1.next;
        }else{
            return false;
        }
    }
    return true;
}
}
