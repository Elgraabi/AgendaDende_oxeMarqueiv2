/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controle;

import Modelo.DAO.impl.AgentePublicoDAOJDBC;
import Modelo.DAO.impl.ClinicaDAOJDBC;
import Modelo.Entidades.AgentePublico;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author LAB118-PC01
 */
public class PublicAgentController {

    public List buscarUsuarios() {
        AgentePublicoDAOJDBC publicAgentDAOJDBC = new AgentePublicoDAOJDBC();
        List listaUsuario = publicAgentDAOJDBC.findAll();
        return listaUsuario;
    }

    public AgentePublico buscarAgente(int idAgente) {
        try {
            AgentePublicoDAOJDBC agentePublicoDAOJDBC = new AgentePublicoDAOJDBC();
            AgentePublico agente = agentePublicoDAOJDBC.findById(idAgente);

            return agente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public void inserirAgentePublico(AgentePublico publicAgent) {
        try {
            AgentePublicoDAOJDBC agentePublicoDAOJDBC = new AgentePublicoDAOJDBC();
            agentePublicoDAOJDBC.insert(publicAgent);
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com Sucesso!");
        } catch (Exception e) {
        }
    }
    
    public List<AgentePublico> buscarAgente(String nomeAgente) {
        List<AgentePublico> retorno = new ArrayList<>();
        try {
            AgentePublicoDAOJDBC agentePublicoDAOJDBC = new AgentePublicoDAOJDBC();
            List<AgentePublico> listAgente = agentePublicoDAOJDBC.findAll();

            if (!nomeAgente.equals("")) {
                for (AgentePublico agentePublico : listAgente) {

                    if (nomeAgente.toLowerCase().equalsIgnoreCase(agentePublico.getName().toLowerCase())) {
                        retorno.add(agentePublico);
                    }

                    String[] nomeQuebrado = agentePublico.getName().split(" ");
                    for (String string : nomeQuebrado) {
                        if (nomeAgente.toLowerCase().equalsIgnoreCase(string.toLowerCase())) {
                            retorno.add(agentePublico);
                        }
                    }
                }
            }else {
                return listAgente;
            }

        } catch (Exception e) {
        }
        return retorno;
    }

    public void atualizarAgente(Integer idPublicAgent, String email, String user, String password, String typeUser) {

        try {
            AgentePublicoDAOJDBC agentePublicoDAOJDBC = new AgentePublicoDAOJDBC();
            agentePublicoDAOJDBC.updateAgente(idPublicAgent, email, user, password, typeUser);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean desativarAgente(int idAgente){
        try {
            AgentePublicoDAOJDBC agentePublicoDAOJDBC = new AgentePublicoDAOJDBC();
            return agentePublicoDAOJDBC.disable(idAgente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
    
    public boolean ativarAgente(int idAgente){
        try {
            AgentePublicoDAOJDBC agentePublicoDAOJDBC = new AgentePublicoDAOJDBC();
            return agentePublicoDAOJDBC.enable(idAgente);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

}
