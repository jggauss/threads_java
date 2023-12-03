package br.com.alura.banco;

public class PrincipalBanco {

    public static void main(String[] args) throws InterruptedException{

        GerenciadorDeTransacao tx = new GerenciadorDeTransacao();
        PoolDeConnexao pool = new PoolDeConnexao();

        new Thread(new TarefaAcessarBanco(pool,tx)).start();
        new Thread(new TarefaAcessarBancoProcedimento(pool,tx)).start();
        
    }
}