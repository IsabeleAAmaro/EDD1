package Lista01;

import java.util.Objects;

//Domingo avaliar viabilidade de botar td num metodo com extends comparable
public class Par implements Comparable<Par> {

    int num1, num2;
    public Par(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    public int getN1() {
        return num1;
    }

    public void setN1(int n1) {
        this.num1 = n1;
    }

    public int getN2() {
        return num2;
    }

    public void setN2(int n2) {
        this.num2 = n2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Par par = (Par) o;
        return num1 == par.num1 && num2 == par.num2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(num1, num2);
    }

    @Override
    public int compareTo(Par o) {
        return 0;
    }
}
