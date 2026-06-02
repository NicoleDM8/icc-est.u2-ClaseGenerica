package models;

public class Caja <T> {
    private T contenido;
    public Caja( T objeto ){
        this.contenido = objeto;
    }
    public void guardar(T objeto){
        this.contenido = objeto;
    }
    public T obtener() {
        return this.contenido;
    }

    public boolean estaVacia(){
        return this.contenido == null;
    }
  
}
