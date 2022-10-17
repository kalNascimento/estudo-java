package colaborador;

import java.text.NumberFormat;
import java.util.Locale;

public class Colaborador {
    private String name;
    private double salario;

    public Colaborador(String name, double salario) {
        setName(name);
        setSalario(salario);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSalario() {
        return formatarSalario(salario);
    }

    private String formatarSalario(double salario) {
        return String.format("%.2f", salario);
    }

    public void aumentoSalarial(double aumento) {
        double novoSalario = this.salario + aumento;
        setSalario(novoSalario);
    }

    public String imprimirInformacoesColaborador() {
        return String.format("Nome: %s\n Salario: %.2f\n", this.name, this.salario);
    }

}