/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.DAO.impl.ClinicaDAOJDBC;
import Modelo.DAO.impl.MedicoDAOJDBC;
import Modelo.Entidades.Clinica;
import Modelo.Entidades.Medico;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucas
 */
public class MedicoControle {
    public boolean cadastroMedico(Medico medico) {
        try {
            MedicoDAOJDBC medicoDAOJDBC = new MedicoDAOJDBC();
            medicoDAOJDBC.insert(medico);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public List<Medico> buscarMedicos() {
        MedicoDAOJDBC doctorDAOJDBC = new MedicoDAOJDBC();
        List<Medico> medicos = doctorDAOJDBC.findAll();
        
        return medicos;
    }
    
    public List<Medico> buscarMedidosPorEspecialidade(String especialidade) {
        MedicoDAOJDBC doctorDAOJDBC = new MedicoDAOJDBC();
        List<Medico> medicos = doctorDAOJDBC.findBySpecialty(especialidade);
        
        return medicos;
    }
    
    public List<String> buscarEspecialidades() {
        MedicoDAOJDBC doctorDAOJDBC = new MedicoDAOJDBC();
        List<String> especialidades = doctorDAOJDBC.findAllSpecialty();
        
        return especialidades;
    }
    
    public Medico buscarMedico(int idMedico) {
        try {
            MedicoDAOJDBC medicoDAOJDBC = new MedicoDAOJDBC();
            Medico medico = medicoDAOJDBC.findByID(idMedico);

            return medico;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void atualizarMedico (Integer idMedico, String nome, int clinica, String tel1, String tel2, String email){
        try {
            MedicoDAOJDBC medico = new MedicoDAOJDBC();
            medico.update(idMedico, nome, clinica, tel1, tel2, email);
            
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
    
    public boolean desativarMedico(int idMedico){
        try {
            MedicoDAOJDBC medicoDAOJDBC = new MedicoDAOJDBC();
            return medicoDAOJDBC.disable(idMedico);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
     public boolean ativarMedico(int idMedico){
        try {
            MedicoDAOJDBC medicoDAOJDBC = new MedicoDAOJDBC();
            return medicoDAOJDBC.enable(idMedico);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public List<Medico> bucarMedicoss(String nomeMedico) {
        List<Medico> retorno = new ArrayList<>();
        try {
            MedicoDAOJDBC MedicoDAO = new MedicoDAOJDBC();
            List<Medico> listMedico = MedicoDAO.findAll();

            if (!nomeMedico.equals("")) {
                for (Medico medico : listMedico) {
                    if (nomeMedico.toLowerCase().equalsIgnoreCase(medico.getName())) {
                        retorno.add(medico);
                    }

                    String[] nomeQuebrado = medico.getName().split(" ");
                    for (String string : nomeQuebrado) {
                        if (nomeMedico.toLowerCase().equalsIgnoreCase(string.toLowerCase())) {
                            retorno.add(medico);
                        }
                    }
                }
            } else {
                return listMedico;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return retorno;
    } 
    
}
