public class Tester2 {
    BST b;

    public static void main(String[] args){
        Tester1 test=new Tester1();
        Node nd1=new Node('6');
        BST b3 = new BST(nd1);
        b3.insertNode('4', 0);
        b3.insertNode('8', 1);
        b3.getRight().insertNode('7', 0);
        b3.getRight().insertNode('8', 1);
        b3.getLeft().insertNode('2',0);
        b3.getLeft().insertNode('3',1);
        System.out.println(" The largest Key is : " +b3.smallestKey(b3));
        System.out.println(" The Smallest Key is : " +b3.largestKey(b3));
        System.out.println(" The inserted value is : " +b3.insertvalue(b3,'9'));
        System.out.println(" The deleted tree : " +b3.deleteval(b3,'6'));
        System.out.println(" The searched node: " +b3.searchV(b3,'0'));
        System.out.println(" The In-Order Traversal is : " +test.inOrder(b3));
    }
    public String inOrder(BinaryTree b3){
        String txt="";
        if (b3.emptyTree()){
            return txt;
        }
        else{
            return inOrder(b3.getLeft())+b3.getRoot()+inOrder(b3.getRight());
        }
    }
}
