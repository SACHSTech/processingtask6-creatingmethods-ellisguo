import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(111, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */

  /**
* Given the xy coords, return draw a ninja based on the xy coordinates
*
* @param width  The first int
* @param height  The second int
*
*/
  
  public void drawNinja(int width, int height) {

    // simple green ninja 
    
   // feet
   fill(0, 128, 0);
   ellipse((width * 7)/16, height * 3/4, 30, 50);
   ellipse((width * 9)/16, height * 3/4, 30, 50);
    // I thought it was funny that the legs were way bigger than the body so I left it like that on purpose
  
   // head
   fill(0, 128, 0);
   ellipse(width/2, (height * 3)/8, 75, 75);
  
   // mask
   fill(255, 227, 48);
   rect((width * 7)/16, (height * 7)/20, 50, 20); 
  
   // eyes
   fill(0, 0, 0);
   ellipse((width * 19)/40, (height * 3)/8, 10, 10);
   ellipse((width * 21)/40, (height * 3)/8, 10, 10);
  
   // body
   fill(0, 128, 0);
   rect((width * 163)/400, (height * 187)/400, 75, 100);
  
   // arms
   fill(0, 128, 0);
   rect((width * 113)/400, (height * 187)/400, 50, 20);
   rect((width * 238)/400, (height * 187)/400, 50, 20);
    
  }

  /**
* Given the xy coords, return draw a ninja based on the xy coordinates and colour RGB
*
* @param intWidth  The first int
* @param intHeight  The second int
* @param intColour The third int
*/

  public void drawNinja2(int intWidth, int intHeight, int intColour) {

    // colour is added with a new variable defined by method parameters
    
    // feet
   fill(intColour, 128, 0);
   ellipse((intWidth * 7)/16, intHeight * 3/4, 20, 30);
   ellipse((intWidth * 9)/16, intHeight * 3/4, 20, 30);
  
   // head
   fill(0, 128, intColour);
   ellipse(intWidth/2, (intHeight * 3)/8, (intWidth * 3)/16, (intHeight * 3)/16);
  
   // mask
   fill(intColour, intColour, 48);
   rect((intWidth * 7)/16, (intHeight * 7)/20, intWidth/8, intHeight/20); 
  
   // eyes
   fill(0, intColour, intColour);
   ellipse((intWidth * 19)/40, (intHeight * 3)/8, intWidth/40, intHeight/40);
   ellipse((intWidth * 21)/40, (intHeight * 3)/8, intWidth/40, intHeight/40);
  
   // body
   fill(0, intColour, 0);
   rect((intWidth * 163)/400, (intHeight * 187)/400, (intWidth * 3)/16, intHeight/4);
  
   // arms
   fill(0, 128, intColour);
   rect((intWidth * 113)/400, (intHeight * 187)/400, intWidth/8, intHeight/20);
   rect((intWidth * 238)/400, (intHeight * 187)/400, intWidth/8, intHeight/20);
    
  }

  
  
  // intWidth and intHeight are adjusted to become centered, the adjusted numbers are then put into drawNinja3

  // intFlower is adjusted to be centered always, to be x and y 400, no matter what petal size is. 

  /**
    * Calculate intFlower to be centered, turn intFlower into 400 (width/2)
    *
    * @param intFlower the first and only number
    * @return the int + 400 - the int
    *
    */

  private int intFlower(int intFlower){
    return intFlower + 400 - intFlower;
  }
   
  public void drawFlower(int intFlower, int intPetalSize, int intColour) {

  fill(255, 128, intColour);
    
  int intPetalDistance = intPetalSize/2; 

  // dimensions are made depending on flower xy and petal size/distance
    
  // upper-left petal
  ellipse(intFlower - intPetalDistance, intFlower - intPetalDistance, intPetalSize, intPetalSize);

  // upper-right petal
  ellipse(intFlower + intPetalDistance, intFlower - intPetalDistance, intPetalSize, intPetalSize);

  // lower-left petal
  ellipse(intFlower - intPetalDistance, intFlower + intPetalDistance, intPetalSize, intPetalSize);

  // lower-right petal
  ellipse(intFlower + intPetalDistance, intFlower + intPetalDistance, intPetalSize, intPetalSize);

  // center petal
  fill(255, intColour, intColour);
    
  ellipse(intFlower, intFlower, intPetalSize, intPetalSize);

    // for testing
          System.out.println(intFlower);
    
  }

  /**
    * the methods and parameters
    *
    * @param drawNinja the first method
    * @param drawNinja2 the second method
    * @return drawFlower the third method
    *
    */
  
  public void draw() {

    // basic green ninja
	 drawNinja(400, 400);
    // small one with big legs
   drawNinja2(200, 200, 150); 
    // the centered flower
   drawFlower(intFlower(700), 200, 100); 
    
  }

  
  
  

  // define other methods down here.
}


/*

// reference
  
   // feet
   fill(intColour, 128, 0);
   ellipse((intWid/2) + intWid/32, intHei * 3/4, 30, 50);
   ellipse((intWid/2) - intWid/32, intHei * 3/4, 30, 50);
  
   // head
   fill(0, 128, intColour);
   ellipse(intWid/2, (intHei * 3)/(intHei/50), 75, 75);
  
   // mask
   fill(intColour, intColour, 48);
   rect((intWid/2) - (intWid/32), (intHei * 7)/(intHei/20), 50, 20); 
  
   // eyes
   fill(0, intColour, intColour);
   ellipse((intWid * 19)/(intWid/20), (intHei * 3)/(intHei/50), 10, 10);
   ellipse((intWid * 21)/(intWid/20), (intHei * 3)/(intHei/50), 10, 10);
  
   // body
   fill(0, intColour, 0);
   rect((intWid/2 - 37), (intHei * 187)/intHei, 75, 100);

    int intBod = (intWid/2 - 37);
  w
   // 32.5 is half of the width of the body
    
   // arms
   fill(0, 128, intColour);
   rect(intBod - 50, (intHei * 187)/intHei, 50, 20);
   rect(intBod + 75, (intHei * 187)/intHei, 50, 20);


*/