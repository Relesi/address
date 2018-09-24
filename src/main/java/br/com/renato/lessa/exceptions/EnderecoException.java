package br.com.renato.lessa.exceptions;

/**
 * 
 * @author r.lessa.da.silva
 *
 */

public class EnderecoException extends Exception{
	
		private static final long serialVersionUID = 1L;

		public EnderecoException() {
			super();
		}

		public EnderecoException(String pMensagem) {
			super(pMensagem);
		}

		public EnderecoException(Throwable pException) {
			super(pException);
		}

		public EnderecoException(String pMensagem, Throwable pException) {
			super(pMensagem, pException);
		}
}
