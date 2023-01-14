package bytebank.encapsulado;


import com.sun.org.apache.xalan.internal.xsltc.compiler.Constants;
import java.time.temporal.TemporalAdjusters;
import java.util.Random;
import javax.swing.JOptionPane;


public class Conta extends Cliente{
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
   static int total;
   private String tipo;
   private boolean status;
   Random aleatorio = new Random();
   
   public Conta(int agencia, int numero){
       //Conta.total++;
       //System.out.println("O total de contas é: " + Conta.total );
       /*this.agencia = agencia;
       this.numero = numero;*/
       this.setAgencia(1333);
       this.setNumero(aleatorio.nextInt(10000)*9);
       //System.out.println("Estou criando uma conta " + this.numero);
   }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return status;
    }
    
    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }

    
 
    
   /* public boolean saca(double valor){
        if(this.saldo >= valor){
            this.saldo =- valor;
            return true;
        }else{
            return false;
        }      
        
        
    }*/
    public boolean transfere(double valor, Conta destino){
        valor = Double.parseDouble(JOptionPane.showInputDialog("Qual valor deseja transferir? "));
        
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.depositar(0);
            return true;
        }else{
            return false;
        }
        
    }
     public double getSaldo(){
         return this.saldo;
     }
     
     public int getNumero(){
         return this.numero;
     }
     
     public void setNumero(int novoNumero){
          if(agencia<=0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;            
        }
      
    
        this.numero = novoNumero;
        
    
    }

    public int getAgencia() {
       
        return this.agencia;
    }

    public void setAgencia(int agencia) {
         if(agencia<=0){
            System.out.println("Não pode valor menor ou igual a 0");
            return;            
        }
      
        this.agencia = agencia;
    }     

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
    
    public static int getTotal(){
      
        return Conta.total;
    }
    
    public void status() {
        
        if (isStatus()== true) {
            
            JOptionPane.showMessageDialog(null,"Dados da Conta\n" +
            "Dono Da conta: " + this.getNome()+
            "\nCPF: " + this.getCpf()+
            "\n Agencia: " + this.getAgencia() +
            "\n Conta: " + this.getNumero() +
            "\n Tipo da Conta: " + this.getTipo() +
            "\n Saldo da Conta: " + this.getSaldo() +
            "\n Status da Conta: " + this.isStatus());
        }
        
        if (isStatus()== false) {
            JOptionPane.showMessageDialog(null,"Dados da Conta\n" +
            "Dono Da conta: " +
            "\n Agencia: "  +
            "\n Conta: " +
            "\n Tipo da Conta: " +
            "\n Saldo da Conta: " +
            "\n Status da Conta: " + this.isStatus());
        }
    }

    

    public void abrirConta(String t) {
   
        t = "cc";
        String p = "p";
        
        this.dados();
        //int j;
        //this.setNome( JOptionPane.showInputDialog("Qual é o seu nome?"));
        
        this.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor que você deseja depositar? ")));
      
        if(this.tipo.equals(p)){

            JOptionPane.showMessageDialog(null, this.getNome() + " sua Conta Polpança está aberta");
            setStatus(true);
        }

        if (this.tipo.equals(t)){

            JOptionPane.showMessageDialog(null,this.getNome() + " sua Conta Corrente está aberta");
            setStatus(true);
        }   
    }



    public void fecharConta() {
 
       // para fechar conta saldo tem que ser 0 

       int d = Integer.parseInt(JOptionPane.showInputDialog(null,"Deseja fechar a sua conta? \n 1- Sim\n 2- Não "));
       
       if(isStatus() == true && this.getSaldo() == 0 && d == 1) {
          
           setStatus(false);
           JOptionPane.showMessageDialog(null, "Sua conta foi fechada");
           
           /*FUNÇÃO PARA FECHAR O PROGRAMA
           System.exit(d);*/
        }

       // se tiver dinheiro na conta ele não permite fechar

       else if(this.getSaldo()> 0 ){
           
           JOptionPane.showMessageDialog(null, "Sua conta possui saldo você não pode fechar a conta");
        }
       
       // se saldo for negativo também não pode fechar

       else if (this.getSaldo() < 0) {

           JOptionPane.showMessageDialog(null,"Seu saldo é negativo impossivel fechar sua conta");
        }
       
       else{
           JOptionPane.showMessageDialog(null,"Sua conta continua aberta");
        }
    }



    public void depositar(float v) {

        if (isStatus() == true && this.getSaldo() >= 0) {
            v =(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor que você deseja depositar? ")));
            
            //this.saldo = getSaldo() + v; 
            this.saldo =+ v;
        }
       
        if (isStatus() == false) {
           JOptionPane.showMessageDialog(null,"Para realizar essa operação uma conta precisa estar aberta");
        }
    }
    
    

    public boolean sacar(float v) {
        if(this.isStatus() == true && this.saldo >= v && this.saldo > 0){
            v = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja sacar? "));
            this.saldo =- v;
            return true;
        }else{
            return false;
        }     
       /* if(this.isStatus() == true){
            
          v = Float.parseFloat(JOptionPane.showInputDialog("Qual valor deseja sacar? "));
        }
        
        if(this.getSaldo() > 0 && this.getSaldo() >= v){
           
           JOptionPane.showMessageDialog(null,"Saque realizado com Sucesso!!");
            this.saldo = this.getSaldo() - v;
        }
        
        else if (this.getSaldo() <= 0){
            JOptionPane.showMessageDialog(null,"Sem Saldo impossivel sacar");
        }
        
        else if (this.getSaldo() < v) {
            JOptionPane.showMessageDialog(null,"Impossivel sacar, valor superior ao seu saldo!!!!");
        }
        
        if (isStatus() == false) {
            JOptionPane.showMessageDialog(null,"Para realizar essa operação uma conta precisa estar aberta");
        }*/
    }


    public void pagarMensal(){

      // pagar mensalidade manutenção de conta
     
        //CONTA CORRENTE
        if(this.saldo <= 0 && this.saldo <= 5){
          JOptionPane.showMessageDialog(null,"Deposita ai que a gente pega");
      }
        
      if(isStatus()== true && this.saldo > 5 && "cc".equals(getTipo())){
           float c = 5;
      
          this.setSaldo(this.getSaldo() - c);
          JOptionPane.showMessageDialog(null,this.getNome() + 
          " O valor da sua mensalidade é " + c + " O saldo da sua conta é " + 
          this.getSaldo());
        }
      
        if (this.saldo < 0 && "p".equals(getTipo())) {
            JOptionPane.showMessageDialog(null,"Conta Polpança não tem taxas");
        }
        if (isStatus() == false) {
            
            JOptionPane.showMessageDialog(null,"Para realizar essa operação uma conta precisa estar aberta");
        }
    }
 
    public void informações(){
        
    
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
        //JOptionPane.showInputDialog(null, Menu);
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
         while(op != 7);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Insira um numero. Erro");
             //DETERMINE UMA FUNÇÃO PARA RETORNA ESSE METODO DENTRO DO CATCH
          JOptionPane.showInputDialog(null, Menu);
        }
    }
    
}
