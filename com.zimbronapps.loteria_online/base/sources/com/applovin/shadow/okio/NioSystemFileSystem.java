package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileTime;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public class NioSystemFileSystem extends JvmSystemFileSystem {
    private final Long zeroToNull(FileTime fileTime) {
        Long valueOf = Long.valueOf(v.a(fileTime));
        if (valueOf.longValue() != 0) {
            return valueOf;
        }
        return null;
    }

    public void atomicMove(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        try {
            b.a(path.toNioPath(), path2.toNioPath(), new CopyOption[]{r.a(), s.a()});
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(c.a(e));
        }
    }

    public void createSymlink(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        j.a(path.toNioPath(), path2.toNioPath(), new FileAttribute[0]);
    }

    public FileMetadata metadataOrNull(Path path) {
        kotlin.jvm.internal.t.g(path, "path");
        return metadataOrNull(path.toNioPath());
    }

    public String toString() {
        return "NioSystemFileSystem";
    }

    public final FileMetadata metadataOrNull(java.nio.file.Path path) {
        kotlin.jvm.internal.t.g(path, "nioPath");
        try {
            BasicFileAttributes a = y.a(path, t.a(), new LinkOption[]{x.a()});
            java.nio.file.Path a2 = z.a(a) ? A.a(path) : null;
            boolean a3 = B.a(a);
            boolean a4 = C.a(a);
            Path path2 = a2 != null ? Path.Companion.get$default(Path.Companion, a2, false, 1, (Object) null) : null;
            Long valueOf = Long.valueOf(D.a(a));
            FileTime a5 = E.a(a);
            Long zeroToNull = a5 != null ? zeroToNull(a5) : null;
            FileTime a6 = u.a(a);
            Long zeroToNull2 = a6 != null ? zeroToNull(a6) : null;
            FileTime a7 = w.a(a);
            return new FileMetadata(a3, a4, path2, valueOf, zeroToNull, zeroToNull2, a7 != null ? zeroToNull(a7) : null, null, 128, null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
