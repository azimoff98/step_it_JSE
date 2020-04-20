package az.stepit.generics;

public class DeveloperMapper implements BaseMapper<Developer, DeveloperDTO> {

    //mapping
    @Override
    public DeveloperDTO convert(Developer data) {
        DeveloperDTO developerDTO = new DeveloperDTO();
        return null;
    }
}
