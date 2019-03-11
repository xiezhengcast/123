package clone.cn;

 class a implements Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        App app = new App(99);

        App clone =(App) app.clone();

        System.out.println(app==clone);
        System.out.println(clone);
    }
}
