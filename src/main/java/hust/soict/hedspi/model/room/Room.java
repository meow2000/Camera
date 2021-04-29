package main.java.hust.soict.hedspi.model.room;

import java.util.List;

import main.java.hust.soict.hedspi.model.camera.Camera;
import main.java.hust.soict.hedspi.model.dovat.DoVat;
import main.java.hust.soict.hedspi.model.hhcn.HinhHopChuNhat;
import main.java.hust.soict.hedspi.model.toado.ToaDo;

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

    public boolean themDoVat(DoVat doVat) {
        // TO DO

        return true;
    }

    public void xoaDoVat(ToaDo toaDoDoVat) {
        // TO DO
    }

    public boolean viTriDoVatHopLe(DoVat doVat) {
        // TO DO

        return true;
    }

    public boolean themCamera(Camera camera) {
        // TO DO

        return true;
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
