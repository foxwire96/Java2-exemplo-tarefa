package actions;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import modelo.Tarefa;

public class BuscarTarefasFinalizadas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		//JPQL para retornar todas as tarefas da tabela
		String sqlHibernate = "select t from Tarefa as t where t.finalizado =: paramFinalizado";
		Query query = manager.createQuery(sqlHibernate);
		query.setParameter("paramFinalizado", true);
		
		@SuppressWarnings("unchecked")
		List<Tarefa> listaTarefas = query.getResultList();
		
		System.out.println("Tarefas finalizadas:");
		System.out.println("======================");
		for (Tarefa t : listaTarefas) {
			System.out.println("Tarefa: "+t.getDescricao()+ " -> finalizada!");
		}
		
		manager.close();
		factory.close();
	}

}
