package aula06.ex6_2;

public class Contacto {
    private static int nextId = 1;
    private int id;
    private Pessoa pessoa;
    private String telemovel;
    private String email;

    public Contacto(Pessoa pessoa, String telemovel, String email) {
        if (pessoa == null) {
            throw new IllegalArgumentException("Contacto deve estar associado a uma pessoa.");
        }
        if ((telemovel == null || !isValidTelemovel(telemovel)) && (email == null || !isValidEmail(email))) {
            throw new IllegalArgumentException("Contacto deve conter pelo menos o número de telemóvel ou o endereço de email válido.");
        }
        this.id = nextId++;
        this.pessoa = pessoa;
        this.telemovel = telemovel;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(String telemovel) {
        if (isValidTelemovel(telemovel)) {
            this.telemovel = telemovel;
        } else {
            throw new IllegalArgumentException("Número de telemóvel inválido.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Endereço de email inválido.");
        }
    }

    private boolean isValidTelemovel(String telemovel) {
        return telemovel != null && telemovel.matches("9\\d{8}");
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@") && (email.endsWith(".pt") || email.endsWith(".com"));
    }

    @Override
    public String toString() {
        return "ID: " + id + "; " + pessoa + "; Telemóvel: " + (telemovel != null ? telemovel : "N/A") + "; Email: " + (email != null ? email : "N/A");
    }
}