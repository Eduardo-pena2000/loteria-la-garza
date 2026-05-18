package org.apache.tika.pipes.pipesiterator.fs;

import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ Path a(Path path, FileVisitor fileVisitor) {
        return Files.walkFileTree(path, fileVisitor);
    }
}
