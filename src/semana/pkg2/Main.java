public class Main {
    
    public static void main(String[] args) {
        
        /*
        Persona p1 = new Persona();
        Persona p2 = new Persona();
        
        System.out.println("--- Persona 1 ---");
        p1.ingresar();
        p1.imprimir();
        
        System.out.println("--- Persona 2 ---");
        p2.setNombre("Edinson");
        p2.setEdad(50);
        p2.setSexo('M');
        p2.setIntereses("Futbol, Rugby");
        p2.imprimir();
        
        System.out.println("--- Persona 3 ---");
        Persona p3 = new Persona();
        p3.setNombre("Juana");
        p3.setEdad(25);
        p3.setSexo('F');
        p3.setIntereses("Voley, Tenis y Futbol");
        
        System.out.println("Nombre: "+p3.getNombre());
        System.out.println("Edad: "+p3.getEdad());
        System.out.println("Sexo: "+p3.getSexo());
        System.out.println("Intereses: "+p3.getIntereses());
        */
        Persona x1 = new Persona();

        x1.setNombre("    ");
        x1.setEdad(-5);
        x1.setSexo('Z');
        x1.setIntereses("Estudia ing. sistemas");
        
        System.out.println("Nombre: "+x1.getNombre());
        System.out.println("Edad: "+x1.getEdad());
        System.out.println("Sexo: "+x1.getSexo());
        System.out.println("Intereses: "+x1.getIntereses());
    }
    
}
