package gatewayprotocol.v1;

import Qa.l;
import com.google.protobuf.GeneratedMessageLite;
import gatewayprotocol.v1.LimitedSessionTokenKt;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import kotlin.jvm.internal.t;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public final class LimitedSessionTokenKtKt {
    public static final UniversalRequestOuterClass.LimitedSessionToken -initializelimitedSessionToken(l block) {
        t.g(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        UniversalRequestOuterClass.LimitedSessionToken.Builder newBuilder = UniversalRequestOuterClass.LimitedSessionToken.newBuilder();
        t.f(newBuilder, "newBuilder()");
        LimitedSessionTokenKt.Dsl _create = companion._create(newBuilder);
        block.invoke(_create);
        return _create._build();
    }

    public static final UniversalRequestOuterClass.LimitedSessionToken copy(UniversalRequestOuterClass.LimitedSessionToken limitedSessionToken, l block) {
        t.g(limitedSessionToken, "<this>");
        t.g(block, "block");
        LimitedSessionTokenKt.Dsl.Companion companion = LimitedSessionTokenKt.Dsl.Companion;
        GeneratedMessageLite.Builder builder = limitedSessionToken.toBuilder();
        t.f(builder, "this.toBuilder()");
        LimitedSessionTokenKt.Dsl _create = companion._create((UniversalRequestOuterClass.LimitedSessionToken.Builder) builder);
        block.invoke(_create);
        return _create._build();
    }
}
