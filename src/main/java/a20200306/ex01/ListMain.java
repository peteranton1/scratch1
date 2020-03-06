package a20200306.ex01;

public class ListMain {
    public static void main(String[] args) {
        ListHolder holder = new ListHolder();
        holder.addItem("Cranberry");
        holder.addItem("Banana");
        holder.addItem("Apples");
        int i = 0;
        for (String item : holder.getItems()) {
            System.out.println(String.format("%02d : %s = %s", i, item, holder.itemAt(i)));
            i++;
        }
    }
}
