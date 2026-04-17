import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private char sexo;
    private String intereses;

    private Scanner teclado;

    public Persona() {
        this.teclado = new Scanner(System.in);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        if(nombre == null || nombre.trim().isEmpty() ){
            this.nombre = "Unknown";
        }else{
            this.nombre = nombre.trim();
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        

        if(edad >= 1 && edad <=70){
            this.edad = edad;
        }else{
            this.edad = 0;
        }
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        sexo = Character.toUpperCase(sexo); // convertir a mayúscula
        if( this.sexo == 'M' || this.sexo == 'F' ){
            this.sexo = sexo;
        }else{
             this.sexo = 'X';
        }
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
    
    public void ingresar(){
        System.out.print("Ing. nombre: ");
        this.nombre = teclado.nextLine();
        System.out.print("Ing. edad: ");
        this.edad  = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ing. Sexo (M/F): ");
        this.sexo = teclado.nextLine().charAt(0);
        System.out.println("Ingresar Intereses: ");
        this.intereses = teclado.nextLine();
    }
    
    public void imprimir(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Intereses: "+this.intereses);
    }

}
