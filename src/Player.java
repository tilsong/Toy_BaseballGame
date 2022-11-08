abstract class Player {
    String number = "";

    abstract public void setNumber();

    public String getNumber(){ // 있어야 하나? 필드가 private이 아닌데..
        return number;
    };
}