package main.java.hust.soict.hedspi.model.hhcn;

import main.java.hust.soict.hedspi.model.matphang.MatPhang;
import main.java.hust.soict.hedspi.model.toado.ToaDo;

public class HinhHopChuNhat {
    private ToaDo[] toaDoCacDinh = new ToaDo[8];

    private double chieuCao;
    
    private MatPhang[] cacMatPhang = new MatPhang[6];

    public HinhHopChuNhat() {
        
    }

    public HinhHopChuNhat(ToaDo dinhA, ToaDo dinhB, ToaDo dinhC, double chieuCao) {
        this.toaDoCacDinh[Constant.DINH_A] = dinhA;
        this.toaDoCacDinh[Constant.DINH_B] = dinhB;
        this.toaDoCacDinh[Constant.DINH_C] = dinhC;

        this.toaDoCacDinh[Constant.DINH_D] = new ToaDo(
            dinhB.getX(), dinhC.getY(), dinhA.getZ()
        );
        this.toaDoCacDinh[Constant.DINH_A_] = new ToaDo(
            dinhA.getX(), dinhA.getY(), dinhA.getZ() + chieuCao
        );
        this.toaDoCacDinh[Constant.DINH_B_] = new ToaDo(
            dinhB.getX(), dinhB.getY(), dinhB.getZ() + chieuCao
        );
        this.toaDoCacDinh[Constant.DINH_C_] = new ToaDo(
            dinhC.getX(), dinhC.getY(), dinhC.getZ() + chieuCao
        );
        this.toaDoCacDinh[Constant.DINH_D_] = new ToaDo(
            this.toaDoCacDinh[Constant.DINH_D].getX(), 
            this.toaDoCacDinh[Constant.DINH_D].getY(), 
            this.toaDoCacDinh[Constant.DINH_D].getZ() + chieuCao
        );

        this.chieuCao = chieuCao;
    }

    public double theTich() {
        double result = 0;

        // TO DO

        return result;
    }

    public ToaDo viTri() {
        ToaDo result = null;

        // TO DO

        return result;
    }

    public static boolean hopLe(ToaDo dinhA, ToaDo dinhB, ToaDo dinhC, double chieuCao) {
        ToaDo vectorAB = new ToaDo(
            dinhB.getX() - dinhA.getX(),
            dinhB.getY() - dinhA.getY(),
            dinhB.getZ() - dinhA.getZ()
        );
        ToaDo vectorAC = new ToaDo(
            dinhC.getX() - dinhA.getX(),
            dinhC.getY() - dinhA.getY(),
            dinhC.getZ() - dinhA.getZ()
        );

        double tichVoHuong = vectorAB.getX() * vectorAC.getX() +
                vectorAB.getY() * vectorAC.getY() + vectorAB.getZ() * vectorAC.getZ();

        return (tichVoHuong == 0 && chieuCao > 0) ? true : false;
    }

    public String loaiDiem(ToaDo d) {
        String result = "";
       
        // TO DO

        return result;
    }

    // getter, setter
}
