public class Calculator implements java.io.Serializable  {
    private double operandOne;
    private double operandTwo;
    private String operation;
    private double product;

    public Calculator(){
        this.operandOne = 0;
        this.operandTwo = 0;
        this.operation = "";
        this.product = 0;
    }

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double operandOne) {
        this.operandOne = operandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double operandTwo) {
        this.operandTwo = operandTwo;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getProduct() {
        return product;
    }

    public double performOperation(){
        if(this.operation.equals("+")){
            this.product = this.operandOne + this.operandTwo;
            return this.product;
        }
        if(this.operation.equals("-")){
            this.product = this.operandOne - this.operandTwo;
            return this.product;
        }
        else{
            System.out.println("No such operation.");
            return 0;
        }
    }

    public void getResults(){
        System.out.println("The result of the operation is: " + this.product);
    }

    
}
