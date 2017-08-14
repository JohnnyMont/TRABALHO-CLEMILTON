
package app1;
import app.App;
import javax.swing.JOptionPane;
public class App2 extends App {
    @Override
    public void Enviar(String email, String senha){
    super.setEmail(email);
    String email0 = super.getEmail();
    super.setSenha(senha);
    String senha0 = super.getSenha();
    System.out.println("Enviar as informações " +email0 +senha0);
    JOptionPane.showMessageDialog(null,"O email é: " +email+ " A senha é: " +senha);
} 
    @Override
    public void Digitar(String nome,int idade,String endereco, int telefone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
