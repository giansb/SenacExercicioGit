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
public class MensagemDoDiaTestes {
    
    public void testarMensagemSortida(String fraseDoDia){
        Mensagem md = new Mensagem();
        String[] lista = md.contas;
        boolean cod = false;
        for(String frase:lista){
            if(frase == fraseDoDia){
                cod = true;
            } else {
                
            }
        }
        if(cod = true){
            System.out.println("tudo certo");
        } else {
            System.out.println("algo deu errado");
        }
        
        
    }
    
    public void testarMensagemDoDia(){
        Mensagem md = new Mensagem();
        String teste = md.mensagemDoDia();
        
        if(teste != ""){
            System.out.println("tudo certo");
        } else {
            System.out.println("algo deu errado");
        }
    }
    
    public void testarTamanhoArray(int tamanho){
        
        Mensagem m = new Mensagem();
        if(m.tamanhoArray() == tamanho){
            System.out.println("teste executado. Resultado: sucesso");
        } else {
            System.out.println("teste executao, porém falha no resultado");
        }
    }
}
