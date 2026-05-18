package org.apache.tika.pipes.pipesiterator.fs;

import org.apache.tika.pipes.pipesiterator.fs.FileSystemPipesIterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ FileSystemPipesIterator.FileCountWorker a;

    public /* synthetic */ e(FileSystemPipesIterator.FileCountWorker fileCountWorker) {
        this.a = fileCountWorker;
    }

    public final void run() {
        FileSystemPipesIterator.FileCountWorker.a(this.a);
    }
}
