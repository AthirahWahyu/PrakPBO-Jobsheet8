public class TransferBank extends Pembayaran {
    public String namaBank;
    public String noRekening;

    @Override
    public void prosesPembayaran() {
        System.out.println("Membuat nomor Virtual Account untuk Bank " + namaBank);
        System.out.println("Mengecek mutasi masuk pada rekening " + noRekening);
    }
}