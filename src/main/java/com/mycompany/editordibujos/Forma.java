package com.mycompany.editordibujos;
import java.awt.*;
import java.util.LinkedList;

class Forma {
    private int x1, y1, x2, y2;
    private String tipo;

    public Forma(int x1, int y1, int x2, int y2, String tipo) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.tipo = tipo;
    }

    public void dibujar(Graphics g) {
        if (tipo.equals("Linea")) {
            g.drawLine(x1, y1, x2, y2);
        } else if (tipo.equals("Rectangulo")) {
            g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x2 - x1), Math.abs(y2 - y1));
        } else if (tipo.equals("Circulo")) {
            int radio = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            g.drawOval(x1 - radio, y1 - radio, radio * 2, radio * 2);
        }
    }
}