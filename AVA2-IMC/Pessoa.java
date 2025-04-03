
public class Pessoa {
    private double pesoPessoa;
    private double alturaPessoa;
    private double imcPessoa;

    public Pessoa(double pesoPessoa, double alturaPessoa) {
        this.pesoPessoa = pesoPessoa;
        this.alturaPessoa = alturaPessoa;
        this.imcPessoa = calcularImcPessoa(pesoPessoa, alturaPessoa);
    }

    private static double calcularImcPessoa(double peso, double altura) {
        return peso / (Math.pow(altura, 2));
    }

    private String classificarImcPessoa() {
        if (imcPessoa < 18.5) {
            return "Baixo peso. É recomendado procurar um médico para avaliação criteriosa do resultado. "
                 + "Pode indicar um estado de consumo do organismo, com poucas reservas e riscos associados.";
        } else if (imcPessoa >= 18.5 && imcPessoa <= 24.9) {
            return "Peso adequado. Tudo indica que está tudo bem, mas é importante avaliar outros parâmetros da composição corporal, "
                 + "para compreender se estão dentro do recomendado. Algumas pessoas apresentam IMC dentro da normalidade, mas têm circunferência "
                 + "abdominal maior que a recomendada e/ou quantidade de massa gorda acima do ideal.";
        } else if (imcPessoa >= 25 && imcPessoa <= 29.9) {
            return "Sobrepeso. O sobrepeso está associado ao risco de doenças como diabetes e hipertensão. Então, atenção! "
                 + "Consulte um médico e reveja hábitos para reverter o quadro. Também é importante avaliar outros parâmetros, como a circunferência abdominal.";
        } else if (imcPessoa >= 30 && imcPessoa <= 34.9) {
            return "Obesidade grau I. É importante buscar orientação médica e nutricional para entender melhor o seu caso, "
                 + "mesmo que os exames (colesterol e glicemia, por exemplo) estejam normais.";
        } else if (imcPessoa >= 35 && imcPessoa <= 39.9) {
            return "Obesidade grau II. Indica um quadro de obesidade mais evoluído em relação à classificação anterior e, mesmo com exames laboratoriais "
                 + "dentro da normalidade, não se deve atrasar a busca por orientação médica e nutricional.";
        } else {
            return "Obesidade grau III. Nesse ponto, a chance de já estarmos diante de outras doenças associadas é mais elevada. "
                 + "É fundamental buscar orientação médica.";
        }
    }

    public void mostrarImcPessoa() {
        System.out.println("Peso: " + this.pesoPessoa + " kg");
        System.out.println("Altura: " + this.alturaPessoa + " m");
        System.out.println("IMC: " + String.format("%.2f", this.imcPessoa));
        System.out.println("Análise: " + classificarImcPessoa());
    }
}