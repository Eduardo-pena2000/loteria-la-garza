package org.apache.tika.concurrent;

import java.util.concurrent.ExecutorService;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface ConfigurableThreadPoolExecutor extends ExecutorService {
    void setCorePoolSize(int i);

    void setMaximumPoolSize(int i);
}
