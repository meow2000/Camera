package main.java.hust.soict.hedspi.controller;

import java.util.Map;

import main.java.hust.soict.hedspi.app.App;
import main.java.hust.soict.hedspi.enums.Option;
import main.java.hust.soict.hedspi.model.camera.Camera;
import main.java.hust.soict.hedspi.model.dovat.DoVat;
import main.java.hust.soict.hedspi.model.room.Room;
import main.java.hust.soict.hedspi.model.toado.ToaDo;
import main.java.hust.soict.hedspi.view.AppView;

public class AppController {

    private AppView view;
    private App app;

    public AppController(App app) {
        this.app = app;
        this.view = new AppView();
    }

    public AppController(App app, AppView view) {
        this.app = app;
        this.view = view;
    }

    public void runApp() {
        System.out.println("app running...");
        this.app.running = true;
        
        while (this.app.running) {
            Option userChoice = this.view.displayMenuApp("Camera app",
                                "tao phong",
                                "exit");

            switch (userChoice) {
                case TAO_PHONG:
                    this.createRoom();
                    break;
                case EXIT:
                    this.app.running = false;
                    break;
                default:
            }
        }
    }

    public void createRoom() {
        Map<String, Object> userData = this.view.roomForm();

        this.app.currentRoom = Room.getInstance(
            (double) userData.get("chieuDai"),
            (double) userData.get("chieuRong"),
            (double) userData.get("chieuCao")
        );

        if (this.app.currentRoom == null) {
            this.view.thongBao("error", "failed to create room");
        } else {
            this.app.rooms.put(this.app.indexCount++, this.app.currentRoom);
            this.view.thongBao("notice", "create room is successfully");
            Option userOption;
            do {
                userOption = this.view.createRoomView(this.app.currentRoom);
                switch (userOption) {
                    case THEM_CAMERA:
                        this.themCamera();
                        break;
                    case THEM_DO_VAT:
                        this.themDoVat();
                        break;
                    case BACK:
                        break;
                    case EXIT:
                        this.app.running = false;
                        break;
                    default:
                }
            } while (userOption != Option.BACK && userOption != Option.EXIT);
        }
    }

    public void themDoVat() {
        Map<String, Object> userData = this.view.doVatForm();

        DoVat doVat = DoVat.getInstance(
            (String) userData.get("ten"),
            (String) userData.get("mauSac"),
            (ToaDo) userData.get("dinhA"),
            (ToaDo) userData.get("dinhB"),
            (ToaDo) userData.get("dinhC"),
            (double) userData.get("chieuCao")
        );
        
        if (doVat == null) {
            this.view.thongBao("error", "failed to create do vat");
            return;
        }
        
        if (this.app.currentRoom.themDoVat(doVat)){
            this.view.thongBao("notice", "create do vat is successfully");
        } else {
            this.view.thongBao("error", "vi tri do vat khong hop le");
        }
    }

    public void themCamera() {
        Map<String, Object> userData = this.view.cameraForm();

        Camera camera = Camera.getInstance(
            (ToaDo) userData.get("toaDo"),
            (double) userData.get("tamNhin"),
            (double) userData.get("gocNhin")
        );

        if (camera == null) {
            this.view.thongBao("error", "failed to create camera");
            return;
        }
        
        if (this.app.currentRoom.themCamera(camera)) {
            this.view.thongBao("notice", "create camera is successfully");
        } else {
            this.view.thongBao("notice", "vi tri camera khong hop le");
        }
    }

}
