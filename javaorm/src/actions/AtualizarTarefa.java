package actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Tarefa;

public class AtualizarTarefa {
	public static void main(String[] args) {
		Tarefa tarefa = new Tarefa();
		tarefa.setId(5L);
		tarefa.setDescricao("Estudar muito mais Python");
		tarefa.setFinalizado(false);
		tarefa.setDataFinalizado(null);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(tarefa);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa atualizada, ID: "+tarefa.getId());
		
		manager.close();
		factory.close();
	}
}