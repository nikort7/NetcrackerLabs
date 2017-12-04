package Field;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import Sort.BubbleSort;
import Sort.Sorter;


public class Config {
    //путь к нашему файлу конфигураций
    public static final String PATH_TO_PROPERTIES = "src/main/resources/config.properties";

    public static Sorter getSorter() {

        FileInputStream fileInputStream;
        Properties prop = new Properties();

        try {
            //обращаемся к файлу и получаем данные
            fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
            prop.load(fileInputStream);

            String sortType = prop.getProperty("sortType");
            switch (sortType){
                case ("BUBBLE"):
                    return new BubbleSort();

                case ("QUICK"):
                    return new BubbleSort();

                case ("SELECT"):
                    return new BubbleSort();
            }

        } catch (IOException e) {
//            System.out.println("Ошибка в программе: файл " + PATH_TO_PROPERTIES + " не обнаружено");
            e.printStackTrace();
        }

        return null;
    }

}
