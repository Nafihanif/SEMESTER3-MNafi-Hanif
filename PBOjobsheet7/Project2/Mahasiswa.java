package Project2;


class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan di warung depan kampus.");
    }
    
    public void tidur() {
        System.out.println("Mahasiswa tertidur setelah mengerjakan tugas.");
    }
}