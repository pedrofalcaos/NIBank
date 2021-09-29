package school.cesar.nib.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Conta {

    private String Numero;
    private double saldo;
    private String senha;

    public void creditar(double valor){
        saldo +=valor;
    }

    public void debitar (double valor){
        saldo -=valor;
    }

}
