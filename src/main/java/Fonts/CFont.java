package Fonts;

import java.awt.*;
import java.awt.image.BufferedImage;

public class CFont {
    private String filepath;
    private int fontSize;

    public CFont (String filepath, int fontSize) {
        this.filepath = filepath;
        this.fontSize = fontSize;
        generateBitMap();
    }

    public void generateBitMap() {
        Font font = new Font(this.filepath, Font.PLAIN, fontSize);

        //Create fake image to get font information
        BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = img.createGraphics();
        g2d.setFont(font);

    }
}
