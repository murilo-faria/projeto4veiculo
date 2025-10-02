public class carro extends veiculo {

    private String motorização;
    private String qtde_marchas;
    private String opcionais;

    public carro(String nome, String ano, String modelo, String cor, String placa, boolean unicoDono, String motorização, String qtde_marchas, String opcionais) {
        super(nome, ano, modelo, cor, placa, unicoDono);
        this.motorização = motorização;
        this.qtde_marchas = qtde_marchas;
        this.opcionais = opcionais;
    }

public carro () {

    }

    @Override
    public void alterar() {
        System.out.println("Alterando carro ----->");
        
    }

    @Override
    public void excluir() {
        System.out.println("Excluindo carro ----->");
        
    }

    @Override
    public void pesquisa() {
        System.out.println("Pesquisando carro -------->");
        
    }

        @Override
        public void salvar() {
            System.out.println("Carro salvo com sucesso! ---->");
        }
    }



    
