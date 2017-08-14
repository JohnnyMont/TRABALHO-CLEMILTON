package app1;
import app.App;
import javax.swing.JOptionPane;
public class App1 extends App {
    @Override
    public void Digitar(String nome,int idade,String endereco, int telefone){
    super.setNome(nome);
    String nome0 = super.getNome();
    super.setIdade(idade);
    int idade0 = super.getIdade();
    super.setIdade(idade);
    float peso0 = super.getPeso();
    super.setIdade(idade);
    String endereco0 = super.getEndereco();
    super.setIdade(idade);
    int telefone0 = super.getTelefone();
    
    System.out.println("Digite as informações ");
    JOptionPane.showMessageDialog(null,"O nome é: " +nome+ "  A idade é: " +idade+ "  O endereço é: " +endereco+ "  O telefone é: " +telefone++ );
} 
    @Override
    public void Enviar(String email, String senha) {
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
}
