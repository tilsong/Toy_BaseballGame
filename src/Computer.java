import java.util.Random;

class Computer extends Player {
    @Override
    public void setNumber() {
        Random random = new Random();

        while (number.length() < 3) {
            int num = random.nextInt(10); // 0이면 다시
            if(num == 0) continue;
            number += (num +"");
        }
        System.out.println("com num: " + number);
    }
}