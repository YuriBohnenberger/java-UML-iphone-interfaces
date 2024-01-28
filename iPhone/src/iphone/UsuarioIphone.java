package iphone;

/**
 *
 * @author Yuri Telles
 */
public class UsuarioIphone {
        public static void main(String[] args) {
            Iphone iphone = new Iphone();
            
            iphone.ligarIphone();
            
            iphone.abrirNavegador();
            iphone.exibirPagina();
            iphone.atualizarPagina();
            iphone.adicionarNovaAba();
            iphone.fecharNavegador();
            
            iphone.abrirReprodutorMusical();
            iphone.selecionarMusica();
            iphone.tocarMusica();
            iphone.pausarMusica();
            iphone.fecharReprodutorMusical();
            
            iphone.fazerLigacao();
            iphone.finalizarLigacao();
            iphone.atenderLigacao();
            iphone.finalizarLigacao();
            iphone.iniciarCorreioVoz();
            
            iphone.desligarIphone();
    }
}
