package org.apache.tika.pipes.async;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import org.apache.tika.pipes.pipesiterator.TotalCountResult;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class AsyncStatus {
    private Instant lastUpdate;
    private final Instant started;
    private TotalCountResult totalCountResult = new TotalCountResult(0, TotalCountResult.STATUS.NOT_COMPLETED);
    private Map statusCounts = new HashMap();
    private ASYNC_STATUS asyncStatus = ASYNC_STATUS.STARTED;
    private String crashMessage = "";

    public enum ASYNC_STATUS {
        STARTED,
        COMPLETED,
        CRASHED
    }

    public AsyncStatus() {
        Instant a = b.a();
        this.started = a;
        this.lastUpdate = a;
    }

    public ASYNC_STATUS getAsyncStatus() {
        return this.asyncStatus;
    }

    public String getCrashMessage() {
        return this.crashMessage;
    }

    public Instant getLastUpdate() {
        return this.lastUpdate;
    }

    public Instant getStarted() {
        return this.started;
    }

    public Map getStatusCounts() {
        return this.statusCounts;
    }

    public TotalCountResult getTotalCountResult() {
        return this.totalCountResult;
    }

    public String toString() {
        return "AsyncStatus{started=" + String.valueOf(this.started) + ", lastUpdate=" + String.valueOf(this.lastUpdate) + ", totalCountResult=" + String.valueOf(this.totalCountResult) + ", statusCounts=" + String.valueOf(this.statusCounts) + ", asyncStatus=" + String.valueOf(this.asyncStatus) + ", crashMessage='" + this.crashMessage + "'}";
    }

    public synchronized void update(Map map, TotalCountResult totalCountResult, ASYNC_STATUS async_status) {
        this.lastUpdate = b.a();
        this.statusCounts = map;
        this.totalCountResult = totalCountResult;
        this.asyncStatus = async_status;
    }

    public void updateCrash(String str) {
        this.crashMessage = str;
    }
}
