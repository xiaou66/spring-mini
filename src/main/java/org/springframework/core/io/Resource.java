package org.springframework.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author xiaou
 * @date 2024/1/25
 */
public interface Resource {
    InputStream getInputSteam() throws IOException;
}
