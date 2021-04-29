package hust.soict.hedspi.model.room;

import java.util.List;

import hust.soict.hedspi.model.dovat.Camera;
import hust.soict.hedspi.model.dovat.DoVat;
import hust.soict.hedspi.model.hhcn.HinhHopChuNhat;
import hust.soict.hedspi.model.hhcn.ToaDo;

public class Room extends HinhHopChuNhat {
    private double chieuDai;
    private double chieuRong;
    private double chieuCao;

    private List<DoVat> danhSachDoVat;

    private List<Camera> danhSachCamera;

    public Room(double chieuDai, double chieuRong, double chieuCao) {
        super(
            new ToaDo(0, 0, 0), 
            new ToaDo(chieuDai, 0, 0), 
            new ToaDo(0, chieuRong, 0), 
            chieuCao
        );
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
        this.chieuCao = chieuCao;
    }

    public static Room getInstance(double chieuDai, double chieuRong, double chieuCao) {
        return (chieuDai <= 0 || chieuRong <= 0 || chieuCao <= 0) ? null : new Room(
            chieuDai, chieuRong, chieuCao
        );
    }

    public void themDoVat(DoVat doVat) {
        // TO DO
    }

    public void xoaDoVat(ToaDo toaDoDoVat) {
        // TO DO
    }

    public boolean viTriDoVatHopLe(DoVat doVat) {
        // TO DO

        return true;
    }

    public void themCamera(Camera camera) {
        // TO DO
    }

    public boolean viTriCameraHopLe() {
        // TO DO

        return true;
    }

    public void xoaCamera(ToaDo toaDoCam) {
        // TO DO
    }

    // getter, setter
}
