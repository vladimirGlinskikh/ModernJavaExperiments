package kz.zhelezyaka.codeTransfer;

public class Apple {
    Color color;
    private int weight = 0;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Apple{color='%s', weight=%d}", color, weight);
    }
}
