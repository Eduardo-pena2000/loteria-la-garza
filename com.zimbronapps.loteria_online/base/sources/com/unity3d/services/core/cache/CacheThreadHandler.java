package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes5.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    public class 1 implements IWebRequestProgressListener {
        private long lastProgressEventTime = System.currentTimeMillis();
        final /* synthetic */ CacheEventSender val$cacheThreadBinder;
        final /* synthetic */ int val$progressInterval;
        final /* synthetic */ File val$targetFile;

        public 1(CacheEventSender cacheEventSender, File file, int i) {
            this.val$cacheThreadBinder = cacheEventSender;
            this.val$targetFile = file;
            this.val$progressInterval = i;
        }

        public void onRequestProgress(String str, long j, long j2) {
            if (this.val$progressInterval <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= this.val$progressInterval) {
                return;
            }
            this.lastProgressEventTime = System.currentTimeMillis();
            this.val$cacheThreadBinder.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str, Long.valueOf(j), Long.valueOf(j2));
        }

        public void onRequestStart(String str, long j, int i, Map map) {
            this.val$cacheThreadBinder.sendEvent(CacheEvent.DOWNLOAD_STARTED, str, Long.valueOf(this.val$targetFile.length()), Long.valueOf(j + this.val$targetFile.length()), Integer.valueOf(i), Request.getResponseHeadersMap(map));
        }
    }

    /*  JADX ERROR: Type inference failed
        LI11I1ll1Ii11.iliLiI1iLLIL: Type inference error: updates count limit reached
        	at LL11ILIl1lL1ii.LiiI1lLILii.LL1ll1L1IL1LlII(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:52)
        	at LL11ILIl1lL1ii.LiiI1lLILii.L1IlILiL1l11Ll(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:9)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:1)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(r8-map-id-00a9cd7197aaac3ec6fe197781e93d4bad557227c7b5caf65935aa44aec86362:21)
        */
    private void downloadFile(java.lang.String r23, java.lang.String r24, int r25, int r26, int r27, java.util.HashMap r28, boolean r29, com.unity3d.services.core.cache.CacheEventSender r30) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean, com.unity3d.services.core.cache.CacheEventSender):void");
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, "GET", hashMap2, i, i2);
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map map, CacheEventSender cacheEventSender) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + elapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    public void handleMessage(Message message) {
        HashMap hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap hashMap2 = new HashMap();
            for (String str : data.keySet()) {
                hashMap2.put(str, Arrays.asList(data.getStringArray(str)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, hashMap, z, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
