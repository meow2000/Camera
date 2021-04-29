package main.java.hust.soict.hedspi;
import main.java.hust.soict.hedspi.app.App;
import main.java.hust.soict.hedspi.controller.AppController;

public class Main {
    public static void main(String[] args) throws Exception {
        App cameraApp = new App();
        AppController appController = new AppController(cameraApp);

        System.out.println("OOP final project");
        appController.runApp();
    }
}
