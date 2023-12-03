package br.com.alura.banco;

public class TarefaAcessarBancoProcedimento implements Runnable {

	private PoolDeConnexao pool;
	private GerenciadorDeTransacao tx;

	public TarefaAcessarBancoProcedimento(PoolDeConnexao pool, GerenciadorDeTransacao tx) {
		this.pool = pool;
		this.tx = tx;
		
	}

	@Override
	public void run() {
		synchronized (pool) {
			System.out.println("começando a tx ");
			pool.getConnection();
			
			synchronized (tx) {
				System.out.println("peguei a conexão");
				tx.begin();
			}
			
		}

	}

}
