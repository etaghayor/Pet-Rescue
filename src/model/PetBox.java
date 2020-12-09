package model;

public class PetBox extends Box {

    public String toString() {
        return "PetBox";
    }

    @Override
    public BoxType getType() {
        return BoxType.PET;
    }
}
