package school.cesar.nib.guis;

import school.cesar.nib.entities.Cliente;
import school.cesar.nib.repository.ClienteRepository;
import school.cesar.nib.services.ClienteService;

import java.util.Scanner;

public class ClienteGui {

    private ClienteService clienteService;

    public ClienteGui(){
        clienteService = new ClienteService();
    }

    public void exibemenu(){
        int opcao = 0;
        Scanner teclado = new Scanner(System.in);
        do{
            System.out.println("Selecione a opção desejada:");
            System.out.println("1-------- CADASTRAR CLIENTE");
            System.out.println("2-------- BUSCAR CLIENTE");
            System.out.println("3-------- SAIR");

             opcao = teclado.nextInt();

             switch (opcao){
                 case 1:
                     salvar(teclado);
                     break;
                 case 2:
                     buscar(teclado);
                     break;
                 case 3:
                     break;

             }

        }while (opcao != 3);

        System.out.println("Obrigado por usar o NIB");
        teclado.close();


    }

    private void salvar (Scanner teclado){
        System.out.println("Digite o Cpf do cliente");
        String cpf = teclado.next();

        System.out.println("Digite o nome do cliente");
        String nome = teclado.next();

        Cliente cliente = new Cliente(cpf,nome,null);

        boolean clientefoicadastrado = clienteService.salvar(cliente);

        if (clientefoicadastrado){
            System.out.println("Cliente foi cadastrado com sucesso!");
        } else{
            System.out.println("Erro ao cadastrar o cliente. Verifique os dados e tente novamente!");
        }


    }
    private void buscar (Scanner teclado){
        System.out.println("Digite o Cpf:");
        String cpf = teclado.next();
        Cliente cliente = clienteService.buscar(cpf);
        if (cliente == null){
            System.out.println("Cliente não encontrado!");

        }else{
            System.out.println("Cliente "+cliente);
        }
    }
}
