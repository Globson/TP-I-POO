/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;
import java.util.ArrayList;

public class Cliente{
  private static String Nome;
  private static int Codigo;
  private static String CPF;
  private ArrayList<String> Enderecos = new ArrayList<String>();
  private static String Email;
  private static String Senha;
  
  public boolean SetNomeCPF_Cliente(String nome,String cpf){
      Nome = nome;
      if(cpf.length() == 11){
          CPF = cpf;
          return true;
      }
      return false;
  }
  
  public boolean SetCodigo(int codigo){
      if(codigo>0){
         Codigo = codigo;
         return true;
      }
      return false;
  }
  
  public boolean SetEmail(String email){
      if(email.contains("@")){
          Email = email;
          return true;
      }
      return false;
  }
  
  public boolean SetSenha(String senha){
      if(senha.length() < 8){
          return false;
      }
      for(int i = 0;i<senha.length();i++){
          for(int j = 0;j<senha.length();j++){
              if(senha.charAt(i) == senha.charAt(j)){
                  return false;
              }
          }
      }
      Senha = senha;
      return true;
  }
  
  public boolean AdicionaEndereco(String endereco){
      for(int i = 0; i < Enderecos.size();i++){
          if(Enderecos.get(i).equals(endereco)){
              return false;
          }
      }
      Enderecos.add(endereco);
      return true;
  }
    
  public int GetCodigo(){
      return Codigo;
  }
}

