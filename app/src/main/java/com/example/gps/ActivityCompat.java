package com.example.gps;

import androidx.fragment.app.FragmentActivity;

public abstract class ActivityCompat extends FragmentActivity {
    public abstract void OnRequestPermissionResult(int requestCode, String permissions[], int[] grantResults);
}
