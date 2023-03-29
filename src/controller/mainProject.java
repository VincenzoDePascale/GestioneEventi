package controller;



import java.time.LocalDate;

import model.Evento;

public class mainProject {
	
	

	public static void main(String[] args) {
		
		Evento e = new Evento();
		e.setTitolo("evento1");
		e.setDataEvento(LocalDate.of(2022, 1, 1));
		e.setDescrizione("desc1");
		e.setTipoEvento("tipo1");
		e.setNumeroMassimoPartecipanti(250);
		
		EventoDAO.save(e);
	}



}
