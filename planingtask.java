public class planingtask {
    private int id;
    private String judul;
    private String deskripsi;
    private String tanggal;

    public planingtask(int id, String judul, String deskripsi, String tanggal) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.tanggal = tanggal;
    }

    // Metode getter untuk mengambil nilai id
    public int getId() {
        return id;
    }

    // Metode setter untuk mengatur nilai id
    public void setId(int id) {
        this.id = id;
    }

    // Metode getter untuk mengambil nilai judul
    public String getJudul() {
        return judul;
    }

    // Metode setter untuk mengatur nilai judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Metode getter untuk mengambil nilai deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    // Metode setter untuk mengatur nilai description
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Metode getter untuk mengambil nilai tanggal
    public String getTanggal() {
        return tanggal;
    }

    // Metode setter untuk mengatur nilai tanggal
    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas planingtask
        planingtask task = new planingtask(1, "Membuat planing task OOP", "Mengerjakan To-Do List", "2023-10-18");

        // Mengakses nilai properti
        System.out.println("ID: " + task.getId());
        System.out.println("Judul: " + task.getJudul());
        System.out.println("Deskripsi: " + task.getDeskripsi());
        System.out.println("Tanggal: " + task.getTanggal());

        // Mengubah nilai properti
        task.setDeskripsi("Mengubah status task");
        task.setTanggal("2023-10-19");
        task.setJudul("Mengerjakan project class & object");

        System.out.println("status setelah diubah: " + task.getDeskripsi());
        System.out.println("Tanggal setelah diubah: " + task.getTanggal());
        System.out.println("Judul setelah diubah: " + task.getJudul());
    }
}
