public abstract class Pembayaran {
    public String idTransaksi;
    public double nominal;

    // Abstract method
    public abstract void prosesPembayaran();

    // Concrete method
    public void cetakStruk() {
        System.out.println("ID Transaksi : " + this.idTransaksi);
        System.out.println("Nominal      : Rp" + this.nominal);
        System.out.println("Status       : Berhasil");
    }
}