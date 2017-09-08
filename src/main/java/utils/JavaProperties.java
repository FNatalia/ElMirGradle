package utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * Created on 08.09.2017.
 */
public class JavaProperties {

        private static final JavaProperties JAVA_PROPERTIES = new JavaProperties();

        private static Properties properties = new Properties();
        private JavaProperties() {}

        public static JavaProperties newInstance() {
            load();
            return JAVA_PROPERTIES;
        }

        private static void load() {
            InputStream inputStream = JavaProperties.class.getClassLoader().getResourceAsStream("standard.properties");
            try {
                properties.load(inputStream);
            } catch (IOException e) {
                System.out.println("Could not load the file!");
            }
        }

        public String getProperty(String property){
            return properties.getProperty(property);
        }



}
