package com.facebook.presto.hadoop;

import org.apache.hadoop.util.NativeCodeLoader;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestHadoopNative
{
    @Test
    public void testSanity()
            throws Exception
    {
        HadoopNative.requireHadoopNative();
        assertTrue(NativeCodeLoader.isNativeCodeLoaded());
    }
}
