package xb;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import xb.C;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class w extends u {
    public void c(C source, C target) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(target, "target");
        try {
            com.applovin.shadow.okio.b.a(source.n(), target.n(), new CopyOption[]{v.a(com.applovin.shadow.okio.r.a()), v.a(com.applovin.shadow.okio.s.a())});
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(com.applovin.shadow.okio.c.a(e));
        }
    }

    public k m(C path) {
        kotlin.jvm.internal.t.g(path, "path");
        return u(path.n());
    }

    public String toString() {
        return "NioSystemFileSystem";
    }

    public final k u(Path nioPath) {
        kotlin.jvm.internal.t.g(nioPath, "nioPath");
        try {
            BasicFileAttributes a = com.applovin.shadow.okio.y.a(nioPath, com.applovin.shadow.okio.t.a(), new LinkOption[]{com.applovin.shadow.okio.x.a()});
            Path a2 = com.applovin.shadow.okio.z.a(a) ? com.applovin.shadow.okio.A.a(nioPath) : null;
            boolean a3 = com.applovin.shadow.okio.B.a(a);
            boolean a4 = com.applovin.shadow.okio.C.a(a);
            C f = a2 != null ? C.a.f(C.b, a2, false, 1, null) : null;
            Long valueOf = Long.valueOf(com.applovin.shadow.okio.D.a(a));
            FileTime a5 = com.applovin.shadow.okio.E.a(a);
            Long v = a5 != null ? v(a5) : null;
            FileTime a6 = com.applovin.shadow.okio.u.a(a);
            Long v2 = a6 != null ? v(a6) : null;
            FileTime a7 = com.applovin.shadow.okio.w.a(a);
            return new k(a3, a4, f, valueOf, v, v2, a7 != null ? v(a7) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    public final Long v(FileTime fileTime) {
        Long valueOf = Long.valueOf(com.applovin.shadow.okio.v.a(fileTime));
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }
}
