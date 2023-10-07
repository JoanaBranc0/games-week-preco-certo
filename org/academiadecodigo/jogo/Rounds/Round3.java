package org.academiadecodigo.jogo.Rounds;
import org.academiadecodigo.jogo.Options.Options;
import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Round3 extends Round {
    //Properties
    private Picture background;
    private Picture whiteBackground;
    private Picture product3;

    private Picture yellowButtonNormalA;
    private Picture yellowButtonNormalB;
    private Picture yellowButtonNormalC;
    private Picture yellowButtonNormalD;
    private Picture greenButtonCorrectB;
    private Picture redButtonWrongA;
    private Picture redButtonWrongC;
    private Picture redButtonWrongD;
    private Picture priceA;
    private Picture priceB;
    private Picture priceC;
    private Picture priceD;
    private boolean correct;


    //Constructor
    public Round3() {

        background = new Picture(10, 10, "resources/StartScreen/background_blue.png");
        whiteBackground = new Picture(223, 72, "resources/Products/image_white_background.png");
        product3 = new Picture(408, 72, "resources/Products/product_fairy.png");
        yellowButtonNormalA = new Picture(290,480, "resources/YellowButton/button_yellow_normal.png");
        yellowButtonNormalB = new Picture(670,480, "resources/YellowButton/button_yellow_normal.png");
        yellowButtonNormalC = new Picture(290, 600, "resources/YellowButton/button_yellow_normal.png");
        yellowButtonNormalD = new Picture(670, 600, "resources/YellowButton/button_yellow_normal.png");

        greenButtonCorrectB = new Picture(670, 480, "resources/GreenButton/button_green_normal.png");

        redButtonWrongA = new Picture(290, 480, "resources/RedButton/button_red_normal.png");
        redButtonWrongC = new Picture(290, 600, "resources/RedButton/button_red_normal.png");
        redButtonWrongD = new Picture(670, 600, "resources/RedButton/button_red_normal.png");

        priceA = new Picture(300, 480, "resources/Prices/Round3Prices/A.png");
        priceB = new Picture(670, 480, "resources/Prices/Round3Prices/B.png");
        priceC = new Picture(300, 600, "resources/Prices/Round3Prices/C.png");
        priceD = new Picture(670, 600, "resources/Prices/Round3Prices/D.png");
    }

    //Methods
    public void showScreen() {
        background.draw();
        whiteBackground.draw();
        product3.draw();

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
        whiteBackground.delete();
        product3.delete();
        yellowButtonNormalA.delete();
        yellowButtonNormalB.delete();
        yellowButtonNormalC.delete();
        yellowButtonNormalD.delete();

        greenButtonCorrectB.delete();

        redButtonWrongA.delete();
        redButtonWrongC.delete();
        redButtonWrongD.delete();

        priceA.delete();
        priceB.delete();
        priceC.delete();
        priceD.delete();
    }

    public boolean isOptionIncorrect(Options options){
        switch (options){
            case A:
                return true;
            case C:
                return true;
            case D:
                return true;
        }
        return false;
    }

    public boolean isOptionCorrect(Options options) {
        if (options == Options.B) {
            return true;

        } else return false;
    }

    public void showOptionWrongA(){
        redButtonWrongA.draw();
        priceA.draw();
        yellowButtonNormalA.delete();
    }

    public void showOptionWrongC(){
        redButtonWrongC.draw();
        priceC.draw();
        yellowButtonNormalC.delete();
    }

    public void showOptionWrongD(){
        redButtonWrongD.draw();
        priceD.draw();
        yellowButtonNormalD.delete();
    }

    public void showOptionCorrectB() {
        greenButtonCorrectB.draw();
        priceB.draw();
        yellowButtonNormalB.delete();
    }

}
