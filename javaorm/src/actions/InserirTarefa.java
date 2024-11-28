package actions;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Tarefa;

public class InserirTarefa {
	public static void main(String[] args) {
		Tarefa tarefa1 = new Tarefa();
		tarefa1.setDescricao("Estudar Violão");
		tarefa1.setFinalizado(true);
		tarefa1.setDataFinalizado(Calendar.getInstance());
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.persist(tarefa1);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa inserida, ID: "+tarefa1.getId());
		
		manager.close();
		factory.close();
	}

}
