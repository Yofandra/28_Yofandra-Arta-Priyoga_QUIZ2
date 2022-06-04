public class Pembeli {
    String namaPembeli, noHP;
    Node prev, next;

    public Node(Node prev, String namaPembeli, String noHP, Node next){
        this.prev = prev;
        this.namaPembeli = namaPembeli;
        this.noHP = noHP;
        this.next = next;
    }
}
