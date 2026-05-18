package org.apache.tika.pipes;

import java.io.Closeable;
import java.io.IOException;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class PipesReporter implements Closeable {
    public static final PipesReporter NO_OP_REPORTER = new 1();

    public class 1 extends PipesReporter {
        public void error(String str) {
        }

        public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j) {
        }

        public void error(Throwable th) {
        }
    }

    public void close() throws IOException {
    }

    public abstract void error(String str);

    public abstract void error(Throwable th);

    public abstract void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j);

    public void report(TotalCountResult totalCountResult) {
    }

    public boolean supportsTotalCount() {
        return false;
    }
}
