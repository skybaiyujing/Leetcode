package LinkedList;
/*
*21 简单 合并两个有序链表
* 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * */
public class mergeTwoLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null&&list2==null){
        return null;
    }
    ListNode cur;
    ListNode p1=list1;
    ListNode p2=list2;
    if(list1!=null&&list2!=null){
        if(list1.val>list2.val){
            cur=list2;
            p2=list2.next;
        }else{
            cur=list1;
            p1=list1.next;
        }
    }else if(list1==null){
        cur=list2;
        p2=list2.next;
    }else{
        cur=list1;
        p1=list1.next;
    }
    ListNode res=cur;
    while(p1!=null&&p2!=null){
        if(p1.val<=p2.val){
            cur.next=p1;
            cur=cur.next;
            p1=p1.next;
        }else{
            cur.next=p2;
            cur=cur.next;
            p2=p2.next;
        }
    }
    if(p1!=null){
        cur.next=p1;
    }else if(p2!=null){
        cur.next=p2;
    }
    return res;
}
}
