public class Moto extends veiculo {

    private String cilindradas;
   

    public Moto(String nome, String ano, String modelo, String cor, String placa, boolean unicoDono, String cilindradas) {
        super(nome, ano, modelo, cor, placa, unicoDono);
        this.cilindradas = cilindradas;
    }

    public Moto () {

    }

    @Override
    public void alterar() {
        System.out.println("Alterando moto -------<>");
        
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo moto ------<>");
        
    }

    @Override
    public void pesquisa() {
        System.out.println("Pesquisando moto ----<>");
        
    }

    @Override
    public void salvar() {
        System.out.println("Salvando moto ------<>");
        
    }

    


}
