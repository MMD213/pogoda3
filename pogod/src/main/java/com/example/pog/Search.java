package com.example.pog;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;



public class Search {
    ArrayList<Elements> pogoda = new ArrayList<Elements>();

    public ArrayList<Elements> Poisk(String gorod) {


        if (!gorod.equals("")) {

            Document document = null;
            try {
                document = Jsoup.connect("https://pogoda.mail.ru/prognoz/" + gorod + "/")
                        .userAgent("Google")
                        .cookie("auth", "token")
                        .get();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__header > div.information__header__left > div.information__header__left__date"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__content > div.information__content__wrapper.information__content__wrapper_left > a > div.information__content__additional.information__content__additional_first"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__content > div.information__content__wrapper.information__content__wrapper_left > a > div.information__content__additional.information__content__additional_temperature"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__content > div.information__content__wrapper.information__content__wrapper_left > a > div.information__content__additional.information__content__additional_second > div:nth-child(1) > span"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__content > div.information__content__wrapper.information__content__wrapper_left > a > div.information__content__additional.information__content__additional_second > div:nth-child(2)"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__content > div.information__content__wrapper.information__content__wrapper_left > a > div.information__content__additional.information__content__additional_second > div:nth-child(3) > span"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.information.block.js-city_one > div.information__content > div.information__content__wrapper.information__content__wrapper_left > a > div.information__content__additional.information__content__additional_second > div:nth-child(4)"));


            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.cols.cols_banner-wide.clearfix.margin-top-20 > div.cols__column.cols__column_left > div > div > div > div:nth-child(1)"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.cols.cols_banner-wide.clearfix.margin-top-20 > div.cols__column.cols__column_left > div > div > div > div:nth-child(2)"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.cols.cols_banner-wide.clearfix.margin-top-20 > div.cols__column.cols__column_left > div > div > div > div:nth-child(3)"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.cols.cols_banner-wide.clearfix.margin-top-20 > div.cols__column.cols__column_left > div > div > div > div:nth-child(4)"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.cols.cols_banner-wide.clearfix.margin-top-20 > div.cols__column.cols__column_left > div > div > div > div:nth-child(5)"));
            pogoda.add(document.select("body > div.g-layout.layout.layout_banner-side.js-module > div:nth-child(2) > div.block.block_forecast.block_index.forecast-rb-bg > div > div.cols.cols_banner-wide.clearfix.margin-top-20 > div.cols__column.cols__column_left > div > div > div > div:nth-child(6)"));
        }
        return pogoda;
    }
    public String Osadki(){
        String a = null;

        while (true) {
            if (pogoda.get(1).text().contains("дождь")) {
                a = "https://avatars.dzeninfra.ru/get-zen_doc/4757752/pub_608392a8d77cf0380342fdd8_608392b4874e5a022523ffc4/scale_1200";
                break;
            }

            if (pogoda.get(1).text().contains("ливень")) {
                a = "https://avatars.dzeninfra.ru/get-zen_doc/4757752/pub_608392a8d77cf0380342fdd8_608392b4874e5a022523ffc4/scale_1200";
                break;
            }
            if (pogoda.get(1).text().contains("снег")) {
                a = "https://vsegda-pomnim.com/uploads/posts/2022-02/1645923261_62-vsegda-pomnim-com-p-sneg-foto-78.jpg";
                break;
            }
            if (pogoda.get(1).text().contains("град")) {
                a = "https://phonoteka.org/uploads/posts/2021-07/1625675695_49-phonoteka-org-p-grad-art-krasivo-52.jpg";
                break;
            }
            if (pogoda.get(1).text().contains("туман")) {
                a = "https://s.poembook.ru/theme/4b/d8/80/ff81da6ded928b79d3ea0c2218365aaa68d08931.jpeg";
                break;
            }
            if (pogoda.get(1).text().contains("ясно")) {
                a = "https://static.mk.ru/upload/entities/2020/03/19/16/articles/facebookPicture/b3/52/42/ab/960261db2e59cd2afa0170013fc66908.jpg";
                break;
            }
            if (pogoda.get(1).text().contains("пасмурно")) {
                a = "https://img5.goodfon.ru/wallpaper/nbig/8/b7/islandiia-nebo-tserkov-pole.jpg";
                break;
            }
            if (pogoda.get(1).text().contains("облачно")) {
                a = "https://img5.goodfon.ru/wallpaper/nbig/8/b7/islandiia-nebo-tserkov-pole.jpg";
                break;
            }
        }
        return a;
    }
}
