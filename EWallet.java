public class EWallet extends Pembayaran {
    public String namaAplikasi;
    public String noHp;

    @Override
    public void prosesPembayaran() {
        System.out.println("Mengirim permintaan pembayaran ke aplikasi " + namaAplikasi);
        System.out.println("Memverifikasi PIN untuk nomor " + noHp);
    }
}