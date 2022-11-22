package P1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class Methods {

//This method creates a Simple Date Format Object, Extracts the Date and Time from the OS (Operating System),
//And returns a String containing Date and Time in the specified format.
public String setTimeAndDate() {
    DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm");
    Date dateobj = new Date();
    return df.format(dateobj);
}

//This method runs a help window based on the language setting specified by the user.
public void showHelp(int lang) {
    if(lang==0)
        JOptionPane.showMessageDialog(null, "<html><b>Language Settings:</b> Change between English and Spanish languages.<html>"
                                            +"\nAffects all labels and outputs within the application."
                
                                            + "\n\n<html><b>Output Settings:</b> Change between Detailed and Simple outputs created by the application. <i>(only applies to the Simple BMI Calculation Function)<i><html>"
                                            + "\n<html><u>Detailed:</u> The application creates a pop-up window, which includes both results and inputs entered by the user.<html>"
                                            + "\n<html><u>Simple:</u> The application does not create external windows and displays results in a simplified form directly on the interface.<html>"
                                            
                                            + "\n\n<html><b>Unit Settings:</b> Change between the Metric and Imperial unit systems.<html>"
                                            + "\n<html><u>Metric:</u> The application will take all forms of input in the <u>metric</u> system: Kilograms <b>(Kg)</b> and Grams <b>(g)</b> for weight, Meters <b>(m)</b> and Centimeters <b>(cm)</b> for height.<html>"
                                            + "\n<html><u>Imperial:</u> The application will take all forms of input in the <u>imperial</u> system: Pounds <b>(lb)</b> and Ounces <b>(oz)</b> for weight, Feet <b>(ft)</b> and Inches <b>(in)</b> for height.<html>", "-Help-", 1);
    else if (lang==1)
        JOptionPane.showMessageDialog(null, "<html><b>Ajustes de Lenguaje:</b> Opción de cambiar entre los lenguajes Español e Inglés.<html>"
                                            +"\nEste cambio afecta a todo el texto generado por la aplicación."
                
                                            + "\n\n<html><b>Ajustes de Resultados:</b> Opción de cambiar entre resultados Detallados y Simples creados por la aplicación. <i>(solo aplica para la función de Cálculo de IMC Simple)<i><html>"
                                            + "\n<html><u>Detallado:</u> La aplicación crea una ventana emergente, en donde incluyen los resultados y los valores ingresados por el usuario.<html>"
                                            + "\n<html><u>Simple:</u> La aplicación no crea ventanas externas y en vez despliega los resultados simplificados directamente en el interfaz.<html>"
                                            
                                            + "\n\n<html><b>Ajustes de Unidades:</b> Opción de cambiar entre el sistema Métrico y el sistema Imperial de unidades.<html>"
                                            + "\n<html><u>Métrico:</u> La aplicación utilizará el sistema <u>métrico</u> para interpretar todos los valores ingresados por el usuario: Kilogramos <b>(Kg)</b> y Gramos <b>(g)</b> para el peso, Metros <b>(m)</b> y Centimetros <b>(cm)</b> para la altura.<html>"
                                            + "\n<html><u>Imperial:</u> La aplicación utilizará el sistema <u>imperial</u> para interpretar todos los valores ingresados por el usuario: Libras <b>(lb)</b> y Onzas <b>(oz)</b> para el peso, Pies <b>(ft)</b> y Pulgadas <b>(in)</b> para la altura.<html>", "-Ayuda-", 1);
}

public void errorMessage1(int lang) {
    if(lang==0) {
        JOptionPane.showMessageDialog(null, "The values entered are invalid.\nOnly positive numbers are accepted.", "Error", 0);
    } else if(lang==1) {
        JOptionPane.showMessageDialog(null, "Los valores introducidos son inválidos.\nSolo utilice números positivos.", "Error", 0);
    }
}

public void errorMessage2(int lang) {
    if(lang==0) {
        JOptionPane.showMessageDialog(null, "The values entered are in an invalid format.\nNo letters are allowed, only positive numbers are accepted.", "Error", 0);
    } else if(lang==1) {
        JOptionPane.showMessageDialog(null, "Los valores introducidos están en un formato inválido.\nNo se permite el uso de letras, solamente números positivos.", "Error", 0);
    }
}

public void errorMessage3(int lang) {
    if(lang==0) {
        JOptionPane.showMessageDialog(null, "Please select gender.", "Notice", 2);
    } else if(lang==1) {
        JOptionPane.showMessageDialog(null, "Por favor seleccione un sexo.", "Aviso", 2);
    }
}

public void errorMessage4(int lang) {
    if(lang==0) {
        JOptionPane.showMessageDialog(null, "Please input age.", "Notice", 2);
    } else if(lang==1) {
        JOptionPane.showMessageDialog(null, "Por favor ingrese la edad.", "Aviso", 2);
    }
}

public void message1(int lang) {
    if(lang==0) {
        JOptionPane.showMessageDialog(null, "Success. Values were saved.", "Save Successful", 1);
    } else if(lang==1) {
        JOptionPane.showMessageDialog(null, "Los datos fueron guardados correctamente.", "Datos Guardados", 1);
    }
}

//Method used to change JOptionPaneConfirm based on language setting.
public void jOptionPaneLang(int lang) {
    if(lang==0) {
        UIManager.put("OptionPane.yesButtonText", "Yes");
        UIManager.put("OptionPane.cancelButtonText", "Cancel");
    } else if(lang==1) {
        UIManager.put("OptionPane.yesButtonText", "Sí");
        UIManager.put("OptionPane.cancelButtonText", "Cancelar");
        
    }
}

//Methods used to convert values within the metric system. Meter and Centimeters as well as Grams and Kilograms.
public double antiexp2(double x) {
    return x*(Math.pow(10, -2));
}

public double antiexp3(double x) {
    return x*(Math.pow(10, -3));
}

//All of the following methods act as unit converters, in order to carry out all computations under the same unit.
public double poundsToKG(double p) {
    return p/2.2046226218;
}

public double kgToPounds(double k) {
    return k*2.2046226218;
}

public double ouncesToKG(double o) {
    return o/35.274;
}

public double feetToMeters(double f) {
    return f/3.280839895;
}

public double metersToFeet(double m) {
    return m*3.280839895;
}

public double inchesToMeters(double i) {
    return i/39.37;
}

//Method that does the baseline calculation of BMI.
public double calcBMI(double w, double h) {
    return w/(Math.pow(h, 2));
}

//Method that does the backwards calculation of Weight.
public double calcWeight(double bmi, double h) {
    return bmi*(Math.pow(h, 2));
}

//Method that does the backwards calculation of Height.
public double calcHeight(double bmi, double w) {
    return Math.sqrt((w/bmi));
}

//Method that returns status based on the BMI value previously calculated
//and the language setting the user makes.
public String status(double BMI, int lang) {
    String stat="";
    
if(lang==0) {
    
if(BMI<18.5) {
    stat="Underweight";
} else if(BMI>=18.5&&BMI<25) {
    stat="Normal";
} else if(BMI>=25&&BMI<30) {
    stat="Overweight";
} else if(BMI>=30&&BMI<35) {
    stat="Obese";
} else if(BMI>=35) {
    stat="Extremely Obese";
}

} else if(lang==1) {
    if(BMI<18.5) {
    stat="Bajo de Peso";
} else if(BMI>=18.5&&BMI<25) {
    stat="Normal";
} else if(BMI>=25&&BMI<30) {
    stat="Sobrepeso";
} else if(BMI>=30&&BMI<35) {
    stat="Obeso";
} else if(BMI>=35) {
    stat="Extremadamente Obeso";
}

}

return stat;

}

//Methods used to display results.
public void outputWindow(int l, double BMI, String s) {
    if(l==0) { 
    JOptionPane.showMessageDialog(null, "Based on the values entered, your BMI is: "+BMI
                                        +"\n\nThis value indicates that you are: "+s, "Output", 1);
} else if(l==1) {
    JOptionPane.showMessageDialog(null, "Con base en los valores ingresados, su BMI es de: "+BMI
                                        +"\n\nEste valor indica el siguiente estado: "+s, "Output", 1);
}
}

public void outputWindow1(int l, String BMI, String h, String w, String u) {
    if(l==0) {
        JOptionPane.showMessageDialog(null, "Based on a target BMI of "+BMI+" and a height of "+h+" "+u+":"
                                            +"\n\nThe required weight is "+w);
    } else if(l==1) {
        JOptionPane.showMessageDialog(null, "Basado en su objetivo de IMC de "+BMI+" y una altura de "+h+" "+u+":"
                                            +"\n\nEl peso requerido es de "+w);
    }
}

public void outputWindow2(int l, String BMI, String w, String h, String u) {
    if(l==0) {
        JOptionPane.showMessageDialog(null, "Based on a target BMI of "+BMI+" and a weight of "+w+" "+u+":"
                                            +"\n\nThe required height is "+h);
    } else if(l==1) {
        JOptionPane.showMessageDialog(null, "Basado en su objetivo de IMC de "+BMI+" y un peso de "+w+" "+u+":"
                                            +"\n\nLa altura requerida es de "+h);
    }
}

//Method used to create the possible values for the JFrame Slider.
public int[][] createSlider() {
    int[][] values=new int[36][2];
    for(int r=0; r<values.length; r++) {
        values[r][0]=r;
    }
    
    for(int r=0; r<19; r++) {
            values[r][1]=10;
    }
        
    values[19][1]=23;
    values[20][1]=26;
    values[21][1]=30;
    values[22][1]=33;
    values[23][1]=36;
    values[24][1]=40;
    values[25][1]=44;
    values[26][1]=48;
    values[27][1]=52;
    values[28][1]=56;
    values[29][1]=60;
    values[30][1]=64;
    values[31][1]=68;
    values[32][1]=72;
    values[33][1]=76;
    values[34][1]=80;
    values[35][1]=90;
    
    return values;
}

//Method used to access the different values within the 2D array,
//based on the value of BMI calculated by the program.
public int slider(double BMI, int[][] values) {
    int bmi=(int)Math.round(BMI);
    
    if(BMI<36) {
        for(int r=0; r<values.length; r++) {
            if(values[r][0]==bmi) {
                return values[r][1];
            }
        }
    }
    return 95;
}

//Method used to show the array and for testing purposes only.
public void show2D(int[][] values) {
    for(int r=0; r<values.length; r++) {
        for(int c=0; c<values[r].length; c++) {
            System.out.print(values[r][c]+" ");
        }
        System.out.println("");
    }
}

//The methods below are used to construct the output String based on a wide range of parameters.
public String complexOuput(String w, String h, double BMI, int age, String gender, int lang) {
    String output="";
    
    if(lang==0) {
        output+="Based on the value of weight "+w+" and height "+h
                +":\n\nThe BMI is: "+BMI;
        
        output+="\n\nThis value indicates you're "+status(BMI, lang).toLowerCase()+".";
        
        if(gender.equalsIgnoreCase("Male")) {
            output+="\n\nTake into account that BMI values for men tend to be higher than in women. These values also tend to change more frequently.";
        } else if(gender.equalsIgnoreCase("Female")) {
            output+="\n\nRemember that BMI values for women tend to be lower and less volatile when compared to men.";
        }
        
    } else if(lang==1) {
        output+="Con base a los valores de peso "+w+" y altura "+h
                +":\n\nEl IMC es: "+BMI;
        
        output+="\n\nEste valor indica un estado de "+status(BMI, lang).toLowerCase()+".";
        
        if(gender.equalsIgnoreCase("Masculino")) {
            output+="\n\nTenga en cuenta que los valores de IMC en los hombres tienden a ser mayores que los de las mujeres y a cambiar con mayor frecuencia.";
        } else if(gender.equalsIgnoreCase("Femenino")) {
            output+="\n\nRecuerde que los valores de IMC en las mujeres son por lo general más bajos y menos cambiantes que los de los hombres.";
        }
        
    }
    
    output+="\n\n"+ageOutput(age, lang);
    output+="\n\n"+solutionOutput(BMI, lang);
    
    return output;
}

public String ageOutput(int age, int lang) {
    String output="";
    
    if(lang==0) {
        if(age<=17) {
            output="Note that BMI values for underage people are mostly innacurate, as it doesn't account for growth and development. These values are usually higher than normal.";
        } else if(age>=18&&age<=60) {
            output="BMI values for adults are the most accurate when compared to the same values for underage people.";
        } else {
            output="BMI values for older adults can be somewhat innacurate, as these can vary greatly for a number of factors, such as loss in muscle mass.";
        }
    } else if(lang==1) {
        if(age<=17) {
            output="Recuerde que los valores de IMC para personas menores de edad son imprecisos, ya que no toman en cuenta el crecimiento y desarrollo. Dichos valores son por lo general mayores de lo normal.";
        } else if(age>=18&&age<=60) {
            output="Los valores de IMC para los adultos resultan más precisos que el mismo cálculo realizado para personas menores de edad.";
        } else {
            output="El IMC en adultos mayores puede ser un poco impreciso, ya dicho valor puede ser alterado por un sinnúmero de factores, como la pérdida de masa muscular.";
        }
    }
    
    return output;
}

public String solutionOutput(double BMI, int lang) {
    String o="";
    
    if(lang==0) {
    
        if(BMI<18.5) {
            o="An underweight status in BMI indicates that some action must be taken in order to raise body weight based on the current height.";
        } else if(BMI>=18.5&&BMI<25) {
            o="A Normal BMI indicates that the current lifestyle and diet are efficient. Nonetheless, it is important to continue leading a balanced diet and keep being active.";
        } else if(BMI>=25&&BMI<30) {
            o="A BMI status of overweight is really common and shows that the current body weight is a bit excessive. Some exercise along with a balanced diet is all that's necessary to reduce this small weight excess.";
        } else if(BMI>=30&&BMI<35) {
            o="A BMI status indicate obesity is alarming. Obesity can lead to numerous health problems related to other bodily functions. Please consult with a nutritionist immediately.";
        } else if(BMI>=35) {
            o="A BMI status of extreme obesity is highly dangerous. Please visit a nutritionist as soon as possible, in order to consult the best course of action going forward.";
        }

    } else if(lang==1) {
    
        if(BMI<18.5) {
            o="Una clasificación de bajo de peso en el IMC indica que se debe tomar medidas necesarias para aumentar el peso corporal, basado en la altura actual.";
        } else if(BMI>=18.5&&BMI<25) {
            o="Una clasificación Normal en el IMC indica que la dieta actual y estilo de vida son eficientes. No obstante, es importante continuar comiendo saludable y permaneciendo activo.";
        } else if(BMI>=25&&BMI<30) {
            o="Un estado de sobrepeso es bastante común que demuestra que el peso corporal actual es un poco excesivo. Un poco de ejercicio con una dieta balanceada será suficiente para reducir el peso corporal innecesario.";
        } else if(BMI>=30&&BMI<35) {
            o="Un estado de obesidad en el IMC es peligroso. La obesidad puede llevar a numerosos problemas de salud relacionados a otras funciones corporales. Por favor, consulte con un nutricionista.";
        } else if(BMI>=35) {
            o="Un estado de obesidad extrema en el IMC es altamente peligroso. Por favor, consulte con un nutricionista cuanto antes para determinar el mejor curso de acción de aquí en adelante.";
        }

    }
    
    return o;

}



}