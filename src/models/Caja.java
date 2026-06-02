package models;

public class Caja <T> {
    private T contenido;
    public void Caja(objeto : T){
        this.contenido = objeto;
    }
    public void guardar(T objeto){
        this.contenido = objeto;
    }
    public T obtener() {
        return this.contenido;
    }
  
}
