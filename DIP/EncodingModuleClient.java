package com.directi.training.dip.exercise;

import java.util.Base64;

public class EncodingModule {
    private DataReader reader;
    private DataWriter writer;

    public EncodingModule(DataReader reader, DataWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void encode() throws Exception {
        String inputData = reader.read();
        String encodedData = Base64.getEncoder().encodeToString(inputData.getBytes());
        writer.write(encodedData);
    }
}
