package k0;

import Ca.I;
import b0.U1;
import java.util.Arrays;
import l0.A;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes.dex */
public abstract class d {
    public static final int a = 36;

    public static /* synthetic */ I a(f fVar, v vVar, p pVar, String str, Object obj, Object[] objArr) {
        return g(fVar, vVar, pVar, str, obj, objArr);
    }

    public static final /* synthetic */ void b(p pVar, Object obj) {
        h(pVar, obj);
    }

    public static final String c(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    public static final Object d(Object[] objArr, Qa.a aVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(1564532345, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        Object f = f(Arrays.copyOf(objArr, objArr.length), y.f(), null, aVar, mVar, ((i << 6) & 7168) | 384, 0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return f;
    }

    public static final Object e(Object[] objArr, v vVar, Qa.a aVar, b0.m mVar, int i) {
        if (b0.w.L()) {
            b0.w.U(674689872, i, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        Object f = f(Arrays.copyOf(objArr, objArr.length), vVar, null, aVar, mVar, (i & 112) | 384 | ((i << 3) & 7168), 0);
        if (b0.w.L()) {
            b0.w.T();
        }
        return f;
    }

    /*  JADX ERROR: IIiLliI1l1li1 in pass: ConstructorVisitor
        LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:b0.m), (r14v9 ?? I:java.lang.Object) INTERFACE call: b0.m.t(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:201)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
        	at java.util.ArrayList.forEach(ArrayList.java:1613)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.lLlIIL11Li1llL1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:42)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:68)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:8)
        */
    public static final java.lang.Object f(
    /*  JADX ERROR: IIiLliI1l1li1 in pass: ConstructorVisitor
        LI11I1ll1Ii11.IIiLliI1l1li1: Can't remove SSA var: r14v9 ??, still in use, count: 1, list:
          (r14v9 ?? I:java.lang.Object) from 0x00c8: INVOKE (r13v0 ?? I:b0.m), (r14v9 ?? I:java.lang.Object) INTERFACE call: b0.m.t(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:201)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.ILIiiIiIILL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:178)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:22)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at LL11ILIl1lL1ii.i1lLLlIILLIlii.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:5)
        	at java.util.ArrayList.forEach(ArrayList.java:1613)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.IlllI1L11iLLLL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:14)
        	at LL11ILIl1lL1ii.i1lii1lllLIL1.lLlIIL11Li1llL1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:42)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:68)
        */
    /*  JADX ERROR: Method generation error
        LI11I1ll1Ii11.IIiLliI1l1li1: Code variable not set in r9v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:29)
        	at IIiLII1lL1llIlI.L111LiLLi1iiliL.lILLi11Li1lll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:45)
        	at IIiLII1lL1llIlI.L111LiLLi1iiliL.iliLiI1iLLIL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:468)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iLIi1LlIlIil1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:62)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.LIi1LL1Ilill1l(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:23)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.LlIIlIliLlL1IiL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:16)
        	at IIiLII1lL1llIlI.IIiLliI1l1li1.accept(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.util.stream.SortedOps$RefSortingSink$$ExternalSyntheticLambda0.accept(D8$$SyntheticClass:0)
        	at java.util.ArrayList.forEach(ArrayList.java:1613)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:263)
        	at java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:301)
        	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:575)
        	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:564)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:135)
        	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:267)
        	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:657)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iIiLL1lI11ii(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:62)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.IIiLliI1l1li1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:64)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iliLiI1iLLIL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:2)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.lLlIIL11Li1llL1(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:25)
        	at IIiLII1lL1llIlI.l1LII1ii11LI11.iLlIlilL1lI1Il(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:26)
        	at IIiLII1lL1llIlI.ilI1I1iIilII.call(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:3)
        	at IIiLII1lL1llIlI.iiiIlilLli1.il11il1iIii1lIl(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at IIiLII1lL1llIlI.iiiIlilLli1.LlIIlIliLlL1IiL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:11)
        	at IIiLII1lL1llIlI.iiiIlilLli1.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:51)
        	at L1LIIiIlIIL1i.il11il1iIii1lIl.iliLiI1iLLIL(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:152)
        	at L1LIIiIlIIL1i.il11il1iIii1lIl.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:91)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:7)
        	at jadx.core.dex.nodes.ClassNode.decompile(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.nodes.ClassNode.getCode(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:2)
        */

    public static final I g(f fVar, v vVar, p pVar, String str, Object obj, Object[] objArr) {
        fVar.h(vVar, pVar, str, obj, objArr);
        return I.a;
    }

    public static final void h(p pVar, Object obj) {
        String c;
        if (obj == null || pVar.a(obj)) {
            return;
        }
        if (obj instanceof A) {
            A a2 = (A) obj;
            if (a2.d() == U1.j() || a2.d() == U1.q() || a2.d() == U1.n()) {
                c = "MutableState containing " + a2.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                c = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            c = c(obj);
        }
        throw new IllegalArgumentException(c);
    }
}
