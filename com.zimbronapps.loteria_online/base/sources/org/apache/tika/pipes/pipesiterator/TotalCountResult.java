package org.apache.tika.pipes.pipesiterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class TotalCountResult {
    public static TotalCountResult UNSUPPORTED = new TotalCountResult(-1, STATUS.UNSUPPORTED);
    private STATUS status;
    private long totalCount;

    public enum STATUS {
        UNSUPPORTED,
        EXCEPTION,
        NOT_COMPLETED,
        COMPLETED
    }

    public TotalCountResult() {
        this.totalCount = 0L;
        this.status = STATUS.NOT_COMPLETED;
    }

    public STATUS getStatus() {
        return this.status;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public String toString() {
        return "TotalCountResult{totalCount=" + this.totalCount + ", status=" + String.valueOf(this.status) + "}";
    }

    public TotalCountResult(long j, STATUS status) {
        this.totalCount = j;
        this.status = status;
    }
}
