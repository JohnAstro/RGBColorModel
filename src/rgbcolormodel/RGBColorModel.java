/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rgbcolormodel;

import java.awt.image.BufferedImage;

/**
 *
 * @author Jonathan Gonzalez
 */
public class RGBColorModel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // create arrays
        byte[][] rByteData = new byte[256][256];
        byte[][] gByteData = new byte[256][256];
        byte[][] bByteData = new byte[256][256];
        
        // create Red circle
        int xc = 135;
        int yc = 90;
        int r = 60;     // This radius will remain constant for all circles
        int index = 0;
        
        byte R = (byte) 255;
        byte G = (byte) 0;
        byte B = (byte) 0;
        
        RGBCircle  rgbmodel = new RGBCircle();
        rgbmodel.createCircle(rByteData, gByteData, bByteData, xc, yc, r, R, G, B, index);
        
        // create Green circle
        xc = 135;
        yc = 170;
        index = 1;
        
        R = (byte) 0;
        G = (byte) 255;
        B = (byte) 0;
        
        rgbmodel.createCircle(rByteData, gByteData, bByteData, xc, yc, r, R, G, B, index);
        
        // create Blue circle
        xc = 70;
        yc = 130;
        index = 2;
        
        R = (byte) 0;
        G = (byte) 0;
        B = (byte) 255;
        
        rgbmodel.createCircle(rByteData, gByteData, bByteData, xc, yc, r, R, G, B, index);
        
        // Create output
        BufferedImage outImage = ImageIo.setColorByteImageArray2DToBufferedImage(rByteData, gByteData, bByteData);
        ImageIo.writeImage(outImage, "jpg", "rgbcolormodel.jpg");
        
    }
    
}
