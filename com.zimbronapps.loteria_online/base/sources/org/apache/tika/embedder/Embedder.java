package org.apache.tika.embedder;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Set;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Embedder extends Serializable {
    void embed(Metadata metadata, InputStream inputStream, OutputStream outputStream, ParseContext parseContext) throws IOException, TikaException;

    Set getSupportedEmbedTypes(ParseContext parseContext);
}
