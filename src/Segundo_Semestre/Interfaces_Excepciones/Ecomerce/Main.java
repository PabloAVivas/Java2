package Segundo_Semestre.Interfaces_Excepciones.Ecomerce;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto pro1 = new Producto("Agua 1L", 1000);
        Producto pro2 = new Producto("Agua 2L", 2000);
        Producto pro3 = new Producto("Agua 3L", 2750);
        Producto pro4 = new Producto("Papas fritas 275g", 1000);
        Producto pro5 = new Producto("Doritos 500g", 4000);
        Producto pro6 = new Producto("Figura colecionable", 27500);

        ArrayList<Producto> list1 = new ArrayList<>();
        list1.add(pro2);
        list1.add(pro4);
        list1.add(pro5);

        ArrayList<Producto> list2 = new ArrayList<>();
        list2.add(pro1);
        list2.add(pro2);
        list2.add(pro3);

        ArrayList<Producto> list3 = new ArrayList<>();
        list3.add(pro5);
        list3.add(pro6);
        list3.add(pro3);

        ArrayList<Producto> list4 = new ArrayList<>();
        list4.add(pro1);
        list4.add(pro1);
        list4.add(pro3);

        Pedido ped1 = new Pedido(list1);
        double tot1 = ped1.calcular_total();
        Pedido ped2 = new Pedido(list2);
        double tot2 = ped2.calcular_total();
        Pedido ped3 = new Pedido(list3);
        double tot3 = ped3.calcular_total();
        Pedido ped4 = new Pedido(list4);
        double tot4 = ped4.calcular_total();

        TarjetaCredito tar1 = new TarjetaCredito("1234 5678 9012 3456");
        TarjetaCredito tar2 = new TarjetaCredito("7890 1234 5678 9012");

        PayPal pay1 = new PayPal("ora@email.com");
        PayPal pay2 = new PayPal("muda@email.com");

        Cliente cliente1 = new Cliente("Star Platinum", pay1);
        Pedido pedido1 = new Pedido(cliente1, "PENDIENTE");

        Cliente cliente2 = new Cliente("The Word", pay2);
        Pedido pedido2 = new Pedido(cliente2, "PENDIENTE");


        System.out.println("El precio sin descuento es de: " + tot1);
        tar1.procesarPago(tot1* tar1.aplicarDescuento(10));

        System.out.println("El precio sin descuento es de: " + tot2);
        tar2.procesarPago(tot2* tar2.aplicarDescuento(20));

        System.out.println("El precio sin descuento es de: " + tot3);
        pay1.procesarPago(tot3* pay1.aplicarDescuento(15));
        pedido1.cambiarEstado("ENVIADO");
        pedido1.cambiarEstado("ENTREGADO");


        System.out.println("El precio sin descuento es de: " + tot4);
        pay2.procesarPago(tot4* pay2.aplicarDescuento(30));
        pedido2.cambiarEstado("ENVIADO");
        pedido2.cambiarEstado("ENTREGADO");


    }
}
