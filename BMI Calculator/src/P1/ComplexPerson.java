package P1;

//This class extends the super class Person and implements serialization
public class ComplexPerson extends Person implements java.io.Serializable {

private int age;
private char gender;

public ComplexPerson(){};

//This class introduces two new fields, which specializes the class to the needed purpose.
public ComplexPerson(int id, double weight, double height, double BMI, int age, char gender) {
    super(id, weight, height, BMI);
    this.age=age;
    this.gender=gender;
}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

//This class introduces new methods which are used to fill specific fields.
public String theGenderE() {
    char x=getGender();
    String output="";
    
    switch (x) {
        case 'm':
            output="Male";
            break;
        case 'f':
            output="Female";
            break;
        default:
            output="Error when Selecting Gender";
            break;
    }
    
    return output;
}

public String theGenderS() {
    
char x=getGender();
    String output="";
    
    switch (x) {
        case 'm':
            output="Masculino";
            break;
        case 'f':
            output="Femenino";
            break;
        default:
            output="Error al selecionar sexo";
            break;
    }
    
    return output;
}


//This class introduces new showPerson methods, given the larger amount of parameters.
@Override
public String showPerson(int lang) {
    if(lang==0) {
        return super.showPerson(lang)
                +"\nAge: "+getAge()
                +"\nGender: "+theGenderE()+"\n";
    } else {
        return super.showPerson(lang)
                +"\nEdad: "+getAge()
                +"\nSexo: "+theGenderS()+"\n";
    }
}

@Override
public String imperialshowPerson(int lang) {
    if(lang==0) {
        return super.imperialshowPerson(lang)
                +"\nAge: "+getAge()
                +"\nGender: "+theGenderE()+"\n";
    } else {
        return super.imperialshowPerson(lang)
                +"\nEdad: "+getAge()
                +"\nSexo: "+theGenderS()+"\n";
    }

}

}