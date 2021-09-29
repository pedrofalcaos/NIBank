package school.cesar.nib.services;

import school.cesar.nib.entities.Cliente;
import school.cesar.nib.repository.ClienteRepository;
import school.cesar.nib.util.CpfUtil;

public class ClienteService {
    private ClienteRepository clienteRepository;

    public boolean salvar(Cliente cliente){

        clienteRepository = ClienteRepository.getInstancia();

        if(!CpfUtil.isCPF(cliente.getCpf())){
            return false;
        }
        clienteRepository.salvar(cliente);
        return true;

    }
    public Cliente buscar (String cpf){
        return clienteRepository.buscar(cpf);
    }
}
