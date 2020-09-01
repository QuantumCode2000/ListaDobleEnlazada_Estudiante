import java.util.Calendar;

public class Operaciones {
    // Insertar N nodos
    public void insertarN(Lista L) {
        System.out.println("No. nodos= ");
        int nn = Leer.datoInt();
        for (int i = 1; i <= nn; i++) {
            System.out.print("Dato= ");
            Estudiante d = new Estudiante();
            d.leer();
            L.insertar(d);
        }
    }
    public void insertarFin(Lista L, Estudiante x)
    {  // Conectar el nuevo nodo a la lista
        if(L.listaVacia()) { // Caso1: lista vacía
            L.insertar(x);
        }
        else {// Caso2: lista no vacía
            Nodo p=L.primero;
            while(p.sig!=null) { p=p.sig;
            }
            L.insertar2(p, x);
        }
    }

    // MOSTRAR
    public void mostrar(Lista L) {
        Nodo p = L.primero;
        while (p != null) {
            System.out.println("Dato:  ");
            p.dato.mostrar();
            p = p.sig;
        }
    }

    // MOSTRAR CI , NOMBRE Y EDAD DE CADA ESTUDIANTE
    public void edad(Lista L) {
        if (!L.listaVacia()) {
            Nodo p = L.primero;
            while (p != null) {
                System.out.println("Edad = "+(2020-p.dato.fnacimiento.get(Calendar.YEAR))+"\n Ci = "+p.dato.ci+"\n Nombre = "+p.dato.nombre);
                p = p.sig;
            }

        }
    }

    public String[] extraerCarreras(Lista L) {

            Nodo p = L.primero;
            String vc[] = new String[100];
            int iterador = 1;
            vc[0]=p.dato.carrera;
            while (p != null) {
                if (p.dato.carrera != vc[0]) {
                    p.dato.carrera = vc[iterador];
                    iterador++;
                    p = p.sig;
                }
            }

        return vc;
    }
    public int longitud(Lista L) {

        Nodo p = L.primero;
        String vc[] = new String[100];
        int iterador = 1;
        vc[0]=p.dato.carrera;
        while (p != null) {
            if (p.dato.carrera != vc[0]) {
                p.dato.carrera = vc[iterador];
                iterador++;
                p = p.sig;
            }
        }

        return iterador;
    }
    public void contarPorCarrera(Lista L) {
        if (!L.listaVacia()) {
            int l = longitud(L);
            String[] vc = extraerCarreras(L);
            Nodo p = L.primero;
            int cont = 0;
            for (int i = 0; i < l; i++) {
                while (p != null) {
                    if(p.dato.carrera == vc[i]) {
                        cont++;
                    }
                    System.out.println("CARRERA DE "+vc[i]+" HAY "+cont+" ESTUDIANTES;");
                }
            }

        }
    }

    // ELMINAR NODO DADO UN CI
    public void eliminarDadoCI (Lista L, String ci) {
        if(ci.equals(L.primero.dato.ci)) {
            // Caso1: primer nodo
            L.eliminar();
        }
        else {
            // Caso2: nodo distinto del primero
            Nodo p=L.primero;
            while(p.sig!=null && p.sig.dato.ci != ci) {
                p=p.sig;
            }
            if(p.sig!=null) {
                L.eliminar2(p);
            }
        }
    }



}


