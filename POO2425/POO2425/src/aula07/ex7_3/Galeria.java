package aula07.ex7_3;

import java.util.ArrayList;

public class Galeria {
    private ArrayList<Obra> obras = new ArrayList<>();
    private double totalLucro = 0;

    public void adicionarObra(Obra obra) {
        obras.add(obra);
    }

    public void listarObrasDisponiveis() {
        for (Obra o : obras) {
            if (!o.isVendida()) {
                System.out.println(o);
            }
        }
    }

    public void venderObra(int id, double precoVenda) {
        for (Obra o : obras) {
            if (o.getId() == id && !o.isVendida()) {
                o.vender();
                double lucro = o.lucro(precoVenda);
                totalLucro += lucro;
                System.out.println("Obra vendida. Lucro: " + lucro + "€");
                return;
            }
        }
        System.out.println("Obra não encontrada ou já vendida.");
    }

    public void mostrarLucro() {
        System.out.println("Lucro total: " + totalLucro + "€");
    }
}

