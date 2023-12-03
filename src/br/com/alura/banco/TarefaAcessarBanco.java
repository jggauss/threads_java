package br.com.alura.banco;

public class TarefaAcessarBanco implements Runnable {

	private GerenciadorDeTransacao tx;
	private PoolDeConnexao pool;

	public TarefaAcessarBanco(PoolDeConnexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
		
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("peguei a chave do poll");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("Começando a gerenciar a tx");
				tx.begin();
				
			}
		}
		
	}
}
