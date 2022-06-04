import java.util.Scanner;

public class DoubleLinkedListMain {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        DoubleLinkedList Node_28 = new DoubleLinkedList();
        char yn;
        
        System.out.println("======== QUIZ 2 PRAKTIKUM ASD TI - 1G ========");
        System.out.println("dibuat oleh : Yofandra Arta Priyoga");
        System.out.println("NIM : 2141720121");
        System.out.println("Absen : 28");
        System.out.println("==================================================");
        System.out.println("Sistem Antrian Resto Royal Delish");
        do{
            System.out.println("Menu");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian");
            System.out.println("4. Laporan Pengurutan pesanan by nama");
            System.out.println("5. Hitung total pendapatan");
            System.out.println("6. Keluar");
            System.out.println("Pilih(1-5): ");

            int pilihmenu = sc.nextInt();
            if (pilihmenu == 1){
                System.out.println("-------------------------");
                System.out.println("Masukkan Data Pembeli");
                System.out.println("-------------------------");
                System.out.println("Nomor Antrian : ");
                int nomor = sc.nextInt();
                System.out.print("Nama Customer : ");
                int namaCustomer = sc1.nextLine();
                System.out.print("Nomor HP : ");
                int noHp = sc1.nextLine();
                Node_28.addFirst(beli, pesan);
            }
            if(pilihmenu == 2){
                System.out.println("++++++++++++++++++");
                System.out.println("Daftar Antrian Resto Royal Delish");
                System.out.println("++++++++++++++++++");

            }


        }while (yn == 'y');
    }
}
