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
  private int CodigoProduto;
  private int Quantidade;
  private double preco;
  private String Descricao;
  private String Categoria;
  private  String Particularidade; 
  
  
  public boolean SetProduto(int codigo,int quant,double preco_uni,String Descri,String Categ,String particu){
      if(codigo>0 && preco_uni>0){
      CodigoProduto = codigo;
      Quantidade = quant;
      preco = preco_uni;
      Descricao = Descri;
      Categoria = Categ;
      Particularidade = particu;
      return true;
      }
      return false;
  }
  
  public boolean VendeuProduto(int Quant){  //Função para venda de unidades de produto, ela subtrai quantidade vendida.
      if(Quantidade<= Quant){
          Quantidade = Quantidade - Quant;
          return true;
      }
      return false;
  }
  
  public int Get_Codigo(){
      return CodigoProduto;
  }
  public int Get_Quantidade(){
      return Quantidade;
  }
  public double Get_Preco(){
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
