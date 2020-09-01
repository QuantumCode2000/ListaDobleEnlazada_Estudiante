public class Principal {
    public static void main(String[] args) {

        Operaciones op=new Operaciones();
        Lista lis=new Lista();
        op.insertarN(lis);
        op.mostrar(lis);
        op.edad(lis);
        op.contarPorCarrera(lis);
        Estudiante estudiante = new Estudiante();
        estudiante.leer();
        op.insertarFin(lis, estudiante);
        System.out.println("Dame el CI");
        String ci = Leer.dato();
        op.eliminarDadoCI(lis, ci);
        op.mostrar(lis);
    }
}
