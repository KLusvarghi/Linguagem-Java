// package prova02;
// import java.io.EOFException;
// import java.io.FileNotFoundException;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.ObjectInputStream;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.util.Scanner;

// import AppendingObjectOutputStream;

// public class Paciente {
//     private int cpf;
//     private String nome;
//     private int peso;

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         int op = 0;

//         /* menu */
//         do {
//             System.out.println("Sistema de registro para Pacientes");
//             System.out.println("<1> Cadastrar paciente ");
//             System.out.println("<2> Consultar paciente");
//             System.out.println("<0> Sair");
//             System.out.print("Opção: ");

//             op = in.nextInt();
//             switch (op) {
//                 case 1:
//                     novoPaciente();
//                     break;
//                 case 2:
//                     paciente();
//                     break;
//                 case 0:
//                     break;
//                 default:
//                     System.out.println("Opção invalida!");
//             }
//         } while (op != 0);
//         in.close();

//     }

//     /* registro de pacientes */
//     private static void paciente() {
//         try (ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get("pacientes.dat")))) {
//             while (true) {
//                 Paciente d = (Paciente) input.readObject();
//                 System.out.printf("%d - %-20.20s %10.2f\n", d.cpf, d.nome, d.peso);
//             }
//             /* possíveis erros */
//         } catch (EOFException e) {
//             System.out.println("Fim dos registros");
//         } catch (ClassNotFoundException e) {
//             System.out.println("Tipo de objeto invalido!");
//         } catch (IOException e) {
//             System.out.println("Erro de leitura no arquivo");
//         }
//     }

//     /* registro de novos pacientes */
//     private static void novoPaciente() {
//         Paciente d = new Paciente();
//         try {
//             Scanner in = new Scanner(System.in);
//             System.out.print("CPF: ");
//             d.cpf = in.nextInt();
//             while (cpfCadastrado(d.cpf) != null)
//             /* caso o cpf ja esteja sendo usado */ {
//                 System.out.println("Ja' existe um paciente cadastrado com este cpf!");
//                 System.out.print("CPF: ");
//                 d.cpf = in.nextInt();
//             }
//             System.out.print("Nome: ");
//             in.nextLine();
//             d.nome = in.nextLine();
//             System.out.print("Digite o peso do paciente:");
//             d.peso = (int) in.nextFloat();
//             Path path = Paths.get("pacientes.dat");

//             if (Files.exists(path)) {
//                 try (FileOutputStream fos = new FileOutputStream("pacientes.dat", true);
//                         AppendingObjectOutputStream output = new AppendingObjectOutputStream(fos)) {
//                     output.writeObject(d);
//                     /* possíveis erros */
//                 } catch (FileNotFoundException e) {
//                     System.out.println("Nao foi possível abrir o arquivo pacientes.dat!");
//                 } catch (IOException e) {
//                     System.out.println("Erro de escrita no arquivo pacientes.dat!");
//                 }
//             }
//         } finally {

//         }

//     }

// }