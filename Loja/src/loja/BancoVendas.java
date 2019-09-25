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
     
     public void AdicionaVenda(Venda V){
         BancoDVendas.add(V);
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
}
