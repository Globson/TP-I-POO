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
import java.util.ArrayList;
public class Venda{
  private int CodigoVenda;
  private int CodigoCliente;
  private String Status;
  private String Data;
  private ArrayList<Integer> CodigoProduto;
  private ArrayList<Double> PrecoProduto;  //Index de cada produto mantido nos 3 arraylists//
  private ArrayList<Integer> QuantidadeProduto;
  
  public Venda(int codigoV,int codigoC,String data,String status){
    CodigoVenda = codigoV;
    CodigoCliente = codigoC;
    Data = data;
    Status = status;
    CodigoProduto = new ArrayList<Integer>();
    PrecoProduto = new ArrayList<Double>();
    QuantidadeProduto = new ArrayList<Integer>();   
}
  
  public boolean SetProdutoVendido(int codigoP,int quantP,Estoque E){
      int indexProduto = E.ProcuraIndex(codigoP);
      double precoP;
      for(int i=0;i<CodigoProduto.size();i++){
          if(codigoP == CodigoProduto.get(i)){
              return false;  //produto ja cadastrado em venda
          }
      }
      if(indexProduto == -1){ //verificando se codigo do produto encontra-se cadastrado no estoque.
          return false;
      }
      else{
          precoP = E.GetProduto(indexProduto).Get_Preco();
      }
      CodigoProduto.add(codigoP);
      PrecoProduto.add(precoP);
      QuantidadeProduto.add(quantP);
      return true;
  }
  
  public double ValorTotal(){
      double total = 0;
      for(int i=0;i<CodigoProduto.size();i++){
          total = total + (PrecoProduto.get(i) * QuantidadeProduto.get(i));
      }
      return total;
  }
  
  public int GetCodigoVenda(){
      return CodigoVenda;
  }
  
  public boolean AlteraStatus(String statusNovo){
      if(statusNovo.equals("pendente") || statusNovo.equals("em andamento") || statusNovo.equals("entregue")){
          Status = statusNovo;
          return true;
      }
      return false;
  }
  
  
  public int GetCodigoC(){
      return CodigoCliente;
  }
  public String GetData(){
      return Data;
  }
  public String GetStatus(){
      return Status;
  }
  public void PrintaProdutos(){
      System.out.println("\t---Inicio de lista de produtos---");
      for(int i = 0;i<CodigoProduto.size();i++){
          System.out.println("\t--------- Item "+(i+1)+" ---------");
          System.out.println("\tCodigo do produto: "+CodigoProduto.get(i));
          System.out.println("\tPreco do produto (unidade): "+PrecoProduto.get(i));
          System.out.println("\tQuantidade do produto: "+QuantidadeProduto.get(i));
          System.out.println("\t------------------------------");
      }
      System.out.println("\t---Fim de lista de produtos---");
  }
}
