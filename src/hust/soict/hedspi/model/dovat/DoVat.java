package hust.soict.hedspi.model.dovat;

import hust.soict.hedspi.model.hhcn.HinhHopChuNhat;
import hust.soict.hedspi.model.hhcn.ToaDo;

public class DoVat extends HinhHopChuNhat {
    private String ten;

    private String mauSac;

    public DoVat(String ten, String mauSac,
                    ToaDo dinhA, ToaDo dinhB, ToaDo dinhC, double chieuCao) {
        
        super(dinhA, dinhB, dinhC, chieuCao);
        this.ten = ten;
        this.mauSac = mauSac;
    }

    public DoVat() {
        super();
    }

    public static DoVat getInstance (
        String ten, 
        String mauSac,
        ToaDo dinhA,
        ToaDo dinhB,
        ToaDo dinhC,
        double chieuCao
    ) {
        return (
            ten != null && mauSac != null &&
            hopLe(dinhA, dinhB, dinhC, chieuCao)
        ) ? new DoVat(ten, mauSac, dinhA, dinhB, dinhC, chieuCao) : null;
    }

    // getter, setter
}
