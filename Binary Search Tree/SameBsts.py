"""
Write a function that takes in two arrays of integers and determines whether these arrays
represent the same BST. Note that you are not allowed to construct any BST in your code.
"""

#O(n^2) time || O(n^2) space ---> where n is the number of nodes in each array, respectively.
def sameBsts(arrayOne, arrayTwo):
    if len(arrayOne) != len(arrayTwo):
		return False
	
	if len(arrayOne) == 0 and len(arrayTwo) == 0:
		return True
	
	if arrayOne[0] != arrayTwo[0]:
		return False;
	
	leftOne = getSmaller(arrayOne)
	leftTwo = getSmaller(arrayTwo)
	rightOne = getBiggerOrEqual(arrayOne)
	rightTwo = getBiggerOrEqual(arrayTwo)
	
	return sameBsts(leftOne, leftTwo) and sameBsts(rightOne, rightTwo)

def getSmaller(array):
	smaller = []
	for i in range(1, len(array)):
		if array[i] < array[0]:
			smaller.append(array[i])
	return smaller

def getBiggerOrEqual(array):
	biggerOrEqual = []
	for i in range(1, len(array)):
		if array[i] >= array[0]:
			biggerOrEqual.append(array[i])
	return biggerOrEqual
		
