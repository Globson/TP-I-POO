/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;
import java.util.ArrayList;

public class Cliente{
  private String Nome;
  private int Codigo;
  private String CPF;
  private String Email;
  private String Senha;
  private ArrayList<String> Enderecos = new ArrayList<String>();
  
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
  public String GetNome(){
      return Nome;
  }
  public String GetCPF(){
      return CPF;
  }
  public String GetEmail(){
      return Email;
  }
  public String GetPrimeiroEndereco(){
      if (Enderecos.size() > 0){
      return Enderecos.get(0);
      }
      return "NULL";
  }
}

