package com.directi.training.dip.exercise;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class NetworkDataReader implements DataReader {
    private String urlString;

    public NetworkDataReader(String urlString) {
        this.urlString = urlString;
    }

    @Override
    public String read() throws Exception {
        URL url = new URL(urlString);
        InputStream in = url.openStream();
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        int c;
        while ((c = reader.read()) != -1) {
            inputString.append((char) c);
        }
        reader.close();
        return inputString.toString();
    }
}
