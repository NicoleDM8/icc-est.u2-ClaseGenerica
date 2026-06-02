package models;

public class Par <K,V> {
    private K clave;
    private V valor;
    public Par( K clave, V valor ){
        this.clave = clave;
        this.valor = valor;
    }
    public void guardarValor( V valor){
        this.valor = valor;
    }
    public K obtenerClave(){
        return this.clave;
    }
    public V obtenerValor(){
        return this.valor;
    }
}
