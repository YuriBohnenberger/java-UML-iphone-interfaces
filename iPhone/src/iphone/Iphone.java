package iphone;

/**
 *
 * @author Yuri Telles
 */
public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    public void ligarIphone(){
        System.out.println("Ligando iphone");
    }
    
    public void desligarIphone(){
        System.out.println("Desligando iphone");
    }
    
    public void abrirNavegador(){
        System.out.println("Abrindo navegador de internet");
    }

    public void fecharNavegador(){
        System.out.println("Fechando navegador de internet");
    }
    
    public void abrirReprodutorMusical(){
        System.out.println("Abrindo reprodutor musical");
    }
    
    public void fecharReprodutorMusical(){
        System.out.println("Fechando reprodutor musical");
    }
    
    @Override
    public void tocarMusica(){
        System.out.println("Tocando música");
    }
    
    @Override
    public void pausarMusica(){
        System.out.println("Música pausada");
    }
    
    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando música");
    }
    
    @Override
    public void fazerLigacao(){
        System.out.println("Fazendo ligação");
    }
    
    @Override
    public void atenderLigacao(){
        System.out.println("Atendendo ligação");
    }
    
    @Override
    public void finalizarLigacao(){
        System.out.println("Finalizando ligação");
    }
    
    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz");
    }
    
    @Override
    public void exibirPagina(){
        System.out.println("Exibindo página no navegador");
    }
    
    @Override
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba no navegador");
    }
    
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página do navegador");
    }
}
