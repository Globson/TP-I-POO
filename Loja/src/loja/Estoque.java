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
public class Estoque {
    private static ArrayList<Produto> Estoque;
    
    public Estoque(){
       Estoque = new ArrayList<Produto>();
    }
    
    public void AdicionaItem(Produto Item){
        Estoque.add(Item);
    }
     
    public int ProcuraIndex(int codigo){   //retorna indice de produto no arraylist caso produto com reespectivo codigo seja encontrado, retorna -1 caso n encontre
        for(int i=0;i<Estoque.size();i++){ 
            if(codigo == (Estoque.get(i)).Get_Codigo()){
                return i;
            }
        }
        return -1;
    }
    
    public int AlteraEstoque(int codigo,int Novocodigo,int quant,int preco_uni,String Descri,String Categ,String particu){  //retorna 1 caso alteracoes sejam realizadas, 0 caso não.
        int a = ProcuraIndex(codigo);
        if(a>-1){
            return Estoque.get(a).SetProduto(Novocodigo, quant, preco_uni, Descri, Categ, particu);   
        }
        return 0;
    }
    
}
