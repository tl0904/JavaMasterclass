package com.timbuchalka.section4.Challenge31;

public class Main {
    
    public static void main(String[] args) {
        
        boolean gameOver = true;
        int score = 1500;
        int levelCompleted = 5;
        int bonus = 100;
        String playersName = "Kiss Feri";
        
        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);
        
        int helyezes = calculateHighScorePosition(score);
        displayHighScorePosition(playersName, helyezes);
        
        score = 900;
        levelCompleted = 8;
        bonus = 200;
        playersName = "Nagy Jani";
        
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        helyezes = calculateHighScorePosition(score);
        displayHighScorePosition(playersName, helyezes);
        
        score = 400;
        levelCompleted = 8;
        bonus = 200;
        playersName = "Mese Emese";
        
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        helyezes = calculateHighScorePosition(score);
        displayHighScorePosition(playersName, helyezes);
        
        score = 50;
        levelCompleted = 8;
        bonus = 200;
        playersName = "Valami Sanyi";
        
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was: " + highScore);

        helyezes = calculateHighScorePosition(score);
        displayHighScorePosition(playersName, helyezes);
        
    }

    private static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        
        return -1;
    }
    
    private static void displayHighScorePosition(String playersName, int helyezes) {
        System.out.println(playersName + " managed to get into position " + helyezes);
    }
    
    private static int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1;
        } else if (score <= 1000 && score > 500) {
            return 2;
        } else if (score <= 500 && score > 100) {
            return 3;
        } else {
            return 4;
        }
    }
    
}
