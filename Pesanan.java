public class Pesanan {
    int kodePesanan, harga;
    String namaPesanan;
    Node prev, next;

    public Node(Node prev, int kodePesanan, String namaPesanan, int harga, Node next){
        this.prev = prev;
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.next = next;
    }
}
