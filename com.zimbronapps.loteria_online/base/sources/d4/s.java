package d4;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public final class s {
    public static final s a = new s();

    public final h a(GetTopicsResponse getTopicsResponse) {
        kotlin.jvm.internal.t.g(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = i.a(getTopicsResponse).iterator();
        while (it.hasNext()) {
            Topic a2 = j.a(it.next());
            arrayList.add(new t(k.a(a2), l.a(a2), m.a(a2)));
        }
        return new h(arrayList);
    }

    public final h b(GetTopicsResponse getTopicsResponse) {
        kotlin.jvm.internal.t.g(getTopicsResponse, "response");
        ArrayList arrayList = new ArrayList();
        Iterator it = i.a(getTopicsResponse).iterator();
        while (it.hasNext()) {
            Topic a2 = j.a(it.next());
            arrayList.add(new t(k.a(a2), l.a(a2), m.a(a2)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = n.a(getTopicsResponse).iterator();
        while (it2.hasNext()) {
            EncryptedTopic a3 = o.a(it2.next());
            byte[] a4 = p.a(a3);
            kotlin.jvm.internal.t.f(a4, "encryptedTopic.encryptedTopic");
            String a5 = q.a(a3);
            kotlin.jvm.internal.t.f(a5, "encryptedTopic.keyIdentifier");
            byte[] a6 = r.a(a3);
            kotlin.jvm.internal.t.f(a6, "encryptedTopic.encapsulatedKey");
            arrayList2.add(new a(a4, a5, a6));
        }
        return new h(arrayList, arrayList2);
    }
}
