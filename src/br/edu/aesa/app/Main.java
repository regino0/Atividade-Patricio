package br.edu.aesa.app;

import br.edu.aesa.model.Veiculo;
import br.edu.aesa.service.GerenciadorVeiculos;

import java.util.Scanner;

public class Main {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    GerenciadorVeiculos g1 = new GerenciadorVeiculos();

while (true){
    System.out.println("GERENCIADOR DE VEÍCULOS");
    System.out.println(" ");
    System.out.println("ESCOLHA UMA OPÇÃO");
    System.out.println("[1] Cadastrar Veículo");
    System.out.println("[2] Listar Todos");
    System.out.println("[3] Buscar por ID");
    System.out.println("[4] Atualizar Veículo");
    System.out.println("[5] Remover Veículo");
    System.out.println("[0] Sair");
    int opcao = scanner.nextInt();
    switch (opcao){
        case 0: System.out.println("Saindo do sistema");
            System.exit(0);break;
        case 1:
            System.out.println("Qual o ID");
            int id=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Qual a placa do seu carro?");
            String placa = scanner.nextLine();
            System.out.print("Digite o Modelo: ");
            String modelo = scanner.nextLine();
            System.out.print("Digite a Marca: ");
            String marca = scanner.nextLine();
            System.out.print("Digite o Ano: ");
            int ano = scanner.nextInt();
            Veiculo novoCarro = new Veiculo(id, placa, modelo, marca, ano);
            g1.cadastrarVeiculo(novoCarro);
        case 2: g1.ListarVeiculos(); break;
        case 3:
            System.out.print("Digite o ID que deseja buscar: ");
            int idBusca = scanner.nextInt();
            Veiculo carroEncontrado = g1.buscarPorId(idBusca);
            if (carroEncontrado != null) {
                System.out.println("Veículo encontrado: " + carroEncontrado.exibirDetalhes());
            } else {
                System.out.println("Erro: Nenhum veículo encontrado com esse ID!");}
            break;
        case 4:
            System.out.print("Digite o ID do veículo que deseja atualizar: ");
            int idAtualizar = scanner.nextInt();
            Veiculo existente = g1.buscarPorId(idAtualizar);

            if (existente == null) {
                System.out.println("Erro: Nenhum veículo encontrado com esse ID!");
            } else {
                scanner.nextLine();
                System.out.println("Veículo encontrado! Digite os novos dados:");
                System.out.print("Nova Placa: ");
                String novaPlaca = scanner.nextLine();
                System.out.print("novo modelo: ");
                String novoModelo = scanner.nextLine();
                System.out.print("nova marca: ");
                String novaMarca = scanner.nextLine();
                System.out.println("novo ano");
                String novoAno = scanner.nextInt();

                Veiculo novosDados = new Veiculo(idAtualizar, novaPlaca, novoModelo, novaMarca, novoAno);
                g1.atualizar(idAtualizar, novosDados);
            }
            break;

        default:
            System.out.println("Opção Invalida!");
            System.out.println("tente novamente");break;




    }

}




}

}
