package app;

import app1.Tela1;
import javax.swing.JOptionPane;
public abstract class App {
    private String Nome;
    private int idade;
    private float peso;
    private String endereco;
    private int telefone;
    private String email;
    private String senha;
public void setNome(String Nome){
   this.Nome = Nome;  
}

public String getNome() {
    return this.Nome;
}    
public void setEmail(String email){
   this.email = email;  
}

public String getEmail() {
    return this.email;
}    
public void setSenha(String senha){
   this.senha = senha;  
}

public String getSenha() {
    return this.senha;
}    
public void setIdade(int idade){
    this.idade = idade;
}
public int getIdade(){
    return this.idade;
}
public void setEndereco(String endereco){
    this.endereco = endereco;
}
public String getEndereco(){
    return this.endereco;
}
public int getTelefone(){
    return this.telefone;
}
public float getPeso(){
    return this.peso;
}
public abstract void Digitar(String nome,int idade, String endereco, int telefone);
public abstract void Enviar(String email, String senha);
public static void main(String args[]){
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
        JOptionPane.showMessageDialog(null,"Preencha o formulário a seguir para continuar com o seu acesso.");
}
}

