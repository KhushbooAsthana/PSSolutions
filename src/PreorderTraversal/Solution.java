package PreorderTraversal;
import java.util.List;
import java.util.ArrayList;
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
public class Solution {
    public List<Integer> preorder(Node root) {

        List<Integer> res = new ArrayList<>();

        if(root != null){
            res.add(root.val);
            preorderTrav(root.children, res);
        }

        return res;
    }

    public List<Integer> preorderTrav(List<Node> childs, List<Integer> res) {

        if (childs == null)
            return res;

        for(Node n : childs) {
            res.add(n.val);
            preorderTrav(n.children, res);
        }
        return res;
    }

}
