# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):

        previous = head
        runner = head
        
        while runner:
            if runner.next == None:
                return head
            # ----IF A DUPLICATE IS FOUND RUN THIS ELIF----
            elif runner.val == runner.next.val:
                while runner:
                    # -----FIRST CONDITION PREVENTS ERROR IF DUPLICATES END THE LIST, SECOND CONDITION IS CHECKING FOR DUPLICATES-----
                    if runner.next and runner.val == runner.next.val:
                        runner = runner.next
                    else:
                        # ---STANDARD SITUATION---
                        if previous.val != runner.val:
                            previous.next=runner.next
                            runner=runner.next
                        # -----SITUATIONS WHERE THE DUPLICATES STARTED THE LINKED LIST-reassign head to first digit after duplicates and reinitializes previous and head-----
                        else:
                            head=runner.next
                            previous=head
                            runner=head
                        break
            else:
                previous = runner
                runner = runner.next
        return head
        