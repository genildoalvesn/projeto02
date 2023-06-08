import java.time.LocalDateTime;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Individual individual1 = new Individual("senha123", true);
	        Individual individual2 = new Individual("senha456", false);
	        Participante participante = new Participante("Maria");
	        LocalDateTime datahora = LocalDateTime.now();

	        Mensagem mensagem = new Mensagem(1, "Ola, como voce esta?", individual1, participante, datahora);

	        // Adicionando a mensagem à lista de mensagens recebidas do participante

	        participante.getRecebidas().add(mensagem);

	        // Exibindo as mensagens recebidas pelo participante

	        System.out.println("Mensagens recebidas por " + participante.getNome() + ":");

	        for (Mensagem m : participante.getRecebidas()) {
	           // System.out.println("Remetente: " + m.getEmitente().get());
	            System.out.println("Mensagem: " + m.getTexto());
	            System.out.println("Data e Hora: " + m.getDatahora());
	        }

	        // Criando um grupo e adicionando indivíduos

	        Grupo grupo = new Grupo();
	        grupo.getIndividuos().add(individual1);
	        grupo.getIndividuos().add(individual2);

	        // Exibindo os indivíduos do grupo

	        System.out.println("Individuos do grupo:");
	        for (Individual individuo : grupo.getIndividuos()) {
	            System.out.println("Nome: " + participante.getNome());//.getNome());
	        }
	    }
	}