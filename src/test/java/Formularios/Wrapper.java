package Formularios;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wrapper {
	private WebDriver driver=null;
	private static Wrapper wrapper=null;
	public String[] gestionBodega_name={"Guerrero","Guittarero","Leon","Palencia","Salamanca",
	"Segovia","Soria","Valladolid","Zamora","Buitrago"};
	
	
	
	public String[] gestionBodega_responsable={"Guerrero","Guittarero","León","Palencia","Salamanca",
			"Segovia","Soria","Valladolid","Zamora","Buitrago"};
	public String[] gestionExtras_Municipios = {"Amazonas", "Antioquia", "Arauca","Atlantico",
		    "Bolivar","Boyaca", "Caldas","Caqueta","Casanare","Cauca","Cesar","Choco", "Cordoba",
		    "Cundinamarca","Guainia", "Guajira","Guaviare", "Huila","Magdalena","Meta","Norte de Santander",
		    "Nariño","Putumayo","Quindio","Risaralda","San Andres","Santander", "Sucre","Tolima",
		    "Valle Del Cauca", "Vaupes","Vichada","Amazonass", "Antioquiaa", "Araucaa","Atlanticoo",
		    "Bolivarr","Boyacaa", "Caldass","Caquetaa","Casanaree","Caucaa","Cesarr","Chocoo", "Cordobaa",
		    "Cundinamarcaa","Guainiaa", "Guajiraa","Guaviaree", "Huilaa","Magdalenaa","Metaa","Norte de Santanderr",
		    "Nariñoo","Putumayoo","Quindioo","Risaraldaa","San Andress","Santanderr", "Sucree","Tolimaa",
		    "Valle Del Caucaa", "Vaupess","Vichadaa"};
	
	public String[] amazonas= { "LETICIA", "EL ENCANTO", "LA CHORRERA", "LA PEDRERA", "LA VICTORIA",
		        "MIRITI-PARANA",     "PUERTO ALEGRIA","PUERTO ARICA", "PUERTO NARINO", "SANTANDER", "TARAPACA"};
	
  
	public String[] antioquia={"ABEJORRAL","ABRIAQUI","ALEJANDRIA",
		      "AMAGA", "AMALFI", "ANDES","ANGELOPOLIS", "ANGOSTURA",
		        "ANORI","ANZA","APARTADO", "ARBOLETES", "ARGELIA", "ARMENIA",
		         "BARBOSA","BELLO", "BELMIRA", "BETANIA","BETULIA", "BRICENO",
		         "BURITICA","CACERES","CAICEDO","CALDAS", "CAMPAMENTO", "CANASGORDAS",
		         "CARACOLI", "CARAMANTA", "CAREPA","CARMEN DE VIBORAL",
		         "CAROLINA", "CAUCASIA", "CHIGORODO","CISNEROS","CIUDAD BOLIVAR","COCORNA", "CONCEPCION",
		         "CONCORDIA","COPACABANA", "DABEIBA","DON MATIAS", "EBEJICO", "EL BAGRE","ENTRERRIOS",
		         "ENVIGADO",  "FREDONIA","FRONTINO", "GIRALDO", "GIRARDOTA",
		          "GOMEZ PLATA","GRANADA", "GUADALUPE","GUARNE", "GUATAPE", "HELICONIA","HISPANIA",  "ITAGUI",
		   		  "ITUANGO","JARDIN", "JERICO", "LA CEJA", "LA ESTRELLA", "LA PINTADA","LA UNION","LIBORINA",
		          "MACEO", "MARINILLA","MEDELLIN", "MONTEBELLO", "MURINDO","MUTATA", "NARINO",
		          "NECHI", "NECOCLI","OLAYA","PENOL","PEQUE", "PUEBLORRICO",
		         "PUERTO BERRIO","PUERTO NARE", "PUERTO TRIUNFO", "REMEDIOS",
		          "RETIRO","RIONEGRO","SABANALARGA", "SABANETA", "SALGAR",
		          "SAN ANDRES","SAN CARLOS","SAN FRANCISCO", "SAN JERONIMO",
		          "SAN JOSE DE LA MONTANA","SAN JUAN DE URABA","SAN LUIS",
		          "SAN PEDRO","SAN PEDRO DE URABA", "SAN RAFAEL","SAN ROQUE",
		          "SAN VICENTE","SANTA BARBARA","SANTA FE DE ANTIOQUIA", "SANTA ROSA DE OSOS","SANTO DOMINGO",
		          "SANTUARIO","SEGOVIA", "SONSON", "SOPETRAN", "TAMESIS","TARAZA", "TARSO",
		           "TITIRIBI","TOLEDO", "TURBO",  "URAMITA", "URRAO",  "VALDIVIA","VALPARAISO",
		          "VEGACHI", "VENECIA","VIGIA DEL FUERTE", "YALI", "YARUMAL","YOLOMBO", "YONDO", "ZARAGOZA",
		   };
		   
		   
		    public String[] arauca= { "ARAUCA", "ARAUQUITA",
		     "CRAVO NORTE","FORTUL", "PUERTO RONDON","SARAVENA","TAME"};
		    
		    public String[] ATLANTICO= { "BARANOA", "BARRANQUILLA","CAMPO DE LA CRUZ",
		    "CANDELARIA","GALAPA", "JUAN DE ACOSTA", "LURUACO","MALAMBO","MANATI", "PALMAR DE VARELA"
		    };
		    public String[] BOLIVAR= {"ACHI", "ALTOS DEL ROSARIO","ARENAL","ARJONA",
		      "ARROYOHONDO","BARRANCO DE LOBA", "CALAMAR","CANTAGALLO","CARTAGENA DE INDIAS","CICUCO"};
		   
		   public String[] BOYACA= {"ALMEIDA",
		        "AQUITANIA",
		        "ARCABUCO",
		        "BELEN",
		        "BERBEO",
		        "BETEITIVA",
		        "BOAVITA",
		       "BOYACA",
		        "BRICENO",
		        "BUENAVISTA"
		    };
		   public String[] CALDAS= {"AGUADAS",
		        "ANSERMA",
		        "ARANZAZU",
		        "BELALCAZAR",
		        "CHINCHINA",
		        "FILADELFIA",
		        "LA DORADA",
		       "LA MERCED",
		        "MANIZALES",
		        "MANZANARES"
		    };
		    public String[] CAQUETA= { "ALBANIA",
		        "BELEN DE LOS ANDAQUIES",
		        "CARTAGENA DEL CHAIRA",
		        "CURILLO",
		        "EL DONCELLO",
		        "EL PAUJIL",
		        "FLORENCIA",
		       "MILAN",
		        "MONTANITA",
		        "MORELIA"
		    };
		     public String[] CASANARE= {"AGUAZUL",
		        "CHAMEZA",
		        "HATO COROZAL",
		        "LA SALINA",
		        "MANI",
		        "MONTERREY",
		        "NUNCHIA",
		       "OROCUE",
		        "PAZ DE ARIPORO",
		        "PORE"
		    };
		    public String[] CAUCA= {"ALMAGUER",
		        "ARGELIA",
		        "BALBOA",
		        "BOLIVAR",
		        "BUENOS AIRES",
		        "CAJIBIO",
		        "CALDONO",
		       "CALOTO",
		        "CORINTO",
		        "EL TAMBO"
		    };
		   public String[] CESAR= {
		      "AGUACHICA",
		        "AGUSTIN CODAZZI",
		        "ASTREA",
		        "BECERRIL",
		        "BOSCONIA",
		        "CHIMI HAGUA",
		        "CHIRIGUANA",
		       "CURUMANI",
		        "EL COPEY",
		        "EL PASO"
		    };
		    public String[] CHOCO= {"ACANDI",
		        "ALTO BAUDO",
		        "ATRATO",
		        "BAGADO",
		        "BAHIA SOLANO",
		        "BAJO BAUDO",
		        "BOJAYA",
		       "CARMEN DEL DARIEN",
		        "CERTEGUI",
		        "CONDOTO"
		    };
		    
		        public String[] CORDOBA= {"AYAPEL",
		        "BUENAVISTA",
		        "CANALETE",
		        "CERETE",
		        "CHIMA",
		        "CHINU",
		        "CIENAGA DE ORO",
		       "COTORRA",
		        "LA APARTADA",
		        "LORICA"
		    };
		     public String[] CUNDINAMARCA= {"AGUA DE DIOS",
		        "ALBAN",
		        "ANAPOIMA",
		        "ANOLAIMA",
		        "APULO",
		        "ARBELAEZ",
		        "BELTRAN",
		       "BITUIMA",
		        "BOJACA",
		        "CAJICA",
		        "QUIPILE",
		        "RICAURTE",
		        "SOACHA",
		        "SOPO",
		        "TABIO",
		        "TENJO",
		        "TOCAIMA",
		        "TOCANCIPA","UBATE",
		        "ZIPAQUIRA",
		    };
		   
		        public String[] GUAINIA= {"BARRANCO MINA",
		        "CACAHUAL",
		        "INIRIDA",
		        "LA GUADALUPE",
		        "MAPIRIPANA",
		        "MORICHAL",
		        "PANA-PANA",
		       "PUERTO COLOMBIA",
		        "SAN FELIPE",
		    };
		     
		        public String[] GUAJIRA= {"ALBANIA",
		        "BARRANCAS",
		        "DIBULLA",
		        "DISTRACCION",
		        "EL MOLINO",
		        "FONSECA",
		        "HATO NUEVO",
		       "LA JAGUA DEL PILAR",
		        "MAICAO",
		        "MANAURE",
		        "RIOHACHA",
		        "SAN JUAN DEL CESAR",
		        "URIBIA",
		        "URUMITA",
		        "VILLANUEVA",
		    };
		  
		        public String[] GUAVIARE= {"CALAMAR",
		        "EL RETORNO",
		        "MIRAFLORES",
		        "SAN JOSE DEL GUAVIARE",
		    };
		     
		        public String[] HUILA= {"ACEVEDO",
		        "AGRADO",
		        "AIPE",
		        "ALGECIRAS",
		        "ALTAMIRA",
		        "BARAYA",
		        "CAMPOALEGRE",
		       "COLOMBIA",
		        "ELIAS",
		        "GARZON",
		    };
		    
		        public String[] MAGDALENA= {"ALGARROBO",
		        "ARACATACA",
		        "ARIGUANI",
		        "CERRO DE SAN ANTONIO",
		        "CHIVOLO",
		        "CIENAGA",
		        "CONCORDIA",
		       "EL BANCO",
		        "EL PINON",
		        "EL RETEN",
		    };
		  
		        public String[] META= {"ACACIAS",
		        "BARRANCA DE UPIA",
		        "CABUYARO",
		        "CASTILLA LA NUEVA",
		        "CUBARRAL",
		        "CUMARAL",
		        "EL CALVARIO",
		       "EL CASTILLO",
		        "EL DORADO",
		        "FUENTE DE ORO",
		      
		    };
		    
		        public String[] NSANTANDER= {"ABREGO",
		        "ARBOLEDAS",
		        "BOCHALEMA",
		        "BUCARASICA",
		        "CACHIRA",
		        "CACOTA",
		        "CHINACOTA",
		       "CHITAGA",
		        "CONVENCION",
		        "CUCUTA",
		       "CUCUTILLA",
		        "DURANIA",
		        "EL CARMEN",
		        "EL TARRA",
		        "EL ZULIA",
		        "GRAMALOTE",
		        "HACARI",
		         "HERRAN",
		        "LA ESPERANZA",
		          "LA PLAYA",
		       "LABATECA",
		        "LOS PATIOS",
		        "LOURDES",
		        "MUTISCUA",
		        "OCANA",
		        "PAMPLONA",
		        "PAMPLONITA",
		        "PUERTO SANTANDER",
		        "RAGONVALIA",
		        "SALAZAR",
		        "SAN CALIXTO",
		        "SAN CAYETANO",
		        "SANTIAGO",
		        "SARDINATA",
		        "SILOS",
		        "TEORAMA",
		        "TIBU",
		        "TOLEDO",
		        "VILLA CARO",
		        "VILLA DEL ROSARIO",
		    };
		    
		        public String[] NARINO= {"ALBAN",
		        "ALDANA",
		        "ANCUYA",
		        "ARBOLEDA",
		        "BARBACOAS",
		        "BELEN",
		        "BUESACO",
		       "CHACHAGUI",
		        "COLON (GEnova)",
		        "CONSACA"
		    };
		 
		        public String[] PUTUMAYO= {"COLON",
		        "MOCOA",
		        "ORITO",
		        "PUERTO ASIS",
		        "PUERTO CAICEDO",
		        "PUERTO GUZMAN",
		        "PUERTO LEGUIZAMO",
		       "SAN FRANCISCO",
		        "SAN MIGUEL",
		        "SANTIAGO"
		    };
		 
		        public String[] QUINDIO= {"ARMENIA",
		        "BUENAVISTA",
		        "CALARCA",
		        "CIRCASIA",
		        "CORDOBA",
		        "FILANDIA",
		        "GENOVA",
		       "LA TEBAIDA",
		        "MONTENEGRO",
		        "PIJAO"
		    };
		  
		        public String[] RISARALDA= {"APIA",
		        "BALBOA",
		        "BELEN DE UMBRIA",
		        "DOSQUEBRADAS",
		        "GUATICA",
		        "LA CELIA",
		        "LA VIRGINIA",
		       "MARSELLA",
		        "MISTRATO",
		        "PEREIRA"
		    };
		  
		        public String[] SANANDRES= {"PROVIDENCIA Y SANTA CATALINA",
		        "SAN ANDRES",
		    };
		    
		        public String[] SANTANDER= {"AGUADA",
		        "ALBANIA",
		        "ARATOCA",
		        "BARBOSA",
		        "BARICHARA",
		        "BARRANCABERMEJA",
		        "BETULIA",
		       "BOLIVAR",
		        "BUCARAMANGA",
		        "CABRERA"
		    };
		  
		        public String[] SUCRE= {"BUENAVISTA",
		        "CAIMITO",
		        "CHALAN",
		        "COLOSO",
		        "COROZAL",
		        "COVENAS",
		        "EL ROBLE",
		       "GALERAS",
		        "GUARANDA",
		        "LA UNION"
		    };
		    
		        public String[] TOLIMA= {"ALPUJARRA",
		        "ALVARADO",
		        "AMBALEMA",
		        "ANZOATEGUI",
		        "ARMERO",
		        "ATACO",
		        "CAJAMARCA",
		       "CARMEN DE APICALA",
		        "CASABIANCA",
		        "CHAPARRAL"
		    };
		 
		        public String[] VALLEDELCAUCA= {"ALCALA",
		        "ANDALUCIA",
		        "ANSERMANUEVO",
		        "ARGELIA",
		        "BOLIVAR",
		        "BUENAVENTURA",
		        "BUGA",
		       "BUGALAGRANDE",
		        "CAICEDONIA",
		        "CALI",
		        
		        "CALIMA",
		        "CANDELARIA",
		        "CARTAGO",
		        "DAGUA"
		
		    };
		    
		        public String[] VAUPES= {"CARURU",
		        "MITU",
		        "PACOA",
		        "PAPUNAUA",
		        "TARAIRA",
		        "YAVARATE",
		    };
		 
		        public String[] VICHADA= {"CUMARIBO",
		        "LA PRIMAVERA",
		        "PUERTO CARRENO",
		        "SANTA ROSALIA",
		    };
	
     public String[] gestionBodega_marca={"SilentCircle","Microsoft","Philips","Casio","Epson","Bosch","Toshiba","Acer",
     "Siemens","Sharp","Google","Celly","Xprinter","WzarPos","Sunmi","Genstar", "Verifone", "Spectra","Android"};
     
     public String[] gestionBodega_modelo={"TMm30","Xp58ii ","T500","NewPos","TR172"};
     
     public String[] gestionBodega_accesorios={"Conector Paneles Solares Mc4 Fotovoltaico","Cargador","Teclado","Conector usb","pantalla de cliente de 7 pulgadas 2*20 VFD"};
     
     public String[] gestionBodega_repuestos={"Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor",
    		 "Tactil","Batería","Bluetooth","Impresora","Switch Interruptor","Tactil","Batería","Bluetooth","Impresora","Switch Interruptor"};
     
     String rutaExcel_comercio="C:\\Users\\Wposs\\Downloads\\PlantillaComercio.xlsx";
     String rutaExcel_sim="C:\\Users\\Wposs\\Downloads\\PlantillaSim_x_comercio.xlsx";
     String rutaExcel_terminal="C:\\Users\\Wposs\\Downloads\\Plantillaterminales_x_comercio.xlsx";
     
	//public String[] gestionExtras_Distritos_
	public static Wrapper getSingleton() {
		if(wrapper==null) {
			wrapper=new Wrapper();
		}
		return wrapper;
	}

	public WebDriver getChromeConection() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
			driver= new ChromeDriver();
		}
		return driver;
	}
	
	public void click(By xpath) {
		driver.findElement(xpath).click();
	}

	public void type(By xpath, String string) {
		driver.findElement(xpath).sendKeys(string);
	}

	public boolean isDisplayed(By xpath) {
		return driver.findElement(xpath).isDisplayed();
	}
}
