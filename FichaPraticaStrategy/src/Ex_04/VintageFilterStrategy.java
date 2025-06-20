package Ex_04;

public class VintageFilterStrategy implements ImageFilterStrategy{

    @Override
    public String applyFilter(String image) {
    return "vintage";
    }

}
