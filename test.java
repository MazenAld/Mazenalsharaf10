public class test {
    public static void main(String[] args) {
        CircularlyLinkedList<Integer> Circl1=new CircularlyLinkedList<>();
        System.out.println(Circl1.isEmpty());
        Circl1.AddFirst(3);
        Circl1.AddLast(4);
        Circl1.AddLast(5);
        Circl1.AddFirst(2);
    

        CircularlyLinkedList<Integer> Circl2=new CircularlyLinkedList<>();
        Circl2.AddFirst(2);
        Circl2.AddLast(3);
        Circl2.AddLast(8);
        Circl2.AddFirst(1);


        System.out.println(Circl1.Same(Circl2));
        System.out.println(Circl1.equals(Circl2));
        System.out.println(Circl1.SizeFuntaion());
    }
}
