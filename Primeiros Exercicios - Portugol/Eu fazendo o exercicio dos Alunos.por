programa
{
	
	funcao inicio()
	{

	/* DESAFIO DA NOTAS


    VETOR - TODOS OS NOMES DE ALUNOS

    cadeia alunos[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS",
    "ATHOS GIOM DE PAIVA MESQUITA","C NDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA",
    "DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA",
    "DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS",
    "FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN",
    "GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS",
    "JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI",
    "KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT",
    "LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA",
    "MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA",
    "NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI",
    "RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
 
    VETOR PARA NOTAS - INTEIRO
    VETOR PARA MATRICULA - CADEIA
    G5-1
    G5-2

    MOSTRA OS ALUNOS
    SELECIONAR UM ALUNO PELA MATRICULA
    CADASTRA A NOTA [1-10]
    PERGUNTA SE CONTINUA S/N
    SE SIM CADASTRAR DE NOVO
    SE NÃO
    LISTA OS ALUNOS NOVAMENTE COM A NOTA E COM A 
    SIT */
		
		cadeia alunosGeneration[] = {"ALONSO MENDES SILVA DE OLIVEIRA","ANDRESSA FERREIRA DOS SANTOS","ATHOS GIOM DE PAIVA MESQUITA","CÂNDIDO JURELMO DOS SANTOS CAVALEIRO","CAROLINA GUIDA","DANIELE DOS SANTOS PINHEIRO","DÉBORA VIDEIRA MONTEIRO","DENILSON TEIXEIRA DE SOUZA","DENISE BRITO ANJOS","FELIPE CASAGRANDE TEIXEIRA DE CASTRO","FERNANDO BEDNARSKI RAMOS","FERNANDO DE BARROS SABALETE","GISELE DE OLIVEIRA PAZ","GUSTAVO DE SOUZA GUILHEN","GUSTAVO ESTEBAN CARRERAS JORGE","GUSTAVO LIMA DE SOUZA","IGOR MILHOMENS DOS SANTOS","JEAN PABLO CESARIO DA SILVA","JESSICA REGINA RODRIGUES HOLANDA","KAREN BERNARDI","KEWIN SOUTO BARROS","LEONARDO LIMA CINTRA","LEONARDO QUEIROZ BURJATO","LUCAS ALVES SCHIMIT","LUCAS DE BARROS PAIFAR","LUCAS LOIOLA DE ALMEIDA","MARCOS DOS SANTOS","MARIA NAZARE CORTEZ LIMA","MARIANA LIMA","MATHEUS RIBEIRO VILLELA","MAYARA CARDINOT MAFIOLETTI","MILTON JUNIOR CAVALCANTE DA PENHA","NATÃ DE ARAUJO GRECU","OSVALDO TAVARES VELASCO","PAOLA ALENCAR LISBOA","RAPHAEL EUZÉBIO SCAZITI","RENATO ANDRÉ NASCIMENTO SILVA","RUI ALMEIDA DE ANDRADE","TATIANE TISSONI ANTUNES","VICTOR DE MORAIS ARAUJO"}
	     inteiro notas[40]
	     cadeia MatriculaGeneration[40] 
	     cadeia matricula, status = "" 
	     inteiro nota, indice = 0
	     caracter opcao = '1'


	     para(inteiro i = 0; i<40; i++)
	     {
	     	MatriculaGeneration[i] = "G0 - " + (i+1) 
	     }


	    //Informa na tela os nomes e as Matriculas

	    escreva("TURMA DO GRUPO G0-ZERO CONSCIENTE\n") 
	    limpa()

	    escreva("Mat \t Aluno \n")

	    para (inteiro x=0; x<40; x++){

	    		escreva(MatriculaGeneration[x], "\t", alunosGeneration[x], "\n")
	    }
	  faca
	  { 
         escreva("Por favor informe a matricula: ")
         leia (matricula)

          para (inteiro y = 0; y<40; y++) 
          {
          	se(matricula == MatriculaGeneration[y])
          	{
          		indice = y
          	}
          }

          escreva("Aluno ", alunosGeneration[indice], " informe sua nota: ")
          leia(notas[indice]) 
          escreva(" Deseja começar 1 - SIM e 2 - NAO \n") 
          leia(opcao)
	  	
	  }enquanto(opcao =='1')

	  para(inteiro z = 0; z<40 ; z++)
	  {

	  	se(notas[z] ==0)
	  	{
	  		status = " Não se aplica!!!!"
	  	}senao se (notas[z] < 5)
	  	{
	  		status = "Você foi reprovado!!!" 
	  	} senao se (notas[z] <8){
	  		status = "Estamos análisando"
	  	}senao se (notas[z]<=10 e notas[z]>=8 ){
	  		status = " Parabens você foi aprovado!!!"
	  	} senao se (notas[z]>10){ 
	  		status = " Não se aplica!!!!"
	  	}
	  	escreva(" O Aluno: ", alunosGeneration[z] , " da matricula: ", MatriculaGeneration[z], " com a nota: ",notas[z],status,"\n")
	  }
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 3710; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */