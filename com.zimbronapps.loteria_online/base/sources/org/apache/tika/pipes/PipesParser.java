package org.apache.tika.pipes;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PipesParser implements Closeable {
    private final ArrayBlockingQueue clientQueue;
    private final List clients = new ArrayList();
    private final PipesConfig pipesConfig;

    public PipesParser(PipesConfig pipesConfig) {
        this.pipesConfig = pipesConfig;
        this.clientQueue = new ArrayBlockingQueue(pipesConfig.getNumClients());
        for (int i = 0; i < pipesConfig.getNumClients(); i++) {
            PipesClient pipesClient = new PipesClient(pipesConfig);
            this.clientQueue.offer(pipesClient);
            this.clients.add(pipesClient);
        }
    }

    public void close() throws IOException {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.clients.iterator();
        while (it.hasNext()) {
            try {
                ((PipesClient) it.next()).close();
            } catch (IOException e) {
                arrayList.add(e);
            }
        }
        if (arrayList.size() > 0) {
            throw ((IOException) arrayList.get(0));
        }
    }

    public PipesResult parse(FetchEmitTuple fetchEmitTuple) throws InterruptedException, PipesException, IOException {
        PipesClient pipesClient;
        PipesClient pipesClient2 = null;
        try {
            pipesClient = (PipesClient) this.clientQueue.poll(this.pipesConfig.getMaxWaitForClientMillis(), TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (pipesClient != null) {
                PipesResult process = pipesClient.process(fetchEmitTuple);
                this.clientQueue.offer(pipesClient);
                return process;
            }
            PipesResult pipesResult = PipesResult.CLIENT_UNAVAILABLE_WITHIN_MS;
            if (pipesClient != null) {
                this.clientQueue.offer(pipesClient);
            }
            return pipesResult;
        } catch (Throwable th2) {
            th = th2;
            pipesClient2 = pipesClient;
            if (pipesClient2 != null) {
                this.clientQueue.offer(pipesClient2);
            }
            throw th;
        }
    }
}
