package bytebank.encapsulado;

public class ByteBankEncapsulado {

    public static void main(String[] args) {
       /*Cliente alexandre = new Cliente();
       
        alexandre.dados();*/
       
      
        Conta conta = new Conta(1333, 24226);
        conta.informações();

        
        /*alexandre.setNome("Alexandre Augusto");
        conta.setTitular(alexandre);
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());

        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programador");*/

       
    }

}
