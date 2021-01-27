programa
{
	
	funcao inicio()
	{
		/*
		TO DO LIST - AGENDA

		1 - CADASTRAR EVENTOS EM UM DIA QUALQUER DO MÊS
          2 - SEMPRE EM UMA HORA 
		3 - PODE MOSTRA A LISTA ATÉ O MOMENTO
          RESOLUÇÃO EM MATRIZ*


          STOREBOARD DE TELAS:

         BEM-VINDO, DIGITE O SEU NOME:_

        ESCOLHA UM DIA PARA CADASTRO [1/31] : _
        SELECIONE A HORA DO EVENTO[0/24]: _

        CONTINUA SIM OU NÃO [S/N]:

        SE ESCOLHIDO NÃO:

        MOSTRA AGENDA ATUAL S/N:
        SE SIM MOSTRA TODOS OS DIAS E EVENTOS CADASTRADOS

        APÓS PERGUNTA, RECOMEÇA SIM OU NÃO
        SE SIM COMEÇA TUDO DE NOVO EM  BRANCO PARA UM NOVO USUARIO
        SENÃO SAE DO PROGRAMA
		*/



		inteiro evento = 0, dia = 0, horas = 0

		cadeia nome, Calendario[24][31] 
		caracter recomecar, recomecar2


           escreva(" Por favor informe seu nome: \n") 
           leia(nome) 


           

          faca{

          	escreva( "Escolha um dia para agendamento [1/31] \n")
          	leia(dia) 
          	enquanto( dia<=0 ou dia> 31)
          	{
          		 escreva("O dia informado não se adequa ao software, por favor informe um horario de 0 a 31 dias: \n")
          		 leia(dia)
          	}
            dia-=1

            escreva("Escolha o horario para agendamento do evendo de [0-23] \n") 
            leia(horas) 

            enquanto( horas<0 ou horas> 23)
            {
            	escreva("Essa hora não se apica ao software, informa um horario no range de 0 a 23: \n")
            	leia(horas)
            }

            escreva("Informe que tarefa você ira realizar nesse horario: \n") 
            leia (Calendario[horas][dia])
            escreva("Deseja continuar a agendar novos compromissos 1 - Sim 2 - Não: ") 
            leia(recomecar)
             
          }enquanto(recomecar == '1')

          para(inteiro l = 0; l<31; l++){
          	para(inteiro c = 0; c<24; c++)
          	{
          		se(Calendario[c][l] != ""){
          			escreva("\n Dia: ", l+1 , " hora ",c, " : ", Calendario[c][l],"\n")
          		}
          	}
          }

          escreva(" Deseja continuar a utilizar o software se sim tecla 1 se não tecla 2 \n") 
          leia(recomecar2)
              se(recomecar2 == '1'){  
                 inicio()
              } senao 
              {
              	escreva("Obrigado por utilizar nosso software \n") 
              }
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2396; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */