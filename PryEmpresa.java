

package com.mycompany.pryempresa;


public class PryEmpresa {

    public static void main(String[] args) {
      
        CrearEmpleados empleado1 = new CrearEmpleados("Pedro", "1102345678", 1500.00);
        CrearEmpleados empleado2 = new CrearEmpleados("Infante", "1108765432", 1800.00);

       
        Empresa empresa1 = new Empresa("ppinc", "1234567890", "calleET", "pp1@hotmail.com");

        
        empresa1.agregarEmpleado(empleado1);
        empresa1.agregarEmpleado(empleado2);

       
        empresa1.mostrarInformacion();
        
    }
        
        
    }

