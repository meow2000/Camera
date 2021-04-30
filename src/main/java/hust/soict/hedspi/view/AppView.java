package main.java.hust.soict.hedspi.view;

import java.util.HashMap;
import java.util.Map;

import main.java.hust.soict.hedspi.enums.Option;
import main.java.hust.soict.hedspi.model.room.Room;

public class AppView {

    public Option displayMenuApp(String title, String... options) {

        // hien thi menu chuong trinh
        // tra ve option ma nguoi dung chon

        Option userOption;

        // TO DO
        // userOption = Option.?

        userOption = Option.EXIT;
        
        return userOption;
    }

    public Map<String, Object> roomForm() {
        Map<String, Object> userData = new HashMap<String, Object>();

        // TO DO
        // userData.put("chieuDai", ?)
        // userData.put("chieuRong", ?)
        // userData.put("chieuCao", ?)

        return userData;
    }

    public Option createRoomView(Room currentRoom) {
        Option userOption;

        // TO DO
        // userOption = Option. BACK || THEM_DO_VAT || THEM_CAMERA || EXIT

        userOption = Option.BACK;
        
        return userOption;
    }

    public Map<String, Object> doVatForm() {
        Map<String, Object> userData = new HashMap<String, Object>();

        // TO DO
        // userData["ten"] = ?
        // userData["mauSac"] = ?
        // userData["dinhA"] = ?
        // userData["dinhB"] = ?
        // userData["dinhC"] = ?
        // userData["chieuCao"] = ?

        return userData;        
    }

    public Map<String, Object> cameraForm() {
        Map<String, Object> userData = new HashMap<String, Object>();

        // TO DO
        // userData["toaDo"] = ?
        // userData["tamNhin"] = ?
        // userData["gocNhin"] = ?

        return userData;
    }

    public void thongBao(String type, String message) {
        System.out.println(type + ": " + message);
        // TO DO
        
    }
}










