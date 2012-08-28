package com.hanoilabs.camera;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class Camera extends Activity {
	private static final String TAG = "Camera";
	
	private SurfaceView mSurfaceView;
	private SurfaceHolder mSurfaceHolder = null;
	
	private Uri mSaveUri;
	
	private int mNumberOfCameras;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mNumberOfCameras = CameraManager.instance().getNumberOfCameras();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
	}
	
	@Override
	protected void onStart() {
		super.onStart();
	}
	
	@Override
	protected void onPause() {
		super.onPause();
	}
}
