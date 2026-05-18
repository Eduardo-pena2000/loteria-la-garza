package org.apache.tika.detect;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface EncodingDetector extends Serializable {
    Charset detect(InputStream inputStream, Metadata metadata) throws IOException;
}
