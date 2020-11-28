package Formularios;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	Ingresar.class,
	//GestionBodega.class, 						//3. Registrar 50  POR CIUDAD.. 
	//GestionExtras_Accesorios.class,			//6. por modelo son 5 acces  = 50 vidrio templado, base...
	//GestionExtras_Comercios.class,			////////////////////////////////////////7. 50mil comercios crediBanco (Cinemaks, papa johns...)
	//GestionExtras_Distritos.class,			///////////////////////////////////////////////////////////////////////////YA8. Registrar 100 (ciudades)
	//GestionExtras_MallaHorarios.class, 		//10.Registrar 4 (8-5...)
	//GestionExtra_MarcasTerminal.class, 		////////////////////////////////////////////////////////////////////////////4. Registrar 5 (NewPos, wzarPos,sunmi,Genstar, Verifone, Spectra)
	//GestionExtras_ModelosTerminal.class,		////////////////////////////////////////////////////////////////////////////5. Registrar 10 (Android 9220,T1000,....)
	//GestionExtras_Municipios.class,			///////////////////////////////////////////////////////////////////////////YA9. Registrar 20 (C/mca, Antioquia)
	//GestionExtras_ProductividadCampo.class,	///////////////////////////////////////////////////////////////////////////YAsolo registra una vez un registro en cada lugar //1. (7-8-9) 
	//GestionExtras_Repuestos.class,			//11. Regitrar 50 por terminal (pantalla, carcaza, bateria, conector cargador.. plug aud, lectores banda,chip msr..., camara)
	//GestionExtras_SimCard.class,				////////////////////////////////////////////12. Registrar 20mil  (serial 15 char)
	//GestionExtras_Terminales.class,			//13. Registrar 50mil (9 char alfanumerico sin espacios)
	//GestionExtras_TiemposParaClientes.class,	//14. Registrar 20
	//GestionExtra_Tipificaciones.class, 		//2. Registrar 30 (Motivo-solicitus no funciona la señal, no enciende) tipificacion de falla... el comercio esta cerrado, la persona no quizo atender
	GestionIncidencias_CrearIncidencia.class,	//
	//Read_write_excel.class,//*****
	//user 
	//100 tecnicos (70 campo, 30 lab)
	//15 cordinadores
	})
public class AllTests {

}
