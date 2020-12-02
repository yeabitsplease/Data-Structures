#!/usr/bin/env python
# coding: utf-8

# In[4]:


class BinaryTree:
    def __init__(self,value,left=None,right=None):
        self.value=value
        self.left=left
        self.right=right
        
def BinaryTreeDiameter(tree):
    return getTreeInfo(tree).diameter

def getTreeInfo(tree):
    if tree is None:
        return TreeInfo(0,0)
    leftTreeInfo=getTreeInfo(tree.left)
    rightTreeInfo=gretTreeInfo(tree.right)
    
    longestPathThroughRoot=leftTreeInfo.diameter+rightTreeInfo.diameter
    maxDiameterSoFar=max(leftTreeInfo.diameter,rightTreeInfo.diameter)
    currentDiameter=max(maxDiameterSoFar,longestPathThroughRoot)
    currentHeight=1+max(leftTreeInfo.height,rightTreeInfo.height);
    
    return TreeInfo(currentDiameter,currentHeight)

class TreeInfo:
    def __init__(self,diameter,height):
        self.diameter=diameter;
        self.height=height;



        


# In[ ]:




