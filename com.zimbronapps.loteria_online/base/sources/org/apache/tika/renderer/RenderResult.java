package org.apache.tika.renderer;

import com.applovin.shadow.okio.h;
import com.applovin.shadow.okio.l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.io.TemporaryResources;
import org.apache.tika.io.TikaInputStream;
import org.apache.tika.metadata.Metadata;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RenderResult implements Closeable {
    private final int id;
    private final Metadata metadata;
    private final Object result;
    private final STATUS status;
    TemporaryResources tmp = new TemporaryResources();

    public class 1 implements Closeable {
        final /* synthetic */ Object val$result;

        public 1(Object obj) {
            this.val$result = obj;
        }

        public void close() throws IOException {
            l.a(h.a(this.val$result));
        }
    }

    public enum STATUS {
        SUCCESS,
        EXCEPTION,
        TIMEOUT
    }

    public RenderResult(STATUS status, int i, Object obj, Metadata metadata) {
        this.status = status;
        this.id = i;
        this.result = obj;
        this.metadata = metadata;
        if (a.a(obj)) {
            this.tmp.addResource(new 1(obj));
        } else if (obj instanceof Closeable) {
            this.tmp.addResource((Closeable) obj);
        }
    }

    public void close() throws IOException {
        this.tmp.close();
    }

    public int getId() {
        return this.id;
    }

    public InputStream getInputStream() throws IOException {
        if (a.a(this.result)) {
            return TikaInputStream.get(h.a(this.result), this.metadata);
        }
        TikaInputStream tikaInputStream = TikaInputStream.get(new byte[0]);
        tikaInputStream.setOpenContainer(this.result);
        return tikaInputStream;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public STATUS getStatus() {
        return this.status;
    }
}
