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
  
  public Cliente(String nome,String cpf){
      Nome = nome;
      if(cpf.length() == 11){
          CPF = cpf;
      }
  }
  
  public int SetCodigo(int codigo){
      if(codigo>0){
         Codigo = codigo;
         return 1;
      }
      return 0;
  }
  
  public int SetEmail(String email){
      if(email.contains("@")){
          Email = email;
          return 1;
      }
      return 0;
  }
  
  public int SetSenha(String senha){
      if(senha.length() < 8){
          return 0;
      }
      for(int i = 0;i<senha.length();i++){
          for(int j = 0;j<senha.length();j++){
              if(senha.charAt(i) == senha.charAt(j)){
                  return 0;
              }
          }
      }
      Senha = senha;
      return 1;
  }
  
  public int AdicionaEndereco(String endereco){
      for(int i = 0; i < Enderecos.size();i++){
          if(Enderecos.get(i).equals(endereco)){
              return 0;
          }
      }
      Enderecos.add(endereco);
      return 1;
  }
}

