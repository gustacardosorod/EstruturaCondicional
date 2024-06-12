package ControleDeCandidatos;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo seletivo");
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido)
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        else {
            System.out.println("AGUARDANDO DEMAIS CANDIDATOS");
        }

    }

}