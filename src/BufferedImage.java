import java.awt.*;

public class BufferedImage {
    private int height;
    private int width;
    private int[][] pixels;

    public BufferedImage(int width, int height) {
        this.width = width;
        this.height = height;
        pixels = new int[height][width];
    }

    public void setPixel(int x, int y, Color color) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            pixels[y][x] = color.getRGB();
        }
    }

    public Color getPixel(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return new Color(pixels[y][x]);
        }
        return null;
    }
}