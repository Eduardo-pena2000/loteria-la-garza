package com.google.android.gms.internal.consent_sdk;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
final class zzph extends zzpk {
    public zzph(byte[] bArr, int i, int i2) {
        super(bArr);
        zzpm.zzi(0, 47, bArr.length);
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1111)
        	at java.util.ArrayList$Itr.next(ArrayList.java:1064)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:40)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:124)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:60)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:8)
        */
    public final byte zza(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1111)
        	at java.util.ArrayList$Itr.next(ArrayList.java:1064)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:40)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:124)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:60)
        */
    /*  JADX ERROR: Method generation error
        LI11I1ll1Ii11.IIiLliI1l1li1: Code variable not set in r5v0 ??
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

    public final byte zzb(int i) {
        return ((zzpk) this).zza[i];
    }

    public final int zzc() {
        return 0;
    }

    public final int zzd() {
        return 47;
    }
}
