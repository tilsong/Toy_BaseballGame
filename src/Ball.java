class Ball {
    int ball = 0;
    int strike = 0;

    public void addBall () {
        ball++;
    }

    public void addStrike () {
        strike++;
    }

    public int getBall() {
        return ball;
    }

    public int getStrike() {
        return strike;
    }

    public void reset() {
        ball = 0;
        strike = 0;
    };
}
