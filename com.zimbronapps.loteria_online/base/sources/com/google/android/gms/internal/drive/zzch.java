package com.google.android.gms.internal.drive;

import H6.H;
import H6.J;
import H6.d;
import H6.g;
import H6.h;
import H6.i;
import H6.k;
import H6.l;
import H6.m;
import H6.q;
import I6.e;
import I6.f;
import I6.o;
import L6.c;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes4.dex */
public final class zzch extends l {
    private static final AtomicInteger zzfn = new AtomicInteger();

    public zzch(Context context, d.a aVar) {
        super(context, aVar);
    }

    public static final /* synthetic */ e zza(zzg zzgVar, Task task) throws Exception {
        if (task.isSuccessful()) {
            return zzgVar;
        }
        throw task.getException();
    }

    private static void zze(int i) {
        if (i != 268435456 && i != 536870912 && i != 805306368) {
            throw new IllegalArgumentException("Invalid openMode provided");
        }
    }

    public final Task addChangeListener(k kVar, f fVar) {
        t.l(kVar.getDriveId());
        t.m(fVar, "listener");
        zzdi zzdiVar = new zzdi(this, fVar, kVar.getDriveId());
        int incrementAndGet = zzfn.incrementAndGet();
        StringBuilder sb = new StringBuilder(27);
        sb.append("OnChangeListener");
        sb.append(incrementAndGet);
        com.google.android.gms.common.api.internal.l registerListener = registerListener(zzdiVar, sb.toString());
        return doRegisterEventListener(new zzcp(this, registerListener, kVar, zzdiVar), new zzcq(this, registerListener.b(), kVar, zzdiVar)).continueWith(new zzci(registerListener));
    }

    public final Task addChangeSubscription(k kVar) {
        t.l(kVar.getDriveId());
        t.a(o.a(1, kVar.getDriveId()));
        return doWrite(new zzcr(this, kVar));
    }

    public final Task cancelOpenFileCallback(e eVar) {
        if (eVar instanceof zzg) {
            return doUnregisterEventListener(((zzg) eVar).zzad());
        }
        throw new IllegalArgumentException("Unrecognized ListenerToken");
    }

    public final Task commitContents(g gVar, q qVar) {
        return commitContents(gVar, qVar, new J().a());
    }

    public final Task createContents() {
        t.b(true, "Contents can only be created in MODE_WRITE_ONLY or MODE_READ_WRITE.");
        return doWrite(new zzcw(this, 536870912));
    }

    public final Task createFile(i iVar, q qVar, g gVar) {
        return createFile(iVar, qVar, gVar, new m.a().a());
    }

    public final Task createFolder(i iVar, q qVar) {
        t.m(qVar, "MetadataChangeSet must be provided.");
        if (qVar.a() == null || qVar.a().equals("application/vnd.google-apps.folder")) {
            return doWrite(new zzdb(this, qVar, iVar));
        }
        throw new IllegalArgumentException("The mimetype must be of type application/vnd.google-apps.folder");
    }

    public final Task delete(k kVar) {
        t.l(kVar.getDriveId());
        return doWrite(new zzcl(this, kVar));
    }

    public final Task discardContents(g gVar) {
        t.b(!gVar.zzk(), "DriveContents is already closed");
        gVar.zzj();
        return doWrite(new zzda(this, gVar));
    }

    public final Task getAppFolder() {
        return doRead(new zzco(this));
    }

    public final Task getMetadata(k kVar) {
        t.m(kVar, "DriveResource must not be null");
        t.m(kVar.getDriveId(), "Resource's DriveId must not be null");
        return doRead(new zzdc(this, kVar, false));
    }

    public final Task getRootFolder() {
        return doRead(new zzck(this));
    }

    public final Task listChildren(i iVar) {
        t.m(iVar, "folder cannot be null.");
        return query(zzbs.zza((c) null, iVar.getDriveId()));
    }

    public final Task listParents(k kVar) {
        t.l(kVar.getDriveId());
        return doRead(new zzde(this, kVar));
    }

    public final Task openFile(h hVar, int i) {
        zze(i);
        return doRead(new zzct(this, hVar, i));
    }

    public final Task query(c cVar) {
        t.m(cVar, "query cannot be null.");
        return doRead(new zzcz(this, cVar));
    }

    public final Task queryChildren(i iVar, c cVar) {
        t.m(iVar, "folder cannot be null.");
        t.m(cVar, "query cannot be null.");
        return query(zzbs.zza(cVar, iVar.getDriveId()));
    }

    public final Task removeChangeListener(e eVar) {
        t.m(eVar, "Token is required to unregister listener.");
        if (eVar instanceof zzg) {
            return doUnregisterEventListener(((zzg) eVar).zzad());
        }
        throw new IllegalStateException("Could not recover key from ListenerToken");
    }

    public final Task removeChangeSubscription(k kVar) {
        t.l(kVar.getDriveId());
        t.a(o.a(1, kVar.getDriveId()));
        return doWrite(new zzcs(this, kVar));
    }

    public final Task reopenContentsForWrite(g gVar) {
        t.b(!gVar.zzk(), "DriveContents is already closed");
        t.b(gVar.getMode() == 268435456, "This method can only be called on contents that are currently opened in MODE_READ_ONLY.");
        gVar.zzj();
        return doRead(new zzcx(this, gVar));
    }

    public final Task setParents(k kVar, Set set) {
        t.l(kVar.getDriveId());
        t.l(set);
        return doWrite(new zzdf(this, kVar, new ArrayList(set)));
    }

    public final Task trash(k kVar) {
        t.l(kVar.getDriveId());
        return doWrite(new zzcm(this, kVar));
    }

    public final Task untrash(k kVar) {
        t.l(kVar.getDriveId());
        return doWrite(new zzcn(this, kVar));
    }

    public final Task updateMetadata(k kVar, q qVar) {
        t.l(kVar.getDriveId());
        t.l(qVar);
        return doWrite(new zzdd(this, qVar, kVar));
    }

    public zzch(Activity activity, d.a aVar) {
        super(activity, aVar);
    }

    public final Task commitContents(g gVar, q qVar, m mVar) {
        t.m(mVar, "Execution options cannot be null.");
        t.b(!gVar.zzk(), "DriveContents is already closed");
        t.b(gVar.getMode() != 268435456, "Cannot commit contents opened in MODE_READ_ONLY.");
        t.m(gVar.getDriveId(), "Only DriveContents obtained through DriveFile.open can be committed.");
        H g = H.g(mVar);
        if (m.c(g.f()) && !gVar.zzi().zzb()) {
            throw new IllegalStateException("DriveContents must be valid for conflict detection.");
        }
        if (qVar == null) {
            qVar = q.b;
        }
        return doWrite(new zzcy(this, g, gVar, qVar));
    }

    public static final /* synthetic */ e zza(com.google.android.gms.common.api.internal.l lVar, Task task) throws Exception {
        if (task.isSuccessful()) {
            return new zzg(lVar.b());
        }
        throw task.getException();
    }

    public final Task createFile(i iVar, q qVar, g gVar, m mVar) {
        zzbs.zzb(qVar);
        return doWrite(new zzdh(iVar, qVar, gVar, mVar, null));
    }

    public final Task openFile(h hVar, int i, I6.g gVar) {
        zze(i);
        int incrementAndGet = zzfn.incrementAndGet();
        StringBuilder sb = new StringBuilder(27);
        sb.append("OpenFileCallback");
        sb.append(incrementAndGet);
        com.google.android.gms.common.api.internal.l registerListener = registerListener(gVar, sb.toString());
        l.a b = registerListener.b();
        zzg zzgVar = new zzg(b);
        return doRegisterEventListener(new zzcu(this, registerListener, hVar, i, zzgVar, registerListener), new zzcv(this, b, zzgVar)).continueWith(new zzcj(zzgVar));
    }
}
