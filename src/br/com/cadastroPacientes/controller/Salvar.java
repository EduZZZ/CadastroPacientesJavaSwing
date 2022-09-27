package br.com.cadastroPacientes.controller;

import br.com.cadastroPacientes.model.Paciente;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Salvar {

    private OutputStream os;
    private OutputStreamWriter osw;
    private BufferedWriter bw;

    public Salvar() {
    }

    public void salvar(Paciente paciente) {
        try {
            //instamciar
            os = new FileOutputStream("dados_pacientes.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);
            
            //escrita
            bw.append(paciente.getNome()+", "+paciente.getDataNascimento()+ ", "+paciente.getCardNum()+", "+paciente.getSexo()+ ".");
            bw.newLine();
            
            //fechar
            bw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Salvar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
