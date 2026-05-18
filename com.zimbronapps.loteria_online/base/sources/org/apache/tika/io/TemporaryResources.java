package org.apache.tika.io;

import B8.m;
import com.applovin.shadow.okio.l;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.Iterator;
import java.util.LinkedList;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.utils.StringUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TemporaryResources implements Closeable {
    private static final Wb.c LOG = Wb.e.l(TemporaryResources.class);
    private final LinkedList resources = new LinkedList();
    private Path tempFileDir = null;

    public static /* synthetic */ void a(Path path) {
        lambda$createTempFile$0(path);
    }

    private static /* synthetic */ void lambda$createTempFile$0(Path path) throws IOException {
        try {
            l.a(path);
        } catch (IOException unused) {
            LOG.w("delete tmp file fail, will delete it on exit");
            org.apache.tika.fork.b.a(path).deleteOnExit();
        }
    }

    public void addResource(Closeable closeable) {
        this.resources.addFirst(closeable);
    }

    public void close() throws IOException {
        Iterator it = this.resources.iterator();
        Throwable th = null;
        while (it.hasNext()) {
            try {
                ((Closeable) it.next()).close();
            } catch (IOException e) {
                if (th == null) {
                    th = e;
                } else {
                    th.addSuppressed(e);
                }
            }
        }
        this.resources.clear();
        if (th != null) {
            throw th;
        }
    }

    public Path createTempFile(String str) throws IOException {
        if (StringUtils.isBlank(str)) {
            str = ".tmp";
        }
        Path path = this.tempFileDir;
        Path a = path == null ? org.apache.tika.fork.a.a("apache-tika-", str, new FileAttribute[0]) : c.a(path, "apache-tika-", str, new FileAttribute[0]);
        addResource(new d(a));
        return a;
    }

    public File createTemporaryFile() throws IOException {
        return org.apache.tika.fork.b.a(createTempFile(""));
    }

    public void dispose() throws TikaException {
        try {
            close();
        } catch (IOException e) {
            throw new TikaException("Failed to close temporary resources", e);
        }
    }

    public Closeable getResource(Class cls) {
        Iterator it = this.resources.iterator();
        while (it.hasNext()) {
            Closeable closeable = (Closeable) it.next();
            if (cls.isAssignableFrom(closeable.getClass())) {
                return closeable;
            }
        }
        return null;
    }

    public void setTemporaryFileDirectory(Path path) {
        this.tempFileDir = path;
    }

    public void setTemporaryFileDirectory(File file) {
        this.tempFileDir = file == null ? null : m.a(file);
    }

    public Path createTempFile() throws IOException {
        return createTempFile("");
    }

    public Path createTempFile(Metadata metadata) throws IOException {
        String str = metadata.get("resourceName");
        if (StringUtils.isBlank(str)) {
            return createTempFile("");
        }
        return createTempFile(FilenameUtils.getSuffixFromPath(str));
    }
}
