# Singly Linked List

Here is the typical definition for a node in a singly-linked list:

```Java
public class SinglyListNode {
    int val;
    SinglyListNode next;
    SinglyListNode(int x) { val = x; }
}
```

INSERT - If we want to add a new value after a given node prev we should:

1. Initialize new node `cur` with a value
2. Link the “next” field of `cur` to prev’s next node 'next'
3. Link the “next” field in `prev` to `cur`

DELETE - If we want to delete an existing node `cur` from the singly linkded list, we can do it in two steps:

1. Find the cur's previous node `prev` adn its next node `next`
2. Link `prev` to cur's next node `next`
