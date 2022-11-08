import java.util.Scanner;

class User extends Player {
    @Override
    public void setNumber() {
        System.out.print("숫자를 입력해주세요: ");
        Scanner input = new Scanner(System.in);
        number = input.nextLine();
    }
}
