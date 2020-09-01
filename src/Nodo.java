public class Nodo
{ // Campos
    Estudiante dato;
    Nodo sig, ant;
    // Constructor por defecto
    public Nodo()
    {  dato=null;
        sig=null;
        ant=null;
    }
    // Constructor ordinario
    public Nodo (Estudiante vd)
    {  dato= vd;
        sig=null;
        ant=null;
    }
}
