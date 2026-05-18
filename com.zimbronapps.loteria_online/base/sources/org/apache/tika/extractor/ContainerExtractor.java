package org.apache.tika.extractor;

import java.io.IOException;
import java.io.Serializable;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TikaInputStream;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ContainerExtractor extends Serializable {
    void extract(TikaInputStream tikaInputStream, ContainerExtractor containerExtractor, EmbeddedResourceHandler embeddedResourceHandler) throws IOException, TikaException;

    boolean isSupported(TikaInputStream tikaInputStream) throws IOException;
}
