
package bytebank.encapsulado;

import javax.swing.JOptionPane;


public class TestaValores extends Conta{
    
   //public static void main(String[] args) {
       
        /*Conta conta = new Conta (1213,12145);
        
        cont*/
        /* Conta conta = new Conta(1337, 24226);
        
        System.out.println(conta.getAgencia());
        
        conta.setAgencia(1232123);
        
        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);
        Conta conta4 = new Conta(2321, 12520 );
        
        System.out.println(Conta.total);
        System.out.println("total de contas é: "+Conta.getTotal());*/
    //}

    public TestaValores(int agencia, int numero) {
        super(agencia, numero);
    
     int op;
        
        String Menu = "Banco 7BANK\n"+
        "1- Cadastro \n"+
        "2- Status \n"+
        "3- Deposito \n"+
        "4- Sacar \n"+
        "5- Fechar Conta \n"+
        "6- Mensalidade \n"+       
        "7- Sair";
        try{
        
            do{
            
                op = Integer.parseInt(JOptionPane.showInputDialog(Menu));
        
            
                switch(op){
            
                
                    case 1:
                   
                        String x;
                    
                        x = JOptionPane.showInputDialog("Digite uma das opções para abertura de conta \n"
                        + " P- Polpança\n" + " cc- Corrente\n");
                    
                        this.setTipo(x);
                    
                    
                        abrirConta(this.getTipo());
                    break;
                
                
                    case 2:
                    
                        status();   
                    break;
            
                
                    case 3:
                    
                        depositar(0);    
                    break;
                
                
                    case 4:
                    
                        sacar(0);    
                    break;

                
                 
                    case 5:
                    
                        if (isStatus() == false) {
                      
                            JOptionPane.showMessageDialog(null,"Para realizar essa operação uma conta precisa estar aberta");
                      
                            break;
                        }
                    
                    
                        fecharConta();
                    break;
            
                
                    case 6:
                    
                    
                        pagarMensal();  
                    break;
                
                
                    case 7:
                    
                        JOptionPane.showMessageDialog(null,"Obrigado pela Preferência");
                    break;
               
                
                    default:
                    
                        JOptionPane.showMessageDialog(null,"Opção invaladia");
                    break;
                }
            }
        
            while(op != 9);
           }
        catch(NumberFormatException e){
        
            JOptionPane.showMessageDialog(null,"Insira um numero. Erro \n" + e);
        }
    } 
}

/* public static void main(String[] args) {
       
        /*Conta conta = new Conta (1213,12145);
        
        cont*/
        /* Conta conta = new Conta(1337, 24226);
        
        System.out.println(conta.getAgencia());
        
        conta.setAgencia(1232123);
        
        Conta conta2 = new Conta(1337, 16549);
        Conta conta3 = new Conta(2112, 14660);
        Conta conta4 = new Conta(2321, 12520 );
        
        System.out.println(Conta.total);
        System.out.println("total de contas é: "+Conta.getTotal());*/