package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.e;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import v9.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
public abstract class ScarAdHandlerBase implements e {
    protected final EventSubject _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final c _scarAdMetadata;

    public class 1 implements IEventListener {
        public 1() {
        }

        public void onNextEvent(com.unity3d.scar.adapter.common.c cVar) {
            ScarAdHandlerBase.this._gmaEventSender.send(cVar, new Object[0]);
        }
    }

    public ScarAdHandlerBase(c cVar, EventSubject eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = cVar;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    public void onAdClicked() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_CLICKED, new Object[0]);
    }

    public void onAdClosed() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_CLOSED, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    public void onAdFailedToLoad(int i, String str) {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.LOAD_ERROR, this._scarAdMetadata.c(), this._scarAdMetadata.d(), str, Integer.valueOf(i));
    }

    public void onAdLoaded() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_LOADED, this._scarAdMetadata.c(), this._scarAdMetadata.d());
    }

    public void onAdOpened() {
        this._gmaEventSender.send(com.unity3d.scar.adapter.common.c.AD_STARTED, new Object[0]);
        this._eventSubject.subscribe(new 1());
    }
}
