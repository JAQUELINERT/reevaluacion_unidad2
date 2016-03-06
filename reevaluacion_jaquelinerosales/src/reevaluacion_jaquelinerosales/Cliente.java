/**
 * 
 */
package reevaluacion_jaquelinerosales;

public class Cliente {

	public void usa(){
		IBanco banco = new IBanco() {
			
			@Override
			public void operacionesBancarias() {
				
			}
		};
	}
	
	public void solicita(){
		ICredito credito = new ICredito() {
			
			@Override
			public void estadoCrediticio() {
				
			}
		};
	}
	
	public void verifica(){
		AVerificador verificar = new AVerificador() {
			
			@Override
			void getCredito() {
				
			}
			
			@Override
			void getBanco() {
				
			}
		};
	}

}
