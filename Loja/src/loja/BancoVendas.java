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
public class BancoVendas {
     private ArrayList<Venda> BancoDVendas;
     
     public BancoVendas(){
         BancoDVendas = new ArrayList<Venda>();
     }
     
     public boolean AdicionaVenda(Venda V,BancoClientes C){ // funcao verifica se codigo de cliente existe para cadastrar venda.
         for(int i=0;i<BancoDVendas.size();i++){
             if(BancoDVendas.get(i).GetCodigoV() == V.GetCodigoC()){
                 return false;
             }
         }
         if(C.ProcuraIndex(V.GetCodigoC()) != -1){
            BancoDVendas.add(V);
            return true; 
         }
         else{
             return false;
         }
     }
     
     public int ProcuraIndex(int codigoV){
         for(int i=0;i<BancoDVendas.size();i++){ 
            if(codigoV == (BancoDVendas.get(i)).GetCodigoVenda()){
                return i;
            }
        }
        return -1;
     }
     
     public boolean AlteraStatusVenda(int codigoV,String statusNovo){ 
         int a = ProcuraIndex(codigoV);
         if(a>-1){
             return BancoDVendas.get(a).AlteraStatus(statusNovo);
         }
         return false;
     }
     
     public Venda GetVenda(int index){   //sempre utilizar Procuraindex e verificar se retorno é != de -1//
         return BancoDVendas.get(index);
     }
     
     public void ListaVendas(){
         System.out.println("---Inicio da listagem de vendas:--");
         for(int i =0; i<BancoDVendas.size();i++){
             System.out.println("----------Venda "+(i+1)+" ------------");
             System.out.println("Codigo da venda: "+BancoDVendas.get(i).GetCodigoV());
             System.out.println("Codigo do Cliente: "+BancoDVendas.get(i).GetCodigoC());
             System.out.println("Data da venda: "+BancoDVendas.get(i).GetData());
             System.out.println("Status: "+BancoDVendas.get(i).GetStatus());
             BancoDVendas.get(i).PrintaProdutos();
             System.out.println("--------------------------------------");
         }
         System.out.println("---Fim da listagem de vendas---");
     }
}
