import java.util.LinkedList;
import java.util.Queue;

public class Parte2 {

    public static Pacote[] geraPacotes() {
        Pacote[] out = new Pacote[5];
        out[0] = new TCP("1.1.1.1","2.2.2.2", "Olá! :)");
        out[1] = new TCP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[2] = new UDP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[3] = new UDP("2.2.2.2","1.1.1.1", "Olá! :)");
        out[4] = new UDP("2.2.2.2","1.1.1.1", "Tudo bem?");
        return out;
    }

    public static abstract class Pacote {
        protected String source;
        protected String destino;

        public Pacote(String source, String destino) {
            this.source = source;
            this.destino = destino;
        }

        public String getSource() {
            return source;
        }

        public String getDestino() {
            return destino;
        }

        public abstract void enviar();
    }

    public static class TCP extends Pacote {
        private static int contador = 100;
        private int numeroSequencia;
        private String mensagem;

        public TCP(String source, String destino, String mensagem) {
            super(source, destino);
            if (mensagem.length() > 1410) {
                throw new IllegalArgumentException("Mensagem TCP excede 1410 caracteres.");
            }
            this.mensagem = mensagem;
            this.numeroSequencia = contador;
            contador++;
        }

        public void enviar() {
            System.out.println("TCP (" +"source:"+ source + ","+"destination:" + destino + ","+ "seq:" + numeroSequencia + ") msg: [" + mensagem + "]");
        }
    }

    public static class UDP extends Pacote {
        private String mensagem;

        public UDP(String source, String destino, String mensagem) {
            super(source, destino);
            if (mensagem.length() > 1430) {
                throw new IllegalArgumentException("Mensagem UDP excede 1430 caracteres.");
            }
            this.mensagem = mensagem;
        }

        public void enviar() {
            System.out.println("UDP (" + "source:" + source + ","+ "destination:" + destino + ") msg: [" + mensagem + "]");
        }
    }

    public static class Roteador {
        private String nome;
        private Queue<Pacote> fila;

        public Roteador(String nome) {
            this.nome = nome;
            this.fila = new LinkedList<>();
        }

        public void addPacote(Pacote p) {
            fila.add(p);
        }

        public void removePacote(Pacote p) {
            fila.remove(p);
        }

        public boolean hasPacotes() {
            return !fila.isEmpty();
        }

        public int getTamanhoFila() {
            return fila.size();
        }

        public void enviarPacote() {
            if (hasPacotes()) {
                Pacote p = fila.poll();
                p.enviar();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Roteador ").append(nome).append(" está  UP, ").append("tamanhoFila=").append(fila.size());
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        // Run #1
        Pacote[] pacotes = geraPacotes();
        Pacote p1 = pacotes[0];
        Pacote p2 = pacotes[1];
        Pacote p3 = pacotes[2];
        Pacote p4 = pacotes[3];
        Pacote p5 = pacotes[4];

        Roteador router1 = new Roteador("Aveiro-UA");
        router1.addPacote(p1);
        router1.addPacote(p2);
        router1.addPacote(p3);
        router1.addPacote(p4);
        router1.addPacote(p5);

        System.out.println(router1);
        while (router1.hasPacotes()) {
            router1.enviarPacote();
        }
        System.out.println(router1);

        // Run #2
        pacotes = geraPacotes();
        p1 = pacotes[0];
        p2 = pacotes[1];
        p3 = pacotes[2];
        p4 = pacotes[3];
        p5 = pacotes[4];

        router1.addPacote(p1);
        router1.addPacote(p2);
        router1.addPacote(p3);
        router1.removePacote(p3);
        router1.addPacote(p4);
        router1.addPacote(p5);

        System.out.println(router1);
        while (router1.hasPacotes()) {
            router1.enviarPacote();
        }
        System.out.println(router1);
    }
}
