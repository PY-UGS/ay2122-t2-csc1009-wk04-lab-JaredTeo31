public class BMI {
    public double weight;
    public double height;

    public BMI(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    public double getWeight(){
        return this.weight;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getBMI(){
        double BMI = (this.weight/(this.height*this.height));
        return BMI;
    }
    public String getBMIInterpretation(double BMI){
        if(BMI < 18.5)
         return "Underweight";
      else if(BMI < 25)
         return "Normal";
      else if(BMI < 30)
         return "Overweight";
      else
         return "Obese";
    }
}
