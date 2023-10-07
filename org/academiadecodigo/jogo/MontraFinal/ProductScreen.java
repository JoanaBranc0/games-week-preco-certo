package org.academiadecodigo.jogo.MontraFinal;

import org.academiadecodigo.jogo.FirstScreens.Screen;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class ProductScreen implements Screen {
    //Properties
    private Picture background;
    private Picture title;
    private Picture imageViagem;
    private Picture imageGomas;
    private Picture imageTrotinete;
    private Picture imageMagalhães;
    private Picture imageToy;
    private Picture imageDuck;
    private Picture buttonGuess;
    private Picture buttonText;
    private Picture yellowButtonLeft;
    private Picture yellowButtonRight;
    private Picture greyButtonLeft;
    private Picture greyButtonRight;

    //Booleans
    private boolean product1Showing;
    private boolean product2Showing;
    private boolean product3Showing;
    private boolean product4Showing;
    private boolean product5Showing;
    private boolean product6Showing;


    //Constructor
    public ProductScreen() {
        background = new Picture(10, 10, "resources/StartScreen/background_blue.png");
        title = new Picture(140, 49, "resources/MontraFinal/MargemDeErro/title_montra_final.png");
        imageDuck = new Picture(216, 195, "resources/MontraFinal/ProductScreen/image_product_duck.png");
        imageToy = new Picture(216, 195, "resources/MontraFinal/ProductScreen/image_product_toy.png");
        imageMagalhães = new Picture(216, 195, "resources/MontraFinal/ProductScreen/image_product_magalhães.png");
        imageTrotinete = new Picture(216, 195, "resources/MontraFinal/ProductScreen/image_product_trotinete.png");
        imageViagem = new Picture(216, 195, "resources/MontraFinal/ProductScreen/image_product_viagem.png");
        imageGomas = new Picture(216, 195, "resources/MontraFinal/ProductScreen/image_product_gomas.png");
        buttonGuess = new Picture(500, 610, "resources/StartScreen/button_yellow_normal.png");
        buttonText = new Picture(520, 625, "resources/MontraFinal/ProductScreen/text_button_guess.png");
        yellowButtonLeft = new Picture(72, 338, "resources/MontraFinal/ProductScreen/button_yellow_left.png");
        yellowButtonRight = new Picture(1104, 338, "resources/MontraFinal/ProductScreen/button_yellow_right.png");
        greyButtonLeft = new Picture(72, 338, "resources/MontraFinal/ProductScreen/button_grey_left.png");
        greyButtonRight = new Picture(1104, 338, "resources/MontraFinal/ProductScreen/button_grey_right.png");
    }

    //Methods
    @Override
    public void showScreen() {
        background.draw();
        title.draw();
        buttonGuess.draw();
        buttonText.draw();
        showProduct1();
        greyButtonLeft.draw();
        yellowButtonRight.draw();
    }

    @Override
    public void deleteScreen() {
        background.delete();
        title.delete();
        buttonGuess.delete();
        buttonText.delete();
        deleteProduct1();
        deleteProduct2();
        deleteProduct3();
        deleteProduct4();
        deleteProduct5();
        deleteProduct6();
        yellowButtonLeft.delete();
        yellowButtonRight.delete();
        greyButtonLeft.delete();
        greyButtonRight.delete();
    }

    //Methods to show products
    public boolean showProduct1() {
        imageDuck.draw();
        return product1Showing = true;
    }

    public boolean showProduct2() {
        imageToy.draw();
        return product2Showing = true;
    }

    public boolean showProduct3() {
        imageMagalhães.draw();
        return product3Showing = true;
    }

    public boolean showProduct4() {
        imageTrotinete.draw();
        return product4Showing = true;
    }

    public boolean showProduct5() {
        imageViagem.draw();
        return product5Showing = true;
    }

    public boolean showProduct6() {
        imageGomas.draw();
        return product6Showing = true;
    }

    //Methods to delete products
    public void deleteProduct1() {
        imageDuck.delete();
    }

    public void deleteProduct2() {
        imageToy.delete();
    }

    public void deleteProduct3() {
        imageMagalhães.delete();
    }

    public void deleteProduct4() {
        imageTrotinete.delete();
    }

    public void deleteProduct5() {
        imageViagem.delete();
    }

    public void deleteProduct6() {
        imageGomas.delete();
    }

    /*
    //LÓGICA DO HANDLER:
        if (product1Showing == true) {
            RIGHT:
            showProduct2();
            deleteProduct1();
            break;
        }
        if (product2Showing == true) {
            LEFT:
            showProduct1();
            deleteProduct2();
            break;
            RIGHT:
            showProduct3();
            deleteProduct2();
            break;
        }
        if (product3Showing == true) {
            LEFT:
            showProduct2();
            deleteProduct3();
            break;
            RIGHT:
            showProduct4();
            deleteProduct3();
            break;
        }
        if (product4Showing == true) {
            LEFT:
            showProduct3();
            deleteProduct4();
            break;
            RIGHT:
            showProduct5();
            deleteProduct4();
            break;
        }
        if (product5Showing == true) {
            LEFT:
            showProduct4();
            deleteProduct5();
            break;
            RIGHT:
            showProduct6();
            deleteProduct5();
            break;
        }
        if (product6Showing == true) {
            LEFT:
            showProduct5();
            deleteProduct6();
            break;

    }*/
}