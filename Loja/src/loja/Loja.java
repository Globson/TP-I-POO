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
       System.out.println("2 - Listar Vendas");
       System.out.println("3 - Alterar status de venda");
   }
    public static void main(String[] args) {    //testes comentados
        
        Estoque Estoque1 = new Estoque();
        BancoClientes BancoC = new BancoClientes();
        BancoVendas BancoV = new BancoVendas();
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
                    System.out.print("Entre com a nova quantidade do produto:");
                    quant = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Entre com o novo preco unitario do produto:");
                    preco_uni = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Entre com a nova descricao do produto:");
                    Descri = sc.nextLine();
                    System.out.print("Entre com a nova categoria do produto:");
                    Categ = sc.nextLine();
                    System.out.print("Entre com a nova particularidade do produto:");
                    particularidade = sc.nextLine();
                   if(Estoque1.AlteraEstoque(codigo, quant, preco_uni, Descri, Categ, particularidade)){
                       System.out.println("Produto modificado com sucesso!");
                   }
                   else{
                       System.out.println("Produto não encontrado!");
                   }
                }
           }
           if(a == 2){
               int b = 0;
               menuCliente();
               while(b!=1 && b!=2 && b!= 3){
                    System.out.print("Entre com a opcao:");
                    b = sc.nextInt();
                    sc.nextLine();
                    if(b!=1 && b!=2 && b!= 3){
                        System.out.println("Opcao invalida!");
                    }
                }
               if(b==1){
                  Cliente TempC = new Cliente();
                  String Nome = new String();
                  String Email = new String();  
                  String Senha = new String();
                  String CPF = new String();
                  int codigo;
                  System.out.print("Entre com o nome do cliente:");
                  Nome = sc.nextLine();
                  System.out.print("Entre com o codigo do cliente:");
                  codigo = sc.nextInt();
                  sc.nextLine();
                  System.out.print("Entre com o CPF do cliente");
                  CPF = sc.nextLine();
                  System.out.print("Entre com o email do cliente:");
                  Email = sc.nextLine();
                  System.out.print("Entre com a senha:");
                  Senha = sc.nextLine();
                  if(TempC.SetNomeCPF_Cliente(Nome, CPF) && TempC.SetEmail(Email) && TempC.SetCodigo(codigo) && TempC.SetSenha(Senha)){
                      while(true){
                          int c = 0;
                          String Endereco = new String();
                          System.out.print("Entre com um endereco:");
                          Endereco = sc.nextLine();
                          if(TempC.AdicionaEndereco(Endereco)){
                              System.out.println("Endereco adicionado com sucesso!");
                          }
                          else{
                              System.out.println("Erro ao adicionar endereco! Endereco ja existente!");
                          }
                          System.out.println("Deseja cadastrar mais enderecos do cliente?");
                          System.out.println("\t 1 - Sim");
                          System.out.println("\t 2 - Nao");
                          while(c!=1 && c!=2){
                            System.out.print("Entre com a opcao:");
                            c = sc.nextInt();
                            sc.nextLine();
                            if(c!=1 && c!=2){
                            System.out.println("Opcao invalida!");
                            }
                           }
                          if(c == 2){
                              break;
                          }
                      }
                     if(BancoC.AdicionaCliente(TempC)){
                         System.out.println("Cliente cadastrado com sucesso!");
                     }
                     else{
                         System.out.println("Erro ao cadastrar cliente! Codigo de cliente ja utilizado!");
                     }
                  }
                  else{
                      System.out.println("Erro ao criar cliente! Dados invalidos!");
                  }
               }
               if(b==2){
                   BancoC.ListaClientes();
               }
               if(b==3){
                   System.out.print("Entre com o codigo do cliente que quer modificar:");
                   int codigo = sc.nextInt();
                   sc.nextLine();
                   String Nome = new String();
                   String Email = new String();  
                   String Senha = new String();
                   String CPF = new String();
                   String Endereco = new String();
                   System.out.print("Entre com o novo nome do cliente:");
                   Nome = sc.nextLine();
                   System.out.print("Entre com o novo CPF do cliente");
                   CPF = sc.nextLine();
                   System.out.print("Entre com o novo email do cliente:");
                   Email = sc.nextLine();
                   System.out.print("Entre com a nova senha:");
                   Senha = sc.nextLine();
                   System.out.print("Entre com um novo endereco:");
                   Endereco = sc.nextLine();
                   if(BancoC.AlteraCliente(codigo, Nome, CPF, Email, Senha, Endereco)){
                       System.out.println("Cliente alterado com sucesso!");
                   }
                   else{
                       System.out.println("Erro! Cliente nao encontrado!");
                   }
                   
               }
           }
           if(a == 3){
               int b = 0;
               menuVenda();
               while(b!=1 && b!=2 && b!= 3){
                    System.out.print("Entre com a opcao:");
                    b = sc.nextInt();
                    sc.nextLine();
                    if(b!=1 && b!=2 && b!= 3){
                        System.out.println("Opcao invalida!");
                    }
                }
               if(b==1){
                   boolean verificacao = false;
                   int CodigoV;
                   int CodigoC;
                   String Data = new String();
                   String Status = new String();
                   System.out.print("Entre com o codigo da Venda:");
                   CodigoV = sc.nextInt();
                   sc.nextLine();
                   System.out.print("Entre com o codigo do cliente:");
                   CodigoC = sc.nextInt();
                   sc.nextLine();
                   System.out.print("Entre com a data da venda:");
                   Data = sc.nextLine();
                   System.out.print("Entre com o status da venda:");
                   Status = sc.nextLine();
                   Venda V = new Venda(CodigoV,CodigoC,Data,Status);
                   while(true){
                       int c = 0;
                       int codigoP;
                       int quantP;
                       System.out.print("Entre com o codigo do produto vendido:");
                       codigoP = sc.nextInt();
                       sc.nextLine();
                       System.out.print("Entre com a quantidade do produto vendido:");
                       quantP = sc.nextInt();
                       sc.nextLine();
                       if(V.SetProdutoVendido(codigoP, quantP, Estoque1)){
                           System.out.println("Produto cadastrado em venda com sucesso!");
                           verificacao = true;
                       }
                       else{
                           System.out.println("Erro! Produto nao encontrado em estoque!");
                       }
                       System.out.println("Deseja cadastrar mais produtos vendidos?");
                          System.out.println("\t 1 - Sim");
                          System.out.println("\t 2 - Nao");
                          while(c!=1 && c!=2){
                            System.out.print("Entre com a opcao:");
                            c = sc.nextInt();
                            sc.nextLine();
                            if(c!=1 && c!=2){
                            System.out.println("Opcao invalida!");
                            }
                           }
                          if(c == 2){
                              break;
                          }
                   }
                 if(verificacao){
                     if(BancoV.AdicionaVenda(V, BancoC)){
                     System.out.println("Venda cadastrada com sucesso!");
                     }
                     else{
                     System.out.println("Erro! Cliente não encontrado!");
                     }
                 }
                 else{
                     System.out.println("Erro! Produto não encontrado!");
                 }
               }
               if(b==2){
                   BancoV.ListaVendas();
               }
               if(b==3){
                   String statusnovo = new String();
                   System.out.print("Entre com o codigo da venda que deseja alterar o status:");
                   int codigo = sc.nextInt();
                   sc.nextLine();
                   System.out.print("Entre com o novo status:");
                   statusnovo = sc.nextLine();
                   if(BancoV.AlteraStatusVenda(codigo, statusnovo)){
                       System.out.println("Status alterado com sucesso!");
                   }
                   else{
                       System.out.println("Erro! Venda nao encontrada!");
                   }
               }
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
                    sc.nextLine();
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
