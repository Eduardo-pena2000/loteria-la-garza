package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.SessionCountersKt;
import gatewayprotocol.v1.SessionCountersOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class SessionCountersKtKt {
    public static final SessionCountersOuterClass.SessionCounters -initializesessionCounters(l block) {
        t.g(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        SessionCountersOuterClass.SessionCounters.Builder newBuilder = SessionCountersOuterClass.SessionCounters.newBuilder();
        t.f(newBuilder, "newBuilder()");
        SessionCountersKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final SessionCountersOuterClass.SessionCounters copy(SessionCountersOuterClass.SessionCounters sessionCounters, l block) {
        t.g(sessionCounters, "<this>");
        t.g(block, "block");
        SessionCountersKt.Dsl.Companion companion = SessionCountersKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = sessionCounters.toBuilder();
        t.f(builder, "this.toBuilder()");
        SessionCountersKt.Dsl _create = companion._create((SessionCountersOuterClass.SessionCounters.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
