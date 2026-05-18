package org.apache.tika.pipes.async;

import com.applovin.shadow.okio.q;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.PipesConfigBase;
import org.apache.tika.pipes.PipesReporter;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AsyncConfig extends PipesConfigBase {
    private long emitWithinMillis = 10000;
    private long emitMaxEstimatedBytes = 100000;
    private int queueSize = 10000;
    private int numEmitters = 1;
    private boolean emitIntermediateResults = false;
    private PipesReporter pipesReporter = PipesReporter.NO_OP_REPORTER;

    public static AsyncConfig load(Path path) throws IOException, TikaConfigException {
        AsyncConfig asyncConfig = new AsyncConfig();
        InputStream a = q.a(path, new OpenOption[0]);
        try {
            asyncConfig.configure("async", a);
            if (a != null) {
                a.close();
            }
            if (asyncConfig.getTikaConfig() == null) {
                asyncConfig.setTikaConfig(path);
            }
            return asyncConfig;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public long getEmitMaxEstimatedBytes() {
        return this.emitMaxEstimatedBytes;
    }

    public long getEmitWithinMillis() {
        return this.emitWithinMillis;
    }

    public int getNumEmitters() {
        return this.numEmitters;
    }

    public PipesReporter getPipesReporter() {
        return this.pipesReporter;
    }

    public int getQueueSize() {
        return this.queueSize;
    }

    public boolean isEmitIntermediateResults() {
        return this.emitIntermediateResults;
    }

    public void setEmitIntermediateResults(boolean z) {
        this.emitIntermediateResults = z;
    }

    public void setEmitMaxEstimatedBytes(long j) {
        this.emitMaxEstimatedBytes = j;
    }

    public void setEmitWithinMillis(long j) {
        this.emitWithinMillis = j;
    }

    public void setNumEmitters(int i) {
        this.numEmitters = i;
    }

    public void setPipesReporter(PipesReporter pipesReporter) {
        this.pipesReporter = pipesReporter;
    }

    public void setQueueSize(int i) {
        this.queueSize = i;
    }
}
