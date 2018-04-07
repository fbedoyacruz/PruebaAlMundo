package com.co.almundo.prueba.callcenter.enums;

/**
 * 
 * Enum para representar los estados de las llamadas en el call center de almundo
 * se crea para poder asignar la llamada a otro empleado u/o mantenerla encolada 
 * hasta que exista empleado disponible
 * una mejor actualización del código en caso de requerir más o menos estados.
 * @author fernbecr
 *
 */
public enum StateCalled {
	
	EN_PROGRESO,
	EN_ESPERA,
	FINALIZADA
}
