package com.applovin.shadow.okio;

import com.applovin.shadow.okio.Path;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.file.CopyOption;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.P;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public final class NioFileSystemWrappingFileSystem extends NioSystemFileSystem {
    private final java.nio.file.FileSystem nioFileSystem;

    public NioFileSystemWrappingFileSystem(java.nio.file.FileSystem fileSystem) {
        kotlin.jvm.internal.t.g(fileSystem, "nioFileSystem");
        this.nioFileSystem = fileSystem;
    }

    private final java.nio.file.Path resolve(Path path) {
        java.nio.file.Path a = a.a(this.nioFileSystem, path.toString(), new String[0]);
        kotlin.jvm.internal.t.f(a, "getPath(...)");
        return a;
    }

    public Sink appendingSink(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "file");
        List c = Da.u.c();
        c.add(n.a());
        if (!z) {
            c.add(o.a());
        }
        List a = Da.u.a(c);
        java.nio.file.Path resolve = resolve(path);
        StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a.toArray(new StandardOpenOption[0]);
        OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
        OutputStream a2 = p.a(resolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        kotlin.jvm.internal.t.f(a2, "newOutputStream(this, *options)");
        return Okio.sink(a2);
    }

    public void atomicMove(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        try {
            kotlin.jvm.internal.t.f(b.a(resolve(path), resolve(path2), (CopyOption[]) Arrays.copyOf(new CopyOption[]{r.a(), s.a()}, 2)), "move(this, target, *options)");
        } catch (UnsupportedOperationException unused) {
            throw new IOException("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(c.a(e));
        }
    }

    public Path canonicalize(Path path) {
        kotlin.jvm.internal.t.g(path, "path");
        try {
            Path.Companion companion = Path.Companion;
            java.nio.file.Path a = i.a(resolve(path), new LinkOption[0]);
            kotlin.jvm.internal.t.f(a, "toRealPath(...)");
            return Path.Companion.get$default(companion, a, false, 1, (Object) null);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void createDirectory(com.applovin.shadow.okio.Path r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.t.g(r4, r0)
            com.applovin.shadow.okio.FileMetadata r0 = r3.metadataOrNull(r4)
            r1 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.isDirectory()
            r2 = 1
            if (r0 != r2) goto L14
            goto L15
        L14:
            r2 = r1
        L15:
            if (r2 == 0) goto L31
            if (r5 != 0) goto L1a
            goto L31
        L1a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r4 = " already exists."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L31:
            java.nio.file.Path r5 = r3.resolve(r4)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L47
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.io.IOException -> L47
            java.nio.file.attribute.FileAttribute[] r0 = (java.nio.file.attribute.FileAttribute[]) r0     // Catch: java.io.IOException -> L47
            java.nio.file.Path r5 = com.applovin.shadow.okio.k.a(r5, r0)     // Catch: java.io.IOException -> L47
            java.lang.String r0 = "createDirectory(this, *attributes)"
            kotlin.jvm.internal.t.f(r5, r0)     // Catch: java.io.IOException -> L47
            return
        L47:
            r5 = move-exception
            if (r2 == 0) goto L4b
            return
        L4b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "failed to create directory: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.NioFileSystemWrappingFileSystem.createDirectory(com.applovin.shadow.okio.Path, boolean):void");
    }

    public void createSymlink(Path path, Path path2) {
        kotlin.jvm.internal.t.g(path, "source");
        kotlin.jvm.internal.t.g(path2, "target");
        kotlin.jvm.internal.t.f(j.a(resolve(path), resolve(path2), (FileAttribute[]) Arrays.copyOf(new FileAttribute[0], 0)), "createSymbolicLink(this, target, *attributes)");
    }

    public void delete(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        java.nio.file.Path resolve = resolve(path);
        try {
            l.a(resolve);
        } catch (IOException unused) {
            if (m.a(resolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to delete " + path);
            }
        } catch (NoSuchFileException unused2) {
            if (z) {
                throw new FileNotFoundException("no such file: " + path);
            }
        }
    }

    public List list(Path path) {
        kotlin.jvm.internal.t.g(path, "dir");
        List list = list(path, true);
        kotlin.jvm.internal.t.d(list);
        return list;
    }

    public List listOrNull(Path path) {
        kotlin.jvm.internal.t.g(path, "dir");
        return list(path, false);
    }

    public FileMetadata metadataOrNull(Path path) {
        kotlin.jvm.internal.t.g(path, "path");
        return metadataOrNull(resolve(path));
    }

    public FileHandle openReadOnly(Path path) {
        kotlin.jvm.internal.t.g(path, "file");
        try {
            FileChannel a = e.a(resolve(path), new OpenOption[]{d.a()});
            kotlin.jvm.internal.t.d(a);
            return new NioFileSystemFileHandle(false, a);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public FileHandle openReadWrite(Path path, boolean z, boolean z2) {
        kotlin.jvm.internal.t.g(path, "file");
        if (z && z2) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        List c = Da.u.c();
        c.add(d.a());
        c.add(f.a());
        if (z) {
            c.add(g.a());
        } else if (!z2) {
            c.add(o.a());
        }
        List a = Da.u.a(c);
        try {
            java.nio.file.Path resolve = resolve(path);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a.toArray(new StandardOpenOption[0]);
            FileChannel a2 = e.a(resolve, (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length));
            kotlin.jvm.internal.t.d(a2);
            return new NioFileSystemFileHandle(true, a2);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public Sink sink(Path path, boolean z) {
        kotlin.jvm.internal.t.g(path, "file");
        List c = Da.u.c();
        if (z) {
            c.add(g.a());
        }
        List a = Da.u.a(c);
        try {
            java.nio.file.Path resolve = resolve(path);
            StandardOpenOption[] standardOpenOptionArr = (StandardOpenOption[]) a.toArray(new StandardOpenOption[0]);
            OpenOption[] openOptionArr = (OpenOption[]) Arrays.copyOf(standardOpenOptionArr, standardOpenOptionArr.length);
            OutputStream a2 = p.a(resolve, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
            kotlin.jvm.internal.t.f(a2, "newOutputStream(this, *options)");
            return Okio.sink(a2);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public Source source(Path path) {
        kotlin.jvm.internal.t.g(path, "file");
        try {
            InputStream a = q.a(resolve(path), (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0));
            kotlin.jvm.internal.t.f(a, "newInputStream(this, *options)");
            return Okio.source(a);
        } catch (NoSuchFileException unused) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public String toString() {
        String e = P.b(this.nioFileSystem.getClass()).e();
        kotlin.jvm.internal.t.d(e);
        return e;
    }

    private final List list(Path path, boolean z) {
        java.nio.file.Path resolve = resolve(path);
        try {
            List b = Oa.e.b(resolve, (String) null, 1, (Object) null);
            ArrayList arrayList = new ArrayList();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                arrayList.add(Path.Companion.get$default(Path.Companion, h.a(it.next()), false, 1, (Object) null));
            }
            Da.z.B(arrayList);
            return arrayList;
        } catch (Exception unused) {
            if (!z) {
                return null;
            }
            if (m.a(resolve, (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0))) {
                throw new IOException("failed to list " + path);
            }
            throw new FileNotFoundException("no such file: " + path);
        }
    }
}
