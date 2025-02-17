package LinkedList;
/*
* 2 两数相加
*给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。

请你将两个数相加，并以相同形式返回一个表示和的链表。

你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
* */
public class addTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode prehead = new ListNode(-1);
    ListNode res=prehead;
    if(l1==null){return l2;}
    if(l2==null){return l1;}
    boolean flag=false;
    while(l1!=null||l2!=null){
        int num1=l1==null?0:l1.val;
        int num2=l2==null?0:l2.val;
        int num=num1+num2;
        if(flag==true){
            num+=1;
            flag=false;
        }
        if(num>10){
            flag=true;
            num-=10;
        }else if(num==10){
            flag=true;
            num=0;
        }
        res.next=new ListNode(num,null);
        res=res.next;
        l1=l1==null?null:l1.next;
        l2=l2==null?null:l2.next;
    }
    if(flag==true){
        res.next=new ListNode(1);
    }
    return prehead.next;
}
}
