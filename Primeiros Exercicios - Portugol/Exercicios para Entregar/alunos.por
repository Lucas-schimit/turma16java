programa
{
	inclua biblioteca Util --> u
	inclua biblioteca Tipos --> tip
	inclua biblioteca Texto --> tex
	
	funcao inicio()
	{
		//cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","CÂNDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
		cadeia alunos[] = {
			"Joao",
			"Maria",
			"Jose",
			"Zé"
		}
		inteiro tamanho = u.numero_elementos(alunos)
		
		real notas[4]
		cadeia matricula[4]
		cadeia situacao[4]
		cadeia matriculaPesquisa
		cadeia continua = "S"
		inteiro id

		para(inteiro i=0; i<4; i++) {
			matricula[i] = "G1-" + i
		}

		escreva("Lista de Matrículas\n")
		para(inteiro i=0; i<4; i++) {
			escreva(matricula[i] + "\t\t" + alunos[i] + "\n")
		}

		enquanto(continua == "S") {
			escreva("Digite a matricula do aluno: ")
			leia(matriculaPesquisa)
			matriculaPesquisa = tex.caixa_alta(matriculaPesquisa)
			matriculaPesquisa = tex.extrair_subtexto(matriculaPesquisa, 3, 4)
			id = tip.cadeia_para_inteiro(matriculaPesquisa, 10)
			escreva("Digite uma nota para este aluno (1-10): ")
			leia(notas[id])
			enquanto(notas[id] < 1 ou notas[id] > 10) {
				escreva("Valor inválido! Digite uma nota para este aluno (1-10): ")
				leia(notas[id])
			}
			escreva("Deseja continuar? (S/N): ")
			leia(continua)
			continua = tex.caixa_alta(continua)
			
			se(continua == "S") {
				se(notas[id] > 8) {
					situacao[id] = "Aprovado!"
				} senao se (notas[id] >= 5) {
					situacao[id] = "Em análise!"
				} senao {
					situacao[id] = "Reprovado!"
				}
			} senao {
				se(notas[id] > 8) {
					situacao[id] = "Aprovado!"
				} senao se (notas[id] >= 5) {
					situacao[id] = "Em análise!"
				} senao {
					situacao[id] = "Reprovado!"
				}
			}
		}

		escreva("Matrícula\tNota\t\tSituação\t\tNome\n")
		para(inteiro i=0; i<4; i++) {
			escreva(matricula[i] + "\t\t" + notas[i] + "\t\t" + situacao[i] + "\t\t" + alunos[i] + "\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1762; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */