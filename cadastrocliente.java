
package cadastrocliente;

public class CadastroCliente {

    public static void main(String[] args) {
        
        // instanciar
        UICadastroCliente formulario = new UICadastroCliente();
        Pessoa clente = new Pessoa(formulario.nome, formulario.cpf, formulario.endereco, formulario.cidade, formulario.estado);
       
    }
    
}
