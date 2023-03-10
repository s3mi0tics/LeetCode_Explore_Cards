class Solution(object):
    def generateParenthesis(self, n):
        def generate(Sequence = []):
            if len(Sequence) == 2*n:
                if valid(Sequence):
                    res.append("".join(Sequence))
            else:
                Sequence.append('(')
                generate(Sequence)
                Sequence.pop()
                Sequence.append(')')
                generate(Sequence)
                Sequence.pop()

        def valid(Sequence):
            bal = 0
            for c in Sequence:
                if c == '(': bal += 1
                else: bal -= 1
                if bal < 0: return False
            return bal == 0

        res = []
        generate()
        return res