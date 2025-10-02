public class veiculo {

    private String nome;
    private String ano;
    private String modelo;
    private String cor;
    private String placa;
    private boolean unicoDono;


    public veiculo(String nome, String ano, String modelo, String cor, String placa, boolean unicoDono) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.unicoDono = unicoDono;
    }


    public veiculo () {

    }   
    
    
    public void  salvar () {
        System.out.println("Veículo salvo com sucesso!");
    }
    public void  alterar () {
        System.out.println("Veículo alterado com sucesso!");
    }
    public void  excluir () {
        System.out.println("Veículo excluído com sucesso!");
    }
    public void pesquisa () {
        System.out.println("Veículo pesquisado com sucesso!");
    }
   
}
