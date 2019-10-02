/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loja;
import java.util.Scanner;
/**
 *
 * @author grobs
 */
public class Loja {
    public static void menu(){
        System.out.println("1 - Produto->");
        System.out.println("2 - Cliente->");
        System.out.println("3 - Venda->");
        System.out.println("9 - Finalizar programa->");
    }
    public static void menuProduto(){
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar Produtos");
        System.out.println("3 - Listar Produtos com o nome");
        System.out.println("4 - Alterar cadastramento de Produto");
    }
    
   public static void menuCliente(){
       System.out.println("1 - Cadastrar Cliente");
       System.out.println("2 - Listar Clientes");
       System.out.println("3 - Alterar cadastramento de Cliente");
   }
   
   public static void menuVenda(){
       System.out.println("1 - Cadastrar Venda");
       System.out.println("2 - Listar Venda");
       System.out.println("3 - Alterar status de venda");
   }
    public static void main(String[] args) {    //testes comentados
        /*BancoVendas BVendas = new BancoVendas();
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
        //Estoque1.ListaProdutosNomes("ete");
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
        */
        Estoque Estoque1 = new Estoque();
        System.out.println("\tBem vindo a gestao comercial");
        Scanner sc = new Scanner(System.in);
        while(true){
           int a=0;
           menu();
           while(a!=1 && a!=2 && a!= 3 && a!=9){
                System.out.print("Entre com a opcao:");
                a = sc.nextInt();
                sc.nextLine();
                if(a!=1 && a!=2 && a!= 3 && a!=9){
                    System.out.println("Opcao invalida!");
                }
           }
           if(a == 1){
                int b = 0;
                menuProduto();
                while(b!=1 && b!=2 && b!= 3 && b!=4){
                    System.out.print("Entre com a opcao:");
                    b = sc.nextInt();
                    sc.nextLine();
                    if(b!=1 && b!=2 && b!= 3 && b!=4){
                        System.out.println("Opcao invalida!");
                    }
                }
                if(b==1){
                    Produto Temp = new Produto();
                    int codigo;
                    int quant;
                    double preco_uni;
                    String Descri = new String();
                    String Categ = new String();
                    String particularidade = new String();
                    System.out.print("Entre com o codigo do produto:");
                    codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entre com a quantidade do produto:");
                    quant = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entre com o preco unitario do produto:");
                    preco_uni = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Entre com a descricao do produto:");
                    Descri = sc.nextLine();
                    System.out.print("Entre com a categoria do produto:");
                    Categ = sc.nextLine();
                    System.out.print("Entre com a particularidade do produto:");
                    particularidade = sc.nextLine();
                    if(Temp.SetProduto(codigo, quant, preco_uni, Descri, Categ, particularidade)){
                        if(Estoque1.AdicionaItem(Temp)){
                            System.out.println("Produto adicionado com sucesso!");
                        }
                        else{
                            System.out.println("Erro ao adicionar produto! Codigo do produto pode ja estar cadastrado!");
                        }
                    }
                    else{
                        System.out.println("Erro ao criar produto!");
                    }
                    
                }
                if(b==2){
                    Estoque1.ListaProdutos();
                }
                if(b==3){
                   System.out.print("Entre com o nome de produto que deseja buscar:");
                   String NomeProduto = new String();
                   NomeProduto = sc.nextLine();
                   Estoque1.ListaProdutosNomes(NomeProduto);
                }
                if(b==4){
                    System.out.print("Entre com o codigo do produto que quer modificar:");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    int quant;
                    Double preco_uni;
                    String Descri = new String();
                    String Categ = new String();
                    String particularidade = new String();
                    System.out.print("Entre com a quantidade do produto:");
                    quant = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entre com o preco unitario do produto:");
                    preco_uni = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Entre com a descricao do produto:");
                    Descri = sc.nextLine();
                    System.out.print("Entre com a categoria do produto:");
                    Categ = sc.nextLine();
                    System.out.print("Entre com a particularidade do produto:");
                    particularidade = sc.nextLine();
                   if(Estoque1.AlteraEstoque(codigo, codigo, quant, preco_uni, Descri, Categ, particularidade)){
                       System.out.println("Produto modificado com sucesso!");
                   }
                   else{
                       System.out.println("Produto não encontrado!");
                   }
                }
           }
           if(a == 2){
               
           }
           if(a == 3){
               
           }
           if(a == 9){
               System.out.println("Tem certeza q deseja finalizar?");
               System.out.println("\t1 - Sim");
               System.out.println("\t2 - Nao");
               System.out.print("Entre:");
               int b = 0;
               while(b!=1 && b!=2){
                    System.out.print("Entre com a opcao:");
                    b = sc.nextInt();
                    if(b!=1 && b!=2){
                        System.out.println("Opcao invalida!");
                    }
               }
               if(b==1){
                   sc.close();
                   break;
               }
           }
        }
        
        
    }
    
}
