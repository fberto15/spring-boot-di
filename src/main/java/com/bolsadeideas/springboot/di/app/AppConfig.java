package com.bolsadeideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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

}
