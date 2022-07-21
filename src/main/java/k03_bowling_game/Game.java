package k03_bowling_game;

public class Game {
    private int score = 0;
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    void roll(int pins){
        rolls[currentRoll++] = pins;
    }
    int score(){
        int score = 0;
        int frameIndex = 0;
        for(int frame=0; frame<10;  frame++){
            if(isStrike(rolls[frameIndex])){ //strike
                score += 10 + strikeBouns(frameIndex);
                frameIndex++;
            }
            else if(isSpare(frameIndex)) { 
                score += 10 + spareBouns(frameIndex);
                frameIndex += 2;
            }else {
                score += sumOfBallsInFrame(frameIndex);
                frameIndex += 2;
            }
        }
        return score;
    }

    private boolean isStrike(int roll) {
        return roll == 10;
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }

    private int spareBouns(int frameIndex) {
        return rolls[frameIndex + 2];
    }

    private int strikeBouns(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private boolean isSpare(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex +1] == 10;
    }
}
