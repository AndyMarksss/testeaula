public class Exercício6 {
    public static void main(String args[]) {

        double hp, lp, ha, la, qtd;

        hp = 2.6;
        lp = 1.6;
        ha = 0.35;
        la = 0.3;

        qtd = (hp * lp) / (ha * la);

        System.out.println("Quantidade de azuleijos necessários para cobrir a parede: " + qtd);
        
    }
}