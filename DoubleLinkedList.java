public class DoubleLinkedList {
    Node_28 head;
    int size;

    DoubleLinkedList(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(Pembeli beli, Pesanan pesan){
        if (isEmpty()) {
            head = new Node_28(null, beli, pesan, null);
        } else {
            Node_28 newNode = new Node(null, beli, pesan, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Pembeli beli, Pesanan pesan){
        if (isEmpty()) {
            addFirst(beli, pesan);
        } else {
            Node_28 current = head;
            while(current.next != null){
                current = current.next;
            }
            Node_28 newNode = new Node_26(current, beli, pesan, null);
            current.next = newNode;
            size++;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node_28 tmp = head;
            while(tmp != null){
                
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil diisi");
        }else{
            System.out.println("Antrian Kosong ");
        }
    }

    public void removeFirst() throws Exception{
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong, tidak dapat menghapus node");
        } else if (size == 1){
            head = null;
            System.out.println(head.beli.namaPembeli+" Telah Memesan Menu");
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void BubleSort() {
        if (isEmpty()) {
            System.out.println("Linked List Kosong");
        } else {
            Node_28 tmp = head;
            while (tmp != null) {
                Node_28 temp2 = tmp.next;
                while (temp2 != null) {
                    if (tmp.namaPesanan > temp2.namaPesanan) {
                        int tempnama = tmp.namaPesanan;
                        tmp.namaPesanan = temp2.namaPesanan;
                        tmp.next.namaPesanan = tempnama;
                    }
                    temp2 = temp2.next;
                }
                tmp = tmp.next;
            }
            Node_28 printnama = head;
            while (printnama != null) {
                System.out.print(printnama.namaPesanan + "\t" +printnama.harga);
                printnama = printnama.next;
            }
            System.out.println();
        }
    }
    
    
}
