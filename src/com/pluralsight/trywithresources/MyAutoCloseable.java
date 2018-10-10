package com.pluralsight.trywithresources;

import java.io.IOException;

/**
 * Created by Jim on 1/9/2016.
 */
public class MyAutoCloseable implements AutoCloseable {
    public void saySomething() throws IOException{
        throw new IOException("Exception from SaySomething");
        // System.out.println("Something");
    }
    @Override
    public void close() throws IOException {
        throw new IOException("Exception from Close");
        // System.out.println("close");
    }
}
