package rocks.zipcode.dreamhouse;

/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
private MyRectangle firstRectangle;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        sun = new Circle();
        sun.changeColor("green");
        sun.moveHorizontal(330);
        sun.moveVertical(-50);
        sun.changeSize(350);
        sun.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(300);
        sun.moveVertical(-20);
        sun.changeSize(340);
        sun.makeVisible();
        
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(200, 200);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(60);
        window.moveVertical(100);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(100);
        firstRectangle.moveVertical(400);   
        firstRectangle.changeSize(600, 100);
        firstRectangle.makeVisible();


        wall = new Square();
        wall.moveVertical(240);
        wall.changeSize(200, 200);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(200);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(60);
        window.moveVertical(200);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(220);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(60);
        window.moveVertical(220);
        window.makeVisible();

        

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(60);
        window.moveVertical(200);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(150);
        window.moveVertical(200);
        window.makeVisible();


        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(150);
        window.moveVertical(270);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(150);
        window.moveVertical(300);
        window.makeVisible();

        



        wall = new Square();
        wall.moveVertical(140);
        wall.moveHorizontal(200);
        wall.changeSize(300, 300);
        wall.makeVisible();

        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(200);
        firstRectangle.moveVertical(200);   
        firstRectangle.changeSize(10, 200);
        firstRectangle.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.changeSize(60, 60);
        window.moveHorizontal(20);
        window.moveVertical(340);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.changeSize(60, 60);
        window.moveHorizontal(20);
        window.moveVertical(370);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 120);
        roof.moveHorizontal(60);
        roof.moveVertical(330);
        roof.makeVisible();

        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(15);
        firstRectangle.moveVertical(420);   
        firstRectangle.changeSize(70, 10);
        firstRectangle.makeVisible();

        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(5);
        firstRectangle.moveVertical(430);   
        firstRectangle.changeSize(90, 10);
        firstRectangle.makeVisible();


        wall = new Square();
        wall.moveVertical(140);
        wall.moveHorizontal(300);
        wall.changeSize(300, 300);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(460);
        window.moveVertical(200);
        window.makeVisible();


        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(400);
        firstRectangle.moveVertical(200);   
        firstRectangle.changeSize(10, 200);
        firstRectangle.makeVisible();

        

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(530);
        window.moveVertical(200);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(460);
        window.moveVertical(300);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(530);
        window.moveVertical(300);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(460);
        window.moveVertical(250);
        window.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(530);
        window.moveVertical(250);
        window.makeVisible();

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(230);
        window.moveVertical(350);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(230);
        window.moveVertical(300);
        window.makeVisible();

        window = new Square();
        window.changeColor("yellow");
        window.moveHorizontal(230);
        window.moveVertical(280);
        window.makeVisible();

    

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(350);
        window.moveVertical(350);
        window.makeVisible();
    
        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("blue");
        firstRectangle.moveHorizontal(280);
        firstRectangle.moveVertical(350);   
        firstRectangle.changeSize(50, 80);
        firstRectangle.makeVisible();

        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(270);
        firstRectangle.moveVertical(420);   
        firstRectangle.changeSize(70, 10);
        firstRectangle.makeVisible();

        firstRectangle = new MyRectangle();
        firstRectangle.changeColor("black");
        firstRectangle.moveHorizontal(260);
        firstRectangle.moveVertical(430);   
        firstRectangle.changeSize(90, 10);
        firstRectangle.makeVisible();

        sun = new Circle();
        sun.changeColor("red");
        sun.moveHorizontal(330);
        sun.moveVertical(20);
        sun.changeSize(200);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
