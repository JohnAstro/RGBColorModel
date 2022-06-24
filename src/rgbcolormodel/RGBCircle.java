/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rgbcolormodel;

/**
 *
 * @author Jonathan Gonzalez
 */
public class RGBCircle {
    public void createCircle(byte[][] rByteData, byte[][] gByteData, byte[][] bByteData, int xc, int yc, int r, byte R, byte G, byte B, int index) {
        // use the inside of the circle equation
        int h = rByteData.length;
        int w = rByteData[0].length;
        
        for  (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                // use the inside of the circle equation
                if (((float) i - (float) xc) * ((float) i - (float) xc) + 
                    ((float) j - (float) yc) * ((float) j - (float) yc) <= 
                    ((float)(r) * (float) (r))) {
                    if (index == 0)
                        rByteData[i][j] = R;
                    if (index == 1)
                        gByteData[i][j] = G;
                    if (index == 2)
                        bByteData[i][j] = B;
                }
            }
        }
    }
}
