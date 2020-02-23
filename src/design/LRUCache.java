package design;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    int capacity;
    Map<Integer, ListNode> map;
    ListNode head;
    ListNode tail;
    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        head = new ListNode();
        tail = new ListNode();

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }
        ListNode match = map.get(key);
        moveToHead(match);
        return match.value;
    }

    public void put(int key, int value) {
        ListNode node = map.get(key);
        if(node == null){
            node = new ListNode();
            node.key = key;
            node.value = value;
            addToFront(node);
            map.put(key, node);
            if(map.size() > capacity){
                map.remove(tail.prev.key);
                removeFromTail(tail.prev);
            }
        }else{
            node.value = value;
            moveToHead(node);
        }

    }
    private void addToFront(ListNode node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    private void moveToHead(ListNode node){
        removeFromTail(node);
        addToFront(node);
    }
    private void removeFromTail(ListNode node){
        ListNode savedPrev = node.prev;
        ListNode savedNext = node.next;

        savedPrev.next = savedNext;
        savedNext.prev = savedPrev;
    }

    private class ListNode{
        int key;
        int value;
        ListNode prev;
        ListNode next;
    }

}
