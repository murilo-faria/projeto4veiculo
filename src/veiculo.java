public class veiculo {

    private String nome;
    private String ano;
    private String modelo;
    private String cor;
    private String placa;
    private boolean unicoDono;
    private categoria categoria;
    private garagem garagem;


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
        public String getNome() {
            return nome;
        }
        public String getAno() {
            return ano;
        }
        public String getModelo() {
            return modelo;
        }
        public String getCor() {
            return cor;
        }
        public String getPlaca() {
            return placa;
        }
        public boolean isUnicoDono() {
            return unicoDono;
        }
        public categoria getCategoria() {
            return categoria;
        }
        public void setCategoria(categoria categoria) {
            this.categoria = categoria;
        }
        public garagem getGaragem() {
            return garagem;
        }
        public void setGaragem(garagem garagem) {
            this.garagem = garagem;
        }
   
}
