package school.cesar.nib.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



public class Poupança extends Conta {

    public void renderJuros(){
        double saldoAtual = getSaldo();
        setSaldo(saldoAtual *=1.005);
    }
}
