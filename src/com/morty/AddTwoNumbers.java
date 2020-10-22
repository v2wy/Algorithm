package com.morty;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * <p>
 * 示例：
 * <p>
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class AddTwoNumbers {

    /**
     * 注意点:
     * 1.两个链表的长度的不一样的情况
     * 2.循环的结束条件
     * 3.最后一个加法的进位要记得生成一个链表节点
     *
     * 时间复杂度O(max(m, n)) m是l1链表的长度 n是l2链表的长度
     * @param l1 ListNode
     * @param l2 ListNode
     * @return head ListNode
     */
    public ListNode solution1(ListNode l1, ListNode l2) {
        int carry = 0,//carry是每一位相加的进位
                sum,//sum是每一位相加之和
                newVal;//newVal是新的值

        ListNode head = null,//链表的头
                tail = null;//链表的尾
        do {
            int l1val = l1 == null ? 0 : l1.val;
            int l2val = l2 == null ? 0 : l2.val;
            //每一位相加加上carry位
            sum = l1val + l2val + carry;
            carry = sum / 10;
            newVal = sum % 10;
            if (head == null) {
                head = tail = new ListNode(newVal);
            } else {
                tail.next = new ListNode(newVal);
                tail = tail.next;
            }
            l1 = l1 == null ? null : l1.next;
            l2 = l2 == null ? null : l2.next;
        } while (l1 != null || l2 != null);
        //最后一个加法的进位要记得生成一个链表节点
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}