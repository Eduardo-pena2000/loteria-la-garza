package org.apache.tika.pipes;

import Wb.e;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class LoggingPipesReporter extends PipesReporter {
    Wb.c LOGGER = e.l(LoggingPipesReporter.class);

    public void error(Throwable th) {
        this.LOGGER.error("pipes error", th);
    }

    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j) {
        this.LOGGER.j("{} {} {}", fetchEmitTuple, pipesResult, Long.valueOf(j));
    }

    public void error(String str) {
        this.LOGGER.u("error {}", str);
    }
}
