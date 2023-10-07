package org.academiadecodigo.jogo.Game;
import org.academiadecodigo.jogo.Coins;
import org.academiadecodigo.jogo.FinalScreens.GameOver;
import org.academiadecodigo.jogo.FinalScreens.WinScreen;
import org.academiadecodigo.jogo.MontraFinal.GuessScreen;
import org.academiadecodigo.jogo.MontraFinal.MargemDeErroScreen;
import org.academiadecodigo.jogo.MontraFinal.MontraFinalTitleScreen;
import org.academiadecodigo.jogo.MontraFinal.ProductScreen;
import org.academiadecodigo.jogo.Rounds.*;
import org.academiadecodigo.jogo.FirstScreens.RulesScreen;
import org.academiadecodigo.jogo.FirstScreens.StartScreen;
import org.academiadecodigo.jogo.Options.Options;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class Game implements KeyboardHandler{
    //Properties
    public Keyboard keyboard;
    private Coins coins;
    boolean[] hasCoin;
    private int countCoins;

    //Starting Screens
    private StartScreen startScreen;
    private RulesScreen rulesScreen;

    //Rounds
    private Round1 round1;
    private Round2 round2;
    private Round3 round3;
    private Round4 round4;
    private Round5 round5;

    //Montra Final
    private MontraFinalTitleScreen montraFinalTitleScreen;
    private MargemDeErroScreen margemDeErroScreen;
    private ProductScreen productScreen;
    private GuessScreen guessScreen;
    private GameOver gameOver;
    private WinScreen winScreen;

    //Booleans
    private boolean rightClicked;
    private boolean spaceClicked;
    private boolean passedRound1;
    private boolean passedRound2;
    private boolean passedRound3;
    private boolean passedRound4;
    private boolean passedRound5;

    //Constructor
    public Game() {
        keyboard = new Keyboard(this);
        createKeyboardEvents();
        startScreen = new StartScreen();
        rulesScreen = new RulesScreen();
        round1 = new Round1();
        round2 = new Round2();
        round3 = new Round3();
        round4 = new Round4();
        round5 = new Round5();
        montraFinalTitleScreen = new MontraFinalTitleScreen();
        margemDeErroScreen = new MargemDeErroScreen();
        productScreen = new ProductScreen();
        guessScreen = new GuessScreen();
        gameOver = new GameOver();
        winScreen = new WinScreen();
        hasCoin = new boolean[5];
    }

    //Methods
    public void start() {
        //round1.showScreen();
        round2.showScreen();
        //round3.showScreen();
        //round4.showScreen();
        //round5.showScreen();
        /*startScreen.showScreen();
        try {
            Thread.sleep(500);
        } catch (Exception e){
            e.printStackTrace();
        }
        Sound.playSound("/Sound/game_intro.wav", 7000);*/
    }

    //Keyboard Events
    public void createKeyboardEvents() {
        KeyboardEvent keyboardEventSpace = new KeyboardEvent();
        keyboardEventSpace.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventSpace.setKey(KeyboardEvent.KEY_SPACE);
        keyboard.addEventListener(keyboardEventSpace);

        KeyboardEvent keyboardEventA = new KeyboardEvent();
        keyboardEventA.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventA.setKey(KeyboardEvent.KEY_A);
        keyboard.addEventListener(keyboardEventA);

        KeyboardEvent keyboardEventB = new KeyboardEvent();
        keyboardEventB.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventB.setKey(KeyboardEvent.KEY_B);
        keyboard.addEventListener(keyboardEventB);

        KeyboardEvent keyboardEventC = new KeyboardEvent();
        keyboardEventC.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventC.setKey(KeyboardEvent.KEY_C);
        keyboard.addEventListener(keyboardEventC);

        KeyboardEvent keyboardEventD = new KeyboardEvent();
        keyboardEventD.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboardEventD.setKey(KeyboardEvent.KEY_D);
        keyboard.addEventListener(keyboardEventD);
    }

    //Overrides
    //PLEASE REVIEW THIS METHOD
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_SPACE:      //DONE
                if (!spaceClicked) {
                    startScreen.deleteScreen();
                    rulesScreen.showScreen();
                    spaceClicked = true;
                } else if (!rightClicked) {
                    rulesScreen.deleteScreen();
                    round1.showScreen();
                    rightClicked = true;
                }
                break;

            case KeyboardEvent.KEY_A:
                if (round2.isOptionCorrect(Options.A) && spaceClicked && rightClicked && passedRound1 && !passedRound2) {
                    passedRound2 = true;
                    //round2.deleteScreen();
                    //round3.showScreen();
                    break;
                }
                if (round1.isOptionIncorrect(Options.A) && spaceClicked && rightClicked && !passedRound1) {
                    passedRound1 = true;
                    //round1.showOptionWrongA();
                    break;
                }
                if (round3.isOptionIncorrect(Options.A) && spaceClicked && rightClicked && passedRound1 && passedRound2 && !passedRound3) {
                    passedRound3 = true;
                    // round3.showOptionWrongA();
                    break;
                }
                if (round4.isOptionIncorrect(Options.A) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && !passedRound4) {
                    passedRound4 = true;
                    // round4.showOptionWrongA();
                    break;
                }
                if (round5.isOptionIncorrect(Options.A) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && passedRound4 && !passedRound5) {
                    passedRound5 = true;
                    //round5.showOptionWrongA();
                    break;
                }
                break;

            case KeyboardEvent.KEY_B:
                //roundCorrectOptions();
                if (round1.isOptionIncorrect(Options.B) && spaceClicked && rightClicked && !passedRound1) {
                    passedRound1 = true;
                    //round2.showScreen();
                    break;
                }
                if (round2.isOptionIncorrect(Options.B) && spaceClicked && rightClicked && passedRound1 && !passedRound2) {
                    passedRound2 = true;
                    //round3.showScreen();
                    break;
                }
                if (round3.isOptionCorrect(Options.B) && spaceClicked && rightClicked && passedRound1 && passedRound2 && !passedRound3) {  //Done
                    passedRound3 = true;
                    //round4.showScreen();
                    break;
                }
                if (round4.isOptionIncorrect(Options.B) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && !passedRound4) {
                    passedRound4 = true;
                    //round5.showScreen();
                    break;
                }
                if (round5.isOptionIncorrect(Options.B) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && passedRound4 && !passedRound5) {
                    // round6.showScreen();
                    passedRound5 = true;
                    break;
                }
            case KeyboardEvent.KEY_C:    //DONE
                if (round5.isOptionCorrect(Options.C) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && passedRound4 && !passedRound5) {
                    //correct round 5
                    passedRound5 = true;
                    break;
                }
                if (round1.isOptionCorrect(Options.C) && spaceClicked && rightClicked && !passedRound1) {
                    //correct round 1
                    passedRound1 = true;
                    //round2.showScreen();
                    break;
                }
                if (round2.isOptionIncorrect(Options.C) && spaceClicked && rightClicked && passedRound1 && !passedRound2) {
                    passedRound2 = true;
                    //round2.showOptionWrongC();
                    break;
                }
                if (round3.isOptionIncorrect(Options.C) && spaceClicked && rightClicked && passedRound1 && passedRound2 && !passedRound3) {
                    passedRound3 = true;
                    //round3.showOptionWrongC();
                    break;
                }
                if (round4.isOptionIncorrect(Options.C) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && !passedRound4) {
                    passedRound4 = true;
                    //round4.showOptionWrongC();
                    break;
                }
                break;

            case KeyboardEvent.KEY_D:
                if (round1.isOptionIncorrect(Options.D) && spaceClicked && rightClicked && !passedRound1) {
                    passedRound1 = true;
                    //round5.showScreen();
                    break;
                }
                if (round2.isOptionIncorrect(Options.D) && spaceClicked && rightClicked && passedRound1 && !passedRound2) {
                    passedRound2 = true;
                    //round3.showScreen();
                    break;
                }
                if (round3.isOptionIncorrect(Options.D) && spaceClicked && rightClicked && passedRound1 && passedRound2 && !passedRound3) {  //Done
                    passedRound3 = true;
                    //round4.showScreen();
                    break;
                }
                if (round4.isOptionCorrect(Options.D) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && !passedRound4) {
                    passedRound4 = true;
                    //round5.showScreen();
                    break;
                }
                if (round5.isOptionIncorrect(Options.D) && spaceClicked && rightClicked && passedRound1 && passedRound2 && passedRound3 && passedRound4 && !passedRound5) {
                    passedRound5 = true;
                    break;
                    //round6.showScreen();
                }
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
    }

    public void earnRoundCoins() {

        if (!hasCoin[0] && round1.isOptionCorrect(Options.C)) {
            coins.showCoin1();
            hasCoin[0] = true;
            return;
        }
        if (!hasCoin[1] && coins.showCoin1() == true && round2.isOptionCorrect(Options.A)) {
            coins.showCoin1();
            coins.showCoin2();
            hasCoin[1] = true;
            return;
        } else {
            if (!hasCoin[1] && coins.showCoin1() == false && round2.isOptionCorrect(Options.A)) {
                coins.showCoin2();
                hasCoin[1] = true;
                return;
            }
        }
        if (!hasCoin[2] && coins.showCoin1() == true && coins.showCoin2() == true && round3.isOptionCorrect(Options.B)) {
            coins.showCoin1();
            coins.showCoin2();
            coins.showCoin3();
            hasCoin[2] = true;
        } else {
            if (!hasCoin[2] && coins.showCoin1() == false && coins.showCoin2() == true && round3.isOptionCorrect(Options.B)) {
                coins.showCoin2();
                coins.showCoin3();
                hasCoin[2] = true;
                return;
            }
            if (!hasCoin[2] && coins.showCoin1() == true && coins.showCoin2() == false && round3.isOptionCorrect(Options.B)) {
                coins.showCoin1();
                coins.showCoin3();
                hasCoin[2] = true;
                return;
            }
            if (!hasCoin[2] && coins.showCoin1() == false && coins.showCoin2() == false && round3.isOptionCorrect(Options.B)) {
                coins.showCoin3();
                hasCoin[2] = true;
                return;
            }
        }
        if (!hasCoin[3] && coins.showCoin1() == true && coins.showCoin2() == true && coins.showCoin3() == true && round4.isOptionCorrect(Options.D)) {
            coins.showCoin1();
            coins.showCoin2();
            coins.showCoin3();
            coins.showCoin4();
            hasCoin[3] = true;
        } else {
            if (!hasCoin[3] && coins.showCoin1() == false && coins.showCoin2() == true && coins.showCoin3() == true && round4.isOptionCorrect(Options.D)) {
                coins.showCoin2();
                coins.showCoin3();
                coins.showCoin4();
                hasCoin[3] = true;
                return;
            }
            if (!hasCoin[3] && coins.showCoin1() == false && coins.showCoin2() == false && coins.showCoin3() == true && round4.isOptionCorrect(Options.D)) {
                coins.showCoin3();
                coins.showCoin4();
                hasCoin[3] = true;
                return;
            }
            if (!hasCoin[3] && coins.showCoin1() == true && coins.showCoin2() == false && coins.showCoin3() == true && round4.isOptionCorrect(Options.D)) {
                coins.showCoin1();
                coins.showCoin3();
                coins.showCoin4();
                hasCoin[3] = true;
                return;
            }
            if (!hasCoin[3] && coins.showCoin1() == false && coins.showCoin2() == true && coins.showCoin3() == false && round4.isOptionCorrect(Options.D)) {
                coins.showCoin2();
                coins.showCoin4();
                hasCoin[3] = true;
                return;
            }
            if (!hasCoin[3] && coins.showCoin1() == true && coins.showCoin2() == true && coins.showCoin3() == false && round4.isOptionCorrect(Options.D)) {
                coins.showCoin1();
                coins.showCoin2();
                coins.showCoin4();
                hasCoin[3] = true;
                return;
            }
            if (!hasCoin[3] && coins.showCoin1() == false && coins.showCoin2() == false && coins.showCoin3() == false && round4.isOptionCorrect(Options.D)) {
                coins.showCoin4();
                hasCoin[3] = true;
                return;
            }
        }
        if (!hasCoin[4] && coins.showCoin1() == true && coins.showCoin2() == true && coins.showCoin3() == true && coins.showCoin4() == true && round5.isOptionCorrect(Options.C)) {
            coins.showCoin1();
            coins.showCoin2();
            coins.showCoin3();
            coins.showCoin4();
            coins.showCoin5();
            hasCoin[4] = true;

        } else {
            if (!hasCoin[4] && coins.showCoin1() == false && coins.showCoin2() == true && coins.showCoin3() == true && coins.showCoin4() == true && round5.isOptionCorrect(Options.C)) {
                coins.showCoin2();
                coins.showCoin3();
                coins.showCoin4();
                coins.showCoin5();
                hasCoin[4] = true;
                return;
            }
            if (!hasCoin[4] && coins.showCoin1() == true && coins.showCoin2() == false && coins.showCoin3() == true && coins.showCoin4() == true && round5.isOptionCorrect(Options.C)) {
                coins.showCoin1();
                coins.showCoin3();
                coins.showCoin4();
                coins.showCoin5();
                hasCoin[4] = true;
                return;
            }
            if (!hasCoin[4] && coins.showCoin1() == true && coins.showCoin2() == true && coins.showCoin3() == true && coins.showCoin4() == false && round5.isOptionCorrect(Options.C)) {
                coins.showCoin1();
                coins.showCoin3();
                coins.showCoin4();
                coins.showCoin5();
                hasCoin[4] = true;
                return;
            }
            if (!hasCoin[4] && coins.showCoin1() == false && coins.showCoin2() == false && coins.showCoin3() == false && coins.showCoin4() == false && round5.isOptionCorrect(Options.C)) {
                coins.showCoin5();
                hasCoin[4] = true;
            }
        }
    }

    public void passFinalRound() {
        for (int i = 0; i < hasCoin.length; i++) {
            if (hasCoin[i] == true) {
                countCoins++;
            }
        }
    }

}