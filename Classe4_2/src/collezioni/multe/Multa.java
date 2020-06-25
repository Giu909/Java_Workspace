package collezioni.multe;

import java.time.LocalDate;

public class Multa {
    private static int count = 0;
    private int id;
    private int mat;
    private String targa;
    private LocalDate date;
    private String desc;

    public Multa(int mat, String targa, String desc) {
        this.id = count++;
        this.mat = mat;
        this.targa = targa;
        this.date = LocalDate.now();
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "id=" + id +
                ", mat=" + mat +
                ", targa='" + targa + '\'' +
                ", date=" + date +
                ", desc='" + desc + '\'' +
                '}';
    }

    public int compareTo (Multa x) {
        if(x.id == this.id) return 0;
        return 2;
    }
}
