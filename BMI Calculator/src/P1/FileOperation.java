package P1;

import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FileOperation {

//Creates the necessary File for the first ArrayList.
public void createArrayList1() {

try {
    File SimpleFile = new File("Media/sPFile.ser");
    if(SimpleFile.createNewFile());
} catch (IOException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: Required files could not be created."
            + "\nPlease check your computer's security settings.", "ERROR", 0);
}

}

//Creates the necessary File for the second ArrayList.
public void createArrayList2() {

try {
    File ComplexFile = new File("Media/cPFile.ser");
    if(ComplexFile.createNewFile());
} catch (IOException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Error: Required files could not be created."
            + "\nPlease check your computer's security settings.", "ERROR", 0);
}

}

//Writes on the file based on the SimplePerson ArrayList.
public void fillFile1(ArrayList<SimplePerson> x) {
        try {
            FileOutputStream fos = new FileOutputStream("Media/sPFile.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(x);
            oos.close();
            fos.close();
            
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: File writing failed.", "ERROR", 0);
    }
}

//Writes on the file based on the ComplexPerson ArrayList.
public void fillFile2(ArrayList<ComplexPerson> x) {
        try {
            FileOutputStream fos = new FileOutputStream("Media/cPFile.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(x);
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: File writing failed.", "ERROR", 0);
        }
}

//Fills the first ArrayList based on the serialized file.
public ArrayList readFile1(ArrayList<SimplePerson> x) {
    try {
        FileInputStream fis = new FileInputStream("Media/sPFile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        x = (ArrayList) ois.readObject();
        ois.close();
        fis.close();
    } catch (IOException ioe) {
        //ioe.printStackTrace();
        //JOptionPane.showMessageDialog(null, "Error: File reading failed.", "ERROR", 0);
    } catch (ClassNotFoundException c) {
        c.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: File reading failed. Class not found.", "ERROR", 0);
    }
    
    return x;
    
    //for (SimplePerson itrF: x) {
    //        System.out.println(itrF.showPerson());
    //    }
    
}

//Fills the second ArrayList based on the serialized file.
public ArrayList readFile2(ArrayList<ComplexPerson> x) {
    try {
        FileInputStream fis = new FileInputStream("Media/cPFile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        x = (ArrayList) ois.readObject();
        ois.close();
        fis.close();
    } catch (IOException ioe) {
        //ioe.printStackTrace();
        //JOptionPane.showMessageDialog(null, "Error: File reading failed.", "ERROR", 0);
    } catch (ClassNotFoundException c) {
        c.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error: File reading failed. Class not found.", "ERROR", 0);
    }
    
    return x;
    
    //for (ComplexPerson itrF: x) {
    //        System.out.println(itrF.showPerson());
    //    }
    
}

//Fills the ArrayList of Objects based on user input.
public void fillArrayList1(ArrayList<SimplePerson> x, int id, double weight, double height, double BMI) {
     x.add(new SimplePerson(id, weight, height, BMI));
}

//Fills the ArrayList of Complex Objects based on user input.
public void fillArrayList2(ArrayList<ComplexPerson> x, int id, double weight, double height, double BMI, int age, char gender) {
    x.add(new ComplexPerson(id, weight, height, BMI, age, gender));
}

//Shows all of the elements in the ArrayList.
public void showArrayList1(ArrayList<SimplePerson> x, int lang, int units) {
    for(SimplePerson itrF:x) {
        if(units==0) {
            System.out.println(itrF.showPerson(lang));
        } else {
            System.out.println(itrF.imperialshowPerson(lang));
        }
    }
}

//Shows all of the elements in the ArrayList.
public void showArrayList2(ArrayList<ComplexPerson> x, int lang, int units) {
    for(ComplexPerson itrF:x) {
        if(units==0) {
            System.out.println(itrF.showPerson(lang));
        } else {
            System.out.println(itrF.imperialshowPerson(lang));
        }
    }
}

//Shows all of the elements in the ArrayList based on a search term.
public String searchArray1(ArrayList<SimplePerson> x, int y, int lang, int units) {
    String o="";
    int c=0;
    for(SimplePerson itrF:x) {
        if(itrF.getId()==y) {
            if(units==0) {
                o+=itrF.showPerson(lang)+"\n";
            } else {
                o+=itrF.imperialshowPerson(lang)+"\n";
            }
            c++;
        }
    }
    
if(lang==0) {
    if(c==0) {
        return c+" results found for search term '"+y+"'.\nPlease try again.";
    } else {
        return c+" result(s) found for search term '"+y+"':\n\n"+o;
    }
} else {
        if(c==0) {
        return c+" resultados encontrados para el término de búsqueda '"+y+"'.\nPor favor, inténtelo de nuevo.";
    } else {
        return c+" resultado(s) encontrado(s) para el término de búsqueda '"+y+"':\n\n"+o;
    }
}
    
}

//Shows all of the elements in the ArrayList based on a search term.
public String searchArray2(ArrayList<ComplexPerson> x, int y, int lang, int units) {
    String o="";
    int c=0;
    for(ComplexPerson itrF:x) {
        if(itrF.getId()==y) {
            if(units==0) {
                o+=itrF.showPerson(lang)+"\n";
            } else {
                o+=itrF.imperialshowPerson(lang)+"\n";
            }
            c++;
        }
    }
if(lang==0) {
    if(c==0) {
        return c+" results found for search term '"+y+"'.\nPlease try again.";
    } else {
        return c+" result(s) found for search term '"+y+"':\n\n"+o;
    }
} else {
    if(c==0) {
        return c+" resultados encontrados para el término de búsqueda '"+y+"'.\nPor favor, inténtelo de nuevo.";
    } else {
        return c+" resultado(s) encontrado(s) para el término de búsqueda '"+y+"':\n\n"+o;
    }
}

}

//Counts all of the results that fulfil the search criteria.
public int countResults1(ArrayList<SimplePerson> x, int y) {
    int c=0;
    for(SimplePerson itrF:x) {
        if(itrF.getId()==y) {
            c++;
        }
    }
    return c;
}

//Counts all of the results that fulfil the search criteria.
public int countResults2(ArrayList<ComplexPerson> x, int y) {
    int c=0;
    for(ComplexPerson itrF:x) {
        if(itrF.getId()==y) {
            c++;
        }
    }
    return c;
}


}