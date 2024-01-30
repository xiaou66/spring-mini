package org.springframework.test.ioc;

import cn.hutool.core.io.IoUtil;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.io.InputStream;

public class ResourceAndResourceLoaderTest {

    @Test
    public void testClassPathResourceLoader() throws Exception {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();

        // 加载 classPath
        Resource resource = resourceLoader.getResource("classpath:hello.txt");
        InputStream in = resource.getInputSteam();
        String txt = IoUtil.readUtf8(in);
        System.out.println(txt);
        Assert.assertEquals(txt, "hello world");
    }
    @Test
    public void testFileResourceLoader() throws IOException {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("src/test/resources/hello.txt");
        Assert.assertTrue(resource instanceof FileSystemResource);
        InputStream in = resource.getInputSteam();
        String txt = IoUtil.readUtf8(in);
        System.out.println(txt);
        Assert.assertEquals("hello world", txt);
    }

    @Test
    public void testUrlResourceLoader() throws IOException {
        DefaultResourceLoader resourceLoader = new DefaultResourceLoader();
        Resource resource = resourceLoader.getResource("https://www.baidu.com");
        Assert.assertTrue(resource instanceof UrlResource);
        InputStream in = resource.getInputSteam();
        String txt = IoUtil.readUtf8(in);
        System.out.println(txt);
    }
}
