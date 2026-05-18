package org.apache.tika.pipes.async;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.apache.tika.pipes.emitter.EmitData;
import org.apache.tika.pipes.emitter.Emitter;
import org.apache.tika.pipes.emitter.EmitterManager;
import org.apache.tika.pipes.emitter.TikaEmitterException;
import org.apache.tika.utils.ExceptionUtils;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AsyncEmitter implements Callable {
    static final int EMITTER_FUTURE_CODE = 2;
    static final EmitData EMIT_DATA_STOP_SEMAPHORE = new EmitData(null, null, null);
    private static final Wb.c LOG = Wb.e.l(AsyncEmitter.class);
    private final AsyncConfig asyncConfig;
    private final ArrayBlockingQueue emitDataQueue;
    private final EmitterManager emitterManager;
    Instant lastEmitted = b.a();

    public class EmitDataCache {
        private final long maxBytes;
        long estimatedSize = 0;
        int size = 0;
        Map map = new HashMap();

        public EmitDataCache(long j) {
            this.maxBytes = j;
        }

        public static /* synthetic */ List a(String str) {
            return lambda$add$0(str);
        }

        public static /* bridge */ /* synthetic */ void b(EmitDataCache emitDataCache) {
            emitDataCache.emitAll();
        }

        private void emitAll() {
            AsyncEmitter.b().b("about to emit {} files, {} estimated bytes", Integer.valueOf(this.size), Long.valueOf(this.estimatedSize));
            int i = 0;
            for (Map.Entry entry : this.map.entrySet()) {
                tryToEmit(AsyncEmitter.a(AsyncEmitter.this).getEmitter((String) entry.getKey()), (List) entry.getValue());
                i += ((List) entry.getValue()).size();
            }
            AsyncEmitter.b().t("emitted: {} files", Integer.valueOf(i));
            this.estimatedSize = 0L;
            this.size = 0;
            this.map.clear();
            AsyncEmitter.this.lastEmitted = b.a();
        }

        private static /* synthetic */ List lambda$add$0(String str) {
            return new ArrayList();
        }

        private void tryToEmit(Emitter emitter, List list) {
            try {
                emitter.emit(list);
            } catch (IOException | TikaEmitterException e) {
                AsyncEmitter.b().g("emitter class ({}): {}", emitter.getClass(), ExceptionUtils.getStackTrace(e));
            }
        }

        public void add(EmitData emitData) {
            this.size++;
            long estimatedSizeBytes = emitData.getEstimatedSizeBytes();
            if (this.estimatedSize + estimatedSizeBytes > this.maxBytes) {
                AsyncEmitter.b().b("estimated size ({}) > maxBytes({}), going to emitAll", Long.valueOf(this.estimatedSize + estimatedSizeBytes), Long.valueOf(this.maxBytes));
                emitAll();
            }
            List list = (List) this.map.computeIfAbsent(emitData.getEmitKey().getEmitterName(), new d());
            updateEstimatedSize(estimatedSizeBytes);
            list.add(emitData);
        }

        public void updateEstimatedSize(long j) {
            this.estimatedSize += j;
        }
    }

    public AsyncEmitter(AsyncConfig asyncConfig, ArrayBlockingQueue arrayBlockingQueue, EmitterManager emitterManager) {
        this.asyncConfig = asyncConfig;
        this.emitDataQueue = arrayBlockingQueue;
        this.emitterManager = emitterManager;
    }

    public static /* bridge */ /* synthetic */ EmitterManager a(AsyncEmitter asyncEmitter) {
        return asyncEmitter.emitterManager;
    }

    public static /* bridge */ /* synthetic */ Wb.c b() {
        return LOG;
    }

    public Integer call() throws Exception {
        EmitDataCache emitDataCache = new EmitDataCache(this.asyncConfig.getEmitMaxEstimatedBytes());
        while (true) {
            EmitData emitData = (EmitData) this.emitDataQueue.poll(500L, TimeUnit.MILLISECONDS);
            if (emitData == EMIT_DATA_STOP_SEMAPHORE) {
                EmitDataCache.b(emitDataCache);
                return 2;
            }
            if (emitData != null) {
                emitDataCache.add(emitData);
            } else {
                LOG.x("Nothing on the async queue");
            }
            Wb.c cVar = LOG;
            cVar.b("cache size: ({}) bytes and extract count: {}", Long.valueOf(emitDataCache.estimatedSize), Integer.valueOf(emitDataCache.size));
            long a = c.a(a.a(), this.lastEmitted, b.a());
            if (a > this.asyncConfig.getEmitWithinMillis()) {
                cVar.b("{} elapsed > {}, going to emitAll", Long.valueOf(a), Long.valueOf(this.asyncConfig.getEmitWithinMillis()));
                EmitDataCache.b(emitDataCache);
            }
        }
    }
}
