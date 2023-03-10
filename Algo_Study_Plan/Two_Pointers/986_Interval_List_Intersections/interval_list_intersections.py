class Solution:
    def intervalIntersection(self, firstList: List[List[int]], secondList: List[List[int]]) -> List[List[int]]:
        output=[]
        i=0
        j=0
        while i<len(firstList) and j<len(secondList):
            if firstList[i][0] <= secondList[j][0] and secondList[j][0] <= firstList[i][1]:
                if secondList[j][1] >= firstList[i][1]:
                    output.append([secondList[j][0], firstList[i][1]])
                    i+=1
                else: 
                    output.append([secondList[j][0], secondList[j][1]])
                    j+=1
                    
                
            elif secondList[j][0] <= firstList[i][0] and firstList[i][0] <= secondList[j][1]:
                if firstList[i][1] >= secondList[j][1]:
                    output.append([firstList[i][0], secondList[j][1]])
                    j+=1
                    
                else: 
                    output.append([firstList[i][0], firstList[i][1]])
                    i+=1
            else:
                if secondList[j][1]<firstList[i][0]:
                    j+=1
                else:
                    i+=1
        return output