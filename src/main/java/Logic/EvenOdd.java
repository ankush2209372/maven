package Logic;

public class EvenOdd {

        public int num;


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void evenOdd(){
        System.out.println (num%2);
        if (num%2==0){
            System.out.println("even ");
        } else {
            System.out.println("odd");

        }
    }
}
