package TestGPX;

import me.himanshusoni.gpxparser.GPXParser;
import me.himanshusoni.gpxparser.modal.GPX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestGPX {

    public static void main(String[] args) throws Exception {

        GPXParser p = new GPXParser();

        FileInputStream in = new FileInputStream(TestGPX.class.getClassLoader().getResource("test.gpx").getFile());
        GPX gpx = p.parseGPX(in);

        System.out.println(gpx);
    }
}
