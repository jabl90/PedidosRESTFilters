package com.ricardo.services;

import static org.junit.Assert.*;

import org.junit.Test;

public class PedidosServiceTest {

	@Test
	public void getPedidoValid() {
		PedidosService pserv= new PedidosService();
		
		assertTrue(pserv.getPedido(2)!=null);
		
		//assertTrue(pserv.getPedido(7)==null);
		
	}

}
