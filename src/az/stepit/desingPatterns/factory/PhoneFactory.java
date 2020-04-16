package az.stepit.desingPatterns.factory;

public class PhoneFactory {

    public static Phone create(PhoneTypes phoneTypes){
        switch (phoneTypes){
            case IPHONE:
                return new Iphone();
            case SAMSUNG:
                return new Samsung();
        }
        return null;
    }

}
