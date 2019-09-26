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
    
    public boolean AdicionaItem(Produto Item){
        for(int i=0;i<Estoque.size();i++){
            if(Estoque.get(i).Get_Codigo() == Item.Get_Codigo()){
                return false; //produto ja existente
            }
        }
        Estoque.add(Item);
        return true;
    }
     
    public int ProcuraIndex(int codigo){   //retorna indice de produto no arraylist caso produto com reespectivo codigo seja encontrado, retorna -1 caso n encontre
        for(int i=0;i<Estoque.size();i++){ 
            if(codigo == (Estoque.get(i)).Get_Codigo()){
                return i;
            }
        }
        return -1;
    }
    
    public boolean AlteraEstoque(int codigo,int Novocodigo,int quant,int preco_uni,String Descri,String Categ,String particu){  //retorna 1 caso alteracoes sejam realizadas, 0 caso não.
        int a = ProcuraIndex(codigo);
        if(a>-1){
            return Estoque.get(a).SetProduto(Novocodigo, quant, preco_uni, Descri, Categ, particu);   
        }
        return false;
    }
    
    public Produto GetProduto(int Index){ //sempre usar com procuraindex e verificar se retorno é != -1//
        return Estoque.get(Index);
    }
    public void ListaProdutos(){
        System.out.println("---Inicio da listagem de produtos:--");
        for(int i=0;i<Estoque.size();i++){
            System.out.println("----------Produto "+(i+1)+" ------------");
            System.out.println("Descricao: "+Estoque.get(i).Get_Descricao());
            System.out.println("Preco unitario: "+Estoque.get(i).Get_Preco());
            System.out.println("Codigo: "+Estoque.get(i).Get_Codigo());
            System.out.println("Categoria: "+Estoque.get(i).Get_Categoria());
            System.out.println("Quantidade: "+Estoque.get(i).Get_Quantidade());
            System.out.println("Particularidade: "+Estoque.get(i).Get_Particularidade());
            System.out.println("----------------------------------------");
        }
        System.out.println("---Fim da listagem de produtos---");
    }
}
