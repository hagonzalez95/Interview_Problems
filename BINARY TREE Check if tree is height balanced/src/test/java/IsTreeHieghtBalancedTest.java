package test.java;

import org.junit.Test;
import main.java.*;

import static org.junit.Assert.assertEquals;
import static main.java.IsTreeHeightBalanced.isTreeHeightBalanced;

public class IsTreeHieghtBalancedTest {

    @Test
    public void balancedTreeTest()
    {
        BinaryTreeNode root = new BinaryTreeNode(0);

        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(2);

        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(4);

        root.right.left = new BinaryTreeNode(5);
        root.right.right = new BinaryTreeNode(6);

        root.left.left.left = null;
        root.left.left.right = new BinaryTreeNode(7);

        root.right.left.left = new BinaryTreeNode(8);
        root.right.left.right = null;

        assertEquals(true, isTreeHeightBalanced(root));
    }

    @Test
    public void unbalancedTreeTest()
    {
        BinaryTreeNode root = new BinaryTreeNode(0);

        root.left = new BinaryTreeNode(1);
        root.right = new BinaryTreeNode(2);

        root.left.left = new BinaryTreeNode(3);
        root.left.right = new BinaryTreeNode(4);

        root.right.left = new BinaryTreeNode(5);
        root.right.right = new BinaryTreeNode(6);

        root.left.left.left = null;
        root.left.left.right = new BinaryTreeNode(7);

        root.right.left.left = new BinaryTreeNode(8);
        root.right.left.right = null;

        root.right.left.left.left = new BinaryTreeNode(9);

        assertEquals(false, isTreeHeightBalanced(root));
    }

    @Test
    public void emptyTreeTest()
    {
        assertEquals(null, isTreeHeightBalanced(null));
    }
}
