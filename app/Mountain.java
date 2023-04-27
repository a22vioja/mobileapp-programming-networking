import java.util.ArrayList;
import java.util.Arrays;

public class Mountain {

    private String ID;
    private String name;
    //@SerializedName("size")
    private int meter;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Mountain{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", meter=" + meter +
                ", items=" + items +
                '}';
    }

    ArrayList<RecyclerViewItem> items = new ArrayList<>(Arrays.asList(
            new RecyclerViewItem("Matterhorn"),
            new RecyclerViewItem("Mont Blanc"),
            new RecyclerViewItem("Denali")
    ));

    @SuppressWarnings("WeakerAccess")
    public class RecyclerViewItem {

        private String title;

        public RecyclerViewItem(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
}