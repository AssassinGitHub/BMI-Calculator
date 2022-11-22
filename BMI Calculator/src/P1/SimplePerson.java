package P1;

//This class extends the super class Person and implements serialization
public class SimplePerson extends Person implements java.io.Serializable {

public SimplePerson(){};

//This subclass doesn't introduce new fields
public SimplePerson(int id, double weight, double height, double BMI) {
    super(id, weight, height, BMI);
}

@Override
public String showPerson(int lang) {
    return super.showPerson(lang)+"\n";
}

@Override
public String imperialshowPerson(int lang) {
    return super.imperialshowPerson(lang)+"\n";
}
 
}
