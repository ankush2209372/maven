package scanner;

public class ProjectCode {
    private int num1;
    private int num2;
    int sum;

    public void Sum() {
        sum = num1 + num2;
        System.out.println(sum);

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}