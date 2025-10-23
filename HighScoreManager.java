public class HighScoreManager {
    private static int highScore = 0;
    
    public static int getHighScore() {
        return highScore;
    }
    
    public static void saveHighScore(int score) {
        if (score > highScore) {
            highScore = score;
        }
    }
}
