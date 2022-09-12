package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsadeideas.springboot.di.app.models.entity.ItemFactura;
import com.bolsadeideas.springboot.di.app.models.entity.Producto;

@Configuration
public class AppConfig {
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){		
		
		Producto producto1 = new Producto("Camara Sony", 100);		
		Producto producto2 = new Producto("PS5", 200);
		
		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 1);
		
		return Arrays.asList(item1, item2);
		
	}
	
	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){		
		
		Producto producto1 = new Producto("Monitor LG", 250);		
		Producto producto2 = new Producto("Notebook Lenovo", 500);
		Producto producto3 = new Producto("Impresora", 300);
		Producto producto4 = new Producto("Escritorio", 600);
		
		ItemFactura item1 = new ItemFactura(producto1, 2);
		ItemFactura item2 = new ItemFactura(producto2, 1);
		ItemFactura item3 = new ItemFactura(producto3, 1);
		ItemFactura item4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(item1, item2, item3, item4);
		
	}

}
