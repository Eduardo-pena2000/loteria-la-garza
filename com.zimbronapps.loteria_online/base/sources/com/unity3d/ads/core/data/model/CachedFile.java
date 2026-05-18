package com.unity3d.ads.core.data.model;

import java.io.File;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class CachedFile {
    private final long contentLength;
    private final String extension;
    private final File file;
    private final String name;
    private final String objectId;
    private final int priority;
    private final String protocol;
    private final String url;

    public CachedFile(String objectId, String url, String name, File file, String str, long j, String protocol, int i) {
        t.g(objectId, "objectId");
        t.g(url, "url");
        t.g(name, "name");
        t.g(protocol, "protocol");
        this.objectId = objectId;
        this.url = url;
        this.name = name;
        this.file = file;
        this.extension = str;
        this.contentLength = j;
        this.protocol = protocol;
        this.priority = i;
    }

    public static /* synthetic */ CachedFile copy$default(CachedFile cachedFile, String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, Object obj) {
        return cachedFile.copy((i2 & 1) != 0 ? cachedFile.objectId : str, (i2 & 2) != 0 ? cachedFile.url : str2, (i2 & 4) != 0 ? cachedFile.name : str3, (i2 & 8) != 0 ? cachedFile.file : file, (i2 & 16) != 0 ? cachedFile.extension : str4, (i2 & 32) != 0 ? cachedFile.contentLength : j, (i2 & 64) != 0 ? cachedFile.protocol : str5, (i2 & 128) != 0 ? cachedFile.priority : i);
    }

    public final String component1() {
        return this.objectId;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.name;
    }

    public final File component4() {
        return this.file;
    }

    public final String component5() {
        return this.extension;
    }

    public final long component6() {
        return this.contentLength;
    }

    public final String component7() {
        return this.protocol;
    }

    public final int component8() {
        return this.priority;
    }

    public final CachedFile copy(String objectId, String url, String name, File file, String str, long j, String protocol, int i) {
        t.g(objectId, "objectId");
        t.g(url, "url");
        t.g(name, "name");
        t.g(protocol, "protocol");
        return new CachedFile(objectId, url, name, file, str, j, protocol, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedFile)) {
            return false;
        }
        CachedFile cachedFile = (CachedFile) obj;
        return t.c(this.objectId, cachedFile.objectId) && t.c(this.url, cachedFile.url) && t.c(this.name, cachedFile.name) && t.c(this.file, cachedFile.file) && t.c(this.extension, cachedFile.extension) && this.contentLength == cachedFile.contentLength && t.c(this.protocol, cachedFile.protocol) && this.priority == cachedFile.priority;
    }

    public final long getContentLength() {
        return this.contentLength;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final File getFile() {
        return this.file;
    }

    public final String getName() {
        return this.name;
    }

    public final String getObjectId() {
        return this.objectId;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((((this.objectId.hashCode() * 31) + this.url.hashCode()) * 31) + this.name.hashCode()) * 31;
        File file = this.file;
        int hashCode2 = (hashCode + (file == null ? 0 : file.hashCode())) * 31;
        String str = this.extension;
        return ((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.contentLength)) * 31) + this.protocol.hashCode()) * 31) + Integer.hashCode(this.priority);
    }

    public String toString() {
        return "CachedFile(objectId=" + this.objectId + ", url=" + this.url + ", name=" + this.name + ", file=" + this.file + ", extension=" + this.extension + ", contentLength=" + this.contentLength + ", protocol=" + this.protocol + ", priority=" + this.priority + ')';
    }

    public /* synthetic */ CachedFile(String str, String str2, String str3, File file, String str4, long j, String str5, int i, int i2, k kVar) {
        this(str, str2, str3, (i2 & 8) != 0 ? null : file, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? -1L : j, (i2 & 64) != 0 ? "" : str5, (i2 & 128) != 0 ? Integer.MAX_VALUE : i);
    }
}
