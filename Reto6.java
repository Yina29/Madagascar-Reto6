package reto6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Reto6 {

	public static void main(String args[]) {
		int resp;
		String[] menu;

		menu = crearMenu();

		do {
			imprimirArray(menu);
			do {
				resp = obtenerNumero();
			}while (resp < 1 || resp > menu.length);

			switch (resp) {
			case 1:
				datosGenerales();
				break;
			case 2:
				curiosidades();
				break;
			case 3:
				personas();
				break;
			case 4:
				quiz();
			}

		}while(resp != 5);

	}

	public static int obtenerNumero() {
		int num = 0;
		boolean error;
		Scanner sc = new Scanner(System.in);

		do {
			try {
				error = false;
				System.out.print("Introduce la opcion que desees: ");
				num = sc.nextInt();
			}catch(InputMismatchException e){
				sc.nextLine();
				error = true;
				System.err.println("Introduce un valor valido");
			}
		}while(error == true);

		return num;
	}

	public static String[] crearMenu() {
		String[] menu = {"\nBienvenido al menu de Madagascar","Que desea conocer sobre Madagascar:\n",
				"1.- Informacion sobre el pais.","2.- Curiosidades de Madagascar.",
				"3.- Gente famosa de Madagascar.","4.- Un divertido Quiz sobre Madagascar.","5.- Salir.\n"};

		return menu;
	}

	public static void imprimirArray(String[] array) {
		for (int i = 0 ; i < array.length ; i++) {
			System.out.println(array[i]);
		}
	}

	public static void pause() {
		Scanner sc = new Scanner(System.in);
		System.err.print("\nPulsa la tecla enter para continuar");
		sc.nextLine();
	}

	//datos generales

	public static void datosGenerales() {
		int num;

		System.out.print("\nBienvenido a la opcion de | Información general sobre el país\n");

		do {
			num = elegirOpcionDatos();

			switch(num) {
			case 1: 
				opcionGeografia();
				break;
			case 2: 
				opcionEconomia();
				break;
			case 3: 
				opcionReligion();
				break;
			case 4: 
				opcionDemografia();
			}
		}while(num != 5);

	}

	public static int elegirOpcionDatos() {
		int opcion;

		System.out.println("\n¡Elija qué quiere saber del país!");

		System.out.println("Estas son las opciones del menú:"
				+ "\n1.- Geografía"
				+ "\n2.- Economía"
				+ "\n3.- Religión"
				+ "\n4.- Demografía"
				+ "\n5.- Volver al menu principal\n");

		do {
			opcion = obtenerNumero();

			if(opcion > 5 || opcion < 1) {
				System.err.println("¡Solo hay 5 opciones disponibles!\nInténtelo de nuevo.");
			}

		}while(opcion > 5 || opcion < 1);

		return opcion;
	}

	public static void opcionGeografia() {
		System.out.println("\n¡VAMOS A VER LA GEOGRAFÍA DE MADAGASCAR!\n-------------------------------------------------------");
		System.out.println("Madagascar es una gran isla en el sureste de África, en el Océano Índico.\nTiene una geografía diversa con selvas tropicales, montañas, mesetas y llanuras costeras.\nLa isla alberga una biodiversidad única, con especies de plantas y animales que no se encuentran en ningún otro lugar del mundo.\nEl clima es tropical, con una temporada de lluvias y una temporada seca.\nMadagascar es conocida por su riqueza natural y sus desafíos, como los ciclones tropicales.\nEn general, la geografía de Madagascar contribuye a su belleza y singularidad.\n");
		pause();
	}

	public static void opcionEconomia() {
		System.out.println("\n¡VAMOS A VER ECONOMÍA DE MADAGASCAR!\n------------------------------------------------------- ");
		System.out.println("La economía de Madagascar se basa principalmente en la agricultura, la pesca, la silvicultura y los servicios.\nSin embargo, el país enfrenta desafíos en términos de desarrollo económico y reducción de la pobreza.\nLa agricultura, incluyendo cultivos como el arroz, el café y la vainilla, es el sector más importante, pero se ve afectada por la falta de acceso a financiamiento y la deforestación.\nLa pesca también es importante, pero la pesca ilegal y la explotación insostenible representan desafíos.\nMadagascar cuenta con recursos naturales como minerales y piedras preciosas, pero su explotación debe ser gestionada de manera sostenible.\nEl turismo es un sector en crecimiento, pero se necesita invertir en infraestructura y servicios.\nMadagascar enfrenta desafíos en términos de infraestructura, desarrollo y acceso a servicios básicos.\nLa gestión sostenible de los recursos naturales, el fortalecimiento de la infraestructura y el impulso del turismo son clave para el crecimiento económico y el desarrollo sostenible del país.\n");
		pause();
	}

	public static void opcionReligion() {
		System.out.println("\n¡VAMOS A VER RELIGIÓN DE MADAGASCAR!\n-------------------------------------------------------");
		System.out.println("La religión en Madagascar es una combinación de creencias y prácticas tradicionales malgaches, influencias africanas y elementos del cristianismo y el islam.\nLa religión tradicional malgache se basa en la creencia en una fuerza vital llamada |Ny aina| y en la veneración de los antepasados a través de rituales y ofrendas.\nEl cristianismo tiene una presencia significativa en la isla, con católicos y protestantes como las principales denominaciones.\nEl islam también está presente, especialmente en las áreas costeras.\nLa religión en Madagascar es diversa y varía según la región y la etnia.\n");
		pause();
	}

	public static void opcionDemografia() {
		System.out.println("\n¡VAMOS A VER DEMOGRAFÍA DE MADAGASCAR!\n-------------------------------------------------------");
		System.out.println("La demografía de Madagascar se caracteriza por una población de alrededor de 28,4 millones de personas, compuesta principalmente por malgaches, con 18 grupos étnicos reconocidos.\nEl idioma oficial es el malgache, pero también se habla francés.\nLa religión en Madagascar es diversa, con una combinación de creencias tradicionales malgaches, cristianismo y el islam.\nLa población se distribuye de manera desigual, con una mayor densidad en las áreas costeras y las tierras altas centrales.\nMadagascar enfrenta desafíos en salud y esperanza de vida, pero sigue siendo un país cultural y naturalmente diverso.\n");
		pause();
	}

	//curiosidades

	public static void curiosidades() {
		int opcion;
		//Curiosidades sobre Madagascar:
		//  1- Gastronomia
		//  2- Datos curiosos
		mensajeBienvenida();
		do {
			opcion=obtenerNumero();
		}while(opcion <1 || opcion >3);

		switchMenu (opcion);
	}

	public static void mensajeBienvenida () {
		System.out.println("\nElija la opcion que desea dentro de las curiosidades sobre Madagascar: ");
		System.out.println("Las opciones son las siguientes: "
				+ "\n1.- Gastronomia "
				+ "\n2.- Datos curiosos "
				+ "\n3.- Volver al menu principal\n");

	}

	public static void switchMenu(int opcion) {
		switch (opcion) {
		case 1: 
			gastronomia();
			break;
		case 2: 
			datosCuriosos();
		}
	}

	public static void gastronomia() {
		int opcionGastronomia;
		System.out.println("\nQue es lo que le interesa saber sobre la gastronomia de Madagascar?");
		System.out.println("Tiene las siguientes opciones:");
		System.out.println("1.- Comidas tipicas.");
		System.out.println("2.- Ingredientes tipicos.");
		System.out.println("3.- Estilo de cocina.");
		System.out.println("4.- volver atras.\n");

		do {
			opcionGastronomia = obtenerNumero();
		}while(opcionGastronomia<1 || opcionGastronomia>4);

		switch(opcionGastronomia) {
		case 1: 
			comidasTipicas();
			break;
		case 2: 
			ingredientesTipicos(); 
			break;
		case 3: 
			estiloCocina();
			break;
		case 4:
			mensajeBienvenida();
			switchMenu(obtenerNumero());
		}

	}

	public static void comidasTipicas() {
		System.out.println("\n1.- Lasopy: \nLos protagonistas de este plato son las verduras y los huesos de ternera. \nGeneralmente, se usan hortalizas como zanahorias, nabos y puerros. \nAdemás del sabor de estas verduras, sientes la del tomate y las habichuelas cocinadas con pimienta negra. \nAunque no están siempre presentes, las patatas pueden encontrarse en esta sopa. \nLos malgaches preparan las verduras y los huesos por separado, así los sabores no se pierden.");
		pause();
		System.out.println("\n2.- Ravitoto: \nSe trata de un guisado de cerdo con hojas de mandioca (conocido también como yuca o casabe) que se sirve con arroz y, en algunos casos, salsa de tomate especiada. \nEl sabor de la carne es el que más está presente, quizás por ser sazonado y salteado aparte de las verduras.");
		pause();
		System.out.println("\n3.- Romazava: \nEste plato no es solo típico, sino también originario de Madagascar: el romazava. Si te decides a probarlo prepárate para una explosión de picante en tu boca. \nEl romazava se hace con brèdes mafana unas flores típicas de Madagascar que son muy, muy picantes. \nTe aseguramos que el sabor de los botones amarillos de esta planta no los podrás probar sino en la isla, y si te gusta el fuego en la comida, seguramente no te arrepientas. \nAdemás del picante, te encontrarás con carne de res sazonada con jengibre y chile tipo tailandés; esta carne es cocinada con tomate y en ocasiones también con acelga. \nEste plato se acompaña tradicionalmente con arroz y la tradicional salsa rougail (tomate, limón y jengibre).");
		pause();
		System.out.println("\n4.- Hen’omby ritra: \nSe trata de carne de res en cubos cocinadas comúnmente, pero sazonadas de una manera malgache. \nLos trozos de carne suelen ser algo grandes, pues así se previene la pérdida de jugo y sabor. \nLos trozos son primero sazonados con sal y salteados hasta que se tornan marrones. \nLuego pasan a ser cocinados con poca agua hasta que esta se evapora por completo. \nEs aqui cuando se le añade el ajo y el jengibre, y no antes, pues estos sabores se perderían y la idea es que la carne tenga un fuerte sabor a estos dos sazonadores.");
		pause();
		
		gastronomia();
	}

	public static void ingredientesTipicos() {
		System.out.println("\n1.- Arroz: \nEl arroz, también conocido vary en malgache, es la piedra angular de la dieta malgache y normalmente se consume en todas las comidas. \nEl arroz se prepara con cantidades variables de agua para producir un arroz seco mullido, que se come con algún tipo de acompañamiento en salsa. \nambién se hace una papilla de arroz espesa llamada vary sosoa que normalmente se come para el desayuno o se prepara para los enfermos.");
		pause();
		System.out.println("\n2.- Laoka: \nLaoka es el nombre que se le da al acompañamiento que se sirve con el arroz. \nLos laoka se sirven frecuentemente con algún tipo de salsa. \nEn las tierras altas, la salsa generalmente está compuesta de tomate, mientras que en las zonas costeras a menudo se agrega leche de coco durante la cocción.");
		pause();
		System.out.println("\n3.- Carne de cebu: \nLa carne de cebú se caracteriza por tener un sabor intenso y un poco más fuerte que la carne de otras razas de vacas, debido a la mayor cantidad de fibras musculares que contiene. \nAdemás, su carne es magra y tiene menos grasa que la de otros tipos de ganado vacuno.");
		pause();
		
		gastronomia();
	}

	public static void estiloCocina() {
		System.out.println("\nEl estilo de cocina utilizado en madagascar es el contemporaneo. \nLa Cocina contemporánea es la que mantiene una constante búsqueda de innovación y creatividad a base de colores, formas y sabores, buscando obtener un producto \nde muy alta calidad y desarrollar nuevas presentaciones y tendencias en los platos; para de esta manera provocar una satisfacción cada vez más exquisita al comensal.");
		pause();
		
		gastronomia();
	}

	public static void datosCuriosos() {
		System.out.println("\nEstas son algunas curiosidades de Madagascar: "
				+ "\n1.- Con 587.000 kilómetros cuadrados es la 4ª isla más grande del mundo, por detrás de Groenlandia, Nueva Guinea y Borneo. "
				+ "\n2.- En Madagascar habitan el 58% de las especies de animales y plantas del mundo, de los cuales más del 80% son endémicas de Madagascar "
				+ "\n3.- Madagascar es uno de los países más pobres del mundo. El sueldo  diario de un trabajador malgache ronda 1 USD por día. "
				+ "\n4.- Por el color predominante de su suelo se le conoce como La Gran Isla Roja. "
				+ "\n5.- En Madagascar coexisten 18 tribus diferentes, cada uno con culturas y costumbres diferentes "
				+ "\n6.- La montaña más alta es Maromokotro con 2.876 metros "
				+ "\n7.- 100 son las especies de primates lémures que se pueden encontrar en Madagasca "
				+ "\n8.- Hay 3.000 especies de mariposas endémicas de Madagascar. "
				+ "\n9.- Las mujeres malgaches se pintan las caras de forma llamativa con corteza triturada de árboles no solo para estar más atractivas, también para protegerse del sol y de los insectos.");
		pause();

		mensajeBienvenida();
		switchMenu(obtenerNumero());
	}

	//personas

	public static void personas() {
		int resp;

		do {
			mostrarMenu();
			resp = obtenerNum();

			if (resp != 6) {
				obtenerPersona(resp-1);
			}
		}while(resp != 6);
	}

	public static void mostrarMenu() {
		System.out.println("\nEstas son algunas personas famosas de Madagascar:");
		System.out.println("1.- Albert Rakoto Ratsimamanga, el Científico Pionero");
		System.out.println("2.- Gisèle Rabesahala, la Patriota");
		System.out.println("3.- Jean-Luc Raharimanana, el Guardián de la Memoria");
		System.out.println("4.- Erick Manana, el Icono Cultural");
		System.out.println("5.- Jacques Rabemananjara, el Prisionero Político");
		System.out.println("6.- Atras\n");
	}

	public static int obtenerNum() {
		int resp = 0;
		boolean error;

		do {
			error = false;
			resp = obtenerNumero();

			if(resp > 6) {
				System.out.println("El valor debe ser menor o igual que 6");
				error = true;
			}else if(resp < 1){
				System.out.println("El valor debe ser mayor o igual que 1");
				error = true;
			}
		}while(error == true);

		return resp;
	}

	public static void obtenerPersona(int num) {
		String[] array = {
				"Albert Rakoto Ratsimamanga es con diferencia el más renombrado científico de Madagascar.\nSe hizo famoso por su extenso trabajo sobre como entender mejor las propiedades curativas de la exclusiva flora endémica.\nSe le atribuyen unas 350 publicaciones científicas sobre temas que van desde la función de la glándula suprarrenal hasta remedios naturales para la diabetes.",
				"Gisèle Rabesahala fue una de las líderes de la lucha por la independencia de Madagascar.\nFue una periodista y activista política, creadora del periódico Imongo Vaovao.\nTambién fue la primera mujer malgache elegida en 1958 como representante del Ayuntamiento de Antananarivo, capital de Madagascar.\nCuando murió en 2011 Internet se inundó de tributos honrando su memoria.",
				"Jean-Luc Raharimanana es un escritor malgache.\nA los 20 años ya había ganado el Premio de Poesía Jean-Joseph Rabearivelo por sus primeros poemas.\nSus escritos fueron reconocidos por su retrato de la belleza de la naturaleza en su país natal, y también la pobreza y miseria, especialmente en los poblados de chabolas.\nEn su trabajo, las leyendas y viejas supersticiones se yuxtaponen con los eventos políticos contemporáneos.",
				"Erick Manana es un cantante y compositor descrito como el «Bob Dylan de Madagascar».\nSu carrera profesional como músico comenzó en 1982 como miembro de la banda Lolo sy ny Tariny.\nManana ha recibido varios premios y actuado en 2013 en la histórica Olympia en París para celebrar el 35 aniversario de su carrera.",
				"Jacques Rabemananjara fue un político, dramaturgo y poeta malgache.\nRabemananjara nació en la ciudad en Bahía de Antongil, en la costa este de Madagascar en 1913.\nRabemananjara fue reconocido como uno de los más importantes autores prolíficos del género Negritud, el movimiento literario e ideológico desarrollado por los intelectuales negros francófonos que rechazaban el colonialismo racista francés.\nSenghor, el famoso escritor senegalés convertido en presidente, es el creador del movimiento.\nFue sospechoso de estar involucrado en la fallida instigación del levantamiento malgache de 1947 contra el dominio colonial, a pesar de que había instado a los alborotadores a mantenerse calmados.\nFue arrestado y sentenciado a cadena perpetua con trabajos forzados.",
		};

		System.out.println("\n"+array[num]);
		pause();

	}

	//quiz

	public static void quiz() {
		String[] preguntas;
		int respUsu = 0;
		boolean[] puntuacion;

		preguntas = crearPreguntas();
		puntuacion = new boolean[preguntas.length];

		for (int i = 0 ; i < preguntas.length ; i++) {
			printPreguntas(i);
			printRespuestas(i);
			respUsu = obtenerRespUsuario();
			puntuacion[i] = validar(i, respUsu);
		}
		puntuacionFinal(puntuacion);

	}

	public static String[] crearPreguntas() {
		String[] preguntas = {
				"\n1.- ¿Idioma oficial de Madagascar?\n",
				"\n2.- Cual es la capital de Madagascar?\n",
				"\n3.- ¿Cuantas regiones hay en Madagascar?\n",
				"\n4.- ¿Cuál es la fecha de la independencia de Madagascar?\n",
				"\n5.- ¿Cuánto fue el PIB Per Capita de Madagascar en el año 2022?\n",
		};

		return preguntas;
	}

	public static String[][] crearRespuestas() {
		String[][] respuestas = {
				{"Malgache y Frances","Frances","Malgache","Ingles\n"},
				{"Antananarivo","Toamasina","Mahajanga","Toliary\n"},
				{"22","6","18","12\n"},
				{"26 de junio","16 de junio","15 de junio","25 de junio\n"},
				{"165.406M euros","14.466M euros","245 rupias","4.010M euros\n"}
		};
		return respuestas;
	}

	public static int respCorrecta(int num) {
		int[] correctaTrivial = {1,1,1,1,1}; //correcta en la posicion 0

		return correctaTrivial[num];
	}

	public static void printPreguntas(int num) {
		String[] pregunta = crearPreguntas();
		System.out.println(pregunta[num]);
	}

	public static void printRespuestas(int num) {
		String[][] respuestas = crearRespuestas();
		for (int i = 0 ; i < respuestas[num].length ; i++) {
			System.out.println((i+1)+".- "+ respuestas[num][i]);
		}
	}

	public static int obtenerRespUsuario() {
		final int CANTRES = 4; //cantidad respuestas
		boolean errorChar;
		int opcion = 0;

		do {
			errorChar = false;
			opcion = obtenerNumero();
			if (opcion < 1 || opcion > CANTRES) {
				System.err.println("El número debe estar entre 1 y " + CANTRES + ".");
				errorChar = true;
			}
		} while (errorChar);

		return opcion;
	}

	public static boolean validar(int num, int respuestaUsuario) {
		boolean valida;
		int correcta = respCorrecta(num);
		String[][] respuestas = crearRespuestas();

		if (correcta == respuestaUsuario) {
			valida = true;
			System.out.println("\n¡RESPUESTA CORRECTA!");
		}else {
			valida = false;
			System.err.println("\nIncorrecto. La respuesta correcta es: " + respuestas[num][correcta-1]);
		}

		return valida;
	}

	public static void puntuacionFinal(boolean[] puntuacion) {
		int puntos = 0;

		for (int i = 0 ; i < puntuacion.length ; i++) {
			if(puntuacion[i]) {
				puntos++;
			}
		}

		System.out.println("\nTu puntuación final es " + puntos);
		pause();
	}
}