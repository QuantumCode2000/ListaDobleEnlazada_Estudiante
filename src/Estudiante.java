import java.util.Calendar;
import java.util.GregorianCalendar;

class Estudiante {
    String ci,nombre,carrera;
    GregorianCalendar fnacimiento;
    int anioIngreso;
    public Estudiante()
    {ci = null ; nombre = null ; carrera = null; anioIngreso=0;fnacimiento=new GregorianCalendar(); }
    public void leer()
    {	System.out.println("C.I.=");
        ci=Leer.dato();
        System.out.println("Nombre=");
        nombre=Leer.dato();
        System.out.println("Carrera =");
        carrera=Leer.dato();
        System.out.println("fecha de Nacimiento");
        System.out.println("Año = ");
        int año=Leer.datoInt();
        System.out.println("Dia = ");
        int dia=Leer.datoInt();
        System.out.println("Mes = ");
        int mes=Leer.datoInt();
        fnacimiento .set(año,mes,dia);
    }


    public void mostrar()
    { System.out.print("Anio Ingreso= "+anioIngreso+"C.I.= "+ci+ "\n Nombre= " +nombre +"\n Carrera= "+carrera+"\n Año= "+ fnacimiento.get(Calendar.YEAR)+ "\n Mes= "+ fnacimiento.get(Calendar.MONTH)+"\n Dia= "+ fnacimiento.get(Calendar.DAY_OF_MONTH));
    }

}
