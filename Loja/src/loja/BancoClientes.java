/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;
import java.util.ArrayList;
/**
 *
 * @author grobs
 */
public class BancoClientes {
    private ArrayList<Cliente> Banco_Clientes;
    
    public BancoClientes(){
        Banco_Clientes = new ArrayList<Cliente>();
    }
    
    public boolean AdicionaCliente(Cliente C){
        for(int i=0;i<Banco_Clientes.size();i++){
            if(Banco_Clientes.get(i).GetCodigo() == C.GetCodigo() || Banco_Clientes.get(i).GetEmail().equals(C.GetEmail())){
                return false; //cliente ja existe;
            }
        }
        Banco_Clientes.add(C);
        return true;
    }
    
    public int ProcuraIndex(int codigo){
        for(int i=0;i<Banco_Clientes.size();i++){ 
            if(codigo == (Banco_Clientes.get(i)).GetCodigo()){
                return i;
            }
        }
        return -1;
    }
    
    public boolean AlteraCliente(int codigo,String nome,String cpf,String email,String senha,String endereco){
        int a = ProcuraIndex(codigo);
        if(a>-1){
            if(Banco_Clientes.get(a).SetNomeCPF_Cliente(nome,cpf) && Banco_Clientes.get(a).SetEmail(email) && Banco_Clientes.get(a).SetSenha(senha) && Banco_Clientes.get(a).AdicionaEndereco(endereco)){
            return true;}
        }
        return false;
    }
    
    public Cliente GetBancoCliente(int index){ //sempre utilizar funcao procuraindex e verificar se retorno != -1//
        return Banco_Clientes.get(index);
    }
    
    public void ListaClientes(){
        System.out.println("---Inicio da listagem de clientes:--");
        for(int i=0;i<Banco_Clientes.size();i++){
            System.out.println("----------Cliente "+(i+1)+" ------------");
            System.out.println("Nome: "+Banco_Clientes.get(i).GetNome());
            System.out.println("CPF: "+Banco_Clientes.get(i).GetCPF());
            System.out.println("Codigo: "+Banco_Clientes.get(i).GetCodigo());
            System.out.println("Email: "+Banco_Clientes.get(i).GetEmail());
            System.out.println("Endereco: "+Banco_Clientes.get(i).GetPrimeiroEndereco());
            System.out.println("----------------------------------------");
        }
        System.out.println("---Fim da listagem de clientes---");
    }
    
    public ArrayList<Cliente> getListaClientes(){
        return Banco_Clientes;
    }
}
