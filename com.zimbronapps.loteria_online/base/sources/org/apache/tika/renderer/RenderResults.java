package org.apache.tika.renderer;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.tika.io.TemporaryResources;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class RenderResults implements Closeable {
    private List results = new ArrayList();
    private final TemporaryResources tmp;

    public RenderResults(TemporaryResources temporaryResources) {
        this.tmp = temporaryResources;
    }

    public void add(RenderResult renderResult) {
        this.tmp.addResource(renderResult);
        this.results.add(renderResult);
    }

    public void close() throws IOException {
        this.tmp.close();
    }

    public List getResults() {
        return this.results;
    }
}
