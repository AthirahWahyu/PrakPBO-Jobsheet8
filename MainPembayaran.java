public class MainPembayaran {
    public static void main(String[] args) {

        // 1. Membuat objek dari subclass EWallet
        EWallet bayar1 = new EWallet();
        bayar1.idTransaksi = "TRX-001";
        bayar1.nominal = 75000;
        bayar1.namaAplikasi = "GoPay";
        bayar1.noHp = "081234567890";

        System.out.println("=== TRANSAKSI 1 ===");
        bayar1.prosesPembayaran();
        bayar1.cetakStruk();

        System.out.println();

        // 2. Membuat objek dari subclass TransferBank
        TransferBank bayar2 = new TransferBank();
        bayar2.idTransaksi = "TRX-002";
        bayar2.nominal = 250000;
        bayar2.namaBank = "BNI";
        bayar2.noRekening = "1234567890";

        System.out.println("=== TRANSAKSI 2 ===");
        bayar2.prosesPembayaran();
        bayar2.cetakStruk();      
    }
}