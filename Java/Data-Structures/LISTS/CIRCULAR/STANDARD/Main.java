public class Main
{
    public static void main(String[] args)
    {
        CircularLinkedList clist = new CircularLinkedList();
        clist.addToHead(1);
        clist.addToHead(2);
        clist.addToHead(3);
        clist.addToHead(4);
        clist.PrintCircularListData();
        
        clist.addToTail(5);
        clist.addToTail(6);
        clist.addToTail(7);
        clist.addToTail(8);
        clist.PrintCircularListData();

        clist.removeFromHead();
        clist.PrintCircularListData();

        clist.removeFromTail();
        clist.PrintCircularListData();

        if(clist.search(1))
        {
            System.out.println("ELEMENT FOUND!");
        }
        else
            System.out.println("NOT FOUND!");
        
        clist.remove_node_using_value(2);
        clist.PrintCircularListData();

        System.out.println(clist);
    }
}