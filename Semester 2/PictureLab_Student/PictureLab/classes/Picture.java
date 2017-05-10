import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method to set values other than blue to 0 */
  public void keepOnlyBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setGreen(0);
		pixelObj.setRed(0);
      }
    }
  }
  
  /** Method to negate values */
  public void negate()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(255 - pixelObj.getRed());
		pixelObj.setGreen(255 - pixelObj.getGreen());
		pixelObj.setBlue(255 - pixelObj.getBlue());
      }
    }
  }
  
  /** Method to set image to grayscale */
  public void grayscale()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        int shade = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue())/3;
		pixelObj.setRed(shade);
		pixelObj.setGreen(shade);
		pixelObj.setBlue(shade);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from right to left */
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
		leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from top to bottom */
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2 ; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
		bottomPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  /** Method that mirrors the picture around a 
    * horizontal mirror in the center of the picture
    * from bottom to top */
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2 ; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        bottomPixel = pixels[height - 1 - row][col];
		topPixel.setColor(bottomPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        count++;
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
	System.out.println(count);
  }
  
  /** Mirror just part of a picture of a snowman */
  public void mirrorArms()
  {
    int mirrorPoint = 191;
    Pixel topPixel = null;
    Pixel bottomPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows to just before the mirror point
    for (int row = 160; row < mirrorPoint; row++)
    {
      // left arm
      for (int col = 105; col < 170; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint]                       
                         [col];
        bottomPixel.setColor(topPixel.getColor());
      }
	  
	  // right arm
	  for (int col = 239; col < 293; col++)
      {
        topPixel = pixels[row][col];      
        bottomPixel = pixels[mirrorPoint - row + mirrorPoint]                       
                         [col];
        bottomPixel.setColor(topPixel.getColor());
      }
    }
  }
  
  /** Mirror just part of a picture of a seagull */
  public void mirrorGull()
  {
    int mirrorPoint = 230;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 235; row < 317; row++)
    {
      // loop from just after the mirror point to 342
      for (int col = mirrorPoint + 1; col < 345; col++)
      {
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
	* start copying fromPic at the specified
	* startCutRow and startCutCol
	* stop copying fromPic at the specified
	* startCutRow and startCutCol
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
	* @param startCutRow the row to start the copy at
	* @param startCutCol the col to start the copy at
	* @param stopCutRow the row to cut off the copy at
	* @param stopCutCol the col to cut off the copy at
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol,
				 int startCutRow, int startCutCol,
				 int stopCutRow, int stopCutCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = startCutRow, toRow = startRow; 
         fromRow < stopCutRow &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = startCutCol, toCol = startCol; 
           fromCol < stopCutCol &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  public void myCollage()
  {
    Picture face1 = new Picture("barbaraS.jpg");
    Picture face2 = new Picture("jenny-red.jpg");
	Picture face3 = new Picture("blue-mark.jpg");
	Picture face4 = new Picture("KatieFancy.jpg");
	face3.zeroBlue();
	face2.keepOnlyBlue();
    this.copy(face1,0,0);
    this.copy(face2,0,111);
	this.copy(face4,0,411);
    this.copy(face3,147,0);
    this.write("collage.jpg");
  }
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
	Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
	Color botColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
		botPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
		botColor = botPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
		else if (leftPixel.colorDistance(botColor) >
			edgeDist)
		  leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void edgeDetection2(int edgeDist)
  {
      Pixel currentPixel = null, testPixel = null;
      
      int testWidth = 3;
      int testHeight = 3;
      
      Pixel[][] pixels = this.getPixels2D();
      double[][] edgeAngle = new double[Math.round(pixels.length / testHeight)][Math.round(pixels[0].length / testWidth)];
      
      for (int row = 0; row < pixels.length - testHeight; row += testHeight)
      {
       for (int col = 0; col < pixels[0].length - testWidth; col += testWidth)
        {
         Pixel[][] currentPixels = this.getPixelCluster(pixels, row, col, testWidth, testHeight);
              double greatestDistance = -10;
              double greatestAngle = -1;
	     for (double angle = 0; angle < Math.PI + 0.1; angle += Math.PI / 8)
          {
            ArrayList<Pixel> group1 = this.getPartialArray(currentPixels, angle, 0);
            Color group1Color = this.getAverageColor(this.getPixelColors(group1));
            ArrayList<Pixel> group2 = this.getPartialArray(currentPixels, angle, 1);
            Color group2Color = this.getAverageColor(this.getPixelColors(group2));
				double currentColorDistance = this.colorDistance(group1Color, group2Color);
           if (currentColorDistance > greatestDistance)
            {
             greatestDistance = currentColorDistance;
             reatestAngle = angle;
            }  
           }
             greatestAngle = Math.round(greatestAngle * 100.0) / 100.0;
             edgeAngle[row / testHeight][col / testWidth] = greatestAngle;
           if (greatestDistance > edgeDist)
            {
             ArrayList<Pixel> group1 = this.getPartialArray(currentPixels, greatestAngle, 0);
             ArrayList<Pixel> group2 = this.getPartialArray(currentPixels, greatestAngle, 1); 
           for (Pixel pixel : group1)
            {
             pixel.setColor(Color.BLACK);
            } 
           for (Pixel pixel : group2)
            {
             pixel.setColor(Color.WHITE);
            }
         }
           else
            {
              for (Pixel[] pixelArray : currentPixels)
               {
                 for (Pixel pixel : pixelArray)
                  {
                   pixel.setColor(Color.WHITE);
                  }
               }
            }
         }
     }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture grass = new Picture("grass.jpg");
    grass.explore();
    grass.zeroBlue();
    grass.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this