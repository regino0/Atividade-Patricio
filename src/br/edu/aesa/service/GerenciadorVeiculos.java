package br.edu.aesa.service;
import br.edu.aesa.model.Veiculo;
import java.util.ArrayList;
public class GerenciadorVeiculos {
    private ArrayList<Veiculo> listaCarros = new ArrayList<>();


    public void cadastrarVeiculo (Veiculo novoVeiculo){
    boolean IdExistente = false;
    for (Veiculo v : listaCarros){
        if(v.getId()==novoVeiculo.getId()){
            IdExistente=true;
        }
    }
    if (IdExistente){
        System.out.println("Erro: Já existe um veículo com esse ID!");
    }
    else {listaCarros.add(novoVeiculo);
        System.out.println("Veículo cadastrado com sucesso!");
    }
    }
    public void ListarVeiculos () {
    if (listaCarros.isEmpty()){
        System.out.println("Nenhum veículo cadastrado");
    }
    else {
        System.out.println("LISTA DE VEICULOS");
        for (Veiculo v: listaCarros){
            System.out.println(v.exibirDetalhes());}
    }
    }

    public void atualizar(int id, Veiculo novosDados) {
        boolean idEncontrado = false;
        for (Veiculo v : listaCarros) {
            if (v.getId() == id) {
                v.setPlaca(novosDados.getPlaca());
                v.setModelo(novosDados.getModelo());
                v.setMarca(novosDados.getMarca());
                v.setAno(novosDados.getAno());
                idEncontrado = true;
                System.out.println("Veículo atualizado com sucesso!");
                break;
            }
        }
        if (idEncontrado == false) {
            System.out.println("Erro: Nenhum veículo encontrado com esse ID!");
        }
    }

    public void remover(int id) {
        boolean encontrado = false;

        for (int i = 0; i < listaCarros.size(); i++) {
            Veiculo v = listaCarros.get(i);

            if (v.getId() == id) {
                listaCarros.remove(i);
                encontrado = true;
                System.out.println("Veículo removid o com sucesso!");
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Erro: Nenhum veículo encontrado com esse ID!");
        }
    }

public Veiculo buscarPorId(int id){
        for (Veiculo v :listaCarros) {
            if (v.getId()==id){
                return v;
            }
        } return null;
}







}

