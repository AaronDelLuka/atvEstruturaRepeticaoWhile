package atvEstruturaRepetição;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1) Scanner scanner = new Scanner(System.in);
		 * 
		 * int alunosAprovados = 0; int alunosReprovados = 0; double maiorNota =
		 * Double.MIN_VALUE; double menorNota = Double.MAX_VALUE; double somaNotas =
		 * 0.0; int totalAlunos = 0;
		 * 
		 * System.out.
		 * println("Informe a nota final do aluno (ou uma nota negativa para sair):");
		 * double nota = scanner.nextDouble();
		 * 
		 * while (nota >= 0) {
		 * System.out.println("Informe o total de faltas do aluno:"); int faltas =
		 * scanner.nextInt();
		 * 
		 * if (nota >= 90) { alunosAprovados++; } else if (nota < 70 || faltas >= 20) {
		 * alunosReprovados++; }
		 * 
		 * if (nota > maiorNota) { maiorNota = nota; }
		 * 
		 * if (nota < menorNota) { menorNota = nota; }
		 * 
		 * somaNotas += nota; totalAlunos++;
		 * 
		 * System.out.
		 * println("Informe a nota final do próximo aluno (ou uma nota negativa para sair):"
		 * ); nota = scanner.nextDouble(); }
		 * 
		 * if (totalAlunos > 0) { double mediaNotas = somaNotas / totalAlunos;
		 * 
		 * System.out.println("Quantidade de alunos com nota >= 90: " +
		 * alunosAprovados); System.out.println("Quantidade de alunos reprovados: " +
		 * alunosReprovados); System.out.println("Maior nota: " + maiorNota);
		 * System.out.println("Menor nota: " + menorNota);
		 * System.out.println("Média de notas da turma: " + mediaNotas); } else {
		 * System.out.println("Nenhum aluno informado."); }
		 * 
		 * scanner.close();
		 */
		/*
		 * 2) Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.
		 * println("Informe a matrícula do aluno (ou uma matrícula negativa para sair):"
		 * ); int matricula = scanner.nextInt();
		 * 
		 * while (matricula >= 0) {
		 * System.out.println("Informe as três notas do aluno:"); double nota1 =
		 * scanner.nextDouble(); double nota2 = scanner.nextDouble(); double nota3 =
		 * scanner.nextDouble();
		 * 
		 * double media = (nota1 + nota2 + nota3) / 3.0;
		 * 
		 * if (media >= 70) { System.out.println("Aluno com matrícula " + matricula +
		 * " foi aprovado."); } else if (media >= 60) {
		 * System.out.println("Aluno com matrícula " + matricula +
		 * " está em recuperação."); } else { System.out.println("Aluno com matrícula "
		 * + matricula + " foi reprovado."); }
		 * 
		 * System.out.
		 * println("Informe a matrícula do próximo aluno (ou uma matrícula negativa para sair):"
		 * ); matricula = scanner.nextInt(); }
		 * 
		 * scanner.close();
		 */
		/*
		 * 3) Scanner scanner = new Scanner(System.in);
		 * 
		 * int canal; int totalAudienciaTotal = 0; int[] audienciaPorCanal = new
		 * int[13]; // Índice 0 não será usado, canais de 2 a 12.
		 * 
		 * System.out.
		 * println("Informe o número do canal (2, 4, 5, 7, 12) e o número de pessoas assistindo (ou 0 para encerrar):"
		 * );
		 * 
		 * while (true) { System.out.print("Número do canal (ou 0 para encerrar): ");
		 * canal = scanner.nextInt();
		 * 
		 * if (canal == 0) { break; }
		 * 
		 * if (canal >= 2 && canal <= 12) {
		 * System.out.print("Número de pessoas assistindo: "); int audiencia =
		 * scanner.nextInt();
		 * 
		 * audienciaPorCanal[canal] += audiencia; totalAudienciaTotal += audiencia; }
		 * else { System.out.
		 * println("Canal inválido. Informe um canal válido (2, 4, 5, 7, 12)."); } }
		 * 
		 * System.out.println("Percentual de audiência por canal:"); for (int i = 2; i
		 * <= 12; i++) { if (audienciaPorCanal[i] > 0) { double percentual = (double)
		 * audienciaPorCanal[i] / totalAudienciaTotal * 100; System.out.println("Canal "
		 * + i + ": " + percentual + "%"); } }
		 * 
		 * scanner.close();
		 */
		/*
		 * 4) Scanner scanner = new Scanner(System.in);
		 * 
		 * int totalPessoas = 0; double somaSalarios = 0.0; int somaFilhos = 0;
		 * 
		 * System.out.println("Digite o salário (ou um salário negativo para encerrar):"
		 * ); double salario = scanner.nextDouble();
		 * 
		 * while (salario >= 0) { System.out.println("Digite o número de filhos:"); int
		 * numFilhos = scanner.nextInt();
		 * 
		 * somaSalarios += salario; somaFilhos += numFilhos; totalPessoas++;
		 * 
		 * System.out.
		 * println("Digite o salário da próxima pessoa (ou um salário negativo para encerrar):"
		 * ); salario = scanner.nextDouble(); }
		 * 
		 * if (totalPessoas > 0) { double mediaSalario = somaSalarios / totalPessoas;
		 * double mediaFilhos = (double) somaFilhos / totalPessoas;
		 * 
		 * System.out.println("Média Salarial da População: " + mediaSalario);
		 * System.out.println("Média do Número de Filhos da População: " + mediaFilhos);
		 * } else { System.out.println("Nenhum dado informado."); }
		 * 
		 * scanner.close();
		 */
	}

}
