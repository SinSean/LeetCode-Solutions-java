/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode d=head;
        ListNode dn=d.next;
        while(dn != null )
        {
            int num=calculateGCD(d.val,dn.val);    
            
            ListNode gcdNode = new ListNode(num);

            d.next=gcdNode;
            gcdNode.next=dn;
            
            
            d=dn;
            dn=d.next;
        }
        return head;
    }
    private int calculateGCD(int a,int b)
    {
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
/*
Java Node的操作方式不同
創一個node  ListNode d;
建立新的node並賦予val(num)  ListNode gcdNode = new ListNode(num);
node的下一個 node.next 
node的val node.val

不像C++，沒有內建的GCD 要自己寫
 */