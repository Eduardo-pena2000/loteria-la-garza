package org.apache.tika.config;

import java.util.Map;
import org.apache.tika.exception.TikaConfigException;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public interface Initializable {
    void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException;

    void initialize(Map map) throws TikaConfigException;
}
