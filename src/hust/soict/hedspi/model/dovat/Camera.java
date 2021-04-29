package hust.soict.hedspi.model.dovat;

import hust.soict.hedspi.model.hhcn.ToaDo;

public class Camera {
    private ToaDo toaDo;
    private double tamNhin;
    private double gocNhin;

    public Camera(ToaDo toaDo, double tamNhin, double gocNhin) {
        this.toaDo = toaDo;
        this.tamNhin = tamNhin;
        this.gocNhin = gocNhin;
    }

    public static Camera getInstance(
        ToaDo toaDo,
        double tamNhin,
        double gocNhin
    ) {
        return (paramIsValid(toaDo, tamNhin, gocNhin)) ? 
            new Camera(toaDo, tamNhin, gocNhin) : null;
    }

    public static boolean paramIsValid(
        ToaDo toaDo,
        double tamNhin,
        double gocNhin
    ) {
        // TO DO
        return true;
    }

    public boolean nhinThay(ToaDo diem) {
        // TO DO
        
        return true;
    }

    public boolean nhinThay(DoVat doVat) {
        // TO DO

        return true;
    }

    // getter, setter 
}
