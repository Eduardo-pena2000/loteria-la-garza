package d4;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class h {
    public final List a;
    public final List b;

    public h(List list, List list2) {
        kotlin.jvm.internal.t.g(list, "topics");
        kotlin.jvm.internal.t.g(list2, "encryptedTopics");
        this.a = list;
        this.b = list2;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a.size() == hVar.a.size() && this.b.size() == hVar.b.size()) {
            return kotlin.jvm.internal.t.c(new HashSet(this.a), new HashSet(hVar.a)) && kotlin.jvm.internal.t.c(new HashSet(this.b), new HashSet(hVar.b));
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.a + ", EncryptedTopics=" + this.b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(List list) {
        this(list, Da.v.n());
        kotlin.jvm.internal.t.g(list, "topics");
    }
}
