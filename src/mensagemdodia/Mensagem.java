/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensagemdodia;

import java.util.ArrayList;

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
    };
    
    
    public String mensagemSortida(){
        int num = (int) (Math.random() * contas.length-1);
        System.out.println(contas[num]);
        
         return contas[num];
    }
    
    
   
    
}
