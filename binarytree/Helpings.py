someStr = []
workStr = []
best = "aaaaaa"


def visitNode(node):
    if node.left is not None:
        print(node.key)
        visitNode(node.left)
    if node.right is not None:
        print(node.key)
        visitNode(node.right)
    if node.left is None and node.right is None:
        print(node.key)





# tab = []
# for line in bestVal:
#     art = []
#     length = len(line)
#     tempNode = realNode
#     for i in range(1, length):
#         if line[i] == "L":
#             art.insert(0, tempNode.key)
#             tempNode = tempNode.left
#         elif line[i] == "R":
#             art.insert(0, tempNode.key)
#             tempNode = tempNode.right
#         else:
#             print("Wrong instruction")
#     art.insert(0, line[0])
#     result = "".join(art)
#     tab.append(result)
#
# bestResult = tab[0]
# for result in tab:
#     if result>bestResult:
#         bestResult = result


# print(bestResult)
