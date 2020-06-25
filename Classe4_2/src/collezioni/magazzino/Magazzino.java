package collezioni.magazzino;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Magazzino implements Serializable {
    private HashMap<String, Materiale> mat = new HashMap<>();
    private ArrayList<Operazione> ops = new ArrayList<>();

    public void addMat (Materiale x) {
        mat.put(x.getDesc(), x);
    }

    public void deleteMat (Materiale x) {
        mat.remove(x);
    }

    public Materiale getMat (String x) {
        return mat.get(x);
    }

    public void listMat () {
         for(String s : mat.toString().split(", "))
             System.out.println(s);
    }
    public Operazione addOps (int q, int p, String desc) {
        ops.add(new Operazione(q, p, desc));
        return new Operazione(q, p, desc);
    }

    public void deleteOps (Operazione x) {
        ops.remove(x);
    }

    public void listOps () {
        for(Operazione o : ops)
            System.out.println(o);
    }

    public Operazione listOpsDesc(String x) {
        for(Operazione o : ops)
            if(o.getDesc().compareToIgnoreCase(x) == 0)
                return o;
        return null;
    }

    public boolean doOp (Operazione x) {
        Materiale y = getMat(x.getDesc());
        y.setImp(x.getP());
        y.setQua(x.getQ());
        if(y.getImp() > 0 && y.getQua() > 0) {
            mat.replace(y.getDesc(), y);
            return true;
        }
        y.setImp(-x.getP());
        y.setQua(-x.getQ());
        return false;
    }
}
