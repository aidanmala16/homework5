import java.util.Iterator;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Test 1: Create a BST with integers using natural ordering
        System.out.println("=== Test 1: Basic Integer BST ===");
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        
        // Add elements
        System.out.println("Adding elements: 50, 30, 70, 20, 40, 60, 80");
        bst.add(50);
        bst.add(30);
        bst.add(70);
        bst.add(20);
        bst.add(40);
        bst.add(60);
        bst.add(80);
        
        // Test basic properties
        System.out.println("Size: " + bst.size());
        System.out.println("Is Empty: " + bst.isEmpty());
        System.out.println("Min: " + bst.min());
        System.out.println("Max: " + bst.max());
        System.out.println("Is Balanced: " + bst.isBalanced());
        System.out.println();
        
        // Test contains
        System.out.println("=== Test 2: Contains ===");
        System.out.println("Contains 40: " + bst.contains(40));
        System.out.println("Contains 100: " + bst.contains(100));
        System.out.println();
        
        // Test get
        System.out.println("=== Test 3: Get ===");
        System.out.println("Get 60: " + bst.get(60));
        System.out.println("Get 99: " + bst.get(99));
        System.out.println();
        
        // Test traversals
        System.out.println("=== Test 4: Traversals ===");
        
        System.out.print("Inorder (should be sorted): ");
    Iterator<Integer> inorder = bst.getIterator(BSTInterface.Traversal.InOrder);
        while(inorder.hasNext()){
            System.out.print(inorder.next() + " ");
        }
        System.out.println();
        
        System.out.print("Preorder: ");
    Iterator<Integer> preorder = bst.getIterator(BSTInterface.Traversal.PreOrder);
        while(preorder.hasNext()){
            System.out.print(preorder.next() + " ");
        }
        System.out.println();
        
        System.out.print("Postorder: ");
    Iterator<Integer> postorder = bst.getIterator(BSTInterface.Traversal.PostOrder);
        while(postorder.hasNext()){
            System.out.print(postorder.next() + " ");
        }
        System.out.println("\n");
        
        // Test remove
        System.out.println("=== Test 5: Remove ===");
        System.out.println("Removing 20 (leaf node): " + bst.remove(20));
        System.out.println("Size after removal: " + bst.size());
        
        System.out.println("Removing 30 (node with two children): " + bst.remove(30));
        System.out.println("Size after removal: " + bst.size());
        
        System.out.println("Removing 100 (non-existent): " + bst.remove(100));
        System.out.println("Size after removal: " + bst.size());
        
        System.out.print("Inorder after removals: ");
        Iterator<Integer> afterRemove = bst.iterator();
        while(afterRemove.hasNext()){
            System.out.print(afterRemove.next() + " ");
        }
        System.out.println("\n");
        System.out.println("=== Test 6: max depth ===");
        bst.add(30);
        bst.add(101);
        bst.add(57);
        bst.add(98);
        System.out.println("The depth of the tree is "+bst.maxDepth());
        System.out.print("Tree after additions: ");
        Iterator<Integer> thing = bst.iterator();
        while(thing.hasNext()){
            System.out.print(thing.next() + " ");
        }
        System.out.println();
        System.out.println("=== Test 7: minimum value ===");
        System.out.println("The minimum value in this tree is "+bst.minValue());
        System.out.println("=== Test 8: double tree ===");
        bst.doubleTree();
        System.out.print("The double tree is: ");
        Iterator<Integer> thing1 = bst.iterator();
        while(thing1.hasNext()){
            System.out.print(thing1.next() + " ");
        }
        System.out.println();
        System.out.println("=== Test 9: same trees ===");
        System.out.print("Testing two equal trees: ");
        BinarySearchTree<Integer> bst1 = new BinarySearchTree<>();
        BinarySearchTree<Integer> bst2 = new BinarySearchTree<>();
        bst1.add(60);
        bst1.add(43);
        bst1.add(80);
        bst1.add(93);
        bst1.add(75);
        bst1.add(14);
        bst1.add(50);
        bst2.add(60);
        bst2.add(43);
        bst2.add(80);
        bst2.add(93);
        bst2.add(75);
        bst2.add(14);
        bst2.add(50);
        if(bst1.sameTree(bst2)){
            System.out.println("Success!");
        }
        else{
            System.out.println("Failure");
        }
        bst2.remove(14);
        Iterator<Integer> thing2 = bst2.iterator();
        while(thing2.hasNext()){
            System.out.print(thing2.next() + " ");
        }
        System.out.print("Testing two unequal trees: ");
        if(bst1.sameTree(bst2)){
            System.out.println("Failure");
        }
        else{
            System.out.println("Success!");
        }
    }
}
