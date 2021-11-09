package br.com.traducao.tdd;

public class Traducao {
    public static void main(String[] args) {
        Linguas linguas = new Linguas();

        linguas.adicionar("brasil", "Feliz Natal");
        linguas.adicionar("alemanha", "Frohliche Weihnachten!");
        linguas.adicionar("austria", "Frohe Weihnacht!");
        linguas.adicionar("coreia", "Chuk Sung Tan!");
        linguas.adicionar("espanha", "Feliz Navidad!");
        linguas.adicionar("grecia", "Kala Christougena!");
        linguas.adicionar("estados-unidos", "Merry Christmas!");
        linguas.adicionar("inglaterra", "Merry Christmas!");
        linguas.adicionar("australia", "Merry Christmas!");
        linguas.adicionar("portugal", "Feliz Natal!");
        linguas.adicionar("suecia", "God Jul!");
        linguas.adicionar("turquia", "Mutlu Noeller");
        linguas.adicionar("argentina", "Feliz Navidad!");
        linguas.adicionar("chile", "Feliz Navidad!");
        linguas.adicionar("mexico", "Feliz Navidad!");
        linguas.adicionar("antardida", "Merry Christmas!");
        linguas.adicionar("canada", "Merry Christmas!");
        linguas.adicionar("irlanda", "Nollaig Shona Dhuit!");
        linguas.adicionar("belgica", "Zalig Kerstfeest!");
        linguas.adicionar("italia", "Buon Natale!");
        linguas.adicionar("libia", "Buon Natale!");
        linguas.adicionar("siria", "Milad Mubarak!");
        linguas.adicionar("marrocos", "Milad Mubarak!");
        linguas.adicionar("japao", "Merii Kurisumasu!");

        System.out.println("Qual pais deseja pesquisar?");
        linguas.encontrarTraducao("brasil");
    }
}
