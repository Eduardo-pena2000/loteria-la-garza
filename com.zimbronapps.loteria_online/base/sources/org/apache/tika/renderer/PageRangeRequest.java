package org.apache.tika.renderer;

import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public class PageRangeRequest implements RenderRequest {
    public static PageRangeRequest RENDER_ALL = new PageRangeRequest(1, -1);
    private final int from;
    private final int to;

    public PageRangeRequest(int i, int i2) {
        this.from = i;
        this.to = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PageRangeRequest pageRangeRequest = (PageRangeRequest) obj;
        return this.from == pageRangeRequest.from && this.to == pageRangeRequest.to;
    }

    public int getFrom() {
        return this.from;
    }

    public int getTo() {
        return this.to;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.from), Integer.valueOf(this.to)});
    }
}
