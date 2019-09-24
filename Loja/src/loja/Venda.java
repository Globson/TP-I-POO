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
  private static int CodigoCliente;
  private ArrayList<Integer> CodigoProduto = new ArrayList<Integer>();
  private ArrayList<Integer> PrecoProduto = new ArrayList<Integer>();
  private ArrayList<Integer> QuantidadeProduto = new ArrayList<Integer>();
  private static String Data;
  protected enum Status{
      Pendente,Em_Andamento,Entregue;}
  private Status Status1;
}
