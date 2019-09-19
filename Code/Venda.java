import java.util.ArrayList;
public class Venda{
  private static int CodigoCliente;
  private ArrayList<Integer> CodigoProduto = new ArrayList<Integer>();
  private ArrayList<Integer> PrecoProduto = new ArrayList<Integer>();
  private ArrayList<Integer> QuantidadeProduto = new ArrayList<Integer>();
  private static String Data;
  protected enum Status{
      Pendente,Em_Andamento,Entregue;}
  private Status Status1;
}
