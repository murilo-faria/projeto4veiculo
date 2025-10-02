public class App {
    public static void main(String[] args) {

        veiculo veiculo1 = new veiculo("Veiculo1", "2019", "ModeloZ", "Azul", "JKL3456", false);
        veiculo1.salvar();
        veiculo1.alterar();
        veiculo1.excluir();
        veiculo1.pesquisa();

        carro carro1 = new carro("Carro1", "2020", "ModeloX", "Vermelho", "ABC1234", true, "Gasolina", "6", "Ar Condicionado, Direção Hidráulica");
        carro1.salvar();
        carro1.alterar();
        carro1.excluir();
        carro1.pesquisa();

        Moto moto1 = new Moto("Moto1", "2021", "ModeloY", "Preto", "XYZ5678", false, "150cc");
        moto1.salvar();
        moto1.alterar();
        moto1.excluir();
        moto1.pesquisa();



                 
    }
}

    

