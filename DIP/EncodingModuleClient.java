package com.directi.training.dip.exercise;

public class EncodingModuleClient {
    public static void main(String[] args) throws Exception {
        DataReader fileReader = new FileDataReader("DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        DataWriter fileWriter = new FileDataWriter("DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        EncodingModule fileEncodingModule = new EncodingModule(fileReader, fileWriter);
        fileEncodingModule.encode();

        DataReader networkReader = new NetworkDataReader("http://myfirstappwith.appspot.com/index.html");
        DataWriter databaseWriter = new MyDatabase();
        EncodingModule networkEncodingModule = new EncodingModule(networkReader, databaseWriter);
        networkEncodingModule.encode();
    }
}
