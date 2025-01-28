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

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, brand);
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
