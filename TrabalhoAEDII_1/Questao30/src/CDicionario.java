import java.util.Scanner;

class CDicionario {
    private CCelulaDicionario primeira, ultima;

    public static void main(String[] args) {
        CDicionario dicionario = new CDicionario();

        dicionario.adiciona("www.google.com", "172.217.29.68");
        dicionario.adiciona("www.yahoo.com", "72.30.35.9");
        dicionario.adiciona("www.amazon.com", "99.84.21.244");
        dicionario.adiciona("www.uol.com.br", "104.17.33.24");
        dicionario.adiciona("www.pucminas.br", "200.229.32.27");
        dicionario.adiciona("www.microsoft.com", "104.105.148.195");
        dicionario.adiciona("research.microsoft.com", "13.67.218.189");
        dicionario.adiciona("www.hotmail.com", "204.79.197.212");
        dicionario.adiciona("www.gmail.com", "172.217.162.165");
        dicionario.adiciona("www.twitter.com", "104.244.42.1");
        dicionario.adiciona("www.facebook.com", "31.13.74.35");
        dicionario.adiciona("www.cplusplus.com", "167.114.170.15");
        dicionario.adiciona("www.youtube.com", "172.217.162.174");
        dicionario.adiciona("www.brasil.gov.br", "170.246.252.243");
        dicionario.adiciona("www.whitehouse.gov", "23.74.84.17");
        dicionario.adiciona("www.nyt.com", "151.101.93.164");
        dicionario.adiciona("www.capes.gov.br", "200.130.18.222");
        dicionario.adiciona("www.wikipedia.com", "208.80.154.232");
        dicionario.adiciona("www.answers.com", "151.101.92.203");
        dicionario.adiciona("www.apple.com", "23.55.32.111");
        dicionario.adiciona("www.hbogo.com.br", "104.17.7.235");
        dicionario.adiciona("www.jovemnerd.com.br", "104.25.8.22");
        dicionario.adiciona("www.netflix.com", "52.206.23.236");
        dicionario.adiciona("www.outline.com", "99.84.27.1111");
        dicionario.adiciona("www.byalnet.com.br", "189.51.96.18");
        dicionario.adiciona("www.byalnet.com.br", "ops");

        Scanner leia = new Scanner(System.in);
        int opc;
        do {
            System.out.printf("Insira uma opção:\n" +
                              "1 - procurar valor;\n" +
                              "2 - adicionar valor\n" +
                              "0 - Sair\n" +
                    "--> ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    leia.nextLine();
                    System.out.printf("Insira a url: ");
                    Object url = leia.nextLine();
                    System.out.printf(url+" --> "+dicionario.recebeValor(url)+"\n");
                    break;
                case 2:
                    System.out.printf("Insira a url: ");
                    leia.nextLine();
                    url = leia.nextLine();
                    System.out.printf("Insira o ip: ");
                    Object ip = leia.nextLine();
                    dicionario.adiciona(url,ip);
                    System.out.println("url: "+url+" | ip: "+dicionario.recebeValor(url));
                    break;
                case 0:
                    break;
                default:
                    System.out.printf("Opção inválida!\n");
                    break;
            }
        }while (opc!=0);
    }

    public CDicionario() {
        primeira = new CCelulaDicionario();
        ultima = primeira;
    }

    public boolean vazio() {
        return ultima == primeira;
    }

    public void adiciona(Object chave, Object valor) {
        if (recebeValor(chave) == null) {
            ultima.prox = new CCelulaDicionario(chave, valor);
            ultima = ultima.prox;
        } else return;
    }

    public Object recebeValor(Object chave) {
        CCelulaDicionario aux = primeira;
        boolean achou = false;
        while (aux != null && !achou) {
            aux = aux.prox;
            if (aux != null)
                if (aux.key.equals(chave)) {
                    achou = true;
                }
        }
        if (achou)return aux.value;
        else return null;
    }
}