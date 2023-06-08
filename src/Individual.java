import java.util.ArrayList;

public class Individual {
	 private String senha;
	    private boolean administrador;
	    private ArrayList<Mensagem> enviadas;
	    private ArrayList<Grupo> grupos;

	    public Individual(String senha, boolean administrador) {
	        this.senha = senha;
	        this.administrador = administrador;
	        this.enviadas = new ArrayList<>();
	        this.grupos = new ArrayList<>();
	    }

	    // Getters e Setters

	    public String getSenha() {
	        return senha;
	    }

	    public void setSenha(String senha) {
	        this.senha = senha;
	    }

	    public boolean isAdministrador() {
	        return administrador;
	    }

	    public void setAdministrador(boolean administrador) {
	        this.administrador = administrador;
	    }

	    public ArrayList<Mensagem> getEnviadas() {
	        return enviadas;
	    }

	    public void setEnviadas(ArrayList<Mensagem> enviadas) {
	        this.enviadas = enviadas;
	    }

	    public ArrayList<Grupo> getGrupos() {
	        return grupos;
	    }

	    public void setGrupos(ArrayList<Grupo> grupos) {
	        this.grupos = grupos;
	    }

		@Override
		public String toString() {
			return "Individual [senha=" + senha + ", administrador=" + administrador + ", enviadas=" + enviadas
					+ ", grupos=" + grupos + "]";
		}

		
	}