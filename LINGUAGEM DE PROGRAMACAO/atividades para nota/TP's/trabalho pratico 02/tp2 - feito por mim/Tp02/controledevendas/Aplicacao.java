package controledevendas;

/* Trabalho produzido por:
    Kauã Ortolani Lusvarghi
    André Augusto 
*/

import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// sendo implements serializable para que ele possa ser gravados em um arquivo
public class Aplicacao implements Serializable {
    public int cpf;
    public String name;
    public String telefone;
    public String data;
    public float valorCompra;
    public static final String DELIMITER = ",";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;
        Aplicacao a = new Aplicacao();
        try {
            do {
                exibirMenu();
                op = in.nextInt();
                switch (op) {
                    case 1:
                        try {
                            System.out.println("\n=====> Cadastrar"); // Cadastro de clientes
                            System.out.print("Digite o CPF: ");
                            a.cpf = in.nextInt();
                            // enquanto cpf for igual de outra pessoa cadastrada, ele ficará neste looping
                            while (validacaoCpf(a.cpf) != null) { 
                                System.out.println("Já existe uma conta cadastrada com este CPF!");
                                System.out.print("CPF: ");
                                a.cpf = in.nextInt();
                            }
                            System.out.print("Digite o nome do cliente: ");
                            in.nextLine();
                            a.name = in.nextLine();
                            System.out.print("Digite o telefone: ");
                            a.telefone = in.nextLine();
                            System.out.println("\nCliente cadastrado com sucesso!");
                            Path path = Paths.get("registro.dat");
                            //caso a pasta já exista, ele não entrará neste if, e cnão não
                            //ele entrará e criará ela
                            if (Files.exists(path)) {
                                try (FileOutputStream fos = new FileOutputStream("registro.dat", true);
                                        AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
                                    output.writeObject(a);
                                } catch (FileNotFoundException e) {
                                    System.out.println("Não foi possível abrir o arquivo registro.dat!");
                                } catch (IOException e) {
                                    System.out.println("Erro de escrita no arquivo registro.dat!");
                                }
                            } else {
                                try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
                                    output.writeObject(a);
                                } catch (IOException e) {
                                    System.out.println("Erro de escrita no arquivo registro.dat!");
                                }
                            }
                        } catch (InvalidPathException e) {
                            System.out.println("Não foi possivel encontrar o arquivo registro.dat!");
                        }
                        break;
                    case 2:
                        //apenas listará os clientes cadastrados chamndo o subprograma 
                        System.out.println("\n=====> Listagem de Clientes");
                        listarClientes();
                        break;
                    case 3:
                        System.out.println("\n=====> Consulta por Cliente");
                        System.out.print("Insira o primeiro nome do cliente: ");
                        in.nextLine();
                        a.name = in.nextLine();
                        // caso o CPF não seja compativel com o de nenhum cliente
                        // cadastrado ele não aceitará e sairá do looping
                        if (validarName(a.name) == 0) { 
                            System.out.println("\nNão existe nenhum cliente com este nome!");

                            // caso o nome seja igual a de outro cliente, ele entrará neste If Else
                            // para caso o nome seja composto, tendo um caracter de espaço nele
                        } else if (validarName(a.name) == 1) { 
                            //enquanto o nome seja composto ele ficará neste looping
                            while (true) { 
                                System.out.println("Não é necessário informar o nome completo do cliente");
                                System.out.print("Nome: ");
                                // in.nextLine();
                                a.name = in.nextLine();
                                //caso seja inserido um nome simples e que seja igual, ele entrará neste if e executará o subprograma
                                if (verCaracterEspaco(a.name) == -1 && validarName(a.name) == 2) { //// esse subprograma irá ser chamado e exibir o cpf, nome e telefone ///do cliente
                                    exibirCadastroExpecifico(a.name);
                                    break;
                                }
                                //caso seja um nome simples e diferente de qualquer um cadastrado el //entrará neste if
                                if (validarName(a.name) == 0) {
                                    System.out.println("\nNão existe nenhum cliente com este nome!");
                                    break;
                                }
                            }
                        // caso o nome inserido seja compativel com algum outro cadastrado 
                        // e tambem não seja nome composto, ele irá executar o subprograma
                        } else if (validarName(a.name) == 2) {                             
                            exibirCadastroExpecifico(a.name);
                        }
                        break;
                    case 4:
                        try {
                            System.out.println("\n=====> Cadastrar Compras");
                            System.out.print("Digite o CPF: ");
                            a.cpf = in.nextInt();
                            // valida se existe um usuário com o cpf inserido, 
                            // caso não, ele entre neste if, exibe a mesgem e sai do case 4
                            if (validacaoCpf(a.cpf) == null) { 
                                System.out.println("CPF não cadastrado.");
                                break;
                            }
                            System.out.print("Informe a data da compra: ");
                            in.nextLine();
                            a.data = in.next();
                            System.out.print("Insira o valor da Compra: ");
                            a.valorCompra = in.nextFloat();
                             //entra neste while caso o valor seja menor que 0 e só sai se foi 
                             //maior  do que 0
                            while (a.valorCompra <= 0) {
                                System.out.println("Valor inválido");
                                System.out.print("Insira novamente o valor da Compra: ");
                                a.valorCompra = in.nextFloat();
                            }
                            System.out.println("\nCompra cadastrada com sucesso! ");
                            
                            Path path = Paths.get("compras.dat"); 
                            // caso o arquivo "comrpras" exista ele apenas adiciona o conteudo a ele
                            //caso não, ele ira criar o arquivo
                            if (Files.exists(path)) { 
                                try (FileOutputStream fos = new FileOutputStream("compras.dat", true);
                                        AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
                                    output.writeObject(a);
                                } catch (FileNotFoundException e) {
                                    System.out.println("Não foi possível abrir o arquivo compras.dat!");
                                } catch (IOException e) {
                                    System.out.println("Erro de escrita no arquivo compras.dat!");
                                }
                            } else {
                                try (ObjectOutputStream output = new ObjectOutputStream(Files.newOutputStream(path))) {
                                    output.writeObject(a);
                                } catch (IOException e) {
                                    System.out.println("Erro de escrita no arquivo compras.dat!");
                                }
                            }
                        } catch (InvalidPathException e) {
                            System.out.println("Não foi possivel encontrar o arquivo compras.dat!");
                        }
                        break;
                    //listará as compras por base na data inserida
                    case 5:
                        String dataComparar;
                        System.out.println("\n=====> Listar Compras por Data");
                        System.out.print("Insira a data da compra: ");
                        String dvdData = in.next();
                        dataComparar = dvdData;
                        //ira verificar se data inserida é igual a alguma cadastrada antes
                        if (validacaoData(dataComparar) == null) { 
                            //caso não ha, ele ira exibir está mensagem
                            System.out.println("\nNão existe nehuma compra nesta Data!");
                            break;
                        } else { 
                            // caso já tenha sido cadastrado, ele entrará nesse subprograma
                            // para exibir as compras, cpf e nome do cliente
                            mostrasNameComprasData(dataComparar);
                        }
                        break;
                    //listará as compras por base no cpf inserido
                    case 6:
                        System.out.println("\n=====> Listar Compras por Clientes");
                        System.out.print("Insira o Cpf do cliente: ");
                        int cpfCompareCompra = in.nextInt();
                        // caso o inserido não seja igual nenhum cadastrado ele entrará neste if
                        if (validacaoCpf(cpfCompareCompra) == null) {
                            // e ira exibir está mensagem
                            System.out.println("Não existe nehuma conta cadastrada com este CPF!");
                            break;
                        } else {
                            // caso seja compativel com algum cpf cadastrado, ele entrará 
                            //nesse subprograma para exibir as compras, data e nome do cliente
                            mostrasNameComprasCpf(cpfCompareCompra);
                        }
                        break;
                    case 7:
                        System.out.println("\n=====> Importar dados");
                        System.out.println("Deseja importar aquivos de registro dos Clientes ou registro das Compras? ");
                        System.out.println("[1] Registro de Clientes\n[2] Registro de Compras\n[3] Ambos\n[0] Sair");
                        int opcao = 0;
                        do { // entrará neste do/while até o usuario digitar 0 (para sair)
                            int ab = 3;
                            opcao = in.nextInt();
                            switch (opcao) {
                                case 1:
                                readCsvCliente(ab);
                                break;
                                case 2:
                                readCsvCompras(ab);
                                break;
                                case 3:
                                ab = 0;
                                readCsvCliente(ab);
                                readCsvCompras(ab);
                                System.out.println("Arquivos importados com sucesso!");
                                break;
                                default:
                                System.out.println("Opção inválida!");
                            }  
                            System.out.print("\nMais alguma importação? ");
                            System.out.println("[1] Registro de Clientes\n[2] Registro de Compras\n[3] Ambos\n[0] Sair");
                        } while (opcao != 0);
                        break;
                    case 0:
                    break;
                    default:
                        System.out.println("\nOpcão invalida!");
                }
            } while (op != 0);
            in.close();
        } catch (InvalidPathException e) {
            System.out.println("Não foi possivel encontrar o arquivo registro.dat!");
        }
    }

    // Menu de Opções
    static void exibirMenu() {
        System.out.println("\n=======Controle de Vendas=======");
        System.out.println("(1) Cadastrar Cliente");
        System.out.println("(2) Listar Clientes");
        System.out.println("(3) Consulta por Cliente");
        System.out.println("(4) Cadastrar Compras");
        System.out.println("(5) Listar Compras por Data");
        System.out.println("(6) Listar Compras por Clientes");
        System.out.println("(7) Importar dados");
        System.out.println("(0) Sair");
        System.out.print("===> opção: ");
    }

    // Validando CPF, tendo a entrada de um string, que no caso é o cpf
    // e tera um return "a" ou "null"

    //usado no menu 4, 6
    public static Aplicacao validacaoCpf(int cpf) {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("registro.dat")))) {
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                if (a.cpf == cpf) {
                    return a;
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            // System.out.println("Erro de leitura no arquivo");
        }
        return null;
    }

    // Menu 2 = Subprograma para listar os clientes do arquivo "registro" e exibir o nome, cpf e telofene cadastrados
    static public void listarClientes() {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("registro.dat")))) {
            String nomeC = "NOME";
            String telefoneC = "TELEFONE";
            if (true) {
                System.out.printf("\n%-25.25s %-25.25s CPF\n", nomeC, telefoneC);
                while (true) {
                    Aplicacao a = (Aplicacao) input.readObject();
                    System.out.printf("%-25.25s %-25.25s %d\n", a.name, a.telefone, a.cpf);
                }
            }
        } catch (EOFException e) {
            System.out.println("\nFim dos registros");
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
    }

    // Menu 3 = Validar se o nome existe, que recebe uma string, que será o nome 
    // inserido pelo usuario, e retornará um int, porem dentro dele é chamado a função 
    // "verCaracterEspaco" para que seja verificado se é nome simple ou composto 
    static public int validarName(String nomeValid) {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("registro.dat")))) {
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                // por meio de um subprograma ele irá verificar se o nome é
                // composto, avaliando se existe algum caracter de espaço
                if (verCaracterEspaco(nomeValid) != -1) { 
                    return 1;                 
                }
                // verifica se o nome começa igual ao inserido pelo usuário
                // que provavelmente foi inserido apenas um nome
                if (a.name.toUpperCase().startsWith(nomeValid.toUpperCase())) {
                    return 2;
                }
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
        //caso ele não seja nome composto e nem igual a nenhum outro nome de
        //ele retornara este 0
        return 0;
    }

    // Menu 3 = verifica se na string de verificação há espaço, que seria caso o usuario inserisse 
    // dois nomes
    static public int verCaracterEspaco(String nomeConsulta) {
        int num = 0;
        num = nomeConsulta.indexOf(" ");
        return num;
    }

    // Menu 3 = Exibi as informações sobre o cliente expecifico caso esteja cadastrado
    // percorrendo o arquivo "registro"
    static public void exibirCadastroExpecifico(String nameCliente) {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("registro.dat")))) {
            String nomeC = "NOME";
            String telefoneC = "TELEFONE";
            if (true) {
                System.out.printf("\n%-25.25s %-25.25s CPF\n", nomeC, telefoneC);
            }
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                if (a.name.toUpperCase().startsWith(nameCliente.toUpperCase())) {
                    System.out.printf("%-25.25s %-25.25s %d\n", a.name, a.telefone, a.cpf);
                }
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
    }

    // Menu 5 = pesquisa se há alguma compra cadastrada na data inserida pelo usuario para
    // retornado "null" ou "a"
    public static Aplicacao validacaoData(String dataVerifica) {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))) {
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                if (a.data.startsWith(dataVerifica)) {
                    return a;
                }
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            // System.out.println("Erro de leitura no arquivo");
        }
        return null;
    }

    // Menu 5 = é um subprograma void, não retornando nada, apenas irá exibir o cpf, nome, 
    // compras realizadas e o total de todas as compras que o usuario fez
    static public void mostrasNameComprasData(String dataComparar) {
        int cont = 0;
        int ct = 1;
        float total = 0;
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))) {
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                // caso o cont (contador), seja igual a 0, que será verdadeiro apenas na primeira 
                //vez que for rodar, ele irá exibir apenas o cabeçalho, que é o NOME e CPF
                if (a.data.equals(dataComparar) && cont == 0) {
                    System.out.printf("CPF: %d  -----  NOME: %s\n\n", a.cpf, cpfPesquisaCompra(a.cpf));
                    cont++;
                }
                //Depois irá ser exibido apenas esse por conta que o "cont" foi incrementado
                //valendo apenas um pra sempre 
                //Sendo necessario verificar a data novamente para ela não exibir outras compras 
                //em outras datas
                if (a.data.equals(dataComparar) && cont == 1) {
                    System.out.printf("COMPRA Nº%d: %.2f\n", (ct++), a.valorCompra);
                    total += a.valorCompra;
                }
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("Nenhuma data encontrada");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
        if (cont > 0) {
            System.out.printf("\nO total comprado pelo cliente nesta data é de %.2f\n", total);
        }
    }

    // menu 5 e 6 = é um subprograma que ira percorrer o arquivo de registro dos clientes,
    // e com o cpf inserido irá retornar o nome do cliente que for compativel com aquele cpf para 
    // poder ser exibido ao listar os clientes pela Data no subprograma acima
    static public String cpfPesquisaCompra(int cpfCliente) {
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("registro.dat")))) {
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                if (a.cpf == cpfCliente) {
                    return a.name;
                }
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("Tipo de objeto invalido!");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
        return null;
    }

    // Menu 6 = retorna o nome, data das compras realizadas e o total caso
    static public void mostrasNameComprasCpf(int cpfCliente) {
        int cont = 0;
        float total = 0;
        try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("compras.dat")))) {
            String nomeC = "NOME";
            String dataC = "DATA";
            String comprasC = "COMPRA";
            //cabeçalho que será exibido apenas uma vez
            if (true) {
                // subprograma "cpfPesquisaCompra" serve para apeans pegar o nome que é igual ao 
                // inserido pelo usuario
                System.out.printf("\n%s: %s\n\n", nomeC, cpfPesquisaCompra(cpfCliente));
                System.out.printf("%-15.15s %-15.15s\n", dataC, comprasC);
            }
            while (true) {
                Aplicacao a = (Aplicacao) input.readObject();
                if (a.cpf == cpfCliente) {
                    System.out.printf("%-15.15s %.2f\n", a.data, a.valorCompra);
                    total += a.valorCompra;
                    cont++;
                }
            }
        } catch (EOFException e) {
        } catch (ClassNotFoundException e) {
            System.out.println("Nenhuma data encontrada");
        } catch (IOException e) {
            System.out.println("Erro de leitura no arquivo");
        }
        if (cont != 0) {
            System.out.printf("\nO total comprado pelo cliente é de %.2f\n", total);
        }else {
            System.out.printf("\n\nNão existe nenhuma compra realizada por este cliente!\n");
        }
    }

    // Menu 7 = Importar arquivo registro, salvando na memória
    public static void readCsvCliente(int ab) {
        final String DELIMITER = ";";
        List<String[]> arquivo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("registro.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                arquivo.add(values);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Uso incorreto!");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita: " + e.getMessage());
        }finally {
            if (ab != 0) {
            System.out.println("Arquivo importado com sucesso!");
            }
        }
    }

    // Menu 7 = Importar arquivo compras, salvando na memória
    public static void readCsvCompras(int ab) {
        final String DELIMITER = ";";
        List<String[]> arquivo = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("compras.dat"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                arquivo.add(values);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Uso incorreto!");
        } catch (IOException e) {
            System.out.println("Erro de leitura/escrita: " + e.getMessage());
        }finally {
            if (ab != 0) {
            System.out.println("Arquivo importado com sucesso!");
            }
        }
    }
}