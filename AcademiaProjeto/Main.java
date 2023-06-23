import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cadastro> listaCadastro = new ArrayList<Cadastro>();
    	ArrayList<Treino> listaTreinos = new ArrayList<Treino>();
        System.out.println("Bem-vinda(a) ao sistema da Academia. Veja o menu para começar.");
        Scanner input = new Scanner(System.in);
        int index = 1;

        while (index != 0) {
            try {
                System.out.println("Menu Principal:\n");
                System.out.println("1) Cadastro de Membros");
                System.out.println("2) Criacao de Treinos");
                System.out.println("3) Item 3");
                System.out.println("0) Encerrar Programa");

                index = input.nextInt();

                switch (index) {
                    case 1:
                        while (index != 9) {
                            try {
                                System.out.println("Menu de Cadastro:\n");
                                System.out.println("1) Criar Cadastro");
                                System.out.println("2) Editar Cadastro");
                                System.out.println("3) Excluir Cadastro");
                                System.out.println("4) Listar Cadastros");
                                System.out.println("9) Voltar ao Menu Principal");

                                index = input.nextInt();

                                switch (index) {
                                    case 1:
                                        System.out.println("1) Criação de Cadastro. Digite as informações pedidas.");
                                        Cadastro cadastro = new Cadastro();
                                        listaCadastro.add(cadastro.criarCadastro());
                                        break;
                                    case 2:
                                        System.out.println("2) Edição de Cadastros. Digite o nome de quem deseja alterar os dados.");
                                        cadastro = new Cadastro();
                                        cadastro.editaCadastro(listaCadastro);
                                        break;
                                    case 3:
                                        System.out.println("3) Remoção de Cadastros. Digite o nome do cadastro que deseja remover.");
                                        cadastro = new Cadastro();
                                        cadastro.deletaCadastro(listaCadastro);
                                        break;
                                    case 4:
                                        System.out.println("4) Listagem de Cadastro. Aqui está a lista de membros cadastrados atualmente.");
                                        for (Cadastro membro : listaCadastro) {
                                            System.out.println(membro.toString());
                                        }
                                        break;
                                    case 9:
                                        System.out.println("9) Saindo do menu de Cadastros e voltando ao Menu Principal.");
                                        break;
                                    default:
                                        System.out.println("Número da opção não está no Menu de Cadastro! Digite novamente.");
                                        break;
                                }

                                System.out.println();
                            } catch (InputMismatchException ime) {
                                System.out.println("Digito inválido. Digite apenas valores numéricos válidos para o menu.");
                                System.out.println("Erro: " + ime.getMessage());
                                input.nextLine();
                            }
                        }

                        break;
                    case 2:
                        System.out.println("2) Criacao de Treinos");
                        while (index != 9) {
                            try {
                                System.out.println("Menu de Exercicios:\n");
                                System.out.println("1) Incluir Treino de Musculacao");
                                System.out.println("2) Incluir Aula Aerobica");
                                System.out.println("3) Listagem de Treinos");
                                System.out.println("4) Edicao de Treinos");
                                System.out.println("5) Remocao de Treinos");
                                System.out.println("9) Voltar ao Menu Principal");

                                index = input.nextInt();
                                input.nextLine();
                                switch (index) {
                                    case 1:
                                        System.out.println("1) Treino de Musculacao. Digite as informações para incluir o exercício.");
                                        TreinoMusculacao treinoMusc = new TreinoMusculacao();
                                        listaTreinos.add(treinoMusc.criarTreino());
                                        break;
                                    case 2:
                                        System.out.println("2) Aula Aerobica. Digite as informacoes para incluir a aula.");
                                        TreinoAerobico treinoAero = new TreinoAerobico();
                                        listaTreinos.add(treinoAero.criarTreino());
                                        break;
                                    case 3:
                                    	System.out.println("3) Listagem de Treinos. Aqui está as listas de Treinos criados.");
                                        for (Treino exercicios : listaTreinos) {
                                            System.out.println(exercicios.toString());
                                        }
                                        break;
                                    case 4:
                                    	System.out.println("4) Edicao de Treinos. Digite o nome do treino que deseja editar.");
                                    	treinoMusc = new TreinoMusculacao();
                                        treinoMusc.editaTreinos(listaTreinos);
                                    	break;
                                    case 5:
                                    	System.out.println("5) Remocao de Treinos. Digite o nome do treino que deseja remover.");
                                    	treinoMusc = new TreinoMusculacao();
                                        treinoMusc.removeTreinos(listaTreinos);
                                    	break;
                                    case 9:
                                        System.out.println("9) Saindo do menu de Treinos e voltando ao Menu Principal.");
                                        break;
                                    default:
                                        System.out.println("Numero da opcao nao esta no Menu de Treinos! Digite novamente.");
                                        break;
                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
                                System.out.println();
                            } catch (InputMismatchException ime) {
                                System.out.println("Digito invalido. Digite apenas valores numericos validos para o menu.");
                                System.out.println("Erro: " + ime.getMessage());
                                input.nextLine();
                            }
                        }
                        break;
                    case 3:
                        System.out.println("3) Item 3");
                        break;
                    case 0:
                        System.out.println("0) Saindo do programa. Obrigada por usar o nosso sistema!");
                        break;
                    default:
                        System.out.println("Numero da opção nao esta no Menu Principal! Digite novamente.");
                        break;
                }

                System.out.println();
            } catch (InputMismatchException ime) {
                System.out.println("Digito inválido. Digite apenas valores numéricos válidos para o menu.");
                System.out.println("Erro: " + ime.getMessage());
                input.nextLine();
            }
        }
        
        input.close();
    }
}
