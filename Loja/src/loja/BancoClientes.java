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
    
    public void AdicionaCliente(Cliente C){
        Banco_Clientes.add(C);
    }
    
    public int ProcuraIndex(int codigo){
        for(int i=0;i<Banco_Clientes.size();i++){ 
            if(codigo == (Banco_Clientes.get(i)).GetCodigo()){
                return i;
            }
        }
        return -1;
    }
    
    public boolean AlteraCliente(int codigo,int NovoCodigo,String nome,String cpf,String email,String senha,String endereco){
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
}
