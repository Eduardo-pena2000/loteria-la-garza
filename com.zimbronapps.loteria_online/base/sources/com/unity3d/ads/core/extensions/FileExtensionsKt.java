package com.unity3d.ads.core.extensions;

import java.io.File;
import java.util.LinkedList;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class FileExtensionsKt {
    public static final long getDirectorySize(File file) {
        File[] listFiles;
        t.g(file, "<this>");
        long j = 0;
        if (!file.exists()) {
            return 0L;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(file);
        while (!linkedList.isEmpty()) {
            File file2 = (File) linkedList.remove(0);
            if (file2.exists() && (listFiles = file2.listFiles()) != null && listFiles.length != 0) {
                for (File child : listFiles) {
                    if (child.isDirectory()) {
                        t.f(child, "child");
                        linkedList.add(child);
                    } else {
                        j += child.length();
                    }
                }
            }
        }
        return j;
    }
}
