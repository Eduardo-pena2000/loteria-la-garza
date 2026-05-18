package xb;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class u extends l {
    public J b(C file, boolean z) {
        kotlin.jvm.internal.t.g(file, "file");
        if (z) {
            t(file);
        }
        return x.f(file.m(), true);
    }

    public void c(C source, C target) {
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(target, "target");
        if (source.m().renameTo(target.m())) {
            return;
        }
        throw new IOException("failed to move " + source + " to " + target);
    }

    public void g(C dir, boolean z) {
        kotlin.jvm.internal.t.g(dir, "dir");
        if (dir.m().mkdir()) {
            return;
        }
        k m = m(dir);
        if (m == null || !m.f()) {
            throw new IOException("failed to create directory: " + dir);
        }
        if (z) {
            throw new IOException(dir + " already exist.");
        }
    }

    public void i(C path, boolean z) {
        kotlin.jvm.internal.t.g(path, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File m = path.m();
        if (m.delete()) {
            return;
        }
        if (m.exists()) {
            throw new IOException("failed to delete " + path);
        }
        if (z) {
            throw new FileNotFoundException("no such file: " + path);
        }
    }

    public List k(C dir) {
        kotlin.jvm.internal.t.g(dir, "dir");
        List r = r(dir, true);
        kotlin.jvm.internal.t.d(r);
        return r;
    }

    public k m(C path) {
        kotlin.jvm.internal.t.g(path, "path");
        File m = path.m();
        boolean isFile = m.isFile();
        boolean isDirectory = m.isDirectory();
        long lastModified = m.lastModified();
        long length = m.length();
        if (isFile || isDirectory || lastModified != 0 || length != 0 || m.exists()) {
            return new k(isFile, isDirectory, null, Long.valueOf(length), null, Long.valueOf(lastModified), null, null, 128, null);
        }
        return null;
    }

    public j n(C file) {
        kotlin.jvm.internal.t.g(file, "file");
        return new t(false, new RandomAccessFile(file.m(), "r"));
    }

    public J p(C file, boolean z) {
        kotlin.jvm.internal.t.g(file, "file");
        if (z) {
            s(file);
        }
        return x.i(file.m(), false, 1, null);
    }

    public L q(C file) {
        kotlin.jvm.internal.t.g(file, "file");
        return x.j(file.m());
    }

    public final List r(C c, boolean z) {
        File m = c.m();
        String[] list = m.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String it : list) {
                kotlin.jvm.internal.t.f(it, "it");
                arrayList.add(c.k(it));
            }
            Da.z.B(arrayList);
            return arrayList;
        }
        if (!z) {
            return null;
        }
        if (m.exists()) {
            throw new IOException("failed to list " + c);
        }
        throw new FileNotFoundException("no such file: " + c);
    }

    public final void s(C c) {
        if (j(c)) {
            throw new IOException(c + " already exists.");
        }
    }

    public final void t(C c) {
        if (j(c)) {
            return;
        }
        throw new IOException(c + " doesn't exist.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
