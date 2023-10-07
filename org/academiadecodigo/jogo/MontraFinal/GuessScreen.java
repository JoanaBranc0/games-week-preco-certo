package org.academiadecodigo.jogo.MontraFinal;

import org.academiadecodigo.jogo.FirstScreens.Screen;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GuessScreen implements Screen {

    //produtos + preços
    //pato: 20€ DONE
    //jantar com o Toy: 200€ DONE
    //magalhães: 30€ DONE
    //viagem de 30 minutos numa trotinete da bolt: 6€ DONE
    //viagem Lisboa - Cacilhas: 1,40€ DONE
    //pacote de gomas ursinho 1kg: 10,69€ DONE
    //total: 268,09€
    //opções: 165,95; 239,24; 268,09; 385,32

    //Properties
    private Picture background;
    private Picture title;
    private Picture whiteBackground;
    private Picture productList;

    //Unclicked Yellow Buttons
    private Picture yellowButtonUnclickedA;
    private Picture yellowButtonUnclickedB;
    private Picture yellowButtonUnclickedC;
    private Picture yellowButtonUnclickedD;

    //Clicked Yellow Buttons
    private Picture yellowButtonClickedA;
    private Picture yellowButtonClickedB;
    private Picture yellowButtonClickedC;
    private Picture yellowButtonClickedD;

    //Clicked Green Button
    private Picture greenButtonClickedC;

    //Clicked Red Buttons
    private Picture redButtonClickedA;
    private Picture redButtonClickedB;
    private Picture redButtonClickedD;

    //Price Options
    private Picture priceOptionA;
    private Picture priceOptionB;
    private Picture priceOptionC;
    private Picture priceOptionD;

    //Constructor
    public GuessScreen() {
        background = new Picture(10, 10, "resources/StartScreen/background_blue.png");
        title = new Picture(140, 49, "resources/MontraFinal/MargemDeErro/title_montra_final.png");
        whiteBackground = new Picture(216, 195, "resources/MontraFinal/ProductScreen/background_product_white.png");
        productList = new Picture(234, 196, "resources/MontraFinal/GuessScreen/text_product_list.png");
        yellowButtonUnclickedA = new Picture(68, 588, "resources/MontraFinal/GuessScreen/button_yellow_unclicked.png");
        yellowButtonUnclickedB = new Picture(359, 588, "resources/MontraFinal/GuessScreen/button_yellow_unclicked.png");
        yellowButtonUnclickedC = new Picture(650, 588, "resources/MontraFinal/GuessScreen/button_yellow_unclicked.png");
        yellowButtonUnclickedD = new Picture(941, 588, "resources/MontraFinal/GuessScreen/button_yellow_unclicked.png");
        yellowButtonClickedA = new Picture(68, 588, "resources/MontraFinal/GuessScreen/button_yellow_clicked.png");
        yellowButtonClickedB = new Picture(359, 588, "resources/MontraFinal/GuessScreen/button_yellow_clicked.png");
        yellowButtonClickedC = new Picture(650, 588, "resources/MontraFinal/GuessScreen/button_yellow_clicked.png");
        yellowButtonClickedD = new Picture(941, 588, "resources/MontraFinal/GuessScreen/button_yellow_clicked.png");
        greenButtonClickedC = new Picture(650, 588, "resources/MontraFinal/GuessScreen/button_green_clicked.png");
        redButtonClickedA = new Picture(68, 588, "resources/MontraFinal/GuessScreen/button_red_clicked.png");
        redButtonClickedB = new Picture(359, 588, "resources/MontraFinal/GuessScreen/button_red_clicked.png");
        redButtonClickedD = new Picture(941, 588, "resources/MontraFinal/GuessScreen/button_red_clicked.png");
        priceOptionA = new Picture(85, 615, "resources/MontraFinal/GuessScreen/text_option_A.png");
        priceOptionB = new Picture(374, 615, "resources/MontraFinal/GuessScreen/text_option_B.png");
        priceOptionC = new Picture(666, 615, "resources/MontraFinal/GuessScreen/text_option_C.png");
        priceOptionD = new Picture(956, 615, "resources/MontraFinal/GuessScreen/text_option_D.png");
    }

    //Methods
    @Override
    public void showScreen() {
        background.draw();
        title.draw();
        whiteBackground.draw();
        productList.draw();
        yellowButtonUnclickedA.draw();
        yellowButtonUnclickedB.draw();
        yellowButtonUnclickedC.draw();
        yellowButtonUnclickedD.draw();
        priceOptionA.draw();
        priceOptionB.draw();
        priceOptionC.draw();
        priceOptionD.draw();
    }

    @Override
    public void deleteScreen() {
        background.delete();
        whiteBackground.delete();
        productList.delete();
    }

    public void clickOptionA() {
        yellowButtonClickedA.draw();
        priceOptionA.draw();
    }

    public void clickOptionB() {
        yellowButtonClickedB.draw();
        priceOptionB.draw();
    }

    public void clickOptionC() {
        yellowButtonClickedC.draw();
        priceOptionC.draw();
    }

    public void clickOptionD() {
        yellowButtonClickedD.draw();
        priceOptionD.draw();
    }
}
