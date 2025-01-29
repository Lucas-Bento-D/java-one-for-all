package academy.bentodev.javaoneforall.Collections.Domain;

import java.util.Objects;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String serialNumber, String brand){
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "serialNumber='" + serialNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    /**
     * Existem algumas regras para sobreescrita do método equals.
     * método precisa ser:
     * reflexivo: x.equals(x) precisa ser true pra tudo diferente de null
     * simétrico: para x e y diferentes de null, se x.equals(y) == true, logo, y.equals(x) == true
     * Transitividade: para x, y e z diferentes de null, se x.equals(y) == true e x.equals(z) == true, logo y.equals(z) == true
     * Consistente: x.equals(x) sempre retorna true se x for diferente de null
     * para x diferente de null, x.equals(null) tem que retornar false
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if (this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals((smartphone.serialNumber));
    }


    /**
     * Para sobreescrever o método hashCode, precisamos levar algumas regras em consideração
     * Se x.equals(y) == true, y.hashCode() == x.hashCode()
     * Se y.hashCode() == x.hashCode() não necessariamente o equals de y.hashCode(x) tem que ser true
     * x.equals(y) == false
     * y.hashCode() != x.hashCode() x.equals(y) deverá ser false
     * @return
     */
    @Override
    public int hashCode() {
        //0 para false, 1 para true
        return this.serialNumber == null ? 0 : this.serialNumber.hashCode() ;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }
}
