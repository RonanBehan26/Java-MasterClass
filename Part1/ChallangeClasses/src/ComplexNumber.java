public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary){
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void add(ComplexNumber complexNumber){
        add(complexNumber.getReal(), complexNumber.getImaginary());
    }

    public void subtraction(double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary + imaginary;
    }

    public void subtraction(ComplexNumber complexNumber){
        subtraction(complexNumber.getReal(), complexNumber.getImaginary());
    }

}
