package verifica_15_05;

import java.time.LocalDate;

public class Operazione {
    private static int count;
    private int id;
    private Conto cc;
    private int imp;
    private LocalDate date;
    private String desc;

    public Operazione(Conto cc, int imp, LocalDate date, String desc) {
        this.id = count++;
        this.cc = cc;
        this.imp = imp;
        this.date = date;
        this.desc = desc;
    }

    public Conto getCc() {
        return cc;
    }

    public int getImp() {
        return imp;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Operazione{" +
                "cc=" + cc +
                " imp=" + imp +
                " date=" + date +
                " desc='" + desc + '\'' +
                '}';
    }
}
