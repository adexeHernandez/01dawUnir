package Testing;

import javabean.Fiesta;

public class Principal {

	public static void main(String[] args) {
		
		//2 Fiestas con el constructor
		
		Fiesta fiesta1 = new Fiesta("Fiesta de jubilación", "C/ Alcala, 27", 60, 90, 30, "25 de noviembre de 2024", "18:00");
		Fiesta fiesta2 = new Fiesta("Comunión de Andreita", "4 Rue de la Foret Noir", 50, 50, 61, "22 de junio de 2025", "15:30");
		
		// 2 Fiestas con constructor vacio
		
		Fiesta fiesta3 = new Fiesta();
		fiesta3.setTipoFiesta("Fiesta de disfraces");
		fiesta3.setDireccion("C/ La Graciosa, 23");
		fiesta3.setBocadillos(18);
		fiesta3.setBebidas(18);
		fiesta3.setInvitados(18);
		fiesta3.setFecha("15 de febrero de 2025");
		fiesta3.setHora("22.00 horas");
	
		Fiesta fiesta4 = new Fiesta();
		fiesta4.setTipoFiesta("Fiesta de Halloween");
		fiesta4.setDireccion("Elm Street, 13");
		fiesta4.setBocadillos(150);
		fiesta4.setBebidas(300);
		fiesta4.setInvitados(150);
		fiesta4.setFecha("31 de octubre de 2025");
		fiesta4.setHora("23.00 horas");
		
		// Mostramos los datos iniciales
		
		System.out.println("DETALLES DE LA FIESTA 1");
		System.out.println(fiesta1.toString());
		System.out.println(); //no se como poner un salto de linea, por eso los syso sin contenido
		System.out.println("DETALLES DE LA FIESTA 2");
		System.out.println(fiesta2.toString());
		System.out.println(); 
		System.out.println("DETALLES DE LA FIESTA 3");
		System.out.println(fiesta3.toString());
		System.out.println(); 
		System.out.println("DETALLES DE LA FIESTA 4");
		System.out.println(fiesta4.toString());
		System.out.println(); 
		
		// Me invento una pelicula para probrar los metodos
		
		 // Fiesta 1 
        System.out.println("La primera fiesta es una " + fiesta1.getTipoFiesta() + ", que se celebrará el " + fiesta1.getFecha() +
                " a las " + fiesta1.getHora() + " en " + fiesta1.getDireccion() + ".");
        System.out.println("En principio, se han preparado " + fiesta1.getBocadillos() + " bocadillos y " +
                fiesta1.getBebidas() + " bebidas para " + fiesta1.getInvitados() + " invitados.");

        // Meto más gente y miro si tengo suficientes recursos
        fiesta1.invitar(5);
        System.out.println("José Luis se ha traido a los 5 becarios, ahora hay " + fiesta1.getInvitados() + " invitados.");
        System.out.println("¿Hay suficiente comida y bebida? ");
        System.out.println(fiesta1.verificarRecursos());

        // Calculo el precio de la fiesta
        System.out.println("La " + fiesta1.getTipoFiesta() + " ha costado: " + fiesta1.precioFiesta() + "€.");
        System.out.println();

       
        // Fiesta 2 
        System.out.println("La segunda fiesta es la " + fiesta2.getTipoFiesta() + ", que se celebrará el " + fiesta2.getFecha() +
                " a las " + fiesta2.getHora() + " en " + fiesta2.getDireccion() + ".");
        System.out.println("Como no se ha confirmado quien viene, se han preparado " + fiesta2.getBocadillos() + " bocadillos y " +
                fiesta2.getBebidas() + " bebidas para " + fiesta2.getInvitados() + " asistentes.");

        // Se cancelan invitados y miro si tengo suficientes recursos
        fiesta2.cancelarInvitacion(10);
        System.out.println("Como hay 2 primos peleados, hay 10 personas que no vienen, quedan " + fiesta2.getInvitados() + " invitados.");
        System.out.println("¿Hay suficiente comida y bebida? ");
        System.out.println(fiesta2.verificarRecursos());

        // Calculo el precio de la fiesta
        System.out.println("El gasto que ha habido en " + fiesta2.getTipoFiesta() + " es: " + fiesta2.precioFiesta() + "€.");
        System.out.println();

        
        // Fiesta 3 
        fiesta3.setTipoFiesta("Fiesta de disfraces");
        fiesta3.setDireccion("C/ La Graciosa, 23");
        fiesta3.setBocadillos(18);
        fiesta3.setBebidas(18);
        fiesta3.setInvitados(18);
        fiesta3.setFecha("15 de febrero de 2025");
        fiesta3.setHora("22.00 horas");
        System.out.println("Esta es una " + fiesta3.getTipoFiesta() + ", que se va a celebrar " + fiesta3.getFecha() +
                " a las " + fiesta3.getHora() + " en " + fiesta3.getDireccion() + ".");
        System.out.println("Es una fiesta de amigos cercanos y somos " + fiesta3.getInvitados() + " solamente.");

        // Verificamos recursos
        System.out.println("¿Hay suficiente comida y bebida? ");
        System.out.println(fiesta3.verificarRecursos());

        // Calculamos el precio de la fiesta
        System.out.println("Se han gastado " + fiesta3.precioFiesta() + "€ en la " + fiesta3.getTipoFiesta() );
        System.out.println();

        
        // Fiesta 4
        fiesta4.setTipoFiesta("Fiesta de Halloween");
        fiesta4.setDireccion("Elm Street, 13");
        fiesta4.setBocadillos(180);
        fiesta4.setBebidas(300);
        fiesta4.setInvitados(150);
        fiesta4.setFecha("31 de octubre de 2025");
        fiesta4.setHora("23.00 horas");
        System.out.println("La ultima fiesta es una " + fiesta4.getTipoFiesta() + ", que va a ser el " + fiesta4.getFecha() +
                " a las " + fiesta4.getHora() + " en " + fiesta4.getDireccion() + ".");
        System.out.println("Hay preparados " + fiesta4.getBocadillos() + " bocadillos y " +
                fiesta4.getBebidas() + " bebidas para " + fiesta4.getInvitados() + " asistentes.");

        // Añadimos y quitamos invitados y verificamos recursos
        fiesta4.invitar(30);
        System.out.println("Como es la fiesta del año, se han apuntado 30 mas y ahora hay " + fiesta4.getInvitados() + " invitados.");
        fiesta4.cancelarInvitacion(10);
        System.out.println("Como hay 10 que nunca leen y han venido sin disfraz, se han ido. Al final hay " + fiesta4.getInvitados() + " invitados");
        System.out.println("¿Habrá suficiente comida y bebida?");
        System.out.println(fiesta4.verificarRecursos());

     // Calculo el precio de la fiesta
        System.out.println("Se nos ha pasado un poco de presupuesto la " + fiesta4.getTipoFiesta() + " y nos hemos gastado " + fiesta4.precioFiesta() + "€.");
  
		
	}

}