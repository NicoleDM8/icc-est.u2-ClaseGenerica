package models;

public class Par <K,V> {
    private K clave;
    private V valor;
    public void Par( clave: K){
        this.clave = clave;
    } 
    public void guardarValor( valor : V){
        this.valor = valor;
    }
    public K obtenerClave(){
        return this.clave;
    }
    public V obtenerValor(){
        return this.valor;
    }
}
