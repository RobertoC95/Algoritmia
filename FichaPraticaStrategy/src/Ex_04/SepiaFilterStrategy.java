package Ex_04;

public class SepiaFilterStrategy implements ImageFilterStrategy {

    @Override
    public String applyFilter(String image) {
        return "sépia";
    }
}
