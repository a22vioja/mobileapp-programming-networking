import java.util.ArrayList;
import java.util.Arrays;

public class Mountain {

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
