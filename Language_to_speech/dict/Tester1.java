public class Tester1 {

    public static void main(String[] args) {

        Tester1 test=new Tester1();
        Node nod1=new Node('+');
        BinaryTree b3 = new BinaryTree(nod1);
        b3.insertNode('/', 0);
        b3.insertNode('*', 1);
        b3.getLeft().insertNode('*', 0);
        b3.getLeft().insertNode('-', 1);
        b3.getRight().insertNode('5', 0);
        b3.getRight().insertNode('-', 1);
        b3.getLeft().getLeft().insertNode('2', 0);
        b3.getLeft().getLeft().insertNode('3', 1);
        b3.getLeft().getRight().insertNode('2', 0);
        b3.getLeft().getRight().insertNode('1',1);
        b3.getRight().getRight().insertNode('4' , 0);
        b3.getRight().getRight().insertNode('1', 1);
        System.out.println("The Tree is :" + b3);
        System.out.println("Count A = "+ test.countA(b3));
        System.out.println("CountLeaves: "+test.countLeaves(b3));
        System.out.println("postOrder: "+test.postOrder(b3));
        System.out.println("InOrder: "+test.inOrder(b3));

    }
    // Task 2:- Question 1
    public int countA1(BinaryTree b3){
        return countA(b3.getLeft())+countA(b3.getRight());
    }
    public  int countA2(BinaryTree b3){
        int won = 1;
        return  countA(b3.getLeft())+won+countA(b3.getRight());
    }

    public int countA(BinaryTree b3){
        int empt =0;
        if (b3.emptyTree()){
            return empt;
        }
        else{
            if (b3.getRoot()!='A'){
                return countA1(b3);
            }
            else{
                return countA2(b3);
            }
        }
    }
    // Task 2:- Question 2
    public int countLeaves1(BinaryTree b3){
        int won = 1;
        return won+countLeaves(b3.getLeft())+countLeaves(b3.getRight());

    }
    public int countLeaves(BinaryTree b3){
        int empt=0;
        if(b3.emptyTree()){
            return empt;
        }
        else{
            if (b3.getRight().emptyTree()&&b3.getLeft().emptyTree()){
                return countLeaves1(b3);
            }
            else{
                return countLeaves(b3.getLeft())+countLeaves(b3.getRight());
            }
        }
    }

    // Task 2:- Question 3
    public String postOrder1(BinaryTree b3){
        return postOrder(b3.getLeft())+postOrder(b3.getRight())+b3.getRoot();
    }
    public String postOrder(BinaryTree b3){
        String txt="";
        if(b3.emptyTree()){
            return txt;
        }else{
            return postOrder1(b3);
        }
    }
    // Task 2:- Question 4
    public String inOrder1(BinaryTree b3){
        return inOrder(b3.getLeft())+b3.getRoot()+inOrder(b3.getRight());
    }
    public String inOrder(BinaryTree b3){
        String txt="";
        if (b3.emptyTree()){
            return txt;
        }
        else{
            return inOrder1(b3);
        }
    }
}
