import java.util.Scanner;

public class Judgement {
    Ball ball = new Ball();
    Boolean play = false;

    public static Judgement start() {
       return new Judgement();
    }

    public void playGame() {
        play = true;

        Ball ball = new Ball();

        while(play) {
            // 선수 생성
            Computer computer = new Computer();
            User user = new User();

            // 선수 플레이
            computer.setNumber();
            user.setNumber();

            // 심판하기

//            while() {
                declareLose();
                judgeBalls(computer.getNumber(), user.getNumber());
//            }

            declareWin();
            selectNewGame();
        }
    }

    public void endGame() {
        play = false;
    }

    public boolean judgeBalls (String comNum, String userNum) {
        // Strike, ball 개수 계산
        for(int j=0; j<userNum.length(); j++) {
            boolean hit = comNum.contains(String.valueOf(userNum.charAt(j)));

            if(hit) {
                if(comNum.charAt(j) == userNum.charAt(j)) {
                    ball.addBall();
                } else {
                    ball.addStrike();
                }
            }
        }

        if(ball.getStrike() == 3) {
            return true;
        } else  {
            return false;
        }
    }

    public void declareWin() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void declareLose() {
        String resultInfo = "";

        if(ball.getBall()>0) resultInfo += (ball.getBall() + "볼 ");
        if(ball.getStrike()>0) resultInfo += (ball.getStrike() + "스트라이크");

        System.out.println(resultInfo);
    }

    public void selectNewGame() {
        Scanner newPlay = new Scanner(System.in);
        if(newPlay.nextInt() == 2) endGame();
    };
}
