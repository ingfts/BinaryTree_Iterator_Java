## Binary Tree Traversal Iterator🍵
[![](https://skills.thijs.gg/icons?i=java)](https://skills.thijs.gg)

This project implements a binary tree traversal iterator in Java. It consists of three main components:

### Tree Class🌳

The `Tree` class represents a node in a binary tree. Each node contains an integer value and references to its left and right child nodes. This class provides the basic structure for creating and manipulating binary tree nodes in Java.

### IteratorTree Class⬅️➡️

The `IteratorTree` class implements the `Iterator` interface for traversing a binary tree in ascending order. It uses a stack to efficiently traverse the tree, pushing left child nodes onto the stack and then popping them to explore right child nodes after processing the root node.

### Main Class🎬

The `Main` class demonstrates the usage of the `IteratorTree` class by creating a sample binary tree and iterating over its nodes to print their values in ascending order.


### Learning📖 
With this code, I was able to learn how Iterators are used and what they are for. Additionally, I learned how the `Stack` coordinates the perfect traversal of both right and left nodes in a binary tree. I also gained knowledge about implementing a binary tree in Java, 
as I had previously only worked with this kind of data structure in the C language. Moreover, I learned how to use Iterators to traverse the tree.
As I have always used Recursion to traverse trees, I found this method much more efficient and faster, as it requires less code.
