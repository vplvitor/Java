import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cadastro> listaCadastro = new ArrayList<Cadastro>();
        System.out.println("Bem-vinda(a) ao sistema da Academia. Veja o menu para começar.");
        Scanner input = new Scanner(System.in);
        int indexGeral = 0;

        while (indexGeral != 0) {
            try {
                System.out.println("Menu Principal:\n");
                System.out.println("1) Cadastro");
                System.out.println("2) Item 2");
                System.out.println("3) Item 3");
                System.out.println("0) Sair");

                indexGeral = input.nextInt();

                switch (indexGeral) {
                    case 1:
                        int indexCadastro = 0;

                        while (indexCadastro != 0) {
                            try {
                                System.out.println("Menu de Cadastro:\n");
                                System.out.println("1) Criar Cadastro");
                                System.out.println("2) Editar Cadastro");
                                System.out.println("3) Excluir Cadastro");
                                System.out.println("4) Voltar ao Menu Principal");

                                indexCadastro = input.nextInt();

                                switch (indexCadastro) {
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
                                    case 0:
                                        System.out.println("0) Voltando ao Menu Principal.");
                                        break;
                                    default:
                                        System.out.println("Número da opção não está no Menu! Digite novamente.");
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
                        System.out.println("2) Item 2");
                        break;
                    case 3:
                        System.out.println("3) Item 3");
                        break;
                    case 0:
                        System.out.println("0) Saindo do programa. Obrigada por usar o nosso sistema!");
                        break;
                    default:
                        System.out.println("Número da opção não está no Menu Principal! Digite novamente.");
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
