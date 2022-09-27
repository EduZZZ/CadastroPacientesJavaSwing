/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.cadastroPacientes.controller;

import br.com.cadastroPacientes.model.Paciente;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class Ler {
    private InputStream is;
    private InputStreamReader isr;
    private BufferedReader br;
    private ArrayList<String> linha;
    private String valor;

    public Ler() {
      
    }
    
    public Paciente ler(){
        linha = new ArrayList<String>();
        
        try {
            is = new FileInputStream("dados_pacientes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);
            
            valor = br.readLine();
            
            while(valor != null){
                linha.add(valor);
                valor = br.readLine();
               
            }
            br.close();
            isr.close();
            is.close();
            
            char c;
            int contador = 0;
            String valor = "";
            Paciente p = new Paciente();
            for(int i = 0; i < linha.get(0).length(); i++){
                c = linha.get(0).charAt(i);
                if(c == ',' && contador == 0){
                    p.setNome(valor);
                    valor = "";
                    contador++;
                }
                else if(c == ',' && contador == 1){
                    p.setDataNascimento(valor);
                    valor = "";
                    contador++;
                }
                else if(c == ',' && contador == 2){
                    p.setCardNum(valor);
                    valor = "";
                    contador++;
                }
                else if(c == '.' && contador == 3){
                    p.setSexo(valor);
                    contador = 0;
                }
                else{
                valor += c;
                }
            }
            return p;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } catch (IOException ex) {
            Logger.getLogger(Ler.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}
