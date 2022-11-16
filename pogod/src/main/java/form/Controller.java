package form;

import com.example.pog.Perevod;
import com.example.pog.Search;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Controller {
    @FXML
    private ImageView fon;
    @FXML
    private Text UF;

    @FXML
    private TextField city;

    @FXML
    private Text data;

    @FXML
    private Text five;

    @FXML
    private Text four;

    @FXML
    private Button getCity;

    @FXML
    private Text humidity;

    @FXML
    private Text one;

    @FXML
    private Text preciption;

    @FXML
    private Text pressure;

    @FXML
    private Text six;

    @FXML
    private Text temp;

    @FXML
    private Text three;

    @FXML
    private Text two;

    @FXML
    private Text wind;
    @FXML
    void initialize() {


        getCity.setOnAction(event -> {
            Perevod perevod = new Perevod();
            Search search = new Search();
            String a = perevod.translate(city.getText());
            if(a.equals("")){
                a =city.getText();
            }
            ArrayList<Elements> pogod = search.Poisk(a);


            data.setText(pogod.get(0).text());
            temp.setText("Температура " + pogod.get(2).text());
            preciption.setText("Осадки " + pogod.get(1).text());
            pressure.setText("Давление " + pogod.get(3).text());
            wind.setText("Ветер " + pogod.get(4).text());
            humidity.setText("Влажность " + pogod.get(5).text());
            UF.setText("Индекс ультрафиолета " + pogod.get(6).text());
            one.setText(pogod.get(7).text());
            two.setText(pogod.get(8).text());
            three.setText(pogod.get(9).text());
            four.setText(pogod.get(10).text());
            five.setText(pogod.get(11).text());
            six.setText(pogod.get(12).text());
            fon.setImage(new Image(search.Osadki()));

        });
    }
}