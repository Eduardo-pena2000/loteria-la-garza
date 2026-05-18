package okhttp3.internal.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.t;
import xb.J;
import xb.L;
import xb.x;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface FileSystem {

    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        public static final class SystemFileSystem implements FileSystem {
            public J appendingSink(File file) {
                t.g(file, "file");
                try {
                    return x.a(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return x.a(file);
                }
            }

            public void delete(File file) {
                t.g(file, "file");
                if (!file.delete() && file.exists()) {
                    throw new IOException(t.o("failed to delete ", file));
                }
            }

            public void deleteContents(File directory) {
                t.g(directory, "directory");
                File[] listFiles = directory.listFiles();
                if (listFiles == null) {
                    throw new IOException(t.o("not a readable directory: ", directory));
                }
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file = listFiles[i];
                    i++;
                    if (file.isDirectory()) {
                        t.f(file, "file");
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException(t.o("failed to delete ", file));
                    }
                }
            }

            public boolean exists(File file) {
                t.g(file, "file");
                return file.exists();
            }

            public void rename(File from, File to) {
                t.g(from, "from");
                t.g(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            public J sink(File file) {
                t.g(file, "file");
                try {
                    return x.i(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return x.i(file, false, 1, null);
                }
            }

            public long size(File file) {
                t.g(file, "file");
                return file.length();
            }

            public L source(File file) {
                t.g(file, "file");
                return x.j(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    J appendingSink(File file);

    void delete(File file);

    void deleteContents(File file);

    boolean exists(File file);

    void rename(File file, File file2);

    J sink(File file);

    long size(File file);

    L source(File file);
}
