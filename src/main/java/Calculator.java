public class Calculator {
    private double input1;
    private double input2;

    public Calculator(double input1, double input2){
        this.input1 = input1;
        this.input2 = input2;
    }

    public double add(){
        double answer = input1 + input2;
        return answer;
    }

    public double subtract(){
        double answer = input1 - input2;
        return answer;
    }

    public double multiply(){
        double answer = input1 * input2;
        return answer;
    }

    public double divide(){
        double answer = input1 / input2;
        return answer;
    }
}
