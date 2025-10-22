package sptech.school;

import sptech.school.exception.ArgumentoInvalidoException;
import sptech.school.exception.VacinaInvalidaException;
import sptech.school.exception.VacinaNaoEncontradaException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Laboratorio {

    String nome;
    List<Vacina> vacinas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Vacina> getVacinas() {
        return vacinas = new ArrayList<>();
    }

    public void adicionarVacina(Vacina vacina) {
        try {
            if (vacina != null) {
                vacinas.add(vacina);
            }
        } catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }

        try {
            if (vacina.getCodigo() != null && vacina.getCodigo() != "") {
                vacinas.add(vacina);
            }
        } catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }
        try {
            if (vacina.getnome() != null && vacina.getnome() != "") {
                vacinas.add(vacina);
            }
        } catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }

        try {
            if (vacina.getTipo() != null && vacina.getTipo() != "") {
                vacinas.add(vacina);
            }
        } catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }

        try {
            if (vacina.getPreco() != null && vacina.getPreco() > 0) {
                vacinas.add(vacina);
            }
        } catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }

        try {
            if (vacina.getEficacia() > 0 && vacina.getEficacia() <= 5) {
                vacinas.add(vacina);
            }
        } catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }
        try {
            if (vacina.getDatalancamento() != null) {

            }
        }  catch (VacinaInvalidaException e) {
            System.out.println("Vacina não encontrada");
        }
    }

    Vacina buscarVacinaPorCodigo(String codigo) {
        try {
            if (codigo != null && codigo != "") {

            }
        } catch (ArgumentoInvalidoException e) {
            System.out.println("Vacina não encontrada");
        }
        Vacina vacina1 = null;

        try {
            for (Vacina vacina : vacinas) {
                if (vacina.getCodigo().equals(codigo)) {
                    return vacina1 = vacina;
                }
            }
        } catch (VacinaNaoEncontradaException e) {
            System.out.println("Vacina não encontrada");
        } return vacina1;
    }

    Vacina buscarVacinaComMelhorEficacia(){

        Vacina vacina1 = vacinas.getFirst();

        try {
                for (Vacina vacina: vacinas){
                    if (vacina.getEficacia() < vacina1.getEficacia()){
                        vacina1 = vacina;
                }
            }
        } catch (VacinaNaoEncontradaException e){
            System.out.println("Vacina não encontrada");
        }
        return vacina1;
    }

    List<Vacina> buscarVacinaPorPeriodo(LocalDate dataInicio, LocalDate dataFim){

        List<Vacina>vacinasPeriodo = new ArrayList<>();
        try {
            if (dataInicio != null && dataFim != null){
                for (Vacina vacina: vacinas){
                    if (vacina.getDatalancamento().equals(dataFim)){
                        vacinasPeriodo.add(vacina);
                    }
                }
            }
        } catch (ArgumentoInvalidoException e){
            System.out.println("Vacina não encontrada");
        } return vacinasPeriodo;
    }
}