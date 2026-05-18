package org.apache.tika.parser;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class AbstractExternalProcessParser implements Parser {
    private static final ConcurrentHashMap PROCESS_MAP = new ConcurrentHashMap();
    private static final long serialVersionUID = 7186985395903074255L;

    static {
        Runtime.getRuntime().addShutdownHook(new Thread(new a()));
    }

    public static /* synthetic */ void a() {
        lambda$static$0();
    }

    private static /* synthetic */ void lambda$static$0() {
        PROCESS_MAP.forEachValue(1L, new b());
    }

    public String register(Process process) {
        String uuid = UUID.randomUUID().toString();
        PROCESS_MAP.put(uuid, process);
        return uuid;
    }

    public Process release(String str) {
        return (Process) PROCESS_MAP.remove(str);
    }
}
