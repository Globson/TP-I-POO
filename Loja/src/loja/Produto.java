/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;

/**
 *
 * @author grobs
 */
public class Produto{
  private static int CodigoProduto;
  private static int Quantidade;
  private static int preco;
  private static String Descricao;
  private static String Categoria;
  private static String Particularidade; 
  
  public Produto(int codigo,int quant,int preco_uni,String Descri,String Categ,String particu){
      if(codigo>0 && preco_uni>0){
      CodigoProduto = codigo;
      Quantidade = quant;
      preco = preco_uni;
      Descricao = Descri;
      Categoria = Categ;
      Particularidade = particu;
      }
  }
  
  public int Get_Codigo(){
      return CodigoProduto;
  }
  public int Get_Quantidade(){
      return Quantidade;
  }
  public int Get_Preco(){
      return preco;
  }
  public String Get_Descricao(){
      return Descricao;
  }
  public String Get_Categoria(){
      return Categoria;
  }
  public String Get_Particularidade(){
      return Particularidade;
  }
}
