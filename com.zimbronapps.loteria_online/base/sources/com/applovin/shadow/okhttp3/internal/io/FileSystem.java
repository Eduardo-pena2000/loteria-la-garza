package com.applovin.shadow.okhttp3.internal.io;

import com.applovin.shadow.okio.Okio;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface FileSystem {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        public static final class SystemFileSystem implements FileSystem {
            public Sink appendingSink(File file) throws FileNotFoundException {
                t.g(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            public void delete(File file) throws IOException {
                t.g(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            public void deleteContents(File file) throws IOException {
                t.g(file, "directory");
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    throw new IOException("not a readable directory: " + file);
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        t.f(file2, "file");
                        deleteContents(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
            }

            public boolean exists(File file) {
                t.g(file, "file");
                return file.exists();
            }

            public void rename(File file, File file2) throws IOException {
                t.g(file, "from");
                t.g(file2, "to");
                delete(file2);
                if (file.renameTo(file2)) {
                    return;
                }
                throw new IOException("failed to rename " + file + " to " + file2);
            }

            public Sink sink(File file) throws FileNotFoundException {
                t.g(file, "file");
                try {
                    return Okio.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.sink$default(file, false, 1, null);
                }
            }

            public long size(File file) {
                t.g(file, "file");
                return file.length();
            }

            public Source source(File file) throws FileNotFoundException {
                t.g(file, "file");
                return Okio.source(file);
            }

            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }
    }

    Sink appendingSink(File file) throws FileNotFoundException;

    void delete(File file) throws IOException;

    void deleteContents(File file) throws IOException;

    boolean exists(File file);

    void rename(File file, File file2) throws IOException;

    Sink sink(File file) throws FileNotFoundException;

    long size(File file);

    Source source(File file) throws FileNotFoundException;
}
