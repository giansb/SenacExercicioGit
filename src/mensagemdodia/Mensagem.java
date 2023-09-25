/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemdodia;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 182210120
 */
public class Mensagem {
    String[] contas = {
        "Em tempos de crise, os sábios constroem pontes, enquanto os tolos constroem muros",
        "Jogue-me no oceano com meus antepassados que pularam dos navios, porque sabiam que a morte era melhor do que a escravidão",
        "Só porque algo funciona, não significa que não possa ser melhorado.",
        "Grandes poderes trazem grandes responsabilidades.",
        "Nós somos quem escolhemos ser... Por isso, escolha!",
        "Podemos não ganhar todas as batalhas, mas devemos dar sempre o nosso máximo.",
        "Todos temos segredos, os que nós escondemos e os que escondem de nós.",
        "Todos os dias me levanto sabendo que quanto mais pessoas eu salvar, mais inimigos eu farei.",
        "Uma coisa eu sei com certeza: não faça como eu. Faça como você.",
        "Não importa quantos golpes eu leve, sempre encontro um jeito de me levantar. Porque a única coisa que impede que esta cidade caia no esquecimento sou eu.",
        "É fácil sentir esperança em um dia lindo como hoje. Mas haverá dias escuros pela frente também, dias em que se sentirão sozinhos. E a esperança será mais necessária do que nunca.",
        "Se você espera decepção, nunca ficará realmente desapontado.",
        "Morte é que dá sentido à vida. Saber que os seus dias estão contados. Que seu tempo é curto.",
        "Só porque alguém tropeça e se perde no caminho não significa que está perdido para sempre.",
        "Progresso é a habilidade do homem de complicar as coisas simples.",
        "Garçom tenho fome, sirva-me um Whisky",
        "Você não escolhe sentir medo. Mas escolhe o que fazer em relação a isso.",
        "É este o meu segredo, Capitão. Estou sempre com raiva.",
        "Viva em paz consigo mesmo, assim pode viver em paz com os outros.",
        "Tomem cuidado. Cuidem uns dos outros. Essa é a luta de nossas vidas. E nós vamos vencer.",
        "A liberdade é a maior mentira da vida.",
        "Parte da jornada é o fim.",
        "Se não pudermos proteger a terra, pode ter certeza que iremos vingá-la.",
        "Humanos são estranhos. Acham que ordem e caos são opostos de alguma forma e tentam controlar o que não podem.",
        "Eu digo para todos que precisam seguir em frente. Alguns conseguem, mas nós não.",
        "Nós somos uma mistura química que cria o caos. Somos uma bomba-relógio.",
        "Eu sei que isso vai funcionar. Porque, se não, eu não sei o que fazer.",
        "Eu lhe asseguro, irmão, o sol vai brilhar em nós novamente.",
        "As escolhas mais difíceis requerem as vontades mais fortes."
    };
    
    public int tamanhoArray(){
        return contas.length-1;
    }
    
    
    public String mensagemSortida(){
        int num = (int) (Math.random() * this.tamanhoArray());
        
         return contas[num];
    }
    
    public String mensagemDoDia(){
        int parametroarray;
        Date d = new Date();
        DateFormat df = new SimpleDateFormat("dd");
        String mensagem = "";
        parametroarray = this.tamanhoArray();
        int num = Integer.parseInt(df.format(d));
        if(num<= parametroarray){
            mensagem = contas[num];
        } else {
            mensagem = "Não há mensagens para o dia de hoje";
        }
        return mensagem;
        
    }
    
    
    
    
   
    
}
