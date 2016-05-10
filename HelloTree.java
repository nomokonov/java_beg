public class HelloTree{
 
    
  public static TNode getI(int i, TNode root){
    String bin = Integer.toBinaryString(i);
    TNode read = root;
    for(int j=1;j<bin.length();j++)
    { if(bin.charAt(j)=='0'){
        if(read.left==null){return null;}
        else{read=read.left;}}
      else{
        if(read.right==null){return null;}
        else{read=read.right;}}
      }
    return read;
  }
  
  public static int empty(TNode root){
    int i=1;
    while(true){
      if(getI(i,root)==null){return i;}
      i++;}
  }
  
  
  
  public static void main(String[] args){
    TNode node1 = new TNode();
    TNode node2 = new TNode();
    TNode node3 = new TNode();
    TNode node4 = new TNode();
    TNode node5 = new TNode();
    node1.left=node2;
    node1.right=node3;   
    node2.left=node4;
    node2.right=node5;
    
    //printtree(node1);
    
    
    for(int i=1;i<7;i++){
    System.out.println(i+" " + getI(i,node1));
    }
    
    System.out.println("empty " + empty(node1));
    
        
    
     
  }
}