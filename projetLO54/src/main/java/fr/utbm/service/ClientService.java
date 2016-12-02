package fr.utbm.service;

import java.util.List;

import fr.utbm.dao.ClientDao;
import fr.utbm.javabeans.Client;


public class ClientService {
	public void registerCourse(Client newCourse)
	{
		ClientDao clientDao=new ClientDao();
		clientDao.save(newCourse);
	}
	public List<Client> getClients()
	{
		ClientDao clientDao=new ClientDao();
		return clientDao.getClients();
	}
	public Client getCourse(int courseId)
	{
		ClientDao clientDao=new ClientDao();
		return clientDao.getClient(courseId);
	}
}
