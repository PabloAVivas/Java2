package Segundo_Semestre.Genericos.kata4;

public interface Identificable<K> {
    K getID();
    boolean tieneMismoID(K id);
}

