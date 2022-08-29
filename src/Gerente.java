public class Gerente extends Funcionario implements Autenticavel  {
	
	
	private Object autenticador;

	public Gerente(){
		this.autenticador = new AutenticacaoUtil();
	}


	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
    public boolean autentica(int senha){
        return ((Gerente) this.autenticador).autentica(senha);

    }


    @Override
    public void setSenha(int senha) {
        ((Gerente) this.autenticador).setSenha(senha);
        
    }  
}