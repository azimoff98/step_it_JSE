package az.stepit.desingPatterns.factory;

public enum PhoneTypes {

    UNDEFINED(0),IPHONE(1), SAMSUNG(2);

    private int id;

    PhoneTypes(int id){
        this.id = id;
    }

}
