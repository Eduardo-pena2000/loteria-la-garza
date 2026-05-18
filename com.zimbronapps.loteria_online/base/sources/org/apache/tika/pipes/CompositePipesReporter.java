package org.apache.tika.pipes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.config.Field;
import org.apache.tika.config.Initializable;
import org.apache.tika.config.InitializableProblemHandler;
import org.apache.tika.exception.TikaConfigException;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class CompositePipesReporter extends PipesReporter implements Initializable {
    private List pipesReporters = new ArrayList();

    @Field
    public void addPipesReporter(PipesReporter pipesReporter) {
        this.pipesReporters.add(pipesReporter);
    }

    public void checkInitialization(InitializableProblemHandler initializableProblemHandler) throws TikaConfigException {
        List list = this.pipesReporters;
        if (list == null) {
            throw new TikaConfigException("must specify 'pipesReporters'");
        }
        if (list.size() == 0) {
            throw new TikaConfigException("must specify at least one pipes reporter");
        }
    }

    public void close() throws IOException {
        Iterator it = this.pipesReporters.iterator();
        Throwable e = null;
        while (it.hasNext()) {
            try {
                ((PipesReporter) it.next()).close();
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    public void error(Throwable th) {
        Iterator it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            ((PipesReporter) it.next()).error(th);
        }
    }

    public List getPipesReporters() {
        return this.pipesReporters;
    }

    public void initialize(Map map) throws TikaConfigException {
    }

    public void report(FetchEmitTuple fetchEmitTuple, PipesResult pipesResult, long j) {
        Iterator it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            ((PipesReporter) it.next()).report(fetchEmitTuple, pipesResult, j);
        }
    }

    public boolean supportsTotalCount() {
        Iterator it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            if (((PipesReporter) it.next()).supportsTotalCount()) {
                return true;
            }
        }
        return false;
    }

    public void error(String str) {
        Iterator it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            ((PipesReporter) it.next()).error(str);
        }
    }

    public void report(TotalCountResult totalCountResult) {
        Iterator it = this.pipesReporters.iterator();
        while (it.hasNext()) {
            ((PipesReporter) it.next()).report(totalCountResult);
        }
    }
}
