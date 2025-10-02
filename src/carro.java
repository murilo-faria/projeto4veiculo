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
        public void exibirInformacoes() {
            System.out.println("Nome: " + getNome());
            System.out.println("Ano: " + getAno());
            System.out.println("Modelo: " + getModelo());
            System.out.println("Cor: " + getCor());
            System.out.println("Placa: " + getPlaca());
            System.out.println("Único dono: " + isUnicoDono());
            System.out.println("Motorização: " + this.motorização);
            System.out.println("Qtde marchas: " + this.qtde_marchas);
            System.out.println("Opcionais: " + this.opcionais);
            if (getCategoria() != null) {
                System.out.println("Categoria: " + getCategoria().getDescricao());
            }
            if (getGaragem() != null) {
                System.out.println("Garagem: " + getGaragem().getNome() + ", Cidade: " + getGaragem().getCidade());
            }
        }
    }



    
