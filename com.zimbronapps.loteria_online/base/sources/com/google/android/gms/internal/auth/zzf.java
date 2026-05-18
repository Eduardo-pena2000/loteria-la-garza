package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import h6.b;
import h6.c;

/* loaded from: /storage/emulated/0/Android/data/com.apktools.app.decompile/files/decompile_temp/jadx/classes3.dex */
public interface zzf extends IInterface {
    Bundle zzd(String str, Bundle bundle) throws RemoteException;

    Bundle zze(Account account, String str, Bundle bundle) throws RemoteException;

    Bundle zzf(Account account) throws RemoteException;

    Bundle zzg(String str) throws RemoteException;

    c zzh(b bVar) throws RemoteException;
}
