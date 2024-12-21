public class RealDrinkImage implements DrinkImage {
    private final String imageUrl;

    public RealDrinkImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public BufferedImage getImage() {
        // Simulate loading image from network or disk
        try {
            Thread.sleep(2000); // Simulate a 2-second delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Loading image from: " + imageUrl);
        return new BufferedImage(400,300); // Placeholder image
    }
}
