package com.unity3d.services.core.network.domain;

import Ca.q;
import Ca.x;
import Da.D;
import Qa.p;
import java.io.File;
import java.util.List;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CleanupDirectory$invoke$additionalFiles$2 extends u implements p {
    public static final CleanupDirectory$invoke$additionalFiles$2 INSTANCE = new CleanupDirectory$invoke$additionalFiles$2();

    public CleanupDirectory$invoke$additionalFiles$2() {
        super(2);
    }

    public final q invoke(q qVar, File file) {
        t.g(qVar, "<name for destructuring parameter 0>");
        t.g(file, "file");
        return x.a(Long.valueOf(((Number) qVar.a()).longValue() - file.length()), D.w0((List) qVar.b(), file));
    }
}
