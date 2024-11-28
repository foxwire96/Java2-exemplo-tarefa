package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Tarefa;

public class BuscarUmaTarefa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();

		Tarefa t1 = manager.find(Tarefa.class, 1L);
		System.out.println("Tarefa do dia: "+t1.getDescricao());

		manager.close();
		factory.close();
	}

}
