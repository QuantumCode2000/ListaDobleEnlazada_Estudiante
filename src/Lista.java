public class Lista
{ // Campos
    Nodo primero;
    // Constructor por defecto
    public Lista()
    {  primero=null; }
    // Inicializar
    public void inicializar ()
    {  primero=null; }
    //Verificar si lista es vacía
    public boolean listaVacia()
    {  return primero==null; }
    // Insertar al principio de la lista
    public void insertar(Estudiante x)
    { // Crear el nuevo nodo
        Nodo nuevo=new Nodo(x);
// Conectar el nuevo nodo a la lista
        nuevo.sig=primero;
        primero=nuevo;
    }
    // Eliminar el primer nodo
    public void eliminar()
    {
        if(!listaVacia()) { // Lista no vacía
            primero=primero.sig;
        }
    }
    // Insertar un nodo en una posición distinta de la primera
    // pos dirección nodo inmediato anterior
    public void insertar2(Nodo pos, Estudiante x) {  // Crear el nuevo nodo
        Nodo nuevo=new Nodo(x);
        // Conectar el nuevo nodo a la lista
        nuevo.ant=pos;
        nuevo.sig=pos.sig;
        if(pos.sig!=null)  { // El nuevo nodo no será el último
            pos.sig.ant=nuevo;}
        pos.sig=nuevo;
    }

    // Eliminar un nodo distinto del primero
    // pos es la dirección del nodo a eliminar
    public void eliminar2(Nodo pos) {
        Nodo a=pos.ant; // a =dirección del nodo anterior al que se elimina
        Nodo s=pos.sig;  // s =dirección del nodo siguiente al que se elimina
        a.sig=s;
        if(s!=null) {
            s.ant=a; // Si el nuevo nodo no es el último
        }
    }
}
