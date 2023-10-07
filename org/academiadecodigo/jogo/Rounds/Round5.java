package org.academiadecodigo.jogo.Rounds;
import org.academiadecodigo.jogo.Options.Options;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Round5 extends Round{
    //Properties
    private Picture background;
    private Picture whitebackground;
    private Picture product5;

    private Picture yellowButtonNormalA;
    private Picture yellowButtonNormalB;
    private Picture yellowButtonNormalC;
    private Picture yellowButtonNormalD;
    private Picture greenButtonCorrectC;
    private Picture redButtonWrongA;
    private Picture redButtonWrongB;
    private Picture redButtonWrongD;
    private Picture priceA;
    private Picture priceB;
    private Picture priceC;
    private Picture priceD;
    private boolean correct;

    //Constructor
    public Round5() {
        background = new Picture(10, 10, "resources/StartScreen/background_blue.png");
        whitebackground = new Picture(223, 72, "resources/Products/image_white_background.png");
        product5 = new Picture(408, 72, "resources/Products/product_coffee_machine.png");
        yellowButtonNormalA = new Picture(290,480, "resources/YellowButton/button_yellow_normal.png");
        yellowButtonNormalB = new Picture(670,480, "resources/YellowButton/button_yellow_normal.png");
        yellowButtonNormalC = new Picture(290, 600, "resources/YellowButton/button_yellow_normal.png");
        yellowButtonNormalD = new Picture(670, 600, "resources/YellowButton/button_yellow_normal.png");

        greenButtonCorrectC = new Picture(290, 600, "resources/GreenButton/button_green_normal.png");

        redButtonWrongA = new Picture(290, 480, "resources/RedButton/button_red_normal.png");
        redButtonWrongB = new Picture(670, 480, "resources/RedButton/button_red_normal.png");
        redButtonWrongD = new Picture(670, 600, "resources/RedButton/button_red_normal.png");

        priceA = new Picture(300, 480, "resources/Prices/Round5Prices/A.png");
        priceB = new Picture(670, 480, "resources/Prices/Round5Prices/B.png");
        priceC = new Picture(300, 600, "resources/Prices/Round5Prices/C.png");
        priceD = new Picture(670, 600, "resources/Prices/Round5Prices/D.png");
    }

    //Methods
    public void showScreen() {
        background.draw();
        whitebackground.draw();
        product5.draw();

        yellowButtonNormalA.draw();
        yellowButtonNormalB.draw();
        yellowButtonNormalC.draw();
        yellowButtonNormalD.draw();

        priceA.draw();
        priceB.draw();
        priceC.draw();
        priceD.draw();
    }

    public void deleteScreen() {
        background.delete();
        whitebackground.delete();
        product5.delete();
        yellowButtonNormalA.delete();
        yellowButtonNormalB.delete();
        yellowButtonNormalC.delete();
        yellowButtonNormalD.delete();

        greenButtonCorrectC.delete();

        redButtonWrongA.delete();
        redButtonWrongB.delete();
        redButtonWrongD.delete();

        priceA.delete();
        priceB.delete();
        priceC.delete();
        priceD.delete();
    }

    public boolean isOptionCorrect(Options options){
        if(options == Options.C){
            return true;
        }
        return false;
    }

    public boolean isOptionIncorrect(Options options){
        switch (options){
            case A:
                return true;
            case B:
                return true;
            case D:
                return true;
        }
        return false;
    }


    public void showOptionWrongA(){
        redButtonWrongA.draw();
        priceA.draw();
        yellowButtonNormalA.delete();

    }

    public void showOptionWrongB(){
        redButtonWrongB.draw();
        priceB.draw();
        yellowButtonNormalB.delete();
    }

    public void showOptionWrongD(){
        redButtonWrongD.draw();
        priceD.draw();
        yellowButtonNormalD.delete();
    }

    public void showOptionCorrectC() {
        greenButtonCorrectC.draw();
        priceC.draw();
        yellowButtonNormalC.delete();
    }

}