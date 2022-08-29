public class Cliente implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public AutenticacaoUtil getAutenticador() {
        return autenticador;
    }


    public void setAutenticador(AutenticacaoUtil autenticador) {
        this.autenticador = autenticador;
    }


    public Cliente(){
        this.autenticador = new AutenticacaoUtil();
   }

  

    
    @Override
    public boolean autentica(int senha){
        return this.autenticador.autentica(senha);

    }


    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
        
    }   

}
