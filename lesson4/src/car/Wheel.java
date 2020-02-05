package car;

public class Wheel {

    private  int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    Wheel(int size){
        this.size=size;
    }

    public int increaseSize(int gg){
        return (gg*size);
    }

    @Override
    public String toString() {
        return "Wheel[size="+size+"]";
    }
}
