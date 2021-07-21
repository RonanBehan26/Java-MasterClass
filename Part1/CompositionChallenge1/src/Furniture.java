public class Furniture {

    private int table;
    private int chair;
    private int sofa;

    public Furniture(int table, int chair, int sofa) {
        this.table = table;
        this.chair = chair;
        this.sofa = sofa;
    }

    public void countFurniture(int table, int chair, int sofa){
        System.out.println("Tables: " + table + " Sofas: " + sofa + " Chairs: " + chair);
    }

    public int getTable() {
        return table;
    }

    public int getChair() {
        return chair;
    }

    public int getSofa() {
        return sofa;
    }
}
