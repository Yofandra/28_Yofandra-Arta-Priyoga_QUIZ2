public class Node_28 {
    
    Pembeli beli;
    Pesanan pesan;
    Node_28 prev, next;

    Node_28(Node_26 prev, Pembeli beli, Pesanan pesan, Node_28 next){
        this.prev = prev;
        this.beli = beli;
        this.pesan = pesan;
        this.next = next;
    }
        
}
