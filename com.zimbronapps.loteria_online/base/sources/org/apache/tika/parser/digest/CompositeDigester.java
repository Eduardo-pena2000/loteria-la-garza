package org.apache.tika.parser.digest;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.DigestingParser;
import org.apache.tika.parser.ParseContext;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositeDigester implements DigestingParser.Digester {
    private final DigestingParser.Digester[] digesters;

    public CompositeDigester(DigestingParser.Digester... digesterArr) {
        this.digesters = digesterArr;
    }

    public void digest(InputStream inputStream, Metadata metadata, ParseContext parseContext) throws IOException {
        TemporaryResources temporaryResources = new TemporaryResources();
        InputStream inputStream2 = TikaInputStream.get(inputStream, temporaryResources, metadata);
        try {
            for (DigestingParser.Digester digester : this.digesters) {
                digester.digest(inputStream2, metadata, parseContext);
            }
            try {
                temporaryResources.dispose();
            } catch (TikaException e) {
                throw new IOException(e);
            }
        } catch (Throwable th) {
            try {
                temporaryResources.dispose();
                throw th;
            } catch (TikaException e2) {
                throw new IOException(e2);
            }
        }
    }
}
