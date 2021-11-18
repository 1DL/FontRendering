package Fonts;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Map;

public class CFont {
    private String filepath;
    private int fontSize;

    private int width, height, lineHeight;
    private Map<Integer, CharInfo> characterMap;

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
        FontMetrics fontMetrics = g2d.getFontMetrics();

        int estimatedWidth = (int)Math.sqrt(font.getNumGlyphs() * font.getSize()) + 1;
        width = 0;
        height = fontMetrics.getHeight();
        lineHeight = fontMetrics.getHeight();
        int x = 0;
        int y = (int)(fontMetrics.getHeight() * 1.4f);

        for (int i = 0; i < font.getNumGlyphs(); i++) {
            if(font.canDisplay(i)) {

            }
        }
    }
}
