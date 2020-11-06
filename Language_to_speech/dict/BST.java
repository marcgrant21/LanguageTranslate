public class BST extends BinaryTree {

    // data members
    private Node root;     // root of the tree

    //Task 2 Part B Question 1
    public char largestKey1(BinaryTree b3){
        return b3.getRoot();
    }
    public char largestKey(BinaryTree b3){
        char txt = '0';

        if (b3.emptyTree()){// checking if the tree is empty
            System.out.println(" This Tree is Empty!!");
            return txt;
        }
        else{
            if(b3.getRight().emptyTree()){//because the largest value is on at the leaf, I tested the right subtree for the last node
                return largestKey1(b3);
            }
            else{
                b3 = b3.getRight();
                return  largestKey(b3);
            }
        }
    }

    //Task 2 Part B Question 2
    public char smallestKey1 (BinaryTree b3){
        return b3.getRoot();
    }
    public char smallestKey(BinaryTree b3){
        char txt= '0';
        if (b3.emptyTree()){// checking if the tree is empty
            return  txt;
        }
        else{
            if(b3.getLeft().emptyTree()){// checking if the left subtree has nodes
                return smallestKey1(b3);

            }
            else{
                b3 = b3.getLeft();
                return  smallestKey(b3);

            }

        }
    }

    //Task 2 Part B Question 3

    public BinaryTree searchV1(BinaryTree b3, char v){
        return  searchV(b3.getLeft(),v);
    }
    public BinaryTree emptyT(){
        return new BST(null);

    }
    public  BinaryTree searchV(BinaryTree b3, char v){
        if (b3.getRoot()== v){ //checking the root
            return b3;// binary search tree
        }
        if (b3.emptyTree()){// checking if the tree is empty
            System.out.println("The value you searched for is not in the BST ");
            return emptyT();
        }
        else{
            if (v<b3.getRoot()){ // if the value is lesser than the root the we search the left subtree
                return searchV1(b3,v);
            }else if (v>b3.getRoot()){ //if the value is greater than the root the we search the right subtree
                return searchV(b3.getRight(),v);
            }else{
                return new BST(new Node(v));
            }
        }
    }

    public BST(Node p) {
        super(p);
    }
    //Task 2 Part B Question 4

    public String insertvalue(BinaryTree b3, char v) {
        if (b3.emptyTree()) {// checking if the tree is empty
            System.out.println("Please enter a Character!!");
            b3 = new BST(new Node(v));
        } else {
            if (v > b3.getRoot()) {// v represents value (Figuring out which part of the tree the value should be entered ).
                if (b3.getRight().emptyTree()) {
                    b3.insertNode(v, 1);//inserting the value on the right side of the subtree
                    return b3.toString();
                }
                insertvalue(b3.getRight(), v);
                return b3.toString();
            } else {
                if (v < b3.getRoot()) {
                    if (b3.getLeft().emptyTree()) {
                        b3.insertNode(v, 0); //inserting the value on the left side of the subtree
                        return b3.toString();
                    }
                    insertvalue(b3.getLeft(), v);
                    return b3.toString();
                }
            }
        }
        return b3.toString();



    }
    public BST() {
        super();
    }

    //Task 2 Part B Question 5 "incomplete "

    public String deleteval(BinaryTree b3 , char t){
        String txt= "";
        BST b33 = new BST();
        if(b3.emptyTree()){// checking the tree to see if it is empty
            return txt;
        }
        else{
            if(b3.getRoot() == t){
                Node newN = new Node(smallestKey(b3.getRight().getLeft()));
                b33 = new BST(newN);
                b33.insertvalue(b3,t);
            }
        }
        return b33.toString();
    }



}
