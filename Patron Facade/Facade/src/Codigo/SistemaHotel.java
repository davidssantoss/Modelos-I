/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Codigo;

/**
 *
 * @author Estudiantes
 */
public class SistemaHotel {
    private Reserva reserva;
    private Habitacion habitacion;
    private ServicioPlus servicioPlus;

    public SistemaHotel() {
        this.reserva = new Reserva();
        this.habitacion = new Habitacion();
        this.servicioPlus = new ServicioPlus();
    }
    public void atencionCliente (Cliente c){
        System.out.println("Atendiendo al cliente ");
    }
    public void revisarHabitacion (Recepcionista r){
        System.out.println("El recepcionista esta revisando la habitacion ");
    }
    public void asignarEnReparacion (Admin a){
        System.out.println("Se esta reparando una habitacion ");
    }
    
    public void funciones(Persona p){
        if(p instanceof Cliente){
            atencionCliente((Cliente) p);
            
        } else if(p instanceof Recepcionista){
            revisarHabitacion((Recepcionista) p);
        } else{
            asignarEnReparacion((Admin) p);
        }
    }
    
}
