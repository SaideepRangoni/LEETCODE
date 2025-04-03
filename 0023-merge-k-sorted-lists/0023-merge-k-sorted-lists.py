# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
from heapq import heappop, heappush
from typing import List, Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []
        for i, node in enumerate(lists):
            if node:
                heappush(heap, (node.val, i, node))
        
        dummy = ListNode()
        curr = dummy
        
        while heap:
            val, i, node = heappop(heap)
            curr.next = node
            curr = curr.next
            if node.next:
                heappush(heap, (node.next.val, i, node.next))
        
        return dummy.next
