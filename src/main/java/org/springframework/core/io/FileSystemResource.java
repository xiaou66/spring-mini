package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiaou
 * @date 2024/1/25
 */
public class FileSystemResource implements Resource {
    private final String filePath;

    public FileSystemResource(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public InputStream getInputSteam() throws IOException {

        return null;
    }
}
