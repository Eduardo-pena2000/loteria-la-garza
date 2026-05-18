package com.unity3d.services.core.request.metrics;

import Da.Q;
import Da.S;
import java.util.Map;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class Metric {
    public static final Companion Companion = new Companion(null);
    private static final String METRIC_NAME = "n";
    private static final String METRIC_TAGS = "t";
    private static final String METRIC_VALUE = "v";
    private final String name;
    private final Map tags;
    private final Object value;

    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public Metric(String str) {
        this(str, null, null, 6, null);
    }

    public static /* synthetic */ Metric copy$default(Metric metric, String str, Object obj, Map map, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = metric.name;
        }
        if ((i & 2) != 0) {
            obj = metric.value;
        }
        if ((i & 4) != 0) {
            map = metric.tags;
        }
        return metric.copy(str, obj, map);
    }

    public final String component1() {
        return this.name;
    }

    public final Object component2() {
        return this.value;
    }

    public final Map component3() {
        return this.tags;
    }

    public final Metric copy(String str, Object obj, Map tags) {
        t.g(tags, "tags");
        return new Metric(str, obj, tags);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Metric)) {
            return false;
        }
        Metric metric = (Metric) obj;
        return t.c(this.name, metric.name) && t.c(this.value, metric.value) && t.c(this.tags, metric.tags);
    }

    public final String getName() {
        return this.name;
    }

    public final Map getTags() {
        return this.tags;
    }

    public final Object getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Object obj = this.value;
        return ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31) + this.tags.hashCode();
    }

    public final Map toMap() {
        Map c = Q.c();
        String str = this.name;
        if (str != null) {
            c.put("n", str);
        }
        Object obj = this.value;
        if (obj != null) {
            c.put("v", obj);
        }
        if (!this.tags.isEmpty()) {
            c.put("t", this.tags);
        }
        return Q.b(c);
    }

    public String toString() {
        return "Metric(name=" + this.name + ", value=" + this.value + ", tags=" + this.tags + ')';
    }

    public Metric(String str, Object obj) {
        this(str, obj, null, 4, null);
    }

    public Metric(String str, Object obj, Map tags) {
        t.g(tags, "tags");
        this.name = str;
        this.value = obj;
        this.tags = tags;
    }

    public /* synthetic */ Metric(String str, Object obj, Map map, int i, k kVar) {
        this(str, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? S.h() : map);
    }
}
