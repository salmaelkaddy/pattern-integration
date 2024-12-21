public class DrinkImageProxy implements DrinkImage {

    private final String imageUrl;
    private RealDrinkImage realImage;

    public DrinkImageProxy(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public BufferedImage getImage() {
        if (realImage == null) {
            realImage = new RealDrinkImage(imageUrl);
        }
        return realImage.getImage();
    }

}
