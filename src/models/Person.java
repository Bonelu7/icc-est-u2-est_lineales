package models;

public class Person {
    private String nombreString;
    private int edad;


    public Person(String nombreString, int edad) {
        this.nombreString = nombreString;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }

    public String getNombreString() {
        return nombreString;
    }
    public void setNombreString(String nombreString) {
        this.nombreString = nombreString;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    } 
    
    
}
