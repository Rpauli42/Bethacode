package Exercicio06;

public class Triangulo implements FiguraGeometrica {
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    public int getLadoA() {
        return ladoA;
    }

    public int getLadoB() {
        return ladoB;
    }

    public int getLadoC() {
        return ladoC;
    }

    @Override
    public String getNomeFigura() {
        return "Triângulo";
    }

    @Override
    public int getArea() {
        int area = (base * altura)/2;
        return area;
    }

    @Override
    public int getPerimetro() {
        int perimetro = ladoA + ladoB + ladoC;
        return perimetro;
    }
}
