package pl.zajavka.behavioralDesignPatterns.templateMethod;

public abstract class HouseTemplate {

    protected final void build() {
        digHole();
        buildFoundation();
        buildWalls();
        makeRoof();
        insertWindows();

    }

    protected void digHole() {
        System.out.println("Digging hole");
    }
    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void makeRoof();
    protected abstract void insertWindows();
}
