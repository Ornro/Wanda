package fr.irit.wanda.servlet;

import fr.irit.wanda.common.IRequest;
import fr.irit.wanda.serveur.ClientRequest;

/**
 * Si le client se complexifie ou se d�localise (e.g application client charg�e par le navigateur en JAVA)
 * cette classe de configuration servira � r�cup�rer l'interface de requ�te et sa configuration g�n�ral.
 * 
 * @author Wanda Team
 *
 */

public class ClientConfiguration {
	public IRequest remoteRequest;
	
	public ClientConfiguration(){
		remoteRequest = new ClientRequest();
	}
}
