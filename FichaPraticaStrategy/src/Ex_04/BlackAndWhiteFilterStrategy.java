package Ex_04;

public class BlackAndWhiteFilterStrategy implements ImageFilterStrategy{

    @Override
    public String applyFilter(String image) {
        return "preto e branco";
    }
}
