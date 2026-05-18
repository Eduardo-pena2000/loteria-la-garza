package org.apache.tika.extractor;

import Db.g;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.pipes.extractor.EmbeddedDocumentBytesConfig;
import zb.g;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class BasicEmbeddedDocumentBytesHandler extends AbstractEmbeddedDocumentBytesHandler {
    private final EmbeddedDocumentBytesConfig config;
    Map docBytes = new HashMap();

    public BasicEmbeddedDocumentBytesHandler(EmbeddedDocumentBytesConfig embeddedDocumentBytesConfig) {
        this.config = embeddedDocumentBytesConfig;
    }

    public void add(int i, Metadata metadata, InputStream inputStream) throws IOException {
        super.add(i, metadata, inputStream);
        this.docBytes.put(Integer.valueOf(i), g.u(inputStream));
    }

    public void close() throws IOException {
    }

    public InputStream getDocument(int i) throws IOException {
        return ((g.b) new g.b().d((byte[]) this.docBytes.get(Integer.valueOf(i)))).l();
    }
}
