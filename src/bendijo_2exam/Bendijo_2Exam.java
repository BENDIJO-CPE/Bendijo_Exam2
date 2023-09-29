
package bendijo_2exam;

import java.awt.BorderLayout;
import java.util.Scanner;


class Node {
        String data2;
        Node next2;
        
        Node (String m){
            
            data2 = m;
            next2= null;
        }
    }

public class Bendijo_2Exam {
    
private class Node {
    

    private Node(String data) {
    }
            String data;
            Node next;
            String data2;
            Node next2;
            
        }

public static Node head, tail, head2, tail2;
private int size;

public Node insertNode (String index2){
    Node newNode = new Node (index2);
    newNode.next2 = head2;
    head2 = newNode;
    return head2;
    }
    
    public void display2(){
         Node node = head2;
         
      
            while (node != null){
                System.out.println(node.data2 + "");
                node = node.next2;
     }
         System.out.println();
     }
     
public boolean search (String target){
             Node current = head2;
             
             while(current != null){
                 if (current.data == target){
                     return true;
                 }
                 current = current.next;
             }
             return false;
     }
    
    public int searchPosition(String target){
    Node current = head;
    int pos = 0;
        while (current != null) {            
            if (current.data == target) {
                return pos;
                
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
    
    
    //////// number 1 code
    

private  Node createNewNode(String index) throws Exception {
    Node node = new Node(index);
    
    node.data = index;
    node.next = null;
    
    return node;
    
}

    private void insertion(String index, int position) throws Exception {
    if(position < 0 || position > size){
        throw new Exception("Index Invalid");
    } else if (position == 0){
        insertBeg(index);
    } else if (position == size){
        insertEnd(index);
    }
    
}

private void insertBeg(String index)throws Exception{
    Node node = createNewNode(index);
    
    if (size == 0){
    head = tail = node;
    }else{
        node.next = head;
        head = node;
    }
    
    tail.next = tail;
    
    size++;
}

private void insertEnd (String index) throws Exception{
    Node node = createNewNode(index);
    
    if(size > 0){
        tail.next = node;
        tail = node;
        
    }else if (size == 0){
        head = tail = node;
    }
    tail.next = head;
    size++;
}
private void display1() throws Exception {
    if (size == 0){
        throw new Exception ("List is empty");
    }
    
    Node temporary = head;
    
    while(temporary != tail){
    System.out.println(temporary.data + " , ");
    temporary = temporary.next;
}
    System.out.println(tail.data + " , ");   
}


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner (System.in);
           Bendijo_2Exam li = new Bendijo_2Exam();
           
           boolean number = true;
           
           while(number){               
          System.out.println("Number 1, 2?");
          int num = scan.nextInt();
          
          if (num == 1 ){
              boolean start1 = true;
              
              while (start1){
                  System.out.println("1. Insert Name: \n2. Display");
                  int choice1 = scan.nextInt();
                  
                  switch (choice1) {
                      case 1:
                          System.out.println("Insert Name: ");
                          String name = scan.next();
                          scan.nextLine();
                          System.out.println("Enter Position");
                          int position = scan.nextInt();
                          li.insertion(name, position -1);
                          break;
                      case 2:
                          li.display1();
                          break;
                  
                  default:
                          System.out.println("Wrong!! TRY AGAIN");
                          break;
                  }
              }
                  
              

    }else if(num == 2){
        li.insertNode("Fita");
        li.insertNode("Pride Powder");
        li.insertNode("Canola Oil");
        li.insertNode("Fita");
        li.insertNode("Nescafe Black Coffee");
        li.insertNode("Ariel Powder");
        li.insertNode("rebisco");
        li.insertNode("Steel Wool");
        li.insertNode("Head and Shoulder");
        li.insertNode("Nova");
        li.insertNode("tanduay");
        li.insertNode("Bearbrand");
        li.insertNode("nature Spring Mineral");
        li.insertNode("Coke");
        li.insertNode("Sprita kasalo");
        li.insertNode("Royal");
        li.insertNode("Sugar");

        
        li.display2();
        
              System.out.println("================================");
              
              System.out.println("Enter the product you want to search");
              String input = scan.next();
        

        String targetVal = input;
        
        int posi = li.searchPosition(targetVal);
        
        if (posi != -1) {
            System.out.println("The " + targetVal + " is here");
        } else {
            System.out.println("The "+ targetVal + " is not here");
        }
        
        
    }
    
}
    }
}
