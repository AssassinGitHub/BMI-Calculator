package P1;

import java.text.DecimalFormat;

//The class Person implements serialization and acts as a super class 
public class Person implements java.io.Serializable {

//Global Identifier Declaration
private int id;
private double weight;
private double height;
private double BMI;

//Default Constructor
public Person(){};

//Overloaded Constructor
public Person(int id, double weight, double height, double BMI) {
    this.id = id;
    this.weight = weight;
    this.height = height;
    this.BMI = BMI;
}

//Getter and Setters
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public double getWeight() {
    return weight;
}

public void setWeight(double weight) {
    this.weight = weight;
}

public double getHeight() {
    return height;
}

public void setHeight(double height) {
    this.height = height;
}

public double getBMI() {
    return BMI;
}

public void setBMI(double BMI) {
    this.BMI = BMI;
}

//Method that shows the object. Is overridden in two different sub-classes.
public String showPerson(int lang) {
    if(lang==0) {
        return "ID: "+this.id+
               "\nWeight: "+this.weight+" Kg"+
               "\nHeight: "+this.height+" m"+
               "\nBMI: "+this.BMI;
    } else {
        return "Identifiación: "+this.id+
               "\nPeso: "+this.weight+" Kg"+
               "\nAltura: "+this.height+" m"+
               "\nIMC: "+this.BMI;
    }
}

//Method that shows the object. Is overridden in two different sub-classes.
public String imperialshowPerson(int lang) {
    if(lang==0) {
        return "ID: "+this.id+
               "\nWeight: "+dFormat(kgToPounds(this.weight))+" lb"+
               "\nHeight: "+dFormat(metersToFeet(this.height))+" ft"+
               "\nBMI: "+this.BMI;
    } else {
        return "Identifiación: "+this.id+
               "\nPeso: "+dFormat(kgToPounds(this.weight))+" lb"+
               "\nAltura: "+dFormat(metersToFeet(this.height))+" ft"+
               "\nIMC: "+this.BMI;
    }
    
}

//Methods used to format variables
public String dFormat(double x) {
    DecimalFormat df = new DecimalFormat("#.000");
    return df.format(x);
}

public double kgToPounds(double k) {
    return k*2.2046226218;
}

public double metersToFeet(double m) {
    return m*3.280839895;
}

}