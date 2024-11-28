package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Tarefa;

public class RemoverTarefa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa t3 = new Tarefa();
		
		t3.setId(4L);
		t3 = manager.find(Tarefa.class, t3.getId());
		
		manager.getTransaction().begin();
		//comando para remover uma tarefa
		manager.remove(t3);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa removida com sucesso!");
		
		manager.close();
		factory.close();
	}

}
