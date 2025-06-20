package Ex_04;

public class ImageProcessor {
    private ImageFilterStrategy imageFilterStrategy;

    public ImageProcessor(ImageFilterStrategy imageFilterStrategy) {
        this.imageFilterStrategy = imageFilterStrategy;
    }

    public ImageFilterStrategy getImageFilterStrategy() {
        return imageFilterStrategy;
    }

    public void setImageFilterStrategy(ImageFilterStrategy imageFilterStrategy) {
        this.imageFilterStrategy = imageFilterStrategy;
    }

    public void applyFilter(String image) {
        System.out.println("Aplicar filtro " + imageFilterStrategy.applyFilter(image) + " na imagem " + image);
    }

}
