package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import kotlin.jvm.internal.t;
import xb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FileOperator {
    public final FileChannel a;

    public FileOperator(FileChannel fileChannel) {
        t.g(fileChannel, "fileChannel");
        this.a = fileChannel;
    }

    public final void a(long j, e sink, long j2) {
        t.g(sink, "sink");
        if (j2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferTo = this.a.transferTo(j, j2, sink);
            j += transferTo;
            j2 -= transferTo;
        }
    }

    public final void b(long j, e source, long j2) {
        t.g(source, "source");
        if (j2 < 0 || j2 > source.A()) {
            throw new IndexOutOfBoundsException();
        }
        while (j2 > 0) {
            long transferFrom = this.a.transferFrom(source, j, j2);
            j += transferFrom;
            j2 -= transferFrom;
        }
    }
}
