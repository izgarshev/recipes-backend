package client;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;

public class MainPanel implements MainPanelIF {

    Node node;

    @Override
    public void init() {
        try {
            this.node = FXMLLoader.<Parent>load(getClass().getResource("/fx/Main.fxml"));
            System.out.println("node is init");
        } catch (Exception e) {
            System.out.println("error by init");
            e.printStackTrace();
        }
    }

    @Override
    public Node getPanel() {
        return node;
    }
}
