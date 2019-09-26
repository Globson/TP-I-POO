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
public class Loja {
    public static void main(String[] args) {
        BancoVendas BVendas = new BancoVendas();
        Estoque Estoque1 = new Estoque();
        Venda v1 = new Venda(3,11,"14/09/2019","pendente");
        v1.SetProdutoVendido(1, 20, 1);
        Venda v2 = new Venda(4,24,"22/10/2010","concluida");
        v2.SetProdutoVendido(2,15, 1);
        BVendas.AdicionaVenda(v1);
        BVendas.AdicionaVenda(v2);
        BVendas.ListaVendas();
        Produto p1 = new Produto();
        p1.SetProduto(1, 20, 15, "monitor", "eletronico", "Monitor da OAC");
        Estoque1.AdicionaItem(p1);
        Produto p2 = new Produto();
        p2.SetProduto(2,15,10,"gabinete","Eletronico","Coolemaster");
        Estoque1.AdicionaItem(p2);
        Estoque1.ListaProdutos();
        BancoClientes BClientes = new BancoClientes();
        Cliente Saulin = new Cliente();
        Saulin.SetNomeCPF_Cliente("Saulin","11269691124");
        Saulin.SetCodigo(11);
        Saulin.SetEmail("saulaoSL@titia.com");
        Saulin.SetSenha("Setlagoaenois");
        Saulin.AdicionaEndereco("Rua ao lado do fim do mundo,666,CDI,SL");
        BClientes.AdicionaCliente(Saulin);
        Saulin = new Cliente();
        Saulin.SetNomeCPF_Cliente("Altamiro","11269691124");
        Saulin.SetCodigo(24);
        Saulin.SetEmail("altamirodoidao@titia.com");
        Saulin.SetSenha("altumiroCP");
        Saulin.AdicionaEndereco("Rua ao lado do fim do mundo,666,Nossa senhora do alem,Florestop");
        BClientes.AdicionaCliente(Saulin);
        
        BClientes.ListaClientes();
        
        
        
    }
    
}
