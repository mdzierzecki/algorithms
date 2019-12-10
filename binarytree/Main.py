import re
import sys
from Node import Node


file_path = sys.argv[1]
file = open(file_path, "r")

lines = []
# our main node
realNode = Node()

# adding data to node
for line in file:
    cleaned_line = re.sub(r"\s+", "", line)
    length = len(cleaned_line)
    if length == 1:
        realNode.set_root(cleaned_line[0])
    tempNode = realNode
    for i in range(1, length):
        if i == length - 1:
            if cleaned_line[i] == "L":
                if tempNode.left is None:
                    newNode = Node(cleaned_line[0])
                    tempNode.left = newNode
                else:
                    tempNode.left.set_root(cleaned_line[0])
                tempNode = tempNode.left
            elif cleaned_line[i] == "R":
                if tempNode.right is None:
                    newNode = Node(cleaned_line[0])
                    tempNode.right = newNode
                else:
                    tempNode.right.set_root(cleaned_line[0])
                tempNode = tempNode.right
            else:
                print("Wrong instruction")
        else:
            if cleaned_line[i] == "L":
                if tempNode.left is None:
                    newNode = Node()
                    tempNode.left = newNode
                tempNode = tempNode.left
            elif cleaned_line[i] == "R":
                if tempNode.right is None:
                    newNode = Node()
                    tempNode.right = newNode
                tempNode = tempNode.right
            else:
                print("Wrong instruction: " + cleaned_line[i])
                print("In line: " + line)

bestresult = "AAAAAAAAA"


def printPaths(root):
    # list to store path
    path = []
    printPathsRec(root, path, 0)

# Helper function to print path from root
# to leaf in binary tree
def printPathsRec(root, path, pathLen):
    global bestresult
    if root is None:
        return

    # add current root's data into
    # path_ar list

    # if length of list is gre
    if (len(path) > pathLen):
        path[pathLen] = root.key
    else:
        path.append(root.key)

        # increment pathLen by 1
    pathLen = pathLen + 1

    if root.left is None and root.right is None:
        workArr = []
        # leaf node then print the list
        for i in path[0: pathLen]:
            workArr.append(i)
        result = "".join(workArr[::-1])
        if (result>bestresult):
            bestresult = result
    else:
        # try for left and right subtree
        printPathsRec(root.left, path, pathLen)
        printPathsRec(root.right, path, pathLen)

    # Helper function to print list in which



printPaths(realNode)

print(bestresult)
